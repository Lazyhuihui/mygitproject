package com.huihui.pay.controller.alipay.config;

import com.huihui.common.config.Global;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.4
 *修改日期：2016-03-08
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 合作身份者ID，签约账号，以2088开头由16位纯数字组成的字符串，查看地址：https://b.alipay.com/order/pidAndKey.htm
	public static String partner = Global.getConfig("ALIPAY_PARTNER_ID");//"2088411179042096";
	
	// 收款支付宝账号，以2088开头由16位纯数字组成的字符串，一般情况下收款账号就是签约账号
	public static String seller_id = partner;

	//商户的私钥,需要PKCS8格式，RSA公私钥生成：https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.nBDxfy&treeId=58&articleId=103242&docType=1
	public static String private_key = Global.getConfig("ALIPAY_MY_PRIVATE_KEY");//"MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAMJAvtRf7MidBqt0/Lg8/UXIWSEvFHgN7ilviU/iRuvlpeio/CgsD3Rc7nVMN5zVRl17exip2B5tjzOCLxIaOe09OCP/xn2HQ+fHRQkgZy5YZbV+fj75Vvg2ba999e370PXsYg9w3iW67B6ozFqRuYPkFrN71MegC9MxyINb5B5JAgMBAAECgYAOCN2AvJl/+RBlTOOBcC6gXxRJeHxTHDaL2doi4mdbXdE52RO211AaiShVYzdVZndaA7TmGEdcE3BYOVyrQyfSIuRWsqRGPPHhb0UhNVAWr3rNr73oZTROb/0PIhQYMSVsuevLuMhpSsh/PH8ds6hDwb1CPiQH5alPGF8OMIvrPQJBAO0lFSy+MHNeS0D6gDTplwTssSkCwnf2APNMGBTCPjMYHWiZ2FRnNFTF2HOnGV+2gn827MUaRDKAP0INpCNaBrsCQQDRsqCV/ne5OQOQsf2D4pXjvz0uajtnjTX2VNbEqxpHsEGZbyJ7IEWfXLeVTxcy4Ov74M3v3GkPg6S2yndvydjLAkA/B8swAEEKePaRh8NJzQhZw7t2xggAMH+iKwh/g/1aQT+XzMRF8sRi/87/Nlu1J+JZg7S80rVrotCtcsi8qLH/AkAFm+qRuInJSY4f27L1SSVLPz1KtYq7PVq5KRHJlu4QBtXqXb+lXXqfRaKfessbEEsfpKa9iL7CrHnGben98n87AkB3LGhhakZ/VKDwpq3Er4mYcdx+NafoDbwPa2leSRyIs/WzFaVsNsgeB5By5CQql2sxfkdNt4JWAeE/Twnul2qX";
	
	// 支付宝的公钥,查看地址：https://b.alipay.com/order/pidAndKey.htm
	public static String alipay_public_key  = Global.getConfig("ALIPAY_PUBLIC_KEY");//"MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = Global.getConfig("ALIPAY_CALL_NOTIFY_URL");//"http://52.196.62.121:8090/pay/alipayreturn";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = Global.getConfig("ALIPAY_CALL_BACK_URL");//"http://52.196.62.121:8090/pay/alipayreturn";

	// 签名方式
	public static String sign_type = "RSA";
	
	// 调试用，创建TXT日志文件夹路径，见AlipayCore.java类中的logResult(String sWord)打印方法。
	public static String log_path = "G:\\aa.txt";
		
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";
		
	// 支付类型 ，无需修改
	public static String payment_type = "1";
		
	// 调用的接口名，无需修改
	public static String service = "create_direct_pay_by_user";

	public static String seller_account = Global.getConfig("ALIPAY_SELLER_ACCOUNT_NAME");

//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
//↓↓↓↓↓↓↓↓↓↓ 请在这里配置防钓鱼信息，如果没开通防钓鱼功能，为空即可 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	
	// 防钓鱼时间戳  若要使用请调用类文件submit中的query_timestamp函数
	public static String anti_phishing_key = "";
	
	// 客户端的IP地址 非局域网的外网IP地址，如：221.0.0.1
	public static String exter_invoke_ip = "";
		
//↑↑↑↑↑↑↑↑↑↑请在这里配置防钓鱼信息，如果没开通防钓鱼功能，为空即可 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	
}

