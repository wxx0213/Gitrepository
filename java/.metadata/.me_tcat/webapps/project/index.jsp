<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'index.jsp' starting page</title>
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
			<h3>
				后台管理登陆界面
			</h3>

			<hr />

			<form
				action="${pageContext.request.contextPath}/csdn/admin_login.action"
				method="post">
				用户名:
				<input type="text" name="adminName" />
				<br />
				密&nbsp;&nbsp;码：
				<input type="password" name="adminPassword" />
				<br />
				<input type="submit" value="Login" />

			</form>
		</div>
		<div align="center">
		    ${name}
		</div>
	</body>
</html>
