<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/book.js"></script>
<title>图书详情</title>
</head>
<body>

<jsp:include page="header.jsp"/>

<div class="center_content">

	<div class="left_content">
	<style type="text/css">
		.codrops-demos a{
    		color: #fff;
		}
		.codrops-demos {
    		padding-top: 50px;
		}
		.codrops-demos a {
    		text-transform: uppercase;
    		letter-spacing: 1px;
   			margin: 15px;
    		padding: 5px 2px;
    		font-weight: 900;
		}
		.codrops-demos a.current-demo {
    		color: #fff;
		}
		
	</style>
		<nav class="codrops-demos"><a href="special.jsp">
                    <h2 class="section-title">图书${book.name} <span>详细介绍</span></h2></a>
        </nav>
		<div class="feat_prod_box_details">
			<div class="prod_img">
				<img src="../${book.cover}" class="thumb_big" border="0" />
			</div>
			<div class="prod_det_box">
				<div class="box_top"></div>
				<div class="box_center">
					<div class="prod_title">${book.name}</div>
					<p class="details"><s:property value="book.intro.substring(0,(intro.length()>70?70:intro.length()))+'...'"/></p>
					<div class="price"><strong>价格:</strong> <span class="red">$${book.price}</span></div>
					<div style="text-align: right;margin-right:11px;margin-top:-20px">
						<a href="javascript:void(0);" onclick="buy(${book.id})">
							<img src="images/button.png" width="150px"/>
						</a>
					</div>
					<div class="clear"></div>
				</div>
				<div class="box_bottom"></div>
			</div>
			<div class="clear"></div>
		</div>
		
		<div id="demo" class="demolayout">
		
			<ul id="demo-nav" class="demolayout">
				<li><a class="active">详细介绍</a></li>
			</ul>
			<div class="tabs-container">
				<div style="display: block;" class="tab" id="tab1">
					<p class="more_details">${book.intro}</p>
					<ul class="list">
						<li><a href="">出版日期: ${book.pubdate}</a></li>
					</ul>
				</div>
			</div>
        
		</div>
	
	</div>
	
</div>

<jsp:include page="right.jsp"/>
<jsp:include page="footer.jsp"/>


</body>
</html>