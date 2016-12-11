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
				显示所有用户的信息
			</h3>
			<div>
                <a href="${pageContext.request.contextPath }/manager/admin/admin_insert.jsp">添加管理员</a>
           </div>
			<div>
				<table border="1px" cellpadding="0" cellspacing="0">
					<thead>
						<th>
							选择
						</th>
						<th>
							序号
						</th>
						<th>
							姓名
						</th>
						<th>
							操作
						</th>
					</thead>
					<tbody>
						<c:forEach var="entity" items="${entities}">
							<tr>
								<td>
									<input type="checkbox" name="id" value="${entitiy.adminId }" />
								</td>
								<td>
									${entity.adminId }
								</td>
								<td>
									${entity.adminName }
								</td>
								<td>
									<a href="${pageContext.request.contextPath }/csdn/admin_findAdminById.action?adminId=${entity.adminId}">更新</a>|
									<a href="${pageContext.request.contextPath }/csdn/admin_deleteObjectById.action?adminId=${entity.adminId}">删除</a>|
									<a href="${pageContext.request.contextPath }/csdn/admin_getObjectById.action?adminId=${entity.adminId}">查看详情</a>
								</td>
							</tr>
						</c:forEach>
						<tr>
							<td colspan="5" align="center">
								<a href="${pageContext.request.contextPath}/csdn/admin_getAllObjects.action?nowpage=1">首页</a>
								<a href="${pageContext.request.contextPath}/csdn/admin_getAllObjects.action?nowpage=${nowpage-1}">上一页</a>
								<a href="${pageContext.request.contextPath}/csdn/admin_getAllObjects.action?nowpage=${nowpage+1}">下一页</a>
								<a href="${pageContext.request.contextPath}/csdn/admin_getAllObjects.action?nowpage=${countPage}">末页</a>
						</tr>
					</tbody>

				</table>
			</div>
		</div>
	</body>
</html>

