<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <!-- 引入 echarts.js -->
    <script src="libs/jquery/jquery-1.11.1.min.js"></script>
    <script src="libs/echarts/echarts.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 400px;height:250px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
       /* var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
            title: {
                text: 'ECharts 入门示例'
            },
            tooltip: {},
            legend: {
                data:['销量']
            },
            xAxis: {
                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子","测试"],
				axisLabel:{  
                         interval:0,//横轴信息全部显示  
                         rotate:-30,//-30度角倾斜显示  
                    }  ,
            },
			
            yAxis: {},
            series: [{
                name: '销量',
                type: 'bar',
                data: [5, 20, 36, 10, 10, 20,15]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
		*/
		
		//alert("");
		
		// 异步加载数据
		
		$.get('getdata').done(function (data) {
			
			
			// 填入数据
			//alert("");
		//	alert(data);
			//alert(data.categories);
			//alert(data.series);
			data=eval("("+data+")");
			var myChart = echarts.init(document.getElementById('main'));
			// 显示标题，图例和空的坐标轴
			myChart.setOption({
				title: {
					text: data.title
				},
				tooltip: {},
				legend: {
					data:[data.legend]
				},
				xAxis: {
					data: [],
				axisLabel:{  
	                interval:0,//横轴信息全部显示  
	                rotate:-30,//-30度角倾斜显示  
	           }  ,
				},
				yAxis: {},
				series: [{
					name: data.legend,
					type: 'bar',
					data: []
				}]
			});
			
			myChart.setOption({
				xAxis: {
					data: data.categories
				},
				series: [{
					// 根据名字对应到相应的系列
					name: '销量',
					data: data.series
				}]
			});
		});
    </script>
</body>
</html>
