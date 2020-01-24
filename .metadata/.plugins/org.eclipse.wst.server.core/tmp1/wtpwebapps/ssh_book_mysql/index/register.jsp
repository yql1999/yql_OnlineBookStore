<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>用户注册</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<div class="center_content">

	<div class="left_content" style="margin: 150px 150px;">
	
		<div class="title"><span class="title_icon"><img src="images/bullet6.gif"/></span>用户注册</div>
		
		<div class="feat_prod_box_details">
		
			<div class="contact_form">
				<div class="form_subtitle">用户注册</div>
				<span style="color:red;"><s:actionmessage/></span>
				<form action="register.action" method="post">
					<div class="form_row">
						<label class="contact"><strong>用户:</strong></label>
						<input type="text" name="user.username" class="contact_input" required="required" placeholder="请输入用户名" />
					</div>
					<div class="form_row">
						<label class="contact"><strong>密码:</strong></label>
						<input type="password" name="user.password" class="contact_input" required="required" placeholder="请输入密码" />
					</div>
					<div class="form_row">
						<label class="contact"><strong>电话:</strong></label>
						<input type="text" name="user.phone" class="contact_input" required="required" placeholder="请输入电话" "/>
					</div>
					<div class="form_row">
						<input type="submit" class="register" value="注册" style="margin-right:10px"/>
						<a href="login.jsp" style="float:right;margin:8px"><b>已有账户? 点击登录</b></a>
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