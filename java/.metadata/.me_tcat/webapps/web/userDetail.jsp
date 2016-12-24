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
    
    <title>用户信息查看</title>
    
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
   <div class="form-group">
        <div class="label">
          <label> 用户名：</label>${user.userName}
        </div>
    </div>
    <div class="form-group">
        <div class="label">
          <label>姓名：</label>${user.realName}
        </div>
      </div>
         <div class="form-group"><!-- 注意test='%{user.sex=="男"}'中，只能用%而不能用$,字符串如"男"，必须用双引号，外层用单引号，否则会报错 -->
        <div class="label">
          <label>性别：</label><s:if test='%{user.sex=="男"}'>
          <input type="radio" id="sexID" name="sex" value="男"  disabled="true" checked="checked"/>男
          <input id="sexID" type="radio" name="sex" disabled="true" value="女"/>女
            </s:if>
            <s:else>
         <input id="sexID" type="radio" name="sex"  disabled="true" />男
         <input id="sexID" type="radio" name="sex"  disabled="true" checked="true"/>女
         </s:else>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>邮箱：</label>${user.email}
        </div>
        
      </div>
       <div class="form-group">
        <div class="label">
          <label>手机：</label>${user.mobile}
        </div>
       
      </div>
    </div>
  </body>
</html>

