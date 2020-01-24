<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
    body {
    background-image: url("../../images/slider/slider06.gif");
    background-size: 100%;
    background-repeat: no-repeat;
}
 
#login_frame {
    width: 400px;
    height: 260px;
    padding: 13px;
 
    position: absolute;
    left: 50%;
    top: 50%;
    margin-left: -200px;
    margin-top: -200px;
 
    background-color: rgba(0,0,0, 0.1);
 
    border-radius: 10px;
    text-align: center;
}
 
form p > * {
    display: inline-block;
    vertical-align: middle;
}
 
#image_logo {
    margin-top: 22px;
}
 
.label_input {
    font-size: 14px;
    font-family: 宋体;
 
    width: 65px;
    height: 28px;
    line-height: 28px;
    text-align: center;
 
    color: white;
    background-color: #3CD8FF;
    border-top-left-radius: 5px;
    border-bottom-left-radius: 5px;
}
 
.text_field {
    width: 278px;
    height: 28px;
    border-top-right-radius: 5px;
    border-bottom-right-radius: 5px;
    border: 0;
}
 
#btn_login {
    font-size: 14px;
    font-family: 宋体;
 
    width: 120px;
    height: 28px;
    line-height: 28px;
    text-align: center;
 
    color: white;
    background-color: #3BD9FF;
    border-radius: 6px;
    border: 0;
 
    float: left;
}
 
#forget_pwd {
    font-size: 12px;
    color: white;
    text-decoration: none;
    position: relative;
    float: right;
    top: 5px;
 
}
 
#forget_pwd:hover {
    color: blue;
    text-decoration: underline;/* 去链接底下的下划线 */
}
 
#login_control {
    padding: 0 28px;
}
    </style>
</head>
 
<body>
<div id="login_frame">
 
    <p id="image_logo"><img src="../../images/logo.gif"></p>
 
    	<form action="<s:url value="/admin/userAdd.action"/>" method="post" >
        <p><label class="label_input">用户名</label><input type="text" name=user.username"  id="username" class="text_field"/></p>
        <p><label class="label_input">密  码</label><input type="text" name="user.password" id="password" class="text_field"/></p>
 		<p><label class="label_input">电  话</label><input type="text" name="user.phone" id="phone" class="text_field"/></p>
        <div id="login_control">
            <input type="submit" id="btn_login" value="添加"/>
            <input style="margin-left:95px;" type="reset" id="btn_login" value="重置"/>
        </div>
    </form>
</div>
</body>
</html>
