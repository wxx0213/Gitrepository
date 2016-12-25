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
    
    <title>修改民族特色信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
  </head>
  
  <body>
 <form action="updateSpecialtyByIdAction.action" method="post">
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" name="save" > 提交</button>
          <button class="button bg-main icon-check-square-o" type="reset" name="cancel" > 取消</button>
          
        </div>
        </div>
   <input type="hidden" name="id" value="${tbspecialty.id}"/>
      <div class="form-group">
        <div class="label">
          <label> 特色名称：</label>
        </div>
          <input type="text" class="input" name="name" value="${tbspecialty.name}"/>
        </div>

      
        <div class="form-group">
        <div class="label">
          <label> 特色描述：</label>
        </div>
          <input type="text" class="input" name="description" value="${tbspecialty.description}"/>
        </div>

      <div class="label">
          <label>所属类型：</label>
        </div>
          ${tbspecialty.type}
        <div class="label">
         <s:select list="constantList" name="id" label="所属民族" 
         listKey="id" listValue="constant" value="%{tbspecialty.folkId}"
         headerKey="0" headerValue="---请选择---" disabled="true">   
        </s:select><br/><br/>
        </div>

<input type="hidden" name="imageFile" value="${tbspecialty.imagePath}"/> 
 图片展示： <br/>
   <c:forEach var="path" items="${ImagePath}">  
    <img src="${path}" height="200" width="200"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </c:forEach> <br/><br/><br/><br/><br/><br/>
   </form>
  </body>
</html>
