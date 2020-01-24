<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>书店首页</title>
</head>
<body>
	
<jsp:include page="header.jsp" />
		
	<div class="center">

		<div class="center_content">

			<div class="left_content">

				<!-- 精品推荐 -->
				<div class="title">
					<span class="title_icon"><img src="images/bullet1.png" /></span>精品推荐
				</div>
					<div class="feat_prod_box">
						<div class="prod_img">
							<a href="detail.action?bookid=${id}"><img src="../picture/7.jpg"
								class="thumb_big" /></a>
						</div>
						<div class="prod_det_box">
							<div class="box_top"></div>
							<div class="box_center">
								<span class="special_icon"><img
									src="images/special_icon.gif"></span>
								<div class="prod_title">
									<a href="detail.action?bookid=7">${name}</a>
								</div>
								<p class="details" style="margin-right: 20px;">
									《明朝那些事儿》这篇文主要讲述的是从1344年到1644年这三百年间关于明朝的一些事情，以史料为基础，以年代和具体人物为主线，并加入了小说的笔法，对明朝十七帝和其他王公权贵和小人物的命运进行全景展示，尤其对官场政治、战争、帝王心术着墨最多，并加入对当时政治经济制度、人伦道德的演义。
								</p>
								<a href="detail.action?bookid=7" class="more">- DETAILS -</a>
								<div class="clear"></div>
							</div>
							<div class="box_bottom"></div>
						</div>
						<div class="clear"></div>
					</div>
					
					<div class="feat_prod_box">
						<div class="prod_img">
							<a href="detail.action?bookid=${id}"><img src="../picture/29.jpg"
								class="thumb_big" /></a>
						</div>
						<div class="prod_det_box">
							<div class="box_top"></div>
							<div class="box_center">
								<span class="special_icon"><img
									src="images/special_icon.gif"></span>
								<div class="prod_title">
									<a href="detail.action?bookid=29">${name}</a>
								</div>
								<p class="details" style="margin-right: 20px;">
									《你是人间四月天》收录了林徽因几乎所有的诗歌、散文、小说。包括诗歌《谁爱这不息的变幻》《你是人间的四月天》《激昂》，散文《悼志摩》《一片阳光》，小说《九十九度中》《模影零篇》等脍炙人口的名篇，内容含量大且丰富，一本书即可了解全部的林徽因。
								</p>
								<a href="detail.action?bookid=29" class="more">- DETAILS -</a>
								<div class="clear"></div>
							</div>
							<div class="box_bottom"></div>
						</div>
						<div class="clear"></div>
					</div>

				<div class="feat_prod_box">
						<div class="prod_img">
							<a href="detail.action?bookid=${id}"><img src="../picture/40.jpg"
								class="thumb_big" /></a>
						</div>
						<div class="prod_det_box">
							<div class="box_top"></div>
							<div class="box_center">
								<span class="special_icon"><img
									src="images/special_icon.gif"></span>
								<div class="prod_title">
									<a href="detail.action?bookid=40">${name}</a>
								</div>
								<p class="details" style="margin-right: 20px;">
									本书以最小最精之篇幅反映《傅雷家书》全貌，再现傅氏兄弟成长的家教背景，全面展示傅雷家风。</p>
								<a href="detail.action?bookid=40" class="more">- DETAILS -</a>
								<div class="clear"></div>
							</div>
							<div class="box_bottom"></div>
						</div>
						<div class="clear"></div>
					</div>

				<!-- 最新出版 -->
				<div class="title">
					<span class="title_icon"><img src="images/bullet2.gif" /></span>最新出版
				</div>

				<div class="feat_prod_box">
				<div class="prod_img">
					<a href="detail.action?bookid=1">
						<img src="../picture/1.jpg" alt="图书图片" class="thumb_big" border="0"/>
					</a>
				</div>
				<div class="prod_det_box"><span class="new_icon"><img src="images/new_icon.gif"/></span>
					<div class="box_top"></div>
					<div class="box_center">
						<p class="details" style="margin-right: 30px;"><a href="detail.action?bookid=1"></a>罗伯特家族在其生前全面增修版基础上，倾力修订改进的权威、详尽的议学经典！根据2000年由美国Perseus出版的官方版本翻译而成，原版总销量已逾500万册。</p>
						<a href="detail.action?bookid=1" class="more">- DETAILS -</a>
						<div class="clear"></div>
					</div>
					<div class="box_bottom"></div>
				</div>
				<div class="clear"></div>
			</div>
				</div>
			</div>
		</div>
			
		<jsp:include page="right.jsp"/>
		<jsp:include page="footer.jsp" />
		

<!-- Include All JavaScript -->
<script src="../js/news/masonry.pkgd.min.js"></script>
<script src="../js/news/imagesloaded.pkgd.min.js"></script>
<script src="../js/news/modernizr.custom.js"></script>
<script src="../js/news/classie.js"></script>
<script src="../js/news/colorfinder-1.1.js"></script>
<script src="../js/news/gridScrollFx.js"></script>
<script src="../js/jquery.min.js"></script>
<script src="../js/jquery.appear.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/main.js"></script>
</body>
</html>