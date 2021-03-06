<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateActivityInfo.jsp' starting page</title>
    
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
 <form action="updateActivityByIdAction.action" method="post">
    <input type="submit" name="submit" value="保存"/>
   <input type="reset" name="reset" value="取消" /><br/><br/><br/>
   <input type="hidden" name="id" value="${activity.actId}"/>
 <!--<input type="text" name="imageFile" value=${savePath}></input><a href=addActivityImage.jsp>如需追加图片请点我</a><br/><br>  -->
   标题：<input type="text" id="titleID" size="80" name="title" maxlength="100" value="${activity.actName}"/>
  <br/><br/>
   内容：<textarea id="contentID" name="content" style="width:515px;height:100px">${activity.content}</textarea><br/><br/>
 <!-- 动态下拉列表 ,value="%{activity.buildId}"动态设置选中值--> 
    <s:select list="buildingList" name="buildId" label="活动地点" 
     listKey="buildId" listValue="buildName" value="%{activity.buildId}"
      headerKey="0" headerValue="---请选择---">   
 </s:select><br/><br/>
  详细地点：<input type="text" id="titleID" size="80" name="locationDetail" maxlength="100" value="${activity.attr2}"/><br/><br/>
  活动时间：<input type="text" name="activityDate" class="laydate-icon" onclick="laydate()" value="${activity.activityDate}"/><br/><br/>
 <input type="hidden" name="imageFile" value="${activity.imagePath}"/> 
 活动图片： <br/>
   <c:forEach var="path" items="${ImagePath}">  
    <img src="${path}" height="200" width="200"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   </c:forEach> <br/><br/><br/><br/><br/><br/>
   </form>
  </body>
</html>
