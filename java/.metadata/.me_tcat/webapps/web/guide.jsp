<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'guide.jsp' starting page</title>
    
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
    <!--header start here-->
<div class="header1">
	<div class="container">
		 <div class="header-main">
				<!---->
					<div class="header-logo">
						<div class="logo">
						<a href="index.jsp"><img src="images/lo1.png" alt="" ></a>
						</div>
						<div class="top-nav">
							<span class="icon"><img src="images/menu.png" alt=""> </span>
							<ul>
								<li ><a href="index.html">首页</a> </li>
								<li ><a href="about.html" >玩遍校园  </a> </li>
								<li><a href="typo.html"  >校园文化</a></li>
								<li><a href="galley.html" >特色建筑</a></li>
								<li><a href="galley.html" >周边服务</a></li>
								
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
						<li><a href="index.jsp"> <img src="images/lo1.png" alt=""> </a></li>
						<li><a href="building.html">特色建筑 </a></li>
						<li><a href="galley.html">周边服务 </a></li>
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
<!--single start here-->
		 <div class="single">
			<div class="container">
			<div class="col-md-8 ">
				<div class=" single-grid">
					<h4>Compus of MUC</h4>
					<img class="img-responsive" src="images/4.jpg" alt=""  class="img-responsive">
					
					<p></p>
					<p></p>
				</div>
					<div class=" single-profile">
				<h4> Related Posts</h4>
				<div class="single-left ">					
					<div class="col-md-3 post-top">
					<img class="img-responsive " src="images/s1.jpg" alt="">
						<h6>Duis autem</h6>
						<p>Lorem ipsum dolor sit amet, consectetuer .</p>
					</div>
					<div class="col-md-3 post-top">
					<img class="img-responsive " src="images/s2.jpg" alt="">
						<h6>Duis autem</h6>
						<p>Lorem ipsum dolor sit amet, consectetuer .</p>
					</div>
					<div class="col-md-3 post-top">
					<img class="img-responsive " src="images/s3.jpg" alt="">
						<h6>Duis autem</h6>
						<p>Lorem ipsum dolor sit amet, consectetuer .</p>
					</div>
					<div class="col-md-3 post-top">
					<img class="img-responsive " src="images/s4.jpg" alt="">
						<h6>Duis autem</h6>
						<p>Lorem ipsum dolor sit amet, consectetuer .</p>
					</div>
					<div class="clearfix"> </div>
				</div>
			</div>
			<div class="single-bottom">
		
			<h3>Leave a Comment</h3>
				<form>
						<div class="col-md-6 comment">
							<input type="text" placeholder="Name">
						</div>
						<div class="col-md-6 comment">
							<input type="text" placeholder="email">
						</div>
						<div class="clearfix"> </div>
							<textarea placeholder="Message" required=""></textarea>	
							<input type="submit" value="Send">
						
				</form>
			
		</div>
				</div>
					<div class="col-md-3 categories-grid">
				<div class="grid-categories">
					<h4>生活小贴士</h4>
					<ul class="popular ">
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>离学校最近的办理业务的银行有农行、建行</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>取快递一般在西门、小东门</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>洗衣房、理发店在第二、四食堂对面</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>开水房和澡堂在一起，位于学校西北角</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>热水房一般晚九点停水，理工楼10层有24小时热水</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>进出宿舍楼需携带一卡通</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>操场里设有健身器材</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>文化楼周末是自习的好地方</a></li>
					</ul>
				</div>
				<div class="grid-categories">
					<h4>Achivements</h4>
					<ul class="popular popular-in">
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>MAY 2014</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>SEP 2012</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>JANUARY 2011</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>FEB 2010</a></li>
						<li><a href="#"><i class="glyphicon glyphicon-ok"> </i>NOV 2009</a></li>
					</ul>
				</div>
			</div>
				<div class="clearfix"> </div>
			
			</div>
	</div>

<!--//single end here-->
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
