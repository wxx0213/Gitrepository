<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>添加建筑信息</title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
  
  <body>
  ${information}
  <!--<s:form action="AddArchitectureAction.action" method="post">
  <input type="text" name="imageFile" value=${savePath}></input><a href=addImage.jsp>上传图片</a><br/><br>
       建筑名称：<input type="text" name="buildingName"/><br>
      建筑位置：<input type="text" name="buildingLocation"/><br>
      建筑描述：<input type="text" name="buildingDescription"/><br>
   <input type="submit" name="save" value="保存"/> 
   <input type="reset" name="cancel" value="取消"/> <br/>
   </s:form>
   
   -->
   <div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 新增建筑信息</strong></div>
  <div class="body-content">
     <s:form action="AddArchitectureAction.action" method="post" cssClass="form-x" >    
      <div class="form-group">
        <div class="label">
          <label>图片：</label>
        </div>
        <div class="field">
        	 <input type="text" class="input tips" style="width:25%; float:left;" name="imageFile" value=${savePath}></input>
         
        <a href=addImage.jsp>上传图片</a>
          <div class="tipss">图片尺寸：500*200</div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label> 建筑名称：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="buildingName"  />
          <div class="tips"></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>建筑位置：</label>
        </div>
        <div class="field">
         <input type="text" class="input" name="buildingLocation"/>
          <div class="tips"></div>
        </div>
      </div>
       <div class="form-group">
        <div class="label">
          <label>建筑描述：</label>
        </div>
        <div class="field">
         <input type="text" class="input" name="buildingDescription"/>
          <div class="tips"></div>
        </div>
      </div>
     	
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" name="save" > 提交</button>
          <button class="button bg-main icon-check-square-o" type="reset" name="cancel" > 取消</button>
          
        </div>
      </div>
    </s:form>
  </div>
</div>
   
  </body>
</html>
