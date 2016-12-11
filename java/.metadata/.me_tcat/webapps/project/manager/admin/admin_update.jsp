<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				更新用户界面
			</h3>
			<div>
			<form action="${pageContext.request.contextPath }/csdn/admin_updateObject.action" method="post">
				<table border="1px" cellpadding="0" cellspacing="0">
					<tr>
						<td>序号</td>
						<td>
						${entity.adminId }
						</td>
					</tr>
					<tr>
						<td>姓名</td>
						<td>
						<input type="text" name="adminName" value="${entity.adminName }"/>
						</td>
					</tr>				
				</table>
				<input type="hidden" name="adminId" value="${entity.adminId }"/>
				<input type="submit" value="更新"/>
			</form>
			</div>
		</div>
	</body>
</html>

