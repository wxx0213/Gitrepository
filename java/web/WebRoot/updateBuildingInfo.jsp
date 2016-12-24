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
    
    <title>修改建筑信息</title>
    
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
 <form action="updateBuildingByIdAction.action" method="post">
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" name="save" > 提交</button>
          <button class="button bg-main icon-check-square-o" type="reset" name="cancel" > 取消</button>
          
        </div>
        </div>
   <input type="hidden" name="id" value="${building.buildId}"/>
   <div class="form-group">
        <div class="label">
          <label> 建筑名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="buildingName" value="${building.buildName}"/>
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>建筑位置：</label>
        </div>
        <div class="field">
         <input type="text" class="input" name="buildingLocation" value="${building.location}"/>
          <div class="tips"></div>
        </div>
      </div>
       <div class="form-group">
        <div class="label">
          <label>建筑描述：</label>
        </div>
        <div class="field">
         <input type="text" class="input" name="buildingDescription" value="${building.description}"/>
          <div class="tips"></div>
        </div>
      </div>    	
<input type="hidden" name="imageFile" value="${building.imagePath}"/> 
 建筑图片： <br/>
   <c:forEach var="path" items="${ImagePath}">  
    <img src="${path}" height="200" width="200"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </c:forEach> <br/><br/><br/><br/><br/><br/>
   </form>
  </body>
</html>
