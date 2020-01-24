<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/bootstrap.min.css">
<link rel="stylesheet" href="../css/font-awesome.min.css">
<link rel="stylesheet" href="../css/preset.css">
<link rel="stylesheet" href="../css/animate.css">
<link rel="stylesheet" href="../css/owl.carousel.css">
<link rel="stylesheet" href="../css/owl.theme.css">
<link rel="stylesheet" href="../css/magnific-popup.css">
<link rel="stylesheet" href="../css/style.css">
<link rel="stylesheet" href="../css/responsive.css">

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/layer.js"></script>
<title></title>
</head>
<body>
<!-- 头部导航 -->
        <header class="header-area" style="position: fixed;width: 100%;">
            <nav class="main-menu hidden-xs hidden-sm">
                <ul class="menu-left pull-left">
                    <li <s:if test="flag==1">class="selected"</s:if>><a href="index.action">首页</a></li>
                    <li <s:if test="flag==1">class="selected"</s:if>><a href="about.action">书店简介</a></li>
                    <li class="menu-has-children">
						<a href="new.jsp">近期活动</a>
						<ul>
                 			<li><a href="special.jsp">精品推荐</a>
                    		<li><a href="new.jsp">最新出版</a>
                    		<li><a href="sale.jsp">优惠促销</a>
                    	</ul>
                    </li>
                </ul>
                <!-- 中间logo -->
                <div class="pull-left logo-area">
                    <a href="index.jsp"><img src="images/logo.gif" alt="Logo" style="width: 100px;height: 60px;padding-top: 12px;margin-left: 30px;margin-right: 30px;"></a>
                </div>

                <ul class="menu-right pull-left">
                    <li><a href="cart.action">购物车</a></li>
                    <li><a href="order.action">我的订单</a></li>
                </ul>
            </nav>

            <!-- 最右边栏 -->
            <ul class="pull-right search-cart">
            	<li style="float: right; margin-left: 30px;">
					<form action="search.action" method="post" id="form_search">
						<a href="javascript:void(0);" onclick="$('#form_search').submit()" style="float: right;margin-left:0">搜索</a>
						<input type="text" name="searchName" value="${searchName}" placeholder="输入图书名称" />
					</form>
					<!-- <form action="search.do" method="post">
						<input type="text" name="search" placeholder="请输入图书名称" size="10"/>
						&nbsp;&nbsp;<input type="submit" value="搜索" style="float: right;margin-left:0">
					</form> -->
				</li>
				<li class="menu-has-children">
					<a href="login.jsp">用户</a>
					<ul>
						<li><a href="login.jsp">用户登陆</a></li>
						<li><a href="register.jsp">用户注册</a></li>
						<li><a href="logout.action">注销用户</a></li>
						<li><a href="../admin/login.jsp" target="_blank">后台管理</a></li>
					</ul>
				</li>
                
                <li class="menu-has-children">
                    <a href="#">语言栏</a>
                    <ul>
                        <li><a href="#">En</a>
                        <li><a href="#">Ch</a>
                    </ul>
                </li> 
            </ul>
            <div class="clearfix"></div>
        </header>
        <!-- head nav end -->
        <div class="top_line_color">
        <p style="border:6px solid #8b0000;"></p>
        <!-- Slider Area Start -->
<style type="text/css">
.second-animation{
	padding-left:120px;
}
.bordered-button{
	margin-left:150px;
}
</style>
        <section class="slider-area">
            <div id="home-one-crousel" class="carousel slide">
                <div class="carousel-inner" role="listbox">
                    <div class="item active" style="background-image: url(../images/slider/slider01.gif);background-size: 100% auto">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 col-xs-12">
                                    <div class="slider-content text-left">
                                        <h3 class="second-animation">林海书店</h3>
                                        <a href="about.jsp" class="bordered-button fourth-animation">DETAILS<i class="fa fa-long-arrow-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-overlay"></div>
                    </div>
                    <div class="item" style="background-image: url(../images/slider/slider02.jpg);background-size: 100% auto">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 col-xs-12">
                                    <div class="slider-content text-left">
                                    <h3 class="second-animation">LinHai</h3>
                                        <a href="about.jsp" class="bordered-button fourth-animation">DETAILS<i class="fa fa-long-arrow-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-overlay"></div>
                    </div>
                    <div class="item" style="background-image: url(../images/slider/slider03.jpg);background-size: 100% auto">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 col-xs-12">
                                    <div class="slider-content text-left">
                                        <h3 class="second-animation">百年之作</h3>
                                        <a href="new.jsp" class="bordered-button fourth-animation">DETAILS<i class="fa fa-long-arrow-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-overlay"></div>
                    </div>
                    <div class="item" style="background-image: url(../images/slider/slider04.jpg);background-size: 100% auto">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 col-xs-12">
                                    <div class="slider-content text-left">
                                        <h3 class="second-animation">审美</h3>
                                        <a href="sale.jsp" class="bordered-button fourth-animation">DETAILS<i class="fa fa-long-arrow-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-overlay"></div>
                    </div>
                    <div class="item" style="background-image: url(../images/slider/slider05.jpg);background-size: 100% auto">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 col-xs-12">
                                    <div class="slider-content text-left">
                                        <h3 class="second-animation">Book</h3>
                                        <a href="sale.jsp" class="bordered-button fourth-animation">DETAILS<i class="fa fa-long-arrow-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-overlay"></div>
                    </div>
                    <div class="item" style="background-image: url(../images/slider/slider06.gif);background-size: 100% auto">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12 col-xs-12">
                                    <div class="slider-content text-left">
                                        <h3 class="second-animation">读一本好书</h3>
                                        <a href="new.jsp" class="bordered-button fourth-animation">DETAILS<i class="fa fa-long-arrow-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="slider-overlay"></div>
                    </div>
                </div>

                <!-- control button -->
                <a class="left carousel-control" href="#home-one-crousel" role="button" data-slide="prev">
                    <i class="fa fa-angle-left"></i>
                </a>
                <a class="right carousel-control" href="#home-one-crousel" role="button" data-slide="next">
                    <i class="fa fa-angle-right"></i>
                </a>
            </div>
        </section>
        <!-- Slider Area End -->
</body>
</html>