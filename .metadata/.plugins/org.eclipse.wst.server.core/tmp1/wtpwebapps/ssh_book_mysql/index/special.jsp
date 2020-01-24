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
<title>精品推荐</title>
</head>
<body>


<jsp:include page="header.jsp"/>

<div class="center_content">

	<div class="left_content">
     

        <section class="news">
            <div class="academic-content">
                <nav class="codrops-demos"><a href="special.jsp">
                    <h2 class="section-title">精品<span>推荐</span></h2></a>
                </nav>
              	<style type="text/css">
              		.grid-wrap .grid li{
              			width: 230px;
              		}
                </style>  
                <section class="grid-wrap">
                    <ul class="grid swipe-rotate" id="grid">
                        <li><a href="detail.action?bookid=29"> <img src="../picture/29.jpg" alt="图书图片1">
                            <h3>《你是人间的四月天》（林徽因）</h3></a></li>
                            <li><a href="detail.action?bookid=30"> <img src="../picture/30.jpg" alt="图书图片2">
                            <h3>《鲁迅全集》（鲁迅）</h3></a></li>
                        <li><a href="detail.action?bookid=35"> <img src="../picture/35.jpg" alt="图书图片3">
                            <h3>《今生今世》（胡兰成）</h3></a></li>
                            <li><a href="detail.action?bookid=38"> <img src="../picture/38.jpg" alt="图书图片4">
                            <h3>《人间草木》（汪曾祺）</h3></a></li>
                        <li><a href="detail.action?bookid=39"> <img src="../picture/39.jpg" alt="图书图片5">
                            <h3>《灵魂只能独行》（周国平）</h3></a></li>
                        <li><a href="detail.action?bookid=40"> <img src="../picture/40.jpg" alt="图书图片6">
                            <h3>《傅雷家书》（傅雷）</h3></a></li>
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