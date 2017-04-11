<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>遇见</title>

	<link href="libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="libs/kindeditor-4.1.10/themes/default/default.css" rel="stylesheet">
	<link href="css/common.css" rel="stylesheet">
	<link href="css/index.css" rel="stylesheet">

	<!--[if lt IE 9]>
	<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
	<style type="text/css">
		.regard{
			margin: 10px 20px;
		}
		.list-inline ol, ul {
			margin-bottom: 0px;
			font-size: 12px;
			color: #898989;
		}
		#box_top{
			background: #eeeeee;
		}

		/* Basic Grey */

		.basic-grey {
			margin-left:auto;
			margin-right:auto;
			max-width: 500px;
			background: #F7F7F7;
			padding: 25px 15px 25px 10px;
			font: 12px Georgia, "Times New Roman", Times, serif;
			color: #888;
			text-shadow: 1px 1px 1px #FFF;
			border:1px solid #E4E4E4;
		}
		.basic-grey h1 {
			font-size: 25px;
			padding: 0px 0px 10px 40px;
			display: block;
			border-bottom:1px solid #E4E4E4;
			margin: -10px -15px 30px -10px;;
			color: #888;
		}
		.basic-grey h1>span {
			display: block;
			font-size: 11px;
		}
		.basic-grey label {
			display: block;
			margin: 0px;
		}
		.basic-grey label>span {
			float: left;
			width: 20%;
			text-align: right;
			padding-right: 10px;
			margin-top: 10px;
			color: #888;
		}
		.basic-grey input[type="text"], .basic-grey input[type="email"], .basic-grey textarea, .basic-grey select {
			border: 1px solid #DADADA;
			color: #888;
			height: 30px;
			margin-bottom: 16px;
			margin-right: 6px;
			margin-top: 2px;
			outline: 0 none;
			padding: 3px 3px 3px 5px;
			width: 70%;
			font-size: 12px;
			line-height:15px;
			box-shadow: inset 0px 1px 4px #ECECEC;
			-moz-box-shadow: inset 0px 1px 4px #ECECEC;
			-webkit-box-shadow: inset 0px 1px 4px #ECECEC;
		}
		.basic-grey textarea{
			padding: 5px 3px 3px 5px;
		}
		.basic-grey select {
			background: #FFF url('down-arrow.png') no-repeat right;
			background: #FFF url('down-arrow.png') no-repeat right);
			appearance:none;
			-webkit-appearance:none;
			-moz-appearance: none;
			text-indent: 0.01px;
			text-overflow: '';
			width: 70%;
			height: 35px;
			line-height: 25px;
		}
		.basic-grey textarea{
			height:100px;
		}
		.basic-grey .button {
			background: #E27575;
			border: none;
			padding: 10px 25px 10px 25px;
			color: #FFF;
			box-shadow: 1px 1px 5px #B6B6B6;
			border-radius: 3px;
			text-shadow: 1px 1px 1px #9E3F3F;
			cursor: pointer;
		}
		.basic-grey .button:hover {
			background: #CF7A7A
		}
	</style>
