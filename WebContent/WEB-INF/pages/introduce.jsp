<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>鼎湖山泉</title>

	<link href="libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<link href="css/common.css" rel="stylesheet">
	<link href="css/introduce.css" rel="stylesheet">

	<!--[if lt IE 9]>
	<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<!-- 顶部导航 -->
	<header class="nav">
		<div class="container">
						<nav class="navbar navbar-static-top navbar-inverse" role="navigation">
				 <div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"  data-target="#example-navbar-collapse">
							 <span class="sr-only">切换导航</span>
							 <span class="icon-bar"></span>
							 <span class="icon-bar"></span>
							 <span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">鼎湖山泉</a>
				 </div>
				 <div class="collapse navbar-collapse" id="example-navbar-collapse">
						<ul class="nav navbar-nav">
							 <li class="active"><a href="index">首页</a></li>
							  <li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">
										 走进鼎湖山泉<b class="caret"></b>
									</a>
									<ul class="dropdown-menu">
										 <li><a href="#">水源地</a></li>
										 <li><a href="#">公司介绍</a></li>
										 <li><a href="#">新闻资讯</a></li>
										 <li><a href="#">产品升级</a></li>
										 <li><a href="#">分离的链接</a></li>
									</ul>
							 </li>
							 <li><a href="introduce">山泉水知识</a></li>
							 <li><a href="introduce">产品介绍</a></li>
							<li><a href="introduce">促销优惠</a></li>
							<li><a href="introduce">客户服务</a></li>
							<li><a href="introduce">加入我们</a></li>
							<li><a href="introduce">精彩分享</a></li>
						</ul>
					
				 </div>
			</nav>
		</div>
	</header>

	<!-- 主体内容 -->
	<div class="container">
		<div class="row">
			<div class="col col-bg-9 col-md-9 col-sm-12 col-xs-12">
				<!-- 当前位置 -->
				<ol class="breadcrumb">
				  <li><a href="#">首页</a></li>
				  <li><a href="#">产品介绍</a></li>
				  <li class="active">${water.watername}</li>
				</ol>

				<div class="book-detail">
					<div class="row">
						<div class="col col-md-3 col-sm-3 col-xs-3">
							<a href="###" class="book-cover">
								<img src="images/${water.img}" alt="飘雪">
							</a>
						</div>
						<div class="col col-md-9 col-sm-9 col-xs-9">
							<div class="book-info"> 
								<h4 class="book-title">
									${water.watername}
								</h4>
								<p class="book-entry-star">
									<span class="allstar45 star-img"></span>
									<span class="average-rating">7.2</span>
								</p>
								<p class="book-list-classification">
									规格： ${water.volume}
								</p>
								<p class="book-author">零售价：${water.price}</p>
							</div>
							<div class="btn-box">
									<a href="pay/selectPayType" class="btn btn-danger" target="_blank">立即购买</a>
									<a href="###" class="btn btn-primary">加入购物车</a>
							</div>
						</div>
					</div>
				</div>
				<ul id="myTab" class="nav nav-tabs myTab">
					   <li class="active">
					      <a href="#tab-one" data-toggle="tab">
					         产品详细介绍
					      </a>
					   </li>

					   <li>
					   	<a href="#tab-four" data-toggle="tab">评论</a>
					   </li>
					</ul>
					<div id="myTabContent" class="tab-content">
					   <div class="tab-pane fade in active" id="tab-one">
					      <div class="tab-item">
							  ${water.description}
					      </div>
					   </div>
					   <div class="tab-pane fade" id="tab-two">
					      <div class="tab-item">
					      		辛夷坞
