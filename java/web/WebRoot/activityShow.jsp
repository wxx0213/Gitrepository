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
    
    <title>更多活动</title>
    
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
<s:form action="ShowActivityByConditionAction.action" method="post">          
          活动名称：<input type="text" name="actName"/>
          活动时间：<input type="text" name="activityDate" class="laydate-icon" onclick="laydate()"/>  
    <button class="button bg-main icon-check-square-o" type="submit" name="save" >搜索</button>
 </s:form>   
    <table  border="1" cellspacing="0" cellpadding="0" bordercolor="#999999" >          
        <tr bgcolor="#DDDDDD">   
         <td width="150" ><div align="center"><strong>活动名称</strong></div></td>  
         <td width="200"><div align="center"><strong>活动时间</strong></div></td> 
         <td width="300"><div align="center"><strong>查看</strong></div></td> 
        </tr>  
    <s:iterator value="#request.activityList">
    <tr> 
         <td width="150"><div align="center"><s:property value="actName" /></div></td>  
         <td width="200"><div align="center"><s:property value="activityDate" /></div></td>
         <td width="300"><div align="center">
         <a href="selectActivityByIdAction.action?id=<s:property value="actId" />">查看</a></div></td>  
  
    </tr>      
    </s:iterator>
    </table> 
    
    <table width="650" border="0" cellpadding="0" cellspacing="0">  
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
