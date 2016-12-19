package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Addadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_005fonsubmit_005fmethod_005fcssClass_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_005fonsubmit_005fmethod_005fcssClass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_005fonsubmit_005fmethod_005fcssClass_005faction.release();
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
      out.write("    <title>register</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/pintuer.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/admin.css\">\r\n");
      out.write("\t<!-- JS代码 -->\r\n");
      out.write("\t <script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/registerJS.js\">\r\n");
      out.write("\t window.onload=function(){}\r\n");
      out.write("\t </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <!--<div align=\"center\">\r\n");
      out.write("    <form action=\"RegisterAction.action\"  method=\"post\" onsubmit=\"return check()\" >\r\n");
      out.write("         用户名：<input type=\"text\" id=\"userNameID\"  name=\"userName\" maxlength=\"10\" onchange=\"checkName()\"/>\r\n");
      out.write("         <label id=\"checktext1\">请输入6-10位用户名</label><br/>\r\n");
      out.write("         密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type=\"password\" id=\"passwordID\"  name=\"password\" maxlength=\"10\" onpaste=\"return false\" oncontextmenu=\"return false\" onchange=\"checkpwd()\"/>\r\n");
      out.write("         <label id=\"checktext2\">请输入6位以上的密码(含字母和数字)</label><br/>\r\n");
      out.write("         密码确认：<input type=\"password\" id=\"repasswordID\"  name=\"repassword\" maxlength=\"10\" onpaste=\"return false\" oncontextmenu=\"return false\" onchange=\"checkpwdc()\"/>\r\n");
      out.write("         <label id=\"checktext3\">请确认您的密码</label><br/>\r\n");
      out.write("                姓名：<input type=\"text\"  id=\"realNameID\" name=\"realName\" maxlength=\"20\"/><br/><br/>\r\n");
      out.write("         性别：<input type=\"radio\" id=\"sexID\" name=\"sex\" value=\"男\" checked=\"checked\"/>男<input id=\"sexID\" type=\"radio\" name=\"sex\" value=\"女\"/>女<br/><br/>\r\n");
      out.write("         邮箱：<input type=\"text\"  id=\"emailID\" name=\"email\" maxlength=\"50\" onchange=\"checkemail()\"/>\r\n");
      out.write("         <label id=\"checktext4\">请输入邮箱</label><br/><br/>\r\n");
      out.write("                手机：<input type=\"text\" id=\"mobileID\" name=\"mobile\" maxlength=\"11\"  onchange=\"checkmobile()\"/>\r\n");
      out.write("         <label id=\"checktext5\">请输入11位手机号\r\n");
      out.write("</label><br/><br/>\r\n");
      out.write("      <input type=\"submit\" name=\"submit\" value=\"注册\"/>\r\n");
      out.write("      <input type=\"reset\" name=\"reset\" value=\"重置\" />\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    --><div class=\"panel admin-panel\">\r\n");
      out.write("  <div class=\"panel-head\"><strong><span class=\"icon-pencil-square-o\"></span>管理员注册</strong></div>\r\n");
      out.write("  <div class=\"body-content\">\r\n");
      out.write("     ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("     </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
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
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_005fonsubmit_005fmethod_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /Addadmin.jsp(52,5) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("RegisterAction.action");
    // /Addadmin.jsp(52,5) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /Addadmin.jsp(52,5) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setCssClass("form-x");
    // /Addadmin.jsp(52,5) name = onsubmit type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setOnsubmit("return check()");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("    \r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label> 用户名：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <input type=\"text\" id=\"userNameID\"  name=\"userName\" maxlength=\"10\" onchange=\"checkName()\"  />\r\n");
        out.write("          <div class=\"tips\"><label id=\"checktext1\">请输入6-10位用户名</label><br/></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("      \r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>密码：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("         <input type=\"password\"  id=\"passwordID\"  name=\"password\" maxlength=\"10\" onpaste=\"return false\" oncontextmenu=\"return false\" onchange=\"checkpwd()\"/>\r\n");
        out.write("          <div class=\"tips\"> <label id=\"checktext2\">请输入6位以上的密码(含字母和数字)</label><br/></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("       <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>密码确认：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("         <input type=\"password\" id=\"repasswordID\"  name=\"repassword\" maxlength=\"10\" onpaste=\"return false\" oncontextmenu=\"return false\" onchange=\"checkpwdc()\"/>\r\n");
        out.write("          <div class=\"tips\"><label id=\"checktext3\">请确认您的密码</label><br/></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <input type=\"radio\" id=\"sexID\" name=\"type\" value=\"1\" checked=\"checked\"/>管理员\r\n");
        out.write("          <input id=\"sexID\" type=\"radio\" name=\"type\" value=\"0\" disabled=\"ture\"/>普通用户\r\n");
        out.write("        </div>\r\n");
        out.write("     \t <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>姓名：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <input type=\"text\" id=\"realNameID\" name=\"realName\" maxlength=\"20\"  />\r\n");
        out.write("          <div class=\"tips\"></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>性别：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <input type=\"radio\" id=\"sexID\" name=\"sex\" value=\"男\" checked=\"checked\"/>男\r\n");
        out.write("          <input id=\"sexID\" type=\"radio\" name=\"sex\" value=\"女\"/>女\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>邮箱：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <input type=\"text\"  id=\"emailID\" name=\"email\" maxlength=\"50\" onchange=\"checkemail()\"/>\r\n");
        out.write("           <div class=\"tips\"><label id=\"checktext4\">请输入邮箱</label><br/></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>手机：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <input type=\"text\"  type=\"text\" id=\"mobileID\" name=\"mobile\" maxlength=\"11\"  onchange=\"checkmobile()\"/>\r\n");
        out.write("           <div class=\"tips\"><label id=\"checktext5\">请输入11位手机号</label><br/></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label></label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <button class=\"button bg-main icon-check-square-o\" type=\"submit\" name=\"save\" > 注册</button>\r\n");
        out.write("          <button class=\"button bg-main icon-check-square-o\" type=\"reset\" name=\"cancel\" > 重置</button>\r\n");
        out.write("          \r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_005fonsubmit_005fmethod_005fcssClass_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_005fonsubmit_005fmethod_005fcssClass_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
