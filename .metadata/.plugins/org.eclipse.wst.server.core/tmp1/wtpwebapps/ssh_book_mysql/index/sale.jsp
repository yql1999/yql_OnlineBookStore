<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="../css/news/normalize.css"/>
<link rel="stylesheet" type="text/css" href="../css/news/demo.css"/>
<link rel="stylesheet" type="text/css" href="../css/news/component.css"/>

<!-- Include All JavaScript -->
        <script src="../js/news/masonry.pkgd.min.js"></script>
        <script src="../js/news/imagesloaded.pkgd.min.js"></script>
        <script src="../js/news/modernizr.custom.js"></script>
        <script src="../js/news/classie.js"></script>
        <script src="../js/news/colorfinder-1.1.js"></script>
        <script src="../js/news/gridScrollFx.js"></script>
<title>优惠促销</title>
</head>
<body>


<jsp:include page="header.jsp"/>

<div class="center_content">

	<div class="left_content">
     

        <section class="news">
            <div class="academic-content">
                <nav class="codrops-demos"><a href="special.jsp">
                    <h2 class="section-title">优惠 <span>促销</span></h2></a>
                </nav>
                
              	<style type="text/css">
              		.grid-wrap .grid li{
              			width: 230px;
              		}
                </style>  
                
                <% String[]s={"21","24","33.1","23.9","11.9","24.6"};%>
                
                <section class="grid-wrap">
                    <ul class="grid swipe-rotate" id="grid">
                        <li><a href="detail.action?bookid=4"> <img src="../picture/4.jpg" alt="图书图片1">
                            <h3>限时优惠：￥<%=s[0] %></h3></a></li>
                            <li><a href="detail.action?bookid=6"> <img src="../picture/6.jpg" alt="图书图片2">
                            <h3>限时优惠：￥<%=s[1] %></h3></a></li>
                        <li><a href="detail.action?bookid=15"> <img src="../picture/15.jpg" alt="图书图片3">
                            <h3>限时优惠：￥<%=s[2] %></h3></a></li>
                            <li><a href="detail.action?bookid=19"> <img src="../picture/19.jpg" alt="图书图片4">
                            <h3>限时优惠：￥<%=s[3] %></h3></a></li>
                        <li><a href="detail.action?bookid=21"> <img src="../picture/21.jpg" alt="图书图片5">
                            <h3>限时优惠：￥<%=s[4] %></h3></a></li>
                        <li><a href="detail.action?bookid=39"> <img src="../picture/39.jpg" alt="图书图片6">
                            <h3>限时优惠：￥<%=s[5] %></h3></a></li>
                    </ul>
                </section>

                <script>
                    new GridScrollFx(document.getElementById('grid'), {
                        viewportFactor: 0.4
                    });
                </script>
            </div>
        </section>
     	

     
	    <!-- 分页 -->
		${pageTool}
		
		<div class="clear"></div>
	</div>
	
</div>

<jsp:include page="right.jsp"/>
<jsp:include page="footer.jsp"/>


</body>
</html>