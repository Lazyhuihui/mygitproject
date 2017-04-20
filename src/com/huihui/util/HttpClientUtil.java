/**
 * @(#)Jodo, 2013年10月11日
 */
package com.huihui.util;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

/**
 * @author treemanz
 */
@SuppressWarnings("deprecation")
public class HttpClientUtil {

    private static HttpClient __instance = null;

    static {
        try {
            TrustManager easyTrustManager = new X509TrustManager() {

                @Override
                public void checkClientTrusted(X509Certificate[] chain,
                        String authType) throws CertificateException {
                    // Oh, I am easy!
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain,
                        String authType) throws CertificateException {
                    // Oh, I am easy!
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };

            SchemeRegistry registry = new SchemeRegistry();// 創建schema

            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[] {
                easyTrustManager
            }, null);

            SSLSocketFactory sslFactory = new SSLSocketFactory(sslcontext,
                    SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            registry.register(new Scheme("http", 80, PlainSocketFactory
                    .getSocketFactory()));// http 80 端口
            registry.register(new Scheme("https", 443, sslFactory));// https
                                                                    // 443端口

            PoolingClientConnectionManager cm = new PoolingClientConnectionManager(
                    registry);// 創建connectionManager

            cm.setDefaultMaxPerRoute(20);// 對每個指定連接的服務器（指定的ip）可以創建並發20
                                         // socket進行訪問
            cm.setMaxTotal(200);// 創建socket的上線是200

            __instance = new DefaultHttpClient(cm);

            HttpParams params = __instance.getParams();
            HttpConnectionParams.setSoTimeout(params, 20 * 1000);// 設定連接等待時間
            HttpConnectionParams.setConnectionTimeout(params, 20 * 1000);// 設定超時時間

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static HttpClient getHttpClient() {
        return __instance;
    }
    
    public static String readResultAsString(HttpResponse httpResponse)
            throws IllegalStateException, IOException {
        // InputStream is = httpResponse.getEntity().getContent();
        // try {
        // byte[] buffer = new byte[1024];
        // ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // int len;
        // while ((len = is.read(buffer)) > -1) {
        // baos.write(buffer, 0, len);
        // }
        // return new String(baos.toByteArray(), "utf-8");
        // } finally {
        // if (null != is) {
        // is.close();
        // }
        // }
        return EntityUtils.toString(httpResponse.getEntity(),
                Charset.forName("utf-8"));
    }

    public static CloseableHttpClient getHttpsClient() {  
        RegistryBuilder<ConnectionSocketFactory> registryBuilder = RegistryBuilder.<ConnectionSocketFactory>create();  
        ConnectionSocketFactory plainSF = new PlainConnectionSocketFactory();  
        registryBuilder.register("http", plainSF);  
//指定信任密钥存储对象和连接套接字工厂  
        try {  
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());  
            //信任任何链接  
            TrustStrategy anyTrustStrategy = new TrustStrategy() {  
                @Override  
                public boolean isTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {  
                    return true;  
                }  
            };  
            SSLContext sslContext = SSLContexts.custom().useTLS().loadTrustMaterial(trustStore, anyTrustStrategy).build();  
            LayeredConnectionSocketFactory sslSF = new SSLConnectionSocketFactory(sslContext, SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);  
            registryBuilder.register("https", sslSF);  
        } catch (KeyStoreException e) {  
            throw new RuntimeException(e);  
        } catch (KeyManagementException e) {  
            throw new RuntimeException(e);  
        } catch (NoSuchAlgorithmException e) {  
            throw new RuntimeException(e);  
        }  
        Registry<ConnectionSocketFactory> registry = registryBuilder.build();  
        //设置连接管理器  
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(registry);  
//      connManager.setDefaultConnectionConfig(connConfig);  
//      connManager.setDefaultSocketConfig(socketConfig);  
        //构建客户端  
        return HttpClientBuilder.create().setConnectionManager(connManager).build();  
    } 
    
    
    public static String doHttpPost(String xmlInfo,String URL){         
        System.out.println("发起的数据:"+xmlInfo);       
       byte[] xmlData = xmlInfo.getBytes();            
        InputStream instr  = null; 
        java.io.ByteArrayOutputStream out = null;              
         try{                          
                URL url = new URL(URL);                
                URLConnection urlCon = url.openConnection();               
                urlCon.setDoOutput(true);              
                urlCon.setDoInput(true);               
                urlCon.setUseCaches(false);                            
                urlCon.setRequestProperty("Content-Type", "text/json");       
                urlCon.setRequestProperty("Content-length",String.valueOf(xmlData.length)); 
               // System.out.println(String.valueOf(xmlData.length));
                DataOutputStream printout = new DataOutputStream(urlCon.getOutputStream());            
                printout.write(xmlData);               
                printout.flush();              
                printout.close();              
                instr = urlCon.getInputStream();   
                byte[] bis = IOUtils.toByteArray(instr);
                String ResponseString = new String(bis, "UTF-8");  
               if ((ResponseString == null) || ("".equals(ResponseString.trim()))) {
                    System.out.println("返回空");
                   }
             // System.out.println("返回数据为:" + ResponseString);
             return ResponseString;    
            
         }catch(Exception e){              
                e.printStackTrace();
               return "0";
         }finally {
                try {          
                       out.close();   
                       instr.close();  
                        
                }catch (Exception ex) {      

                       //return "0";
                    }                  
                }                  
         }  
}
