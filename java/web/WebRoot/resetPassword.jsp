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
    
    <title>My JSP 'forgetPassword.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <script type="text/javascript">
//����������ʽ�ж������Ϸ�
  function checkpwd(){ 
  var check; 
  var reg =/^[a-zA-Z0-9]$/;
  var password = document.getElementById("passwordID").value; 
  if (password.length < 6 || password.length > 18) { 
   alert("请输入6-18位的密码");
   document.getElementById("passwordID").focus();
   check = false; 
  } else if(reg.test(password)){
   alert("密码应含有字母和数字");
   document.getElementById("passwordID").focus();
   check = false; 
  }
  else { 
   document.getElementById("checktext2").innerHTML = "OK"; 
   check = true; 
  } 
  return check; 
 }
 function checkpwdc() { 
  var check; 
  var password = document.getElementById("passwordID").value; 
  var pwdc = document.getElementById("repasswordID").value; 
  if (password != pwdc) { 
   alert("两次密码输入的不一致");
   document.getElementById("passwordID").focus();
   check = false; 
  } else { 
   document.getElementById("checktext3").innerHTML = "OK"; 
   check = true; 
  } 
  return check; 
 }
	</script>
  </head>
  
  <body>

    <div class="body-content">
     <s:form action="UpdatePasswordAction.action" method="post" cssClass="form-x" onsubmit="return check()">  
      <input type="hidden" name="userId" value="${userId}"/>  
      <div class="form-group">
        <div class="label">
          <label> 新密码：</label>
        </div>
        <div class="field">
          <input type="password" id="passwordID"  name="newPassword" maxlength="10" onpaste="return false" oncontextmenu="return false" onchange="checkpwd()"/>
          <div class="tips"> <label id="checktext2">请输入6位以上的密码</label><br/></div>
        </div>
      </div>     
      <div class="form-group">
        <div class="label">
          <label>确认密码：</label>
        </div>
        <div class="field">
          <input type="password"  id="repasswordID" name="repassword" maxlength="10"  onpaste="return false" oncontextmenu="return false" onchange="checkpwdc()"/>
          <div class="tips"><label id="checktext3">请确认您的密码</label><br/></div>
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
