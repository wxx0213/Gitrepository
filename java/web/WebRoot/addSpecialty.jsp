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
    
    <title>My JSP 'addSpecialty.jsp' starting page</title>
    
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
      ${information}
  <s:form action="AddSpecialtyAction.action" method="post">
  <input type="text" name="imageFile" value=${savePath}></input><a href=addSpecialtyImage.jsp>上传图片</a><br/><br>
      特色名称：<input type="text" name="name"/><br/><br/>
      特色描述：<input type="text" name="description"/><br/><br/>
     <!-- 更新 -->
       所属类型：
      <select id="content" name="type">
      <option value="0">---请选择---</option>
      <option value="食物">食物</option>
      <option value="服饰">服饰</option>
      <option value="节日">节日</option>
      </select> 
      <br/><br/>
    <!-- 动态下拉列表 -->
    <s:select list="constantList" name="folkId" label="所属民族" 
     listKey="id" listValue="constant"
     headerKey="0" headerValue="---请选择---"/>
     
      <div style="position:absolute;top:230px;left:50px;">
      <input type="submit" name="save" value="保存"/> 
      <input type="reset" name="cancel" value="取消"/>
      </div>
      <!-- 更新 -->
   </s:form>
   
  </body>
</html>
