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
	<link rel="stylesheet" href="css/pintuer.css">
	<link rel="stylesheet" href="css/admin.css">
	<script src="js/jquery.js"></script>
	<script src="js/pintuer.js"></script>
  </head>
  
  <body>
      ${information}
      <div class="panel admin-panel">
       <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 新增特色资源信息</strong></div>
       <div class="body-content">
  	<s:form action="AddSpecialtyAction.action" method="post" cssClass="form-x">
   			<div class="form-group">
        <div class="label">
          <label>图片：</label>
        </div>
        <div class="field">
        	 <input type="text" class="input tips" style="width:25%; float:left;" name="imageFile" value=${savePath}></input>
        
          <div class="tipss">图片尺寸：500*200</div>
          <div class="tipss"> <a href=addSpecialtyImage.jsp>上传图片</a></div>
        </div>
      </div>
 	
  	 <div class="form-group">
        <div class="label">
          <label>特色名称：</label>
        </div>
        <div class="field">
         <input type="text" class="input" name="name"/>
          <div class="tips"></div>
        </div>
      </div>
      
       <div class="form-group">
        <div class="label">
          <label>特色描述：</label>
        </div>
        <div class="field">
         <input type="text" class="input" name="description"/>
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>所属类型：</label>
        </div>
        <div class="field">
         <select id="content" name="type">
      		<option value="食物">食物</option>
	      <option value="服饰">服饰</option>
	      <option value="节日">节日</option>
      </select>
          <div class="tips"></div>
        </div>
      </div>
      
    <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" name="save" > 保存</button>
          <button class="button bg-main icon-check-square-o" type="reset" name="cancel" > 取消</button>
          
        </div>
   </s:form>
    </div>
</div>
  </body>
</html>
