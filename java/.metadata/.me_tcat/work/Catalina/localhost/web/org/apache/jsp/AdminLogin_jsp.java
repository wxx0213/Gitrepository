package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class AdminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction.release();
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

      out.write("\r\n");
      out.write("\r\n");

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
      out.write("    <title>My JSP 'AdminLogin.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"header-login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"top-nav-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"loginContainer\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"loginBox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
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

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /AdminLogin.jsp(32,12) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("AdminLogin.action");
    // /AdminLogin.jsp(32,12) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /AdminLogin.jsp(32,12) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setId("loginForm");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<fieldset id=\"body\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"email\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t用户名\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"email\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"password\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t密码\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" id=\"password\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<fieldset>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("        <!-- 更新 -->\r\n");
        out.write("          <input type=\"radio\" id=\"sexID\" name=\"type\" value=\"1\" checked=\"checked\" />管理员\r\n");
        out.write("          <input id=\"sexID\" type=\"radio\" name=\"type\" value=\"0\" />普通用户\r\n");
        out.write("        <!-- 更新 -->\r\n");
        out.write("        </div>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" id=\"login\" value=\"登录\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"checkbox\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkbox\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i>记住我</i>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
