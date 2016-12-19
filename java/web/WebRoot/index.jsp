<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>Welcome</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">

		<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
			media="all">
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="js/jquery-1.11.0.min.js"></script>
		<!-- Custom Theme files -->
		<link href="css/style.css" rel="stylesheet" type="text/css"
			media="all" />
		<!-- Custom Theme files -->
		<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--Google Fonts-->
		<!-- start-smoth-scrolling -->
		<script type="text/javascript" src="js/move-top.js"></script>
		<script type="text/javascript" src="js/easing.js"></script>
		<script type="text/javascript">
		jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate( {
				scrollTop : $(this.hash).offset().top
			}, 1000);
		});
	});
	</script>
		<!-- //end-smoth-scrolling -->
		<script src="js/menu_jquery.js"></script>

	</head>
	<body><!--
		${information}
		 显示action中传回的信息 
		<s:form action="LoginAction.action" method="post">
   	用户名：<input type="text" name="username" />
			<br>
			<br>
   	密码:&nbsp;&nbsp;&nbsp;<input type="password" name="password"></input>
			<br>
			<br>
			<input type="submit" name="login" value="登录" />
			<br>
			<a href=register.jsp>注册</a>|<a href=index.jsp>重置密码</a>
			<a href=addArchitecture.jsp>重置密码</a>
			<a href=MyJsp.jsp>测试</a>
		</s:form>

		-->
		
		<!--header start here-->
		<div class="header">
			<div class="container">
				<div class="header-main">
					<div class="top-menu">
						<p style=" color: #ffffff">${information}</p>
						<ul>
							<li>
								<a href="index.jsp">首页</a>
							</li>
							<li>
								<a href="service.jsp">玩遍校园 </a>
							</li>
							<li>
								<a href="Culture.jsp">校园文化</a>
							</li>
							<li>
								<a href="index.jsp"> <img src="images/lo1.png" alt="">
								</a>
							</li>
							<li>
								<a href="building.jsp">特色建筑 </a>
							</li>
							<li>
								<a href="service.jsp">周边服务 </a>
							</li>

							<li>
								<div class="header-login">
									<div class="top-nav-right">
										<div id="loginContainer">
											<a href="#" id="loginButton"><span>登录 </span> </a>
											<div id="loginBox">
												
												<s:form action="LoginAction.action" method="post" id="loginForm">
													<fieldset id="body">
														<fieldset>
															<label for="email">
																用户名
															</label>
															<input type="text" name="username" id="email">
														</fieldset>
														<fieldset>
															<label for="password">
																密码
															</label>
															<input type="password" name="password" id="password">
														</fieldset>
														<input type="submit" id="login" value="登录">
														<label for="checkbox">
															<input type="checkbox" id="checkbox">
															<i>记住我</i>
														</label>
													</fieldset>
													<span><a href="register.jsp">注册</a> </span>
												</s:form>
											</div>
										</div>
									</div>
								</div>
							</li>
						</ul>
					</div>
					<!--script-->
					<div class="bann-bottom">
						<h1>
							Welcome To MINZU University Of China ！
						</h1>
						<p>
							美美与共 知行合一
						</p>
						<div class="bann-main">
							<div class="col-md-4 bann-grid">
								<img src="images/i1.png" alt="">
								<h4>
									特色建筑
								</h4>
							</div>
							<div class="col-md-4 bann-grid">
								<img src="images/i2.png" alt="">
								<h4>
									特色文化
								</h4>
							</div>
							<div class="col-md-4 bann-grid">
								<img src="images/i3.png" alt="">
								<h4>
									特色服务
								</h4>
							</div>
							<div class="clearfix">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--header end here-->

		<!--baner-info start here-->
		<div class="banner-info">
			<div class="container">
				<div class="banner-info-main">
					<div class="col-md-6 bann-info-left">
						<img src="images/2.jpg" alt="" class="img-responsive">
						<p>
							中央民族大学民族博物馆始建于1951年，是以全国56个民族的文物为主要收藏、展示和研究对象的民族学专业博物馆。馆舍总面积近5000平方米。馆藏有各民族的锦旗、革命文物、土特产品、生产工具、服装、皮毛、古器物、历史文献、珠宝器、武器、乐器、宗教用品等14类文物，及国外部分国家和民族的瓷器、钱币、图片等文物，共2万余件。这些藏品的特点，一是族属、内容全面丰富，反映全国56个民族历史、文化、精神风貌的各类文物几乎都有收藏.
						</p>
					</div>
					<div class="col-md-6 bann-info-left">
						<img src="images/auditorium.jpg" alt="" class="img-responsive">
						<p>
							中央民族大学大礼堂是民族大学早期建筑的最典型代表，始建于上世纪五六十年代的学校建初，大礼堂采用早期中国大学红梁灰砖瓦盖的普遍风格，古朴清幽典雅庄严，出自当时建筑名家梁思成之手，是中央民族大学历史见证性的标志建筑。
						</p>
					</div>
					<div class="clearfix">
					</div>
				</div>
				<div class="bann-info-btn">
					<a href="building.html" class="hvr-bounce-to-right">Find More</a>
				</div>
			</div>
		</div>
		<!--banner-info end here-->
		<!--testimonal start here-->
		<div class="testimonal">
			<div class="container">
				<div class="testimonal-main">
					<h2>
						走进民大，感受别样的风情
					</h2>
					<p>
						漫步校园，古朴的建筑映衬下，流动的服饰，鲜丽的色彩，还有美丽的少男少女。置身古朴幽美的民大校园，在“各美其美，美美与共”的各民族文化熏染下，我们有幸去感受绚丽多彩的民族服饰。
					</p>
					<a href="Culture.html" class="hvr-bounce-to-right  testimo-btn">Find
						More</a>
					<div class="clearfix">
					</div>
				</div>
			</div>
		</div>
		<!--testimonal end here-->
		<!--we work strat her-->
		<div class="we-work">
			<div class="container">
				<div class="we-work-main">
					<div class="we-work-top">
						<h3>
							Tour Guide
						</h3>
						<p>
							中央民族大学（Minzu University of
							China）坐落于北京学府林立的海淀区，南邻国家图书馆，北依中关村科技园，校园环境典雅，古朴幽美，人文氛围浓郁，具有鲜明的民族特色。
						</p>
					</div>
					<div class="we-work-bottom">
						<div class="col-md-6 we-work-left">
							<div class="col-md-6 we-left-img1">
								<img src="images/w1.jpg" alt="" class="img-responsive">
							</div>
							<div class="col-md-6 we-left-img2">
								<img src="images/w2.jpg" alt="" class="img-responsive">
							</div>
							<div class="clearfix">
							</div>
						</div>
						<div class="col-md-6 we-work-right">
							<p>
								食堂：学生第二、四食堂 清真风味食堂 地下风味食堂 清真第三食堂
							</p>
							<p>
								宿舍：学生1-8号公寓
								<br>
								澡堂、开水房：清真第三食堂旁边
								<br>
								理发店、洗衣房、眼镜店、地下超市
							</p>
						</div>
						<div class="clearfix">
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--we work end here-->
		<!--feature start here-->
		<div class="features">
			<div class="container">
				<div class="features-main">
					<div class="features-top">
						<h3>
							Services
						</h3>
						<p>
						</p>
					</div>
					<div class="features-bottom">
						<div class="col-md-3 feature-grid">
							<img src="images/f1.jpg" alt="" class="img-responsive">
							<h4>
								衣
							</h4>
							<p>
								天成市场
								<br>
								首体滑冰馆地下一层
								<br>
								生活用品、小商品批发市场
							</p>
						</div>
						<div class="col-md-3 feature-grid">
							<img src="images/f2.jpg" alt="" class="img-responsive">
							<h4>
								食
							</h4>
							<p>
								民族苑
								<br>
								学生8号公寓一层东侧
								<br>
								民族特色菜、价格略高
							</p>
						</div>
						<div class="col-md-3 feature-grid">
							<img src="images/f3.jpg" alt="" class="img-responsive">
							<h4>
								住
							</h4>
							<p>
								中协宾馆
								<br>
								民大西门
								<br>
								三星级
							</p>
						</div>
						<div class="col-md-3 feature-grid">
							<img src="images/f4.jpg" alt="" class="img-responsive">
							<h4>
								行
							</h4>
							<p>
								中央民族大学校园坐落于北京高校林立的海淀区中关村南大街，位于西北三环内，交通便利，周边资源丰富。
							</p>
						</div>
						<div class="clearfix">
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--services end here-->
		<!--footer start here-->
		<div class="footer">
			<div class="container">
				<div class="footer-main">
					<div class="col-md-4 ftr-grid">
						<div class="ftr-grid-left">
							<img src="images/location.png" alt="">
						</div>
						<div class="ftr-grid-right">
							<p>
								地址：海淀区中关村南大街27号
								<span class="local">邮编：100081</span>
							</p>
						</div>
						<div class="clearfix">
						</div>
					</div>
					<div class="col-md-4 ftr-grid">
						<div class="ftr-grid-left">
							<img src="images/email.png" alt="">
						</div>
						<div class="ftr-grid-right">
							<p>
								联系我们
								<span class="local">zzmzdx@muc.edu.cn</span>
							</p>
						</div>
						<div class="clearfix">
						</div>
					</div>
					<div class="col-md-4 ftr-grid">
						<div class="ftr-grid-left">
							<img src="images/phone.png" alt="">
						</div>
						<div class="ftr-grid-right">
							<p>
								备案： 京ICP备10039345号
								<span class="local">京公网安备：110402430036</span>
							</p>
						</div>
						<div class="clearfix">
						</div>
					</div>
					<div class="clearfix">
					</div>
				</div>
			</div>
		</div>
		<!--footer end here-->
		<!--copyright start here-->
		<div class="copyright">
			<div class="container">
				<div class="copyright-main">
					<p>
						Copyright &copy; 2016.Company name All rights reserved.
  <a href=addArchitecture.jsp>添加特色建筑</a><br/>
  <a href=buildingInformation.jsp>查看特色建筑</a><br/>  
  <a href=buildingDetail.jsp>查看指定建筑</a><br/>
  <a href=addSpecialty.jsp>添加特色</a><br/>
  <a href=buildingDetail.jsp>查看指定建筑</a><br/>
  <a href="GetAllBulidingAction.action">添加活动</a><br/>
  <a href=userManage.jsp></a><br/>
   <s:form action="ShowUserByPageAction.action"  method="get">
    <input type="submit" value="用户查询"/>
    </s:form>
      更新<br/>
  <a href=Addadmin.jsp>添加管理员</a><br/>
  <a href=AdminLogin.jsp>管理员登录</a><br/> 
  <a href=forgetPassword.jsp>忘记密码</a><br/>
					</p>
					<div class="clearfix">
					</div>
				</div>
			</div>
		</div>
		<!--copyright end here-->
	</body>
</html>
