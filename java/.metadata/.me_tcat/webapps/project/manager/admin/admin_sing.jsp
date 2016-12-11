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
				显示用户的信息
			</h3>
			<div>
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
						${entity.adminName }
						</td>
					</tr>				
				</table>
				<a href="${pageContext.request.contextPath }/csdn/admin_getAllObjects.action">返回</a>
			</div>
		</div>
	</body>
</html>

