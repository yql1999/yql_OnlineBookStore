<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/cart.js"></script>
<title>购物车</title>
</head>
<body>

<jsp:include page="header.jsp"/>

<div class="center_content">

	<div class="left_content">
	
		<div class="title">我的购物车</div>
		
		<div class="feat_prod_box_details">
		
			<s:if test="#session.indent != null">
			
				<table class="cart_table">
				
					<s:iterator value="#session.indent.itemList">
						<tr class="cart_title">
							<td colspan="2">图书</td>
							<td colspan="1">单价</td>
							<td>数量</td>
							<td>总价</td>
							<td style="color:green;">[增加]</td>
							<td style="color:red;">[减少]</td>
							<td style="color:blue;">[删除]</td>
						</tr>
							
						<tr class="cart_title">
							<td>
								<a href="detail.action?bookid=${book.id}">
									<img src="../${book.cover}" class="thumb" border="0"/>
								</a>
							</td>
							<% request.setCharacterEncoding("utf-8"); %>
							<td>${book.name}</td>
							<td>${book.price}</td>
							<td>x ${amount}</td>
							<td>${total}</td>
							<td><a href="javascript:buy(${book.id});">▲</a></td>
							<td><a href="javascript:lessen(${book.id});">▼</a></td>
							<td><a href="javascript:deletes(${book.id});">╳</a></td>
						</tr>			
					</s:iterator>
					
	          		<tr>
			            <td colspan="7" class="cart_total"><span class="red" type="float:right;color:red;">总价: </span></td>
			            <td>￥<s:property value="#session.indent.total"/></td>
	          		</tr>
	        	</table><br>
	        	
	        	
	        	<div class="title">请填写以下订单</div>
	        	<form action="save.action" method="post" id="form_save_order">
	        		<table class="cart_table">
	        			<tr>
		        			<td>收货人姓名: <input type="text" name="indent.name" value="${indent.name}" placeholder="姓名" style="width:100px" required="required"/></td>
			        	</tr>
			        	<tr>
			        		<td>收货人电话: <input type="text" name="indent.phone" value="${indent.phone}" placeholder="电话" style="width:100px" required="required"/></td>
			        	</tr>
			        	<tr>
			        		<td>收货人地址: <input type="text" name="indent.address" value="${indent.address}" placeholder="收货地址" style="width:180px" required="required"/></td>
		        		</tr>
	        		</table>
	        		
	        		<input type="submit" class="checkout" value="提交订单"/>
	        		
	        	</form>
	        	
			
			</s:if>
			
			 <s:actionmessage/>
		
		</div>
		
		
		<div class="clear"></div>
	
	</div>
   
	<div class="clear"></div>
	
</div>
<jsp:include page="right.jsp"/>
<jsp:include page="footer.jsp"/>

</body>
</html>