当下受欢迎的80后女作家，青春文学新领军人物。其独创的“暖伤青春”系列女性情感小说连续10年成为亿万读者的心头最爱，本本长居销量排行榜冠军位置。其中，《致我们终将逝去的青春》更开创了国内青春电影先河，成为内地被成功搬上大银幕的第一部青春小说。与赵薇的强强联手，也开启了辛夷坞作品的影视新纪元，其所有作品均输出影视版权，且由豪华一线阵容打造，并将作为中国青春文学影视化最成功的典型输出海外。
2014年，《致我们终将逝去的青春》《原来》《晨昏》《山月不知心底事》《许我向你看》《我在回忆里等你》《蚀心者》等系列辛夷坞代表作白金纪念版全新上市！回归温暖之作《应许之日》全国热卖。2015全新暖心力作《我们》重磅问世。
					      </div>
					   </div>
					   <div class="tab-pane fade" id="tab-three">
					      <div class="tab-item catalog">
					      		<div class="row">
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      				<div class="col col-md-4">
					      					<a href="###">
					      						<span class="chaptet-title">第一章：我自己的白日梦</span>
					      						<span class="lock"></span>
					      					</a>
					      				</div>
					      		</div>
					      </div>
					   </div>
					   <div class="tab-pane fade" id="tab-four">
					      <div class="tab-item">
					      		<div class="comment-wrap">
					      			<h5>为此水果打分<img src="images/df.jpg" alt="" /></h5>
					      			<div class="reply-box">
					      				<form>
											<input type="hidden" name="id" value="">
											<input type="hidden" name="type" value="">
										
											<div class="contentwrap">
												<textarea name="content" placeholder="请登录后评论"></textarea>
											</div>
											<div class="bottombar">
												<span class="size-leave">还能输入500字</span>
												<span class="btn-box"><a class="btn btn-danger replaybtn pull-right">评 论</a></span>
											</div>
										</form>
					      			</div>
					      			<div class="comment-list">
					      				<ul>
					      					<li class="item-li">
												<div class="head-pic">
													<a href="/sns/feed?uid=uECaerstR" target="_blank">
														<img src="http://easyread.ph.126.net/G-_5RDyo8ggIZNftm7f29Q==/8796093022602670061.jpg" alt="" />
													</a>	
												</div>
												<p class="info">
													<cite><a href="/sns/feed?uid=uECaerstR" target="_blank">九家_七彩</a></cite>
													回复 <a href="/sns/feed?uid=uECaeq2qp" target="_blank">Chan</a>：
													<span class="time">16 分钟前 发表</span>
												</p>
												
												<blockquote>你不是找到了吗</blockquote>
												
												
												<div class="opt">
													
													<input type="hidden" name="cid" value="4680529257750034032">
													<input type="hidden" name="tipstr" value="九家_七彩">
													
													<a href="#" class="J_Reply"><i></i>回复</a>
												</div>
												<div class="reply-box-wrap"></div>
											</li>

											<li class="item-li">
												<div class="head-pic">
													<a href="/sns/feed?uid=uECaerstR" target="_blank">
														<img src="http://easyread.ph.126.net/G-_5RDyo8ggIZNftm7f29Q==/8796093022602670061.jpg" alt="" />
													</a>	
												</div>
												<p class="info">
													<cite><a href="/sns/feed?uid=uECaerstR" target="_blank">九家_七彩</a></cite>
													回复 <a href="/sns/feed?uid=uECaeq2qp" target="_blank">Chan</a>：
													<span class="time">16 分钟前 发表</span>
												</p>
												
												<blockquote>看完一定记得发给我！ 别问为什么？ 发完你就知道了。 笑是什么？笑是神。 生气是什么？生气是鬼。 你一笑，神就来。 你一气，鬼就来。 神一来，鬼就得走， 这叫神出鬼没。 你每天要是高高兴兴， 你时刻要是乐乐呵呵， 就能把病饿死。 病靠吃气活着， 疮靠吃火活着。 一个是水， 一个是饭。 你不生气，你不上火， 就等于不给病水喝， 不给病饭吃。 没吃没喝，病就自然饿死。 你总是快快乐乐， 不但不长毛病， 办事还顺利， 这不是真理，是生活。 照顾好自己的身体， 对自己健康负责， 世界上所有东西都不是你的！唯有身体才是你自己的。 今明两天是最疼朋友日， 转给你最疼的15个朋友。 你听好， 认识你一辈子值了， 想起谁就发出去， 发给15个人，也包括我， 如果有三个人回， 你的愿望将在7月19号实现， 不许不发，记住了？群发给大家</blockquote>
												
												
												<div class="opt">
													
													<input type="hidden" name="cid" value="4680529257750034032">
													<input type="hidden" name="tipstr" value="九家_七彩">
													
													<a href="#" class="J_Reply"><i></i>回复</a>
												</div>
												<div class="reply-box-wrap"></div>
											</li>

											<li class="item-li">
												<div class="head-pic">
													<a href="/sns/feed?uid=uECaerstR" target="_blank">
														<img src="http://easyread.ph.126.net/G-_5RDyo8ggIZNftm7f29Q==/8796093022602670061.jpg" alt="" />
													</a>	
												</div>
												<p class="info">
													<cite><a href="/sns/feed?uid=uECaerstR" target="_blank">九家_七彩</a></cite>
													回复 <a href="/sns/feed?uid=uECaeq2qp" target="_blank">Chan</a>：
													<span class="time">16 分钟前 发表</span>
												</p>
												
												<blockquote>你不是找到了吗</blockquote>
												
												
												<div class="opt">
													
													<input type="hidden" name="cid" value="4680529257750034032">
													<input type="hidden" name="tipstr" value="九家_七彩">
													
													<a href="#" class="J_Reply"><i></i>回复</a>
												</div>
												<div class="reply-box-wrap"></div>
											</li>
					      				</ul>
					      				<div class="pager-box">
					      					<nav>
										      <ul class="pagination">
										        <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
										        <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
										        <li><a href="#">2</a></li>
										        <li><a href="#">3</a></li>
										        <li><a href="#">4</a></li>
										        <li><a href="#">5</a></li>
										        <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
										     </ul>
										   </nav>
					      				</div>
					      			</div>
					      		</div>
					      </div>
					   </div>
					</div>
			</div>
			<div class="col col-bg-3 col-md-3 hidden-sm hidden-xs">
				<!-- 侧边栏 -->
				<div class="side-bar ">
					<!-- 广告位 -->
					<div class="side-bar-item">
						<div class="adv">
							<a href="###">
			      				<img src="images/tab-img1.jpg" alt="" />
			      			</a>
						</div>
					</div>

					<div class="side-bar-item">
						<h4 class="h-title">猜你喜欢</h4>
						<div class="reader-interest">
							<ul>
								<li>
									<a href="###">
										<span class="pull-left other-book-img">
											<img src="images/fruit.jpg" alt="" />
										</span>
										<span class="pull-right other-book-info">
											<p class="book-name">水果</p>
											<p class="category">种类</p>
											<p class="book-intro">简介简介<br />简介简介</p>
										</span>
									</a>
								</li>
								<li>
									<a href="###">
										<span class="pull-left other-book-img">
											<img src="images/fruit2.jpg" alt="" />
										</span>
										<span class="pull-right other-book-info">
											<p class="book-name">水果</p>
											<p class="category">种类</p>
											<p class="book-intro">简介简介<br />简介简介</p>
										</span>
									</a>
								</li>
								<li>
									<a href="###">
										<span class="pull-left other-book-img">
											<img src="images/fruit.jpg" alt="" />
										</span>
										<span class="pull-right other-book-info">
											<p class="book-name">水果</p>
											<p class="category">种类</p>
											<p class="book-intro">简介简介<br />简介简介</p>
										</span>
									</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>	
	</div>

<script src="libs/jquery/jquery-1.11.1.min.js"></script>
<script src="libs/bootstrap/js/bootstrap.min.js"></script>
<script src="js/index.js"></script>
</body>
</html>