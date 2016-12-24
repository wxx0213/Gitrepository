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
	 <script type="text/javascript" src="<%=request.getContextPath()%>/js/laydate/laydate.js">
	 </script>
  </head>
  
<body>  
<a href="GetAllBulidingAction.action">添加活动</a> 
<s:form action="ShowActivityByConditionAction.action" method="post">          
          活动题目：<input type="text" name="actName"/>
    <!-- 更新 -->
          活动时间：<input type="text" name="activityDate" class="laydate-icon" onclick="laydate()"/>  
          创建日期：<input type="text" name="createDate" class="laydate-icon" onclick="laydate()"/>
    <!-- 更新 -->  
    <button class="button bg-main icon-check-square-o" type="submit" name="save" >搜索</button>
 </s:form>   
    <table  border="1" cellspacing="0" cellpadding="0" bordercolor="#999999" >  
      
          
        <tr bgcolor="#DDDDDD">  
         <td width="40" height="30"><div align="center"><strong>选择</strong></div></td>  
         <td width="150" ><div align="center"><strong>活动名称</strong></div></td>  
         <td width="150"><div align="center"><strong>活动地点</strong></div></td> 
         <!-- 更新 -->
         <td width="200"><div align="center"><strong>活动时间</strong></div></td> 
         <!-- 更新 -->
         <td width="200"><div align="center"><strong>创建日期</strong></div></td>   
         <td width="300"><div align="center"><strong>操作</strong></div></td> 
        </tr>  
    <s:iterator value="#request.activityList">
    <tr>
         <td width="37" height="30"><div align="center"><input type="radio" name="select" value="<s:property value="actId" />" /></div></td> 
         <td width="148"><div align="center"><s:property value="actName" /></div></td>  
         <td width="198"><div align="center"><s:property value="actPlace" /></div></td>
         <!-- 更新 --> 
         <td width="100"><div align="center"><s:property value="activityDate" /></div></td>
         <!-- 更新 -->  
         <td width="100"><div align="center"><s:property value="createDate" /></div></td>  
         <td width="300"><div align="center">
         <a href="selectActivityByIdAction.action?id=<s:property value="actId" />">查看</a>|
         <a href="selectForupdateActivityAction.action?id=<s:property value="actId" />">修改</a>|
         <a href="deleteActivityByIdAction.action?id=<s:property value="actId" />">删除</a></div></td>  
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
  
        <tr align="center" valign="top" >  
            <td height="20">  
                <p align="center">    
            <span class="x2"><a href="ShowActivityAction.action?page=1">首 页</a>  
            <s:if test="page<=1">  
                                 上一页
            </s:if>  
            <s:else>  
            <a href="ShowActivityAction.action?page=<s:property value="page-1"/>">上一页  
            </a>            
            </s:else>  
                      
            <s:if test="page>=totalPage">  
                                下一页  
            </s:if>  
            <s:else>  
            <a href="ShowActivityAction.action?page=<s:property value="page+1"/>"> 下一页</a>  
            </s:else>  
            <a href="ShowActivityAction.action?page=<s:property value="totalPage"/>">最后一页</a>  
            </span>  
            </p>  
            </td>  
        </tr>  
</table> 

</body>  
</html>
