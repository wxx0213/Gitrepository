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
    
    <title>特色建筑</title>
    
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
    <!-- 更新 -->
    <a>更多建筑信息</a><br/>
    <!-- 更新 -->
    <s:form action="GetBuildingInformationAction.action"  method="post">
    <input type="submit" value="查看特色建筑"/>
    </s:form>
    <!-- #request.buildingList请求对应action中的buildingList列表中存放的数据 -->
    <s:iterator value="#request.buildingList">
    &nbsp;&nbsp;<s:property value="buildName"></s:property>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </s:iterator>
    <br>
    <!-- 表示方法是对的，可以参考参数的传递
    <c:forEach var="path" items="${firstImagePath}">  
    <img src="${path}" height="200" width="200"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </c:forEach> -->
    <s:form action="getBuidingDetailAction.action" method="post">
    <s:iterator value="#request.imageList">  
    <!-- imageId作为参数传回action -->
   
    <input type="image" src="${firstImagePath}" height="200" width="200" name="" value=""/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="hidden" name="ImageId" value="${imageId}"/>
    <a href="getBuidingDetailAction.action?id=<s:property value="imageId" />">查看</a>
    </s:iterator>
    </s:form>
  </body>
</html>
