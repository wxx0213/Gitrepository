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
    
    <title>密码找回</title>
    
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
  </head>
  
  <body>
    <div class="body-content">
     <s:form action="CheckForResetPassAction.action" method="post" cssClass="form-x" onsubmit="return check()">    
      <div class="form-group">
        <div class="label">
          <label> 用户名：</label>
        </div>
        <div class="field">
          <input type="text" id="userNameID"  name="userName" maxlength="10"/>
        </div>
      </div>     
      <div class="form-group">
        <div class="label">
          <label>邮箱：</label>
        </div>
        <div class="field">
          <input type="text"  id="emailID" name="email" maxlength="50"/>
        </div>
      </div> 
      <div class="form-group">
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" name="save" >提交</button>
          <button class="button bg-main icon-check-square-o" type="reset" name="cancel" >取消</button>       
        </div>
      </div>
    </s:form>
     </div>
  </body>
</html>
