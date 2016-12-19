package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>后台管理页面</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/pintuer.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\r\n");
      out.write("    <script src=\"js/jquery.js\"></script>  \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t  $(\".leftnav h2\").click(function(){\r\n");
      out.write("\t\t  $(this).next().slideToggle(200);\t\r\n");
      out.write("\t\t  $(this).toggleClass(\"on\"); \r\n");
      out.write("\t  })\r\n");
      out.write("\t  $(\".leftnav ul li a\").click(function(){\r\n");
      out.write("\t\t    $(\"#a_leader_txt\").text($(this).text());\r\n");
      out.write("\t  \t\t$(\".leftnav ul li a\").removeClass(\"on\");\r\n");
      out.write("\t\t\t$(this).addClass(\"on\");\r\n");
      out.write("\t  })\r\n");
      out.write("\t});\r\n");
      out.write("\t</script> \r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body style=\"background-color:#f2f9fd;\">\r\n");
      out.write("<div class=\"header bg-main\">\r\n");
      out.write("  <div class=\"logo margin-big-left fadein-top\">\r\n");
      out.write("    <h1><img src=\"images/y.jpg\" class=\"radius-circle rotate-hover\" height=\"50\" alt=\"\" />后台管理中心</h1>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"head-l\"><a class=\"button button-little bg-green\" href=\"\" target=\"_blank\"><span class=\"icon-home\"></span> 前台首页</a> &nbsp;&nbsp;<a href=\"##\" class=\"button button-little bg-blue\"><span class=\"icon-wrench\"></span> 清除缓存</a> &nbsp;&nbsp;<a class=\"button button-little bg-red\" href=\"login.html\"><span class=\"icon-power-off\"></span> 退出登录</a> </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"leftnav\">\r\n");
      out.write("  <div class=\"leftnav-title\"><strong><span class=\"icon-list\"></span>菜单列表</strong></div>\r\n");
      out.write("  <h2><span class=\"icon-user\"></span>基本设置</h2>\r\n");
      out.write("  <ul style=\"display:block\">\r\n");
      out.write("    <li><a href=\"info.html\" target=\"right\"><span class=\"icon-caret-right\"></span>用户管理</a></li>\r\n");
      out.write("    <li><a href=\"pass.html\" target=\"right\"><span class=\"icon-caret-right\"></span>修改密码</a></li>\r\n");
      out.write("    <li><a href=\"addArchitecture.jsp\" target=\"right\"><span class=\"icon-caret-right\"></span>建筑管理</a></li>  \r\n");
      out.write("    <li><a href=\"adv.html\" target=\"right\"><span class=\"icon-caret-right\"></span>文化资源管理</a></li>   \r\n");
      out.write("    <li><a href=\"book.html\" target=\"right\"><span class=\"icon-caret-right\"></span>留言管理</a></li>     \r\n");
      out.write("    <li><a href=\"column.html\" target=\"right\"><span class=\"icon-caret-right\"></span>服务管理</a></li>\r\n");
      out.write("  </ul>   \r\n");
      out.write("  <h2><span class=\"icon-pencil-square-o\"></span>栏目管理</h2>\r\n");
      out.write("  <ul>\r\n");
      out.write("    <li><a href=\"list.html\" target=\"right\"><span class=\"icon-caret-right\"></span>内容管理</a></li>\r\n");
      out.write("    <li><a href=\"add.html\" target=\"right\"><span class=\"icon-caret-right\"></span>添加内容</a></li>\r\n");
      out.write("    <li><a href=\"cate.html\" target=\"right\"><span class=\"icon-caret-right\"></span>分类管理</a></li>        \r\n");
      out.write("  </ul>  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<ul class=\"bread\">\r\n");
      out.write("  <li><a href=\"{:U('Index/info')}\" target=\"right\" class=\"icon-home\"> 首页</a></li>\r\n");
      out.write("  <li><a href=\"##\" id=\"a_leader_txt\">网站信息</a></li>\r\n");
      out.write("  <li><b>当前语言：</b><span style=\"color:red;\">中文</php></span>\r\n");
      out.write("  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href=\"##\">中文</a> &nbsp;&nbsp;<a href=\"##\">英文</a> </li>\r\n");
      out.write("</ul>\r\n");
      out.write("<div class=\"admin\">\r\n");
      out.write("  <iframe scrolling=\"auto\" rameborder=\"0\" src=\"info.jsp\" name=\"right\" width=\"100%\" height=\"100%\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"text-align:center;\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
