<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
<!-- 头部导航 -->
        <header class="header-area">
            <nav class="main-menu hidden-xs hidden-sm">
                <ul class="menu-left pull-left">
                    <li><a href="index.jsp">首页</a>
                    <li><a href="../index/about.jsp">书店简介</a>
                 	<li><a href="../index/special.jsp">精品推荐</a>
                    <li><a href="../index/new.jsp">最新出版</a>
                    <li><a href="../index/sale.jsp">优惠促销</a>
                </ul>
                <!-- 中间logo -->
                <div class="pull-left logo-area">
                    <a href="index.html"><img src="images/logo.gif" alt="Logo" style="width: 100px;height: 60px;padding-top: 12px;margin-left: 30px;margin-right: 30px;"></a>
                </div>

                <ul class="menu-right pull-left">
                    <li><a href="order.action">我的订单</a></li>
                    <li><a href="../index/about.jsp">联系我们</a></li>
                </ul>
            </nav>

            <!-- 最右边栏 -->
            <ul class="pull-right search-cart">
				<li class="menu-has-children">
					<a href="../index/login.jsp">用户</a>
					<ul>
						<li><a href="../index/login.jsp">用户登录</a>
						<li><a href="../index/register.jsp">用户注册</a>
						<li><a href="../index/logout.jsp">注销用户</a>
					</ul>
				</li>
                <li><a href="../admin/login.jsp">后台管理</a>
                <li class="menu-has-children">
                    <a href="#">en</a>
                    <ul>
                        <li><a href="#">En</a>
                        <li><a href="#">Ch</a>
                        <li><a href="#">Br</a>
                    </ul>
                </li> 
                <li style="float: right; margin-left: 30px;">
					<form action="search.do" method="post">
						<input type="text" name="search" placeholder="请输入图书名称" size="10"/>
						&nbsp;&nbsp;<input type="submit" value="搜索" style="float: right;margin-left:0">
					</form>
				</li>
            </ul>
            <div class="clearfix"></div>
        </header>
        <!-- head nav end -->
        <div class="top_line_color">
        <p style="border:6px solid #8b0000;"></p>
        
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/layer.js"></script>
</body>
</html>