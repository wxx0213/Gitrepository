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
    
    <title>民族特色详情</title>
    
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
         特色名称：${specialty.name}
         <br/>
         特色描述：<textarea id="contentID" name="content" style="width:515px;height:100px" readonly="readonly">${specialty.description}</textarea><br/><br/>
         所属类型：${specialty.type}<br/><br/>
         所属民族：${specialty.folk}<br/><br/>
         图片展示： <br/>
   <c:forEach var="path" items="${ImagePath}">  
    <img src="${path}" height="200" width="200"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </c:forEach> <br/><br/>
  </body>
</html>
