<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'activityDetail.jsp' starting page</title>
    
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
     <div align="left">
         活动名称：${activity.actName}
         <br/>
         活动内容：<textarea id="contentID" name="content" style="width:515px;height:100px" readonly="readonly">${activity.content}</textarea><br/><br/>
         活动时间：${activity.activityDate}<br/><br/>
         活动地址：${actPlace}<br/><br/>
         活动图片： <br/>
   <c:forEach var="path" items="${ImagePath}">  
    <img src="${path}" height="200" width="200"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </c:forEach> <br/><br/>
  </body>
</html>
