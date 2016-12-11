<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'admin_insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   	<div align="center">
   		<h4>添加用户页面</h4>
   		<form action="${pageContext.request.contextPath }/csdn/admin_saveObject.action" method="post">
   			<table border="1px" cellpadding="0" cellspacing="0">
   				<tr>
   					<td>用户名：</td>
   					<td><input type="text" name="adminName"/></td>
   				</tr>
   				<tr>
   					<td>密码：</td>
   					<td><input type="text" name="adminPassword"></td>
   				</tr>
   				<tr>
   					<td>确认密码：</td>
   					<td><input type="text" name="pass"></td>
   				</tr>
   				<tr>
   					<td>
   						<input type="submit" value="添加">
   						<input type="reset" value="重置">
   					</td>
   				</tr>
   			</table>
   		</form>		
   	</div>
  </body>
</html>
