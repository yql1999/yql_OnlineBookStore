<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
a:link {font-size:12px; color:#000000; text-decoration:none;}
a:visited {font-size:12px; color:#red; text-decoration:none;}
a:hover {font-size:12px; color:green;text-decoration:none;}
</style></head>

<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="36" style="background-color: rgba(0,0,0, 0.1);">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        	<td style="font-size:24px;padding-left:30px;color:blue;">
        		林海书店后台管理界面
        	</td>
        	<td style="padding-left:100px;">
	            	<img src="../images/logo.gif"> 
	         </td>
        <td>
        <td width="430" style="text-align:center;background-color: rgba(0,0,0, 0.1);"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>
            	<img src="images/uesr.gif" width="14" height="14">
            	<span> 当前管理员：<s:property value="#session.admin"></s:property></span>
            	<span> 
	            	<img src="images/quit.gif" width="16" height="13"> 
	            </span>
	            <span>
	            	<a href="login.jsp" target=_top>Exit</a>
	            </span>
	            &nbsp;&nbsp;
	            <span>
	            	<img src="images/home.gif" width="12" height="13"> 
	            </span>
	            <span>
	            	<a href="../index/index.action"  target="_blank">返回书店首页</a>
	            </span>
            </td>
          </tr>
        </table></td>
      </tr>
    </table>
    </td>
  </tr>
</table>
</body>
</html>
