<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
  <title>Building</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	

	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
	<script src="js/jquery-1.11.0.min.js"></script>
	
	<!-- Custom Theme files -->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
		<script src="js/modernizr.custom.97074.js"></script><!-- 注释后鼠标悬浮不出现具体描述 -->
		<script src="js/jquery.chocolat.js"></script><!-- 注释后鼠标悬浮不出现具体描述 -->
		<script type="text/javascript" src="js/jquery.hoverdir.js"></script>
		<link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8">
		<!-- 刷新后回到前面 -->
		<script type="application/x-javascript"> 
		addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); 
		function hideURLbar(){ window.scrollTo(0,1); } 
	</script>
  </head>
  
  <body>
    <!--header start here-->
<div class="header1">
	<div class="container">
		 <div class="header-main">
			<div class="top-menu">					
					<ul>
						<li ><a href="index.html" >首页</a> </li>
						<li ><a href="about.html">玩遍校园 </a> </li>
						<li><a href="typo.html">校园文化</a></li>
						<li><a href="index.html"> <img src="images/lo1.png" alt=""> </a></li>
						<li><a href="galley.html">特色建筑 </a></li>
						<li><a href="galley.html">周边服务 </a></li>
						</ul>
				</div>
	 </div>
   </div>
</div>
<!--header end here-->
<!--gallery-starts-->
	<div class="gallery">
		<div class="container">
			<div class="gallery-top heading">
				<h2>特色建筑</h2>
				<p>清幽的环境，古朴的建筑，遇见民大，发现不一样的你。</p>
			</div>
			
				<ul id="da-thumbs" class="da-thumbs">
					<!--<li>
						<a href="images/g1.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g1.jpg" alt="" class="img-responsive">
							<div>
								<h5>民族博物馆</h5>
								<span>博物馆就坐落在校园的西南角，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					--><li>
						<a href="images/g2.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g2.jpg" alt="">
							<div>
								<h5>大礼堂</h5>
								<span>大礼堂就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					<li>
						<a href="images/g3.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g3.jpg" alt="">
							<div>
								<h5>逸夫体育馆</h5>
								<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					<li>
						<a href="images/g4.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g4.jpg" alt="">
							<div>
								<h5>民族歌剧院</h5>
								<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					<li>	
						<a href="images/g5.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g5.jpg" alt="">
							<div>
								<h5>理工楼</h5>
								<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					<li>
						<a href="images/g6.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g6.jpg" alt="">
							<div>
								<h5>文华楼</h5>
								<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					<!--<li>
						<a href="images/g7.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g7.jpg" alt="">
							<div>
								<h5>美术馆</h5>
								<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					--><li>
						<a href="images/g8.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g8.jpg" alt="">
							<div>
								<h5>图书馆</h5>
								<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					<li>
						<a href="images/g9.jpg" rel="title" class="b-link-stripe b-animate-go  thickbox">
							<img src="images/g9.jpg" alt="">
							<div>
								<h5>音乐厅</h5>
								<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>
							</div>
						</a>
					</li>
					
				</ul>
			
				
		<script type="text/javascript">
			$(function() {
			
				$(' #da-thumbs > li ').each( function() { $(this).hoverdir(); } );

			});
		</script>
        </div>
	</div>
<!--gallery-end-->
<!--footer start here-->
<div class="footer">
	<div class="container">
		<div class="footer-main">
			 <div class="col-md-4 ftr-grid">
			 	<div class="ftr-grid-left">
			 	    <img src="images/location.png" alt="">
			 	</div>
			 	<div class="ftr-grid-right">
			 		<p>地址：海淀区中关村南大街27号<span class="local">邮编：100081</span></p>
			 	</div>
			   <div class="clearfix"> </div>
			 </div>
			 <div class="col-md-4 ftr-grid">
			 	 <div class="ftr-grid-left">
			 	    <img src="images/email.png" alt="">
			 	</div>
			 	<div class="ftr-grid-right">
			 		<p>联系我们<span class="local">zzmzdx@muc.edu.cn</span></p>
			 	</div>
			   <div class="clearfix"> </div>
			 </div>
			 <div class="col-md-4 ftr-grid">
			 	 <div class="ftr-grid-left">
			 	    <img src="images/phone.png" alt="">
			 	</div>
			 	<div class="ftr-grid-right">
			 		<p>备案： 京ICP备10039345号<span class="local">京公网安备：110402430036</span></p>
			 	</div>
			   <div class="clearfix"> </div>
			 </div>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>
<!--footer end here-->
<!--copyright start here-->
<div class="copyright">
	<div class="container">
		<div class="copyright-main">
			   <p>Copyright &copy; 2016.Company name All rights reserved.</p>
			<div class="clearfix"> </div>
		</div>
	</div>
</div>
<!--copyright end here-->
  </body>
</html>
