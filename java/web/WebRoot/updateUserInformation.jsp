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
    
    <title>更改用户信息</title>
    
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
	<!-- JS代码 -->
	 <script type="text/javascript" src="<%=request.getContextPath()%>/js/registerJS.js">
	 window.onload=function(){}
	 </script>
	 <!--<script>
     <s:if test="Message != null"> 
     alert(<s:property value="Message"/>);
     </s:if>
     </script>-->
  </head>
  
  <body>
    <div class="body-content">
    <form action="UpdateByIdAction.action" cssClass="form-x" method="post" onsubmit="return check()" >
    <input type="hidden" name="userId" value="${user.id}"/>
    <div class="form-group">
        <div class="label">
          <label> 用户名：</label>
          <input type="text" id="userNameID"  name="userName" maxlength="10" onchange="checkName()" value="${user.userName}" />
          <label id="checktext1">请输入6-10位用户名</label>
        </div>
      </div>
    	 <div class="form-group">
        <div class="label">
          <label>姓名：</label>
           <input type="text" id="realNameID" name="realName" maxlength="20" value="${user.realName}" />
        </div>
      </div>
           <div class="form-group">
        <div class="label">
          <label>性别：</label><!-- 注意test='%{user.sex=="男"}'中，只能用%而不能用$,字符串如"男"，必须用双引号，外层用单引号，否则会报错 -->
          <s:if test='%{user.sex=="男"}'>
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
          <label>邮箱：</label>
          <input type="text"  id="emailID" name="email" maxlength="50" onchange="checkemail()" value="${user.email}"/>
			<label id="checktext4">请输入邮箱</label>
        </div>
      </div>
       <div class="form-group">
        <div class="label">
          <label>手机：</label>
          <input type="text"  type="text" id="mobileID" name="mobile" maxlength="11"  onchange="checkmobile()" value="${user.mobile}"/>
           <label id="checktext5">请输入11位手机号</label>
        </div>
        
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
  </body>
</html>
