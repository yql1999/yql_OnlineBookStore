<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>最新出版</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<div class="center_content">

	<div class="left_content">
	
		<div class="title"><span class="title_icon"><img src="images/bullet1.png"/></span>最新出版</div>
     	<% String[]s={"罗伯特家族在其生前全面增修版基础上，倾力修订改进的权威、详尽的议学经典！根据2000年由美国Perseus出版的官方版本翻译而成，原版总销量已逾500万册。",
"《重新发现社会》(修订本)对身处“历史三峡”中的中国及其前途作了一次通盘思考，内容涉及政治、经济、社会以及历史、文化、互联网等领域。作者以“中国，重新发现社会”为大脉络。",
"作者为什么对中国未来有信心，读者当能从本书中找到答案。",
"旅途不仅是行走，更是与自己的心灵和解、与世界温柔相拥的过程。灵魂命令我们对这星球的美一见倾心。人不能一味走下去，要驻扎在行程的空隙中，和灵魂会合。",
"《物种起源》是达尔文（1809-1882年）论述生物进化论的重要著作，出版于1859年11月24日。该书大概是19世纪最具有争议的著作，其中的观点大多数为当今科学界普遍接受。在该书中，达尔文首次提出了进化论的观点。他使用自己在19世纪30年代环球科学考察中积累的资料，试图证明物种的演化是通过自然选择（天择）和人工选择（人择）的方式实现的。"
     	};%>
     	<% for(int i=1;i<=5;i++){ %>
	     
			<div class="feat_prod_box">
				<div class="prod_img">
					<a href="detail.action?bookid=<%=i%>">
						<img src="../picture/<%=i %>.jpg" alt="图书图片" class="thumb_big" border="0"/>
					</a>
				</div>
				<div class="prod_det_box"><span class="new_icon"><img src="images/new_icon.gif"/></span>
					<div class="box_top"></div>
					<div class="box_center">
						<p class="details" style="margin-right: 30px;"><a href="detail.action?bookid=<%=i%>"><%=s[i-1] %></a></p>
						<a href="detail.action?bookid=<%=i%>" class="more">- DETAILS -</a>
						<div class="clear"></div>
					</div>
					<div class="box_bottom"></div>
				</div>
				<div class="clear"></div>
			</div>
			
		<%} %>
     
	    <!-- 分页 -->
		${pageTool}
		
		<div class="clear"></div>
	
	</div>
	
</div>
<jsp:include page="right.jsp"/>
<jsp:include page="footer.jsp"/>


</body>
</html>