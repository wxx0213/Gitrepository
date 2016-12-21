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
    
    <title>addActivity</title>
    
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
  	<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 新增活动信息</strong></div>
  <div class="body-content">
   <form action="AddActivityAction.action" method="post" class="form-x">
   	<div class="form-group">
        <div class="label">
          <label>图片：</label>
        </div>
        <div class="field">
        	 <input type="text" class="input tips" style="width:25%; float:left;" name="imageFile" value=${savePath}></input>
        
          <div class="tipss">图片尺寸：500*200</div>
          <div class="tipss"> <a href=addActivityImage.jsp>上传图片</a></div>
        </div>
      </div>
    <div class="form-group">
        <div class="label">
          <label>活动标题：</label>
        </div>
        <div class="field">
         <input type="text" class="input" id="titleID" size="80" name="title" maxlength="100"/>
          <div class="tips"></div>
        </div>
      </div>
 
		 <div class="form-group">
        <div class="label">
          <label>活动内容：</label>
        </div>
        <div class="field">
         <textarea class="input" id="contentID" style="width:515px;height:100px" name="content"/></textarea>
          <div class="tips"></div>
        </div>
      </div>
       <div class="form-group">
       		<s:select list="buildingList" name="buildId" label="活动地点"  
       		listKey="buildId" listValue="buildName" headerKey="0" headerValue="---请选择---"/>
      
        
       </div>
   	 
   <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" name="save" > 保存</button>
          <button class="button bg-main icon-check-square-o" type="reset" name="cancel" > 取消</button>
          
        </div>
      </div>
   </form>
     </div>
</div>
  </body>
</html>
