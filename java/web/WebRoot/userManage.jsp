<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%  
request.setCharacterEncoding("utf-8");  
%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userManage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
<body>   
<s:form action="ShowByConditionAction.action" method="post">  
          
          用户类型：<input type="text" name="userType" list="type"/>
          <datalist id="type">
          <option value="1">管理员</option>
          <option value="0">用户</option>
          </datalist>
          用户名：<input type="text" name="userName"/>
    <button class="button bg-main icon-check-square-o" type="submit" name="save" > 注册</button>
 </s:form>   
    <table  border="1" cellspacing="0" cellpadding="0" bordercolor="#999999" >  
      
          
        <tr bgcolor="#DDDDDD">  
         <td width="40" height="30"><div align="center"><strong>选择</strong></div></td>  
         <td width="150" ><div align="center"><strong>用户名</strong></div></td>  
         <td width="150"><div align="center"><strong>姓名</strong></div></td>  
         <td width="200"><div align="center"><strong>性别</strong></div></td>  
         <td width="200"><div align="center"><strong>用户类型</strong></div></td> 
         <td width="300"><div align="center"><strong>操作</strong></div></td> 
        </tr>  
    <s:iterator value="#request.userList">
    <tr>
         <td width="37" height="30"><div align="center"><input type="radio" name="selectUser" value="<s:property value="id" />" /></div></td> 
         <td width="148"><div align="center"><s:property value="userName" /></div></td>  
         <td width="198"><div align="center"><s:property value="realName" /></div></td>  
         <td width="100"><div align="center"><s:property value="sex" /></div></td>  
         <td width="100">
         <s:if test='%{type=="1"}'>
         <div align="center">管理员
         </s:if><br/><br/>
         <s:else>
         <div align="center">用户
         </s:else>
         </td>  
         <td width="300"><div align="center">
         <a href="SelectByIdAction.action?userId=<s:property value="id" />">查看</a>|
         <a href="SelectforUpdateAction.action?userId=<s:property value="id" />">修改</a>|
         <a href="DeleteUserByIdAction.action?userId=<s:property value="id" />">删除</a></div></td>  
    </tr>      
    </s:iterator>
    </table> 
    
    <table width="1100" border="0" cellpadding="0" cellspacing="0">  
    <tr>  
        <td bgcolor="E3E3E3" class="wang" align="center">　  
      
            <span class="x2" align="center">  
            <font color="#0072BC"><b>  
            <s:property value="page"/> /<s:property value="totalPage"/>;共<s:property value="userNum"/>条记录</b></font>  
            </span>  
        </td>  
    </tr>  
  
 <input type="hidden" name="maxNum" value="">  
        <tr align="center" valign="top" >  
            <td height="20">  
                <p align="center">    
            <span class="x2"><a href="ShowUserByPageAction.action?page=1">首 页</a>  
            <s:if test="page<=1">  
                                 上一页
            </s:if>  
            <s:else>  
            <a href="ShowUserByPageAction.action?page=<s:property value="page-1"/>">上一页  
            </a>            
            </s:else>  
                      
            <s:if test="page>=totalPage">  
                                下一页  
            </s:if>  
            <s:else>  
            <a href="ShowUserByPageAction.action?page=<s:property value="page+1"/>"> 下一页</a>  
            </s:else>  
            <a href="ShowUserByPageAction.action?page=<s:property value="totalPage"/>">最后一页</a>  
            </span>  
            </p>  
            </td>  
        </tr>  
</table> 

</body>  
</html>
