 //��֤�û���
   function checkName()
   {
   //��ÿ�������ж���check������Ϊ���ڱ��ύ���ܹ������֤ÿ�������Ƿ�ͨ�����ܺúܺá�������ͬ��
   var check; 
   var username = document.getElementById("userNameID").value; 
   if (username.length > 20 || username.length < 6) { 
    alert("�û�����6-20λ�����������룡");
    //�˴������Ȼ���ڴ˴����������ô����˵��ȻҪ�ڴ˴����������ˡ����ڴ˴�������ȡ���㣡��
    document.getElementById("userNameID").focus();
    check = false; 
   } else { 
    document.getElementById("checktext1").innerHTML = "��"; 
    check = true; 
   } 
   return check; 
  } 
  //����������ʽ�ж�������Ϸ�
  function checkpwd(){ 
  var check; 
  var reg =/^[a-zA-Z0-9]$/;
  var password = document.getElementById("passwordID").value; 
  if (password.length < 6 || password.length > 18) { 
   alert("������6-18λ�ַ���ɣ�");
   document.getElementById("passwordID").focus();
   check = false; 
  } else if(reg.test(password)){
   alert("������������ĸ���������������룡");
   document.getElementById("passwordID").focus();
   check = false; 
  }
  else { 
   document.getElementById("checktext2").innerHTML = " ��"; 
   check = true; 
  } 
  return check; 
 }
 //��֤�����Ƿ�һ��
 function checkpwdc() { 
  var check; 
  var password = document.getElementById("passwordID").value; 
  var pwdc = document.getElementById("repasswordID").value; 
  if (password != pwdc) { 
   alert("�����������벻һ�£����������룡");
   document.getElementById("passwordID").focus();
   check = false; 
  } else { 
   document.getElementById("checktext3").innerHTML = " ��"; 
   check = true; 
  } 
  return check; 
 }
 //��֤����
 function checkemail() { 
  var check; 
  var reg =/([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+/;
  var email= document.getElementById("emailID").value; 
  if(email==""|| !(reg.test(email))){
   alert("�����ʽ����ȷ��");
   document.getElementById("emailID").focus();
   check = false; 
  }
  else { 
   document.getElementById("checktext4").innerHTML = " ��"; 
   check = true; 
  } 
  return check; 
 }
 //��֤�ֻ���
 function checkmobile() { 
  var check; 
  var reg = /^1(3|4|5|7|8)\d{9}/;
  var mobile= document.getElementById("mobileID").value; 
  if( mobile==""||!(reg.test(mobile))){
   alert("�ֻ��Ÿ�ʽ����ȷ��");
   document.getElementById("mobileID").focus();
   check = false; 
  }
  else { 
   document.getElementById("checktext5").innerHTML = " ��"; 
   check = true; 
  } 
  return check; 
 }
 
  function check() { 
  var check = checkName() && checkpwd() && checkpwdc() && checkemail() && checkmobile(); 
  return check; 
 } 
 