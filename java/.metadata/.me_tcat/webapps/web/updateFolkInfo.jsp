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
    
    <title>修改民族信息</title>
    
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
   <form action="updateFolkByIdAction.action" method="post">
  <input type="hidden" name="id" value="${tbconstant.id}"/>
    民族：<input type="text" id="titleID" size="80" name="constant" maxlength="100" value="${tbconstant.constant}"/>
  <br/><br/>
    民族描述：<textarea id="contentID" name="meaning" style="width:515px;height:100px">${tbconstant.meaning}</textarea><br/><br/>
   <input type="submit" name="submit" value="保存"/>
   <input type="reset" name="reset" value="取消" />
   </form>
  </body>
</html>