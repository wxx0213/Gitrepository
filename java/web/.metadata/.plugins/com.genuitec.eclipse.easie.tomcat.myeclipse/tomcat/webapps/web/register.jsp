<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- JS代码 -->
	 <script type="text/javascript" src="<%=request.getContextPath()%>/JS/registerJS.js">
	 window.onload=function(){}
	 </script>
  </head>
  
  <body>
    <div align="center">
    <form action="RegisterAction.action"  method="post" onsubmit="return check()" >
         用户名：<input type="text" id="userNameID" size="20" name="userName" maxlength="10" onchange="checkName()"/>
         <label id="checktext1">请输入6-10位用户名</label><br/>
         密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" id="passwordID"  name="password" maxlength="10" onpaste="return false" oncontextmenu="return false" onchange="checkpwd()"/>
         <label id="checktext2">请输入6位以上的密码(含字母和数字)</label><br/>
         密码确认：<input type="password" id="repasswordID" size="20" name="repassword" maxlength="10" onpaste="return false" oncontextmenu="return false" onchange="checkpwdc()"/>
         <label id="checktext3">请确认您的密码</label><br/>
                姓名：<input type="text" size="20" id="realNameID" name="realName" maxlength="20"/><br/><br/>
         性别：<input type="radio" id="sexID" name="sex" value="男" checked="checked"/>男<input id="sexID" type="radio" name="sex" value="女"/>女<br/><br/>
         邮箱：<input type="text" size="20" id="emailID" name="email" maxlength="50" onchange="checkemail()"/>
         <label id="checktext4">请输入邮箱</label><br/><br/>
                手机：<input type="text" size="20" id="mobileID" name="mobile" maxlength="11"  onchange="checkmobile()"/>
         <label id="checktext5">请输入11位手机号
</label><br/><br/>
      <input type="submit" name="submit" value="注册"/>
      <input type="reset" name="reset" value="重置" />
    </form>
    </div>
  </body>
</html>
