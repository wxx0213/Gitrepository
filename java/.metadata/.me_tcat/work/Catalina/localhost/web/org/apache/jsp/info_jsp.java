package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>网站信息</title>\r\n");
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
      out.write("  <div class=\"panel admin-panel\">\r\n");
      out.write("  <div class=\"panel-head\"><strong><span class=\"icon-pencil-square-o\"></span> 网站信息</strong></div>\r\n");
      out.write("  <div class=\"body-content\">\r\n");
      out.write("    <form method=\"post\" class=\"form-x\" action=\"\">\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>网站标题：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"stitle\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>网站LOGO：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" id=\"url1\" name=\"slogo\" class=\"input tips\" style=\"width:25%; float:left;\" value=\"\" data-toggle=\"hover\" data-place=\"right\" data-image=\"\"  />\r\n");
      out.write("          <input type=\"button\" class=\"button bg-blue margin-left\" id=\"image1\" value=\"+ 浏览上传\" >\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>网站域名：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"surl\" value=\"\" />\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\" style=\"display:none\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>副加标题：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"sentitle\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>网站关键字：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <textarea class=\"input\" name=\"skeywords\" style=\"height:80px\"></textarea>\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>网站描述：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <textarea class=\"input\" name=\"sdescription\"></textarea>\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>联系人：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_name\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>手机：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_phone\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>电话：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_tel\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\" style=\"display:none;\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>400电话：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_400\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>传真：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_fax\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>QQ：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_qq\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\" style=\"display:none\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>QQ群：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_qqu\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("     \r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>Email：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_email\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>地址：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <input type=\"text\" class=\"input\" name=\"s_address\" value=\"\" />\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>  \r\n");
      out.write("              \r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label>底部信息：</label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <textarea name=\"scopyright\" class=\"input\" style=\"height:120px;\"></textarea>\r\n");
      out.write("          <div class=\"tips\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <div class=\"label\">\r\n");
      out.write("          <label></label>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"field\">\r\n");
      out.write("          <button class=\"button bg-main icon-check-square-o\" type=\"submit\"> 提交</button>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
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
