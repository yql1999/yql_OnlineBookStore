<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>用户登录</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<div class="center_content"">

	<div class="left_content" style="margin: 150px 150px;">
	
		<div class="title"><span class="title_icon"><img src="images/bullet6.gif"/></span>用户登录</div>

		<div class="feat_prod_box_details">
		
			<div class="contact_form">
				<div class="form_subtitle">用户登录</div>
				<span style="color:red;"><s:actionmessage/></span>
				<form action="login.action" method="post">
					<div class="form_row">
						<label class="contact"><strong>用户名 :</strong></label>
						<input type="text" name="user.username" class="contact_input" placeholder="请输入用户名" />
					</div>
					<div class="form_row">
						<label class="contact"><strong>密  码 :</strong></label>
						<input type="password" name="user.password" class="contact_input" placeholder="请输入密码"  />
					</div>
					<div class="form_row"></div>
					<div class="form_row">
						<input type="submit" class="register" value="登  录" style="margin-right:20px"/>
						<a href="register.jsp" style="float:right;margin:8px">没有账户? 点击注册</a>
					</div>
				</form>
        	</div>
        
		</div>
	
	</div>
	
</div>
<jsp:include page="right.jsp"/>
<jsp:include page="footer.jsp"/>

</body>
</html>