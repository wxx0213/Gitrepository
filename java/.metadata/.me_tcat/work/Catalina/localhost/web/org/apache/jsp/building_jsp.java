package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class building_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <title>Building</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\t<script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Custom Theme files -->\r\n");
      out.write("\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("\t\t<script src=\"js/modernizr.custom.97074.js\"></script><!-- 注释后鼠标悬浮不出现具体描述 -->\r\n");
      out.write("\t\t<script src=\"js/jquery.chocolat.js\"></script><!-- 注释后鼠标悬浮不出现具体描述 -->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.hoverdir.js\"></script>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/chocolat.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\">\r\n");
      out.write("\t\t<!-- 刷新后回到前面 -->\r\n");
      out.write("\t\t<script type=\"application/x-javascript\"> \r\n");
      out.write("\t\taddEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); \r\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <!--header start here-->\r\n");
      out.write("<div class=\"header1\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t <div class=\"header-main\">\r\n");
      out.write("\t\t\t<div class=\"top-menu\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"index.html\" >首页</a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"about.html\">玩遍校园 </a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"typo.html\">校园文化</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\"> <img src=\"images/lo1.png\" alt=\"\"> </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"galley.html\">特色建筑 </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"galley.html\">周边服务 </a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--header end here-->\r\n");
      out.write("<!--gallery-starts-->\r\n");
      out.write("\t<div class=\"gallery\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"gallery-top heading\">\r\n");
      out.write("\t\t\t\t<h2>特色建筑</h2>\r\n");
      out.write("\t\t\t\t<p>清幽的环境，古朴的建筑，遇见民大，发现不一样的你。</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<ul id=\"da-thumbs\" class=\"da-thumbs\">\r\n");
      out.write("\t\t\t\t\t<!--<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g1.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g1.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>民族博物馆</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的西南角，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t--><li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g2.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g2.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>大礼堂</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>大礼堂就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g3.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g3.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>逸夫体育馆</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g4.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g4.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>民族歌剧院</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\t\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g5.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g5.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>理工楼</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g6.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g6.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>文华楼</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<!--<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g7.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g7.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>美术馆</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t--><li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g8.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g8.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>图书馆</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"images/g9.jpg\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/g9.jpg\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h5>音乐厅</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>博物馆就坐落在校园的中心地区，建筑面积1200平方米，展厅面积500平方米。馆内收藏有各少数民族的文物、文献典籍、服装、生产工具等共14大类3万余件。</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function() {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t$(' #da-thumbs > li ').each( function() { $(this).hoverdir(); } );\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("<!--gallery-end-->\r\n");
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
