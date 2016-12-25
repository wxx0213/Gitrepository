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
    
    <title>民族特色管理</title>
    
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
<s:form action="showSpecialtyByConditionAction.action" method="post">          
          特色名称：<input type="text" name="name"/>
          所属类型：<select id="content" name="type">
      <option value="">---请选择---</option>
      <option value="食物">食物</option>
      <option value="服饰">服饰</option>
      <option value="节日">节日</option>
      </select> 
    <s:select list="folkList" name="folkId" label="所属民族" 
     listKey="id" listValue="constant"
     headerKey="0" headerValue="---请选择---"/>
    <div style="position:absolute;left:1000px;">
    <button class="button bg-main icon-check-square-o" type="submit" name="save" >搜索</button>
    </div>
 </s:form>   
    <table  border="1" cellspacing="0" cellpadding="0" bordercolor="#999999" >  
            
        <tr bgcolor="#DDDDDD">  
         <td width="40" height="30"><div align="center"><strong>选择</strong></div></td>  
         <td width="150" ><div align="center"><strong>特色名称</strong></div></td>  
         <td width="150"><div align="center"><strong>所属类型</strong></div></td> 
         <!-- 更新 -->
         <td width="200"><div align="center"><strong>所属民族</strong></div></td> 
         <!-- 更新 -->
         <td width="200"><div align="center"><strong>描述</strong></div></td>   
         <td width="300"><div align="center"><strong>操作</strong></div></td> 
        </tr>  
    <s:iterator value="#request.specialtyList">
    <tr>
         <td width="37" height="30"><div align="center"><input type="radio" name="select" value="<s:property value="id" />" /></div></td> 
         <td width="148"><div align="center"><s:property value="name" /></div></td>  
         <td width="198"><div align="center"><s:property value="type" /></div></td>
         <!-- 更新 --> 
         <td width="100"><div align="center"><s:property value="folk" /></div></td>
         <!-- 更新 -->  
         <td width="100"><div align="center"><s:property value="description" /></div></td>  
         <td width="300"><div align="center">
         <a href="selectSpecialtyByIdAction.action?id=<s:property value="id" />">查看</a></div></td>  
    </tr>      
    </s:iterator>
    </table> 
    
    <table width="1100" border="0" cellpadding="0" cellspacing="0">  
    <tr>  
        <td bgcolor="E3E3E3" class="wang" align="center">　  
      
            <u><span class="x2" align="center">   
            <font color="#0072bc"><b>   
            <s:property value="page"/> /<s:property value="totalPage"/>;共<s:property value="userNum"/>条记录</b></font>  
            </span></u>  
        </td>  
    </tr>  
  
        <tr align="center" valign="top" >  
            <td height="20">  
                <p align="center">    
            <span class="x2"><a href="showSpecialtyByConditionAction.action?page=1">首 页</a>  
            <s:if test="page<=1">  
                                 上一页
            </s:if>  
            <s:else>  
            <a href="showSpecialtyByConditionAction.action?page=<s:property value="page-1"/>">上一页  
            </a>            
            </s:else>  
                      
            <s:if test="page>=totalPage">  
                                下一页  
            </s:if>  
            <s:else>  
            <a href="showSpecialtyByConditionAction.action?page=<s:property value="page+1"/>"> 下一页</a>  
            </s:else>  
            <a href="showSpecialtyByConditionAction.action?page=<s:property value="totalPage"/>">最后一页</a>  
            </span>  
            </p>  
            </td>  
        </tr>  
</table> 

</body>  
</html>
