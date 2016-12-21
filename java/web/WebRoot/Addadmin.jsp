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
    
    <title>register</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/pintuer.css">
	<link rel="stylesheet" href="css/admin.css">
	<!-- JS代码 -->
	 <script type="text/javascript" src="<%=request.getContextPath()%>/js/registerJS.js">
	 window.onload=function(){}
	 </script>
  </head>
  
  <body>
    <!--<div align="center">
    <form action="RegisterAction.action"  method="post" onsubmit="return check()" >
         用户名：<input type="text" id="userNameID"  name="userName" maxlength="10" onchange="checkName()"/>
         <label id="checktext1">请输入6-10位用户名</label><br/>
         密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" id="passwordID"  name="password" maxlength="10" onpaste="return false" oncontextmenu="return false" onchange="checkpwd()"/>
         <label id="checktext2">请输入6位以上的密码(含字母和数字)</label><br/>
         密码确认：<input type="password" id="repasswordID"  name="repassword" maxlength="10" onpaste="return false" oncontextmenu="return false" onchange="checkpwdc()"/>
         <label id="checktext3">请确认您的密码</label><br/>
                姓名：<input type="text"  id="realNameID" name="realName" maxlength="20"/><br/><br/>
         性别：<input type="radio" id="sexID" name="sex" value="男" checked="checked"/>男<input id="sexID" type="radio" name="sex" value="女"/>女<br/><br/>
         邮箱：<input type="text"  id="emailID" name="email" maxlength="50" onchange="checkemail()"/>
         <label id="checktext4">请输入邮箱</label><br/><br/>
                手机：<input type="text" id="mobileID" name="mobile" maxlength="11"  onchange="checkmobile()"/>
         <label id="checktext5">请输入11位手机号
</label><br/><br/>
      <input type="submit" name="submit" value="注册"/>
      <input type="reset" name="reset" value="重置" />
    </form>
    </div>
    
    --><div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>管理员注册</strong></div>
  <div class="body-content">
     <s:form action="RegisterAction.action" method="post" cssClass="form-x" onsubmit="return check()">    
      <div class="form-group">
        <div class="label">
          <label> 用户名：</label>
        </div>
        <div class="field">
          <input type="text" id="userNameID"  name="userName" maxlength="10" onchange="checkName()"  />
          <div class="tips"><label id="checktext1">请输入6-10位用户名</label><br/></div>
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label>密码：</label>
        </div>
        <div class="field">
         <input type="password"  id="passwordID"  name="password" maxlength="10" onpaste="return false" oncontextmenu="return false" onchange="checkpwd()"/>
          <div class="tips"> <label id="checktext2">请输入6位以上的密码(含字母和数字)</label><br/></div>
        </div>
      </div>
       <div class="form-group">
        <div class="label">
          <label>密码确认：</label>
        </div>
        <div class="field">
         <input type="password" id="repasswordID"  name="repassword" maxlength="10" onpaste="return false" oncontextmenu="return false" onchange="checkpwdc()"/>
          <div class="tips"><label id="checktext3">请确认您的密码</label><br/></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <input type="radio" id="sexID" name="type" value="1" checked="checked"/>管理员
          <input id="sexID" type="radio" name="type" value="0" disabled="ture"/>普通用户
        </div>
      </div>
        
     	 <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" id="realNameID" name="realName" maxlength="20"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>性别：</label>
        </div>
        <div class="field">
          <input type="radio" id="sexID" name="sex" value="男" checked="checked"/>男
          <input id="sexID" type="radio" name="sex" value="女"/>女
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>邮箱：</label>
        </div>
        <div class="field">
          <input type="text"  id="emailID" name="email" maxlength="50" onchange="checkemail()"/>
           <div class="tips"><label id="checktext4">请输入邮箱</label><br/></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>手机：</label>
        </div>
        <div class="field">
          <input type="text"  type="text" id="mobileID" name="mobile" maxlength="11"  onchange="checkmobile()"/>
           <div class="tips"><label id="checktext5">请输入11位手机号</label><br/></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit" name="save" > 注册</button>
          <button class="button bg-main icon-check-square-o" type="reset" name="cancel" > 重置</button>
          
        </div>
      </div>
    </s:form>
     </div>
</div>
    
  </body>
</html>
