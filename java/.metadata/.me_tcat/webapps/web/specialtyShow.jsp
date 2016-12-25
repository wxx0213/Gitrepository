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
    
    <title>民族特色</title>
    
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
    <a href="moreSpecialtyAction.action">更多民族特色</a><br/>
    <!-- #request.buildingList请求对应action中的buildingList列表中存放的数据 -->
    <s:iterator value="#request.specialtyList">
    &nbsp;&nbsp;<s:property value="name"></s:property>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </s:iterator>
    <br>
    <s:form action="selectSpecialtyByIdAction.action" method="post">
    <s:iterator value="#request.imageList">  
    <!-- imageId作为参数传回action --> 
    <input type="image" src="${firstImagePath}" height="200" width="200" name="" value=""/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="hidden" name="ImageId" value="${imageId}"/>
    <a href="detailSpecialtyAction.action?id=<s:property value="imageId" />">详细</a>
    </s:iterator>
    </s:form>
  </body>
</html>
