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
    
    <title>My JSP 'updateUserInformation.jsp' starting page</title>
    
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
         用户名：${user.userName}
         <br/>
          姓名：${user.realName}<br/>
         性别：<!-- 注意test='%{user.sex=="男"}'中，只能用%而不能用$,字符串如"男"，必须用双引号，外层用单引号，否则会报错 -->
         <s:if test='%{user.sex=="男"}'>
         <input id="sexID" type="radio" name="sex"  disabled="true" checked="true"/>男
         <input id="sexID" type="radio" name="sex"  disabled="true"/>女
         </s:if><br/><br/>
         <s:else>
         <input id="sexID" type="radio" name="sex"  disabled="true" />男
         <input id="sexID" type="radio" name="sex"  disabled="true" checked="true"/>女
         </s:else><br/><br/>
          邮箱：${user.email}<br/>
                手机：${user.mobile}
<br/><br/>
    </div>
  </body>
</html>