</head>
<body>
	<!-- 顶部导航 -->
	<header class="nav">

		<div id="box_top">
			<div id="box_top_left">
				<div class="columnSpace" id="elem-FrontMembers_welcomeInfo01-1427286951733" name="会员欢迎信息">
					<div id="FrontMembers_welcomeInfo01-1427286951733" class="FrontMembers_welcomeInfo01-d1_c1">
						<ul class="list-inline">
							<li class="regard">
								晚上好,
								美景晨光农场欢迎您！
							</li>
							<li class="operate">
								<span class="register"><a href="javascript:void(0);" onclick="FrontMembers_welcomeInfo01.goToPage('/members_login.html', '_self', 'false')">会员登录</a></span>
							</li>
							<li class="operate">
								<span class="register"><a href="javascript:void(0);" onclick="FrontMembers_welcomeInfo01.goToPage('/members_register.html', '_self', 'false')">免费注册</a></span>
							</li>
							<li class="link">
								<a class="link0" href="javascript:void(0);" onclick="FrontMembers_welcomeInfo01.goToPage('/order_myorder.html', '_self')"></a>
							</li>
						</ul>
					</div>


				</div>
			</div>

		</div>

		<div class="container">
			<nav class="navbar navbar-static-top navbar-inverse" role="navigation">
				 <div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"  data-target="#example-navbar-collapse">
							 <span class="sr-only">切换导航</span>
							 <span class="icon-bar"></span>
							 <span class="icon-bar"></span>
							 <span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Lrsee</a>
				 </div>
				 <div class="collapse navbar-collapse" id="example-navbar-collapse">
						<ul class="nav navbar-nav">
							 <li class="active"><a href="#">首页</a></li>
							<li><a href="#">产品超市</a></li>
							 <li><a href="#">热卖推荐</a></li>
							 <li><a href="#">限时活动</a></li>
							<li><a href="#">会员专区</a></li>
						</ul>
					 <form class="navbar-form navbar-left" role="search">
						 <div class="form-group">
							 <input type="text" class="form-control" placeholder="Search">
						 </div>
						 <button type="submit" class="btn btn-default">Submit</button>
					 </form>
				 </div>
			</nav>
		</div>
	</header>

	<!-- 主体内容 -->
	<div class="container">
		<div class="row">
			<div class="col col-bg-9 col-md-9 col-sm-12 col-xs-12">
				<!-- 轮播图 -->
				<div id="myCarousel" class="carousel slide" data-ride="carousel">

							<ol class="carousel-indicators">
								<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
								<li data-target="#myCarousel" data-slide-to="1" class=""></li>
								<li data-target="#myCarousel" data-slide-to="2" class=""></li>
							</ol>

							<div class="carousel-inner" role="listbox">

								<div class="item active">
									<img alt="" src="images/slide1.png"  data-holder-rendered="true">
								</div>
								<div class="item">
									<img alt="" src="images/slide2.png"  data-holder-rendered="true">
								</div>
								<div class="item">
									<img alt="" src="images/slide3.png"  data-holder-rendered="true">
								</div>

							</div>

							<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
								<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
								<span class="sr-only">Previous</span>
							</a>
							<a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
								<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
								<span class="sr-only">Next</span>
							</a>

				</div>

				<div class="section ">
					<div class="section-title">
						<h3>
							每日新鲜推荐
							<a class="pull-right bigtitle-more" href="#">更多&gt;&gt;</a>
						</h3>
					</div>
					<div class="section-con">
						<div class="row">
							<div class="col col-bg-3 col-md-4 col-sm-6 col-xs-12">
								<div class="section-item">
									<div class="row">
										<div class="col col-bg-4 col-md-5 col-sm-4 col-xs-4">
											<div class="item-img">
												<a href="###"><img src="images/fruit.jpg" alt="图书" /></a>
											</div>
										</div>
										<div class="col col-bg-8 col-md-7 col-sm-8 col-xs-8">
											<div class="item-info">
												<h4 class="item-title">
													<a href="###">西班牙草莓</a>
												</h4>
												<p class="item-entry-star">
													<span class="allstar45 star-img"></span>
													<span class="average-rating">7.2</span>
												</p>
												<p class="item-author">计量单位： /kg</p>
												<p class="book-list-classification">
																零售价:20元
												 </p>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col col-md-12">
											<p class="item-reviews">
												好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃
											</p>
										</div>
									</div>
								</div>
							</div>
							<div class="col col-bg-3 col-md-4 col-sm-6 col-xs-12">
								<div class="section-item">
									<div class="row">
										<div class="col col-bg-4 col-md-5 col-sm-4 col-xs-4">
											<div class="item-img">
												<a href="###"><img src="images/fruit2.jpg" alt="图书" /></a>
											</div>
										</div>
										<div class="col col-bg-8 col-md-7 col-sm-8 col-xs-8">
											<div class="item-info">
												<h4 class="item-title">
													<a href="introduce.html#">妃子笑</a>
												</h4>
												<p class="item-entry-star">
													<span class="allstar45 star-img"></span>
													<span class="average-rating">7.2</span>
												</p>
												<p class="item-author">计量单位： /kg</p>
												<p class="book-list-classification">
																零售价:20元
												 </p>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col col-md-12">
											<p class="item-reviews">
												好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃
											</p>
										</div>
									</div>
								</div>
							</div>
							<div class="col col-bg-3 col-md-4 col-sm-6 col-xs-12">
								<div class="section-item">
									<div class="row">
										<div class="col col-bg-4 col-md-5 col-sm-4 col-xs-4">
											<div class="item-img">
												<a href="###"><img src="images/fruit3.jpg" alt="图书" /></a>
											</div>
										</div>
										<div class="col col-bg-8 col-md-7 col-sm-8 col-xs-8">
											<div class="item-info">
												<h4 class="item-title">
													<a href="###">台农一号芒</a>
												</h4>
												<p class="item-entry-star">
													<span class="allstar45 star-img"></span>
													<span class="average-rating">7.2</span>
												</p>
												<p class="item-author">计量单位： /kg</p>
												<p class="book-list-classification">
																零售价:20元
												 </p>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col col-md-12">
											<p class="item-reviews">
												好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃好吃
											</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="section">
					<ul id="myTab" class="nav nav-tabs myTab">
					   <li >
					      <a href="#tab-one" data-toggle="tab">营养知识</a>
					   </li>
					   <li>
					   	<a href="#tab-two" data-toggle="tab">新闻资讯</a>
					   </li>
					   <li>
					   	<a href="#tab-three" data-toggle="tab">关于我们</a>
					   </li>
					   <li>
					   	<a href="#tab-four" data-toggle="tab">在线客服</a>
					   </li>
					</ul>
					<div id="myTabContent" class="tab-content">
					   <div class="tab-pane fade in active" id="tab-one">
					      <div class="tab-item">
					      		<h4>
					      			<a href="###" target="_blank">
										吃水果有哪些好处
					      			</a>
					      		</h4>
					      		<div class="row">
					      			<div class="col col-md-3 col-sm-3 col-xs-3 hidden-xs">
					      				<div class="tab-item-img">
					      					<a href="###" target="_blank">
					      						<img src="images/tab-img1.jpg" alt="" />
					      					</a>
					      				</div>
					      			</div>
					      			<div class="col col-md-9 col-sm-9 col-xs-12">
					      				<div class="tab-item-p">
					      					<a href="###" target="_blank">
												每个季节都有每个季节的应季水果，现在水果可是算是人们生活中的"小伴侣",饭前、饭后、休闲时间都会吃些水果。既然我们知道水果中中要多吃水果，那么吃水果有哪些好处大家知道吗？下面水果网小编就给大家说说水果功效。...[详细]
					      					</a>
					      				</div>
					      				<div class="tab-item-info">
					      					<span class="item-date pull-left">6月29日 11:29</span>
					      					<span class="pull-right">
					      						<a href="###">评论</a>&nbsp;|&nbsp;<a href="###">分享</a>
					      					</span>
					      				</div>
					      			</div>
					      		</div>
					      </div>
					      <div class="tab-item">
					      		<h4>
					      			<a href="###" target="_blank">
										饭后吃什么水果可以帮助消化
					      			</a>
					      		</h4>
					      		<div class="row">
					      			<div class="col col-md-3 col-sm-3 col-xs-3 hidden-xs">
					      				<div class="tab-item-img">
					      					<a href="###" target="_blank">
					      						<img src="images/tab-img2.jpg" alt="" />
					      					</a>
					      				</div>
					      			</div>
					      			<div class="col col-md-9 col-sm-9 col-xs-12">
					      				<div class="tab-item-p">
					      					<a href="###" target="_blank">
												对于木瓜我们知道的就是木瓜可以丰胸（木瓜能丰胸吗），还有就是木瓜的美白功效。研究表明，木瓜中含有能够帮助人体消化分解的蛋白质，饭后适量的吃些木瓜，可以帮助消化，有效的防止胃肠炎或者胃溃疡等胃部疾病。《...[详细]
					      					</a>
					      				</div>
					      				<div class="tab-item-info">
					      					<span class="item-date pull-left">6月29日 11:29</span>
					      					<span class="pull-right">
					      						<a href="###">评论</a>&nbsp;|&nbsp;<a href="###">分享</a>
					      					</span>
					      				</div>
					      			</div>
					      		</div>
					      </div>
					   </div>
					   <div class="tab-pane fade" id="tab-two">
					      <div class="tab-item">
					      		<h4>
					      			<a href="###" target="_blank">
										饭后吃什么水果可以帮助消化
					      			</a>
					      		</h4>
					      		<div class="row">
					      			<div class="col col-md-3 col-sm-3 col-xs-3 hidden-xs">
					      				<div class="tab-item-img">
					      					<a href="###" target="_blank">
					      						<img src="images/tab-img2.jpg" alt="" />
					      					</a>
					      				</div>
					      			</div>
					      			<div class="col col-md-9 col-sm-9 col-xs-12">
					      				<div class="tab-item-p">
					      					<a href="###" target="_blank">
												对于木瓜我们知道的就是木瓜可以丰胸（木瓜能丰胸吗），还有就是木瓜的美白功效。研究表明，木瓜中含有能够帮助人体消化分解的蛋白质，饭后适量的吃些木瓜，可以帮助消化，有效的防止胃肠炎或者胃溃疡等胃部疾病。《...[详细]
											</a>
					      				</div>
					      				<div class="tab-item-info">
					      					<span class="item-date pull-left">6月29日 11:29</span>
					      					<span class="pull-right">
					      						<a href="###">评论</a>&nbsp;|&nbsp;<a href="###">分享</a>
					      					</span>
					      				</div>
					      			</div>
					      		</div>
					      </div>
					   </div>
					   <div class="tab-pane fade" id="tab-three">
					      <div class="tab-item">
					      		<h4>
					      			<a href="###" target="_blank">
					      				格非长篇新作《望春风》：用文字为消失的故乡作传
					      			</a>
					      		</h4>
					      		<div class="row">
					      			<div class="col col-md-3 col-sm-3 col-xs-3 hidden-xs">
					      				<div class="tab-item-img">
					      					<a href="###" target="_blank">
					      						<img src="images/tab-img.jpg" alt="" />
					      					</a>
					      				</div>
					      			</div>
					      			<div class="col col-md-9 col-sm-9 col-xs-12">
					      				<div class="tab-item-p">
					      					<a href="###" target="_blank">
					      						“当我回到我的老家的时候，我弟弟带我去看老家的时候，我发现老家没了。整个没了，全部都是一片瓦砾。我在细雨中坐了两个小时，坐在家门口的废墟上。虽然四周空无一人，我好像听到了我的邻居在说话。”《...[详细]
					      					</a>
					      				</div>
					      				<div class="tab-item-info">
					      					<span class="item-date pull-left">6月29日 11:29</span>
					      					<span class="pull-right">
					      						<a href="###">评论</a>&nbsp;|&nbsp;<a href="###">分享</a>
					      					</span>
					      				</div>
					      			</div>
					      		</div>
					      </div>
					   </div>
					   <div class="tab-pane fade" id="tab-four">
					      <div class="tab-item">
							  <form action="" method="post" class="basic-grey">
								  <h1>留言板
									  <span>我们将及时回复你,请在消息中心注意查收.</span>
								  </h1>
								  <label>
									  <span>留言 :</span>
									  <textarea id="message" name="message" placeholder="你的留言"></textarea>
								  </label>

								  <label>
									  <span>&nbsp;</span>
									  <input type="button" class="button" value="Send" />
								  </label>
							  </form>
					      </div>
					   </div>
					</div>
				</div>
			</div>
			<div class="col col-bg-3 col-md-3 hidden-sm hidden-xs">
				<!-- 侧边栏 -->
				<div class="side-bar ">
					<div class="side-bar-item">
						<div class="side-bar-title">
							<span>热卖推荐</span>
							<a class="more" href="###" target="_blank">更多&gt;&gt;</a>
						</div>
						<div id="bestbook-list" class="bestbook-list">
							<div class="list list-now" >
								<h4 class="num1"><a href="introduce.html" target="_blank">妃子笑</a></h4>
								<div class="pictxt">
									<div class="pic">
										<a href="###" target="_blank">
											<img alt="图片说明" src="images/best-fruit1.jpg" width="262" height="120">
										</a>
									</div>
									<!--<div class="txt">-->
										<!--<h5>叶兆言新作，少女寻父记</h5>-->
										<!--<p>作者：叶兆言 </p>-->

										<!--<p>出版社：人民文学出版社</p>-->
									<!--</div>-->
								</div>
							</div>
							<div class="list" >
								<h4 class="num2"><a href="###" target="_blank">台农一号芒</a></h4>
								<div class="pictxt">
									<div class="pic">
										<a href="###" target="_blank">
											<img alt="图片说明" src="images/fruit3.jpg" width="262" height="120">
										</a>
									</div>
									<!--<div class="txt">-->
										<!--<h5>叶兆言新作，少女寻父记</h5>-->
										<!--<p>作者：叶兆言 </p>-->

										<!--<p>出版社：人民文学出版社</p>-->
									<!--</div>-->
								</div>
							</div>
							<div class="list" >
								<h4 class="num3"><a href="###" target="_blank">西班牙草莓</a></h4>
								<div class="pictxt">
									<div class="pic">
										<a href="###" target="_blank">
											<img alt="图片说明" src="images/best-fruit2.jpg" width="262" height="120">
										</a>
									</div>
									<!--<div class="txt">-->
										<!--<h5>叶兆言新作，少女寻父记</h5>-->
										<!--<p>作者：叶兆言 </p>-->

										<!--<p>出版社：人民文学出版社</p>-->
									<!--</div>-->
								</div>
							</div>
							<div class="list" >
								<h4 class="num4"><a href="introduce.html" target="_blank">妃子笑</a></h4>
								<div class="pictxt">
									<div class="pic">
										<a href="###" target="_blank">
											<img alt="图片说明" src="images/best-fruit1.jpg" width="262" height="120">
										</a>
									</div>
									<!--<div class="txt">-->
										<!--<h5>叶兆言新作，少女寻父记</h5>-->
										<!--<p>作者：叶兆言 </p>-->

										<!--<p>出版社：人民文学出版社</p>-->
									<!--</div>-->
								</div>
							</div>
							<div class="list" >
								<h4 class="num5"><a href="###" target="_blank">妃子笑</a></h4>
								<div class="pictxt">
									<div class="pic">
										<a href="###" target="_blank">
											<img alt="图片说明" src="images/best-fruit1.jpg" width="262" height="120">
										</a>
									</div>
									<!--<div class="txt">-->
										<!--<h5>叶兆言新作，少女寻父记</h5>-->
										<!--<p>作者：叶兆言 </p>-->

										<!--<p>出版社：人民文学出版社</p>-->
									<!--</div>-->
								</div>
							</div>
						</div>
					</div>
					<div class="side-bar-item">
						<div class="side-bar-title">
							<span>限时活动</span>
							<a class="more" href="###" target="_blank">更多&gt;&gt;</a>
						</div>
						<div class="txtList">
							<ul>
								<li>
									<a href="###" target="_blank">
										满199送199积分
									</a>
								</li>
								<li>
									<a href="###" target="_blank">
										限时抢购全场八折
									</a>
								</li>
								<li>
									<a href="###" target="_blank">
										双十一疯狂抢购
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>	
	</div>
	<div class="modal fade" tabindex="-1" role="dialog" id="publishModal" aria-labelledby="myModalLabel">
	  <div class="modal-dialog modal-lg">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">内容发布</h4>
	      </div>
	      <div class="modal-body">
	        <div class="form-wrap">
	        		<div class="input-group input-group-lg content-input-group">
					  <input type="text" class="form-control contentTitle" name="contentTitle" placeholder="请输入内容标题" >
					</div>
					<div class="input-group input-group-lg content-input-group">
					  <input type="text" class="form-control contentAbstract" name="contentAbstract" placeholder="请输入内容摘要" >
					</div>
					<div class="input-group input-group-lg content-input-group">
					  <textarea  id="editor_id" name="content" class="publishContent" placeholder="请输入内容"></textarea>
					</div>
					<div class="input-group input-group-lg content-input-group">
						<input type="submit" class="btn center-block publishBtn" value="发布">
					</div>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>
<script src="libs/jquery/jquery-1.11.1.min.js"></script>
<script src="libs/bootstrap/js/bootstrap.min.js"></script>
<script src="libs/kindeditor-4.1.10/kindeditor.js"></script>
<script src="libs/kindeditor-4.1.10/lang/zh_CN.js"></script>
<script src="js/index.js"></script>
<script type="text/javascript">
	KindEditor.ready(function(K) {
           window.editor = K.create('#editor_id');
    });
</script>
</body>
</html>