 //验证用户名
   function checkName()
   {
   //在每个函数中定义check变量是为了在表单提交后，能够逐个验证每个函数是否通过，很好很好。（以下同理）
   var check; 
   var username = document.getElementById("userNameID").value; 
   if (username.length > 20 || username.length < 6) { 
    alert("用户名是6-20位，请重新输入！");
    //此处甚妙，既然你在此处输入错误，那么按理说当然要在此处继续输入了。（在此处继续获取焦点！）
    document.getElementById("userNameID").focus();
    check = false; 
   } else { 
    document.getElementById("checktext1").innerHTML = "√"; 
    check = true; 
   } 
   return check; 
  } 
  //利用正则表达式判断密码符合法
  function checkpwd(){ 
  var check; 
  var reg =/^[a-zA-Z0-9]$/;
  var password = document.getElementById("passwordID").value; 
  if (password.length < 6 || password.length > 18) { 
   alert("密码由6-18位字符组成！");
   document.getElementById("passwordID").focus();
   check = false; 
  } else if(reg.test(password)){
   alert("密码必须包含字母、数字请重新输入！");
   document.getElementById("passwordID").focus();
   check = false; 
  }
  else { 
   document.getElementById("checktext2").innerHTML = " √"; 
   check = true; 
  } 
  return check; 
 }
 //验证密码是否一致
 function checkpwdc() { 
  var check; 
  var password = document.getElementById("passwordID").value; 
  var pwdc = document.getElementById("repasswordID").value; 
  if (password != pwdc) { 
   alert("两次输入密码不一致，请重新输入！");
   document.getElementById("passwordID").focus();
   check = false; 
  } else { 
   document.getElementById("checktext3").innerHTML = " √"; 
   check = true; 
  } 
  return check; 
 }
 //验证邮箱
 function checkemail() { 
  var check; 
  var reg =/([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+/;
  var email= document.getElementById("emailID").value; 
  if(email==""|| !(reg.test(email))){
   alert("邮箱格式不正确！");
   document.getElementById("emailID").focus();
   check = false; 
  }
  else { 
   document.getElementById("checktext4").innerHTML = " √"; 
   check = true; 
  } 
  return check; 
 }
 //验证手机号
 function checkmobile() { 
  var check; 
  var reg = /^1(3|4|5|7|8)\d{9}/;
  var mobile= document.getElementById("mobileID").value; 
  if( mobile==""||!(reg.test(mobile))){
   alert("手机号格式不正确！");
   document.getElementById("mobileID").focus();
   check = false; 
  }
  else { 
   document.getElementById("checktext5").innerHTML = " √"; 
   check = true; 
  } 
  return check; 
 }
 
  function check() { 
  var check = checkName() && checkpwd() && checkpwdc() && checkemail() && checkmobile(); 
  return check; 
 } 
 