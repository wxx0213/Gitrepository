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
    
    <title>活动导航</title>
    
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
  <a href="moreActivityAction.action">更多活动</a><br/><br/>
  <s:iterator value="#request.activityList">
  <input type="hidden" value="${actId}"/>
   ${activityDate}&nbsp;&nbsp;&nbsp;&nbsp;<a href="selectActivityByIdAction.action?id=<s:property value="actId" />">${actName}</a><br/><br/>
  </s:iterator>
  </body>
</html>
