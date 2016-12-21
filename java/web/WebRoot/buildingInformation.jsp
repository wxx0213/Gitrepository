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
    
    <title>特色建筑</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery-1.11.0.min.js"></script>		
	<!-- Custom Theme files -->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
	<!-- Custom Theme files -->
	<script type="application/x-javascript"> 
		addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); 
		function hideURLbar(){ window.scrollTo(0,1); } 
	</script>
	<!--Google Fonts-->
	<!-- start-smoth-scrolling -->
	<!--<script type="text/javascript" src="js/move-top.js"></script> -->
	<!--<script type="text/javascript" src="js/easing.js"></script> -->
	<!-- <script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script> -->
	<!-- <script src="js/menu_jquery.js"></script> -->
	 <script src="js/modernizr.custom.97074.js"></script>
		<script src="js/jquery.chocolat.js"></script>
		<link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8">
		<!--light-box-files -->
		<script type="text/javascript" charset="utf-8">
		$(function() {
			$('.gallery a').Chocolat();
		});
		</script>
		<script type="text/javascript" src="js/jquery.hoverdir.js"></script>
	 </head>
  
  <body>
  	<div class="gallery">
		<div class="container">
			<div class="gallery-top heading">
				 <s:form action="GetBuildingInformationAction.action"  method="post">
   					 <h2>特色建筑</h2>
   					 <p>清幽的环境，古朴的建筑，遇见民大，发现不一样的你。</p>
    			</s:form>
			</div>
			
			<ul id="da-thumbs" class="da-thumbs">
				<s:iterator value="#request.imageList"> 
					<li>
						<a href="getBuidingDetailAction.action?id=<s:property value="imageId" />" rel="title" class="b-link-stripe b-animate-go  thickbox">
								<s:form action="getBuidingDetailAction.action" method="post">
							 	<img src="${firstImagePath}" alt="" class="img-responsive"> 
							 	</s:form> 	  
							<div>
								<h5>${buildName}</h5>
								<input type="hidden" name="ImageId" value="${imageId}"/>
								<span>${buildDesc}</span>
								
							</div>
						</a>
					</li>
			 	</s:iterator>
			</ul>
			
				
		<script type="text/javascript">
			$(function() {
			
				$(' #da-thumbs > li ').each( function() { $(this).hoverdir(); } );

			});
		</script>
		</div>
	</div>
    <!--<s:form action="GetBuildingInformationAction.action"  method="post">
   		 <input type="submit" value="查看特色建筑"/>
    </s:form>
     #request.buildingList请求对应action中的buildingList列表中存放的数据 
    <s:iterator value="#request.buildingList">
    	<s:property value="buildName"></s:property>
    </s:iterator>
    <br>
   
    <s:form action="getBuidingDetailAction.action" method="post">
    	<s:iterator value="#request.imageList">  
    	 imageId作为参数传回action 
   
    	<input type="image" src="${firstImagePath}" height="200" width="200" name="" value=""/>
    		<input type="hidden" name="ImageId" value="${imageId}"/>
    		<a href="getBuidingDetailAction.action?id=<s:property value="imageId" />">查看</a>
    	</s:iterator>
    </s:form>
    -->
  </body>
</html>
