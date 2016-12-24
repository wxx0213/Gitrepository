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
    
    <title>userManage</title>
    
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
<s:form name="form1" id="listform" action="ShowByConditionAction.action" method="post">  
    <div class="panel-head"><strong class="icon-reorder"> 用户列表</strong> </div>
     <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="register.jsp"> 添加用户</a> </li>
       
        <li>
        	 用户类型：<input type="text" name="userType" style="width:250px; line-height:17px;display:inline-block" list="type"/>
          <datalist id="type">
          <option value="1">管理员</option>
          <option value="0">用户</option>
          </datalist>
          用户名：<input type="text" style="width:250px; line-height:17px;display:inline-block" name="userName"/><!--
          <input type="text" placeholder="请输入搜索关键词" name="imageId" class="input" style="width:250px; line-height:17px;display:inline-block" />
          -->
          <button class="button bg-main icon-check-square-o" type="submit" name="save" > 搜索</button>
      </ul>
    </div>
 </s:form>   
    <table  cellspacing="0" cellpadding="0"  class="table table-hover text-center">    
      
          
        <tr>  
         <th width="100" style="text-align:left; padding-left:20px;">选择</th>  
         <th width="10%">用户名</th>
        <th>姓名</th>
        <th>性别</th>
        <th>用户类型</th>
        <th width="30%">操作</th>
        </tr>  
    <s:iterator value="#request.userList">
    <tr>
         <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="selectUser" value="<s:property value="id" />" /></td> 
         <td ><s:property value="userName" /></td>  
         <td ><s:property value="realName" /></td>  
         <td ><s:property value="sex" /></td>  
         <td width="100">
         <s:if test='%{type=="1"}'>
         <div align="center">管理员</div>
         </s:if>
         <s:else>
         <div align="center">用户</div>
         </s:else>
         </td>  
         <td width="300">
         <div class=""> 
         	<a class="button" href="SelectByIdAction.action?userId=<s:property value="id" />"><span class="icon-edit"></span>查看</a>
           <a class="button border-red" href="DeleteUserByIdAction.action?userId=<s:property value="id" />" ><span class="icon-trash-o"></span>删除</a> 
           <a class="button border-main" href="SelectforUpdateAction.action?userId=<s:property value="id" />"><span class="icon-edit"></span>修改</a>          
           </div>
          </td>  
    </tr>      
    </s:iterator>
    </table> 
    
    <table width="850" border="0" cellpadding="0" cellspacing="0">  
    
  	 <!--<tr>
        <td style="text-align:left; padding:19px 0;padding-left:20px;"><input type="checkbox" id="checkall"/>
          全选 </td>
        <td colspan="7" style="text-align:left;padding-left:20px;">
        <a href="javascript:void(0)" class="button border-red icon-trash-o" style="padding:5px 15px;" onclick="DelSelect()"> 删除</a> 
        <a href="javascript:void(0)" style="padding:5px 15px; margin:0 10px;" class="button border-blue icon-edit" onclick="sorts()"> 排序</a> 
        </td> 
      </tr>-->
        <tr align="center" valign="top" >  
        
            <td colspan="8"> 
            	<div class="pagelist">            
           			 <input type="hidden" name="maxNum" value="" />  
            <a href="ShowUserByPageAction.action?page=1">首 页</a>  
            <s:if test="page<=1">  
                                 上一页
            </s:if>  
            <s:else>  
            <a href="ShowUserByPageAction.action?page=<s:property value="page-1"/>">上一页  </a>           
            </s:else>  
                 <s:property value="page"/> /<s:property value="totalPage"/>    
            <s:if test="page>=totalPage">  
                                下一页  
            </s:if>  
            <s:else>  
            <a href="ShowUserByPageAction.action?page=<s:property value="page+1"/>"> 下一页</a>  
            </s:else>  
            <a href="ShowUserByPageAction.action?page=<s:property value="totalPage"/>">尾页</a>
            <span>共<s:property value="userNum"/>条记录</span>
            </div> 
            </td>  

        </tr>  
</table> 

</body>  
</html>
