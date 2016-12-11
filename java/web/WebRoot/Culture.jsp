<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Culture.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--Google Fonts-->
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
<script src="js/menu_jquery.js"></script>

  </head>
  
  <body>
   <div class="header1">
	<div class="container">
		 <div class="header-main">
				<!---->
					<div class="header-logo">
						<div class="logo">
						<a href="index.html"><img src="images/lo1.png" alt="" ></a>
						</div>
						<div class="top-nav">
							<span class="icon"><img src="images/menu.png" alt=""> </span>
							<ul>
								<li ><a href="index.html">首页</a> </li>
								<li ><a href="about.html" >玩遍校园  </a> </li>
								<li><a href="typo.html"  >校园文化</a></li>
								<li><a href="galley.html" >特色建筑</a></li>
								<li><a href="galley.html" >周边服务</a></li>
								<li><a href="contact.html" >联系我们 </a></li>
							</ul>
							<!--script-->
						<script>
							$("span.icon").click(function(){
								$(".top-nav ul").slideToggle(500, function(){
								});
							});
					</script>				
				</div>
				<div class="clearfix"> </div>
					</div>
			<!---->
			<div class="top-menu">					
					<ul>
						<li ><a href="index.html" >首页</a> </li>
						<li ><a href="about.html">玩遍校园 </a> </li>
						<li><a href="typo.html">校园文化</a></li>
						<li><a href="index.html"> <img src="images/lo1.png" alt=""> </a></li>
						<li><a href="galley.html">特色建筑 </a></li>
						<li><a href="galley.html">周边服务 </a></li>
						<li><a href="contact.html">联系我们</a></li>
						<li><div class="header-login">
									 <div class="top-nav-right">
										<div id="loginContainer"><a href="#" id="loginButton"><span>Login</span></a>
											    <div id="loginBox">                
											        <form id="loginForm">
											                <fieldset id="body">
											                	<fieldset>
											                          <label for="email">Email Address</label>
											                          <input type="text" name="email" id="email">
											                    </fieldset>
											                    <fieldset>
											                            <label for="password">Password</label>
											                            <input type="password" name="password" id="password">
											                     </fieldset>
											                    <input type="submit" id="login" value="Sign in">
											                	<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
											            	</fieldset>
											            <span><a href="#">Forgot your password?</a></span>
												 </form>
									        </div>
									  </div>
								   </div>
		                         </div>	</li>
					</ul>
				</div>
					<!--script-->
	 </div>
   </div>
</div>
<!--header end here-->
<!--about start here-->
<div class="about">
	<div class="container">
		<div class="about-main">
			    <div class="about-top">
					<h2>多样文化</h2>
					<p>来民大，感受少数民族特色风情</p>
				</div>
				<div class="about-bottom">
					<div class="col-md-7 about-left">
						<h3>虽然民大没有草原，但有那达慕呀</h3>
						<p>那达慕，第一批入选国家级非物质文化遗产名录，是蒙古族历史悠久的传统节日，在蒙古族人民的生活中占有重要地位。每年七、八月牲畜肥壮的季节举行的“那达慕”大会，是人们为了庆祝丰收而举行的文体娱乐大会。“那达慕”，蒙语的意思是娱乐或游戏。“那达慕”大会上有惊险刺激的赛马、摔跤，令人赞赏的射箭，有争强斗胜的棋艺，有引人入胜的歌舞。赛马也是大会上重要的活动之一。比赛开始，骑手们一字排开，个个扎着彩色腰带，头缠彩巾，洋溢着青春的活力。赛马的起点和终点插着各种鲜艳的彩旗，只等号角长鸣，骑手们便纷纷飞身上鞍，扬鞭策马，一时红巾飞舞，如箭矢齐发。前五名到达终点者，成为草原上最受人赞誉的健儿。射箭、摔跤等比赛也吸引着众多牧民。</p>
					</div>
					<div class="col-md-5 about-right">
						<a href="" >
							<img src="images/1.jpg" alt="" class="img-responsive ">
						</a>								
					</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="team-mem">
			 <h1>多样民族</h1>
			<div class="col-md-3 team-grid">
				<img src="images/bai.PNG"  alt="" class="img-responsive">
				    <ul class="img-social-stags">
							
							<div class="clearfix"> </div>
					</ul>
			</div>
			<div class="col-md-3 team-grid">
				<img src="images/chaoxian.PNG"  alt="" class="img-responsive">
				    <ul class="img-social-stags">
							<li><a class="twitter" href="#"><span> </span></a><li>
							<li><a class="facebook" href="#"><span> </span></a><li>
							<div class="clearfix"> </div>
					</ul>
			</div>
			<div class="col-md-3 team-grid">
				<img src="images/tujia.PNG"  alt="" class="img-responsive">
				    <ul class="img-social-stags">
							<li><a class="twitter" href="#"><span> </span></a><li>
							<li><a class="facebook" href="#"><span> </span></a><li>
							<div class="clearfix"> </div>
					</ul>
			</div>
			<div class="col-md-3 team-grid">
				<img src="images/lisu.PNG"  alt="" class="img-responsive">
				     <ul class="img-social-stags">
							<li><a class="twitter" href="#"><span> </span></a><li>
							<li><a class="facebook" href="#"><span> </span></a><li>
							<div class="clearfix"> </div>
					</ul>
			</div>
			
		   <div class="clearfix"> </div>
		</div>
		</div>
		<div class="advantages">
			<div class="container">
				<div class="advantage-main">
					<div class="advance-top">
						<h3>多样活动</h3>
					</div>
					<div class="advance-bottom">
					   <div class="col-md-6 advantage-left">
					   	<div class="advanc-grid">
					   	  <div class="col-md-3 advanc-icons">
					   		<img src="images/a1.png" alt="">
					   	  </div>
					   	  <div class="col-md-9 advanc-text">
					   		<h4>活动一</h4>
					   		<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>
					   	  </div>
					   	  <div class="clearfix"> </div>
					   	</div>
					   	<div class="advanc-grid">
					   	  <div class="col-md-3 advanc-icons">
					   		<img src="images/a2.png" alt="">
					   	  </div>
					   	  <div class="col-md-9 advanc-text">
					   		<h4>活动二</h4>
					   		<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>
					   	  </div>
					   	  <div class="clearfix"> </div>
					   	</div>
					   </div>
					   <div class="col-md-6 advantage-right">
					   	<div class="advanc-grid">
					   	  <div class="col-md-3 advanc-icons">
					   		 <img src="images/a3.png" alt="">
					   	  </div>
					   	  <div class="col-md-9 advanc-text">
					   		<h4>活动三</h4>
					   		<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>
					   	  </div>
					   	  <div class="clearfix"> </div>
					   	</div>
					   	<div class="advanc-grid">
					   	  <div class="col-md-3 advanc-icons">
					   		 <img src="images/a4.png" alt="">
					   	  </div>
					   	  <div class="col-md-9 advanc-text">
					   		<h4>活动四</h4>
					   		<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>
					   	  </div>
					   	  <div class="clearfix"> </div>
					   	</div>
					   </div>
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	</div>
</div>
<!--about end here-->
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
