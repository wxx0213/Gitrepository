package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Culture_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'Culture.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--Google Fonts-->\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("<!-- //end-smoth-scrolling -->\r\n");
      out.write("<script src=\"js/menu_jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("   <div class=\"header1\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t <div class=\"header-main\">\r\n");
      out.write("\t\t\t\t<!---->\r\n");
      out.write("\t\t\t\t\t<div class=\"header-logo\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"index.html\"><img src=\"images/lo1.png\" alt=\"\" ></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"top-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"icon\"><img src=\"images/menu.png\" alt=\"\"> </span>\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"index.html\">首页</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li ><a href=\"about.html\" >玩遍校园  </a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"typo.html\"  >校园文化</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"galley.html\" >特色建筑</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"galley.html\" >周边服务</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact.html\" >联系我们 </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t<!--script-->\r\n");
      out.write("\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t$(\"span.icon\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\".top-nav ul\").slideToggle(500, function(){\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t</script>\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t<!---->\r\n");
      out.write("\t\t\t<div class=\"top-menu\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"index.html\" >首页</a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"about.html\">玩遍校园 </a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"typo.html\">校园文化</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\"> <img src=\"images/lo1.png\" alt=\"\"> </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"galley.html\">特色建筑 </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"galley.html\">周边服务 </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">联系我们</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><div class=\"header-login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <div class=\"top-nav-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"loginContainer\"><a href=\"#\" id=\"loginButton\"><span>Login</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <div id=\"loginBox\">                \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t        <form id=\"loginForm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                <fieldset id=\"body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                          <label for=\"email\">Email Address</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                          <input type=\"text\" name=\"email\" id=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                    </fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                    <fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                            <label for=\"password\">Password</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                            <input type=\"password\" name=\"password\" id=\"password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                     </fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                    <input type=\"submit\" id=\"login\" value=\"Sign in\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<label for=\"checkbox\"><input type=\"checkbox\" id=\"checkbox\"> <i>Remember me</i></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t            \t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t            <span><a href=\"#\">Forgot your password?</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </div>\r\n");
      out.write("\t\t                         </div>\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--script-->\r\n");
      out.write("\t </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--header end here-->\r\n");
      out.write("<!--about start here-->\r\n");
      out.write("<div class=\"about\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"about-main\">\r\n");
      out.write("\t\t\t    <div class=\"about-top\">\r\n");
      out.write("\t\t\t\t\t<h2>多样文化</h2>\r\n");
      out.write("\t\t\t\t\t<p>来民大，感受少数民族特色风情</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"about-bottom\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-7 about-left\">\r\n");
      out.write("\t\t\t\t\t\t<h3>虽然民大没有草原，但有那达慕呀</h3>\r\n");
      out.write("\t\t\t\t\t\t<p>那达慕，第一批入选国家级非物质文化遗产名录，是蒙古族历史悠久的传统节日，在蒙古族人民的生活中占有重要地位。每年七、八月牲畜肥壮的季节举行的“那达慕”大会，是人们为了庆祝丰收而举行的文体娱乐大会。“那达慕”，蒙语的意思是娱乐或游戏。“那达慕”大会上有惊险刺激的赛马、摔跤，令人赞赏的射箭，有争强斗胜的棋艺，有引人入胜的歌舞。赛马也是大会上重要的活动之一。比赛开始，骑手们一字排开，个个扎着彩色腰带，头缠彩巾，洋溢着青春的活力。赛马的起点和终点插着各种鲜艳的彩旗，只等号角长鸣，骑手们便纷纷飞身上鞍，扬鞭策马，一时红巾飞舞，如箭矢齐发。前五名到达终点者，成为草原上最受人赞誉的健儿。射箭、摔跤等比赛也吸引着众多牧民。</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-5 about-right\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"\" >\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/1.jpg\" alt=\"\" class=\"img-responsive \">\r\n");
      out.write("\t\t\t\t\t\t</a>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"team-mem\">\r\n");
      out.write("\t\t\t <h1>多样民族</h1>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 team-grid\">\r\n");
      out.write("\t\t\t\t<img src=\"images/bai.PNG\"  alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t    <ul class=\"img-social-stags\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 team-grid\">\r\n");
      out.write("\t\t\t\t<img src=\"images/chaoxian.PNG\"  alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t    <ul class=\"img-social-stags\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"twitter\" href=\"#\"><span> </span></a><li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"facebook\" href=\"#\"><span> </span></a><li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 team-grid\">\r\n");
      out.write("\t\t\t\t<img src=\"images/tujia.PNG\"  alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t    <ul class=\"img-social-stags\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"twitter\" href=\"#\"><span> </span></a><li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"facebook\" href=\"#\"><span> </span></a><li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-3 team-grid\">\r\n");
      out.write("\t\t\t\t<img src=\"images/lisu.PNG\"  alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t     <ul class=\"img-social-stags\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"twitter\" href=\"#\"><span> </span></a><li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"facebook\" href=\"#\"><span> </span></a><li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"advantages\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"advantage-main\">\r\n");
      out.write("\t\t\t\t\t<div class=\"advance-top\">\r\n");
      out.write("\t\t\t\t\t\t<h3>多样活动</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"advance-bottom\">\r\n");
      out.write("\t\t\t\t\t   <div class=\"col-md-6 advantage-left\">\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"advanc-grid\">\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-3 advanc-icons\">\r\n");
      out.write("\t\t\t\t\t   \t\t<img src=\"images/a1.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-9 advanc-text\">\r\n");
      out.write("\t\t\t\t\t   \t\t<h4>活动一</h4>\r\n");
      out.write("\t\t\t\t\t   \t\t<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"advanc-grid\">\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-3 advanc-icons\">\r\n");
      out.write("\t\t\t\t\t   \t\t<img src=\"images/a2.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-9 advanc-text\">\r\n");
      out.write("\t\t\t\t\t   \t\t<h4>活动二</h4>\r\n");
      out.write("\t\t\t\t\t   \t\t<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t   <div class=\"col-md-6 advantage-right\">\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"advanc-grid\">\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-3 advanc-icons\">\r\n");
      out.write("\t\t\t\t\t   \t\t <img src=\"images/a3.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-9 advanc-text\">\r\n");
      out.write("\t\t\t\t\t   \t\t<h4>活动三</h4>\r\n");
      out.write("\t\t\t\t\t   \t\t<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   \t<div class=\"advanc-grid\">\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-3 advanc-icons\">\r\n");
      out.write("\t\t\t\t\t   \t\t <img src=\"images/a4.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"col-md-9 advanc-text\">\r\n");
      out.write("\t\t\t\t\t   \t\t<h4>活动四</h4>\r\n");
      out.write("\t\t\t\t\t   \t\t<p>Praesent nunc nunc, egestas eget elementum sed; rutrum eget metus! Vestibulum congue congue dui</p>\r\n");
      out.write("\t\t\t\t\t   \t  </div>\r\n");
      out.write("\t\t\t\t\t   \t  <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t\t   \t</div>\r\n");
      out.write("\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--about end here-->\r\n");
      out.write("<!--footer start here-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"footer-main\">\r\n");
      out.write("\t\t\t <div class=\"col-md-4 ftr-grid\">\r\n");
      out.write("\t\t\t \t<div class=\"ftr-grid-left\">\r\n");
      out.write("\t\t\t \t    <img src=\"images/location.png\" alt=\"\">\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t \t<div class=\"ftr-grid-right\">\r\n");
      out.write("\t\t\t \t\t<p>地址：海淀区中关村南大街27号<span class=\"local\">邮编：100081</span></p>\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"col-md-4 ftr-grid\">\r\n");
      out.write("\t\t\t \t <div class=\"ftr-grid-left\">\r\n");
      out.write("\t\t\t \t    <img src=\"images/email.png\" alt=\"\">\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t \t<div class=\"ftr-grid-right\">\r\n");
      out.write("\t\t\t \t\t<p>联系我们<span class=\"local\">zzmzdx@muc.edu.cn</span></p>\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"col-md-4 ftr-grid\">\r\n");
      out.write("\t\t\t \t <div class=\"ftr-grid-left\">\r\n");
      out.write("\t\t\t \t    <img src=\"images/phone.png\" alt=\"\">\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t \t<div class=\"ftr-grid-right\">\r\n");
      out.write("\t\t\t \t\t<p>备案： 京ICP备10039345号<span class=\"local\">京公网安备：110402430036</span></p>\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--footer end here-->\r\n");
      out.write("<!--copyright start here-->\r\n");
      out.write("<div class=\"copyright\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"copyright-main\">\r\n");
      out.write("\t\t\t   <p>Copyright &copy; 2016.Company name All rights reserved.</p>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--copyright end here-->\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
