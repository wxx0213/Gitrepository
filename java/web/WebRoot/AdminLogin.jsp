<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.0.min.js"></script>
	<!-- Custom Theme files -->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
	<!-- Custom Theme files -->
  </head>
  
  <body>
    <div align="left">
		<div>
			<div>
				<div align="center">  <!-- id="loginBox" -->
												
					<s:form action="AdminLogin.action" method="post" id="loginForm">
						<fieldset id="body">
							<fieldset>
								<label for="email">用户名</label>
								<input type="text" name="username" id="email">
							</fieldset>
							<fieldset>
								<label for="password">密码</label>
								<input type="password" name="password" id="password">
							</fieldset>
							<fieldset>
							<div>
							<input type="radio" id="sexID" name="sex" value="1" checked="checked" disabled="true"/><span>管理员</span>
       						<input id="sexID" type="radio" name="sex" value="0" disabled="true"/>用户
       						</div>
        					
							</fieldset>
					</fieldset>
														
														<input type="submit" id="login" value="登录">
														<label for="checkbox">
															<a href=forgetPassword.jsp>忘记密码</a>
															
														</label>
													</fieldset>
													
												</s:form>
											</div>
										</div>
									</div>
								</div>
  </body>
</html>
