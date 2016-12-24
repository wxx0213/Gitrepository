package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addArchitecture_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fcssClass_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fcssClass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fcssClass_005faction.release();
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\r\n");
      out.write("<title>添加建筑信息</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/pintuer.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/admin.css\">\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/pintuer.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${information}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("  <!--");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   -->\r\n");
      out.write("   <div class=\"panel admin-panel\">\r\n");
      out.write("  <div class=\"panel-head\"><strong><span class=\"icon-pencil-square-o\"></span> 新增建筑信息</strong></div>\r\n");
      out.write("  <div class=\"body-content\">\r\n");
      out.write("     ");
      if (_jspx_meth_s_005fform_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("   \r\n");
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
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /addArchitecture.jsp(24,6) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("AddArchitectureAction.action");
    // /addArchitecture.jsp(24,6) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  <input type=\"text\" name=\"imageFile\" value=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${savePath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("></input><a href=addImage.jsp>上传图片</a><br/><br>\r\n");
        out.write("       建筑名称：<input type=\"text\" name=\"buildingName\"/><br>\r\n");
        out.write("      建筑位置：<input type=\"text\" name=\"buildingLocation\"/><br>\r\n");
        out.write("      建筑描述：<input type=\"text\" name=\"buildingDescription\"/><br>\r\n");
        out.write("   <input type=\"submit\" name=\"save\" value=\"保存\"/> \r\n");
        out.write("   <input type=\"reset\" name=\"cancel\" value=\"取消\"/> <br/>\r\n");
        out.write("   ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f1 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f1.setParent(null);
    // /addArchitecture.jsp(37,5) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("AddArchitectureAction.action");
    // /addArchitecture.jsp(37,5) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    // /addArchitecture.jsp(37,5) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setCssClass("form-x");
    int _jspx_eval_s_005fform_005f1 = _jspx_th_s_005fform_005f1.doStartTag();
    if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f1.doInitBody();
      }
      do {
        out.write("    \r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>图片：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("        \t <input type=\"text\" class=\"input tips\" style=\"width:25%; float:left;\" name=\"imageFile\" value=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${savePath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("></input>\r\n");
        out.write("        \r\n");
        out.write("          <div class=\"tipss\">图片尺寸：500*200</div>\r\n");
        out.write("          <div class=\"tipss\"> <a href=addImage.jsp>上传图片</a></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label> 建筑名称：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <input type=\"text\" class=\"input\" name=\"buildingName\"  />\r\n");
        out.write("          <div class=\"tips\"></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("      \r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>建筑位置：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("         <input type=\"text\" class=\"input\" name=\"buildingLocation\"/>\r\n");
        out.write("          <div class=\"tips\"></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("       <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label>建筑描述：</label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("         <input type=\"text\" class=\"input\" name=\"buildingDescription\"/>\r\n");
        out.write("          <div class=\"tips\"></div>\r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("     \t\r\n");
        out.write("      <div class=\"form-group\">\r\n");
        out.write("        <div class=\"label\">\r\n");
        out.write("          <label></label>\r\n");
        out.write("        </div>\r\n");
        out.write("        <div class=\"field\">\r\n");
        out.write("          <button class=\"button bg-main icon-check-square-o\" type=\"submit\" name=\"save\" > 提交</button>\r\n");
        out.write("          <button class=\"button bg-main icon-check-square-o\" type=\"reset\" name=\"cancel\" > 取消</button>\r\n");
        out.write("          \r\n");
        out.write("        </div>\r\n");
        out.write("      </div>\r\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fcssClass_005faction.reuse(_jspx_th_s_005fform_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fcssClass_005faction.reuse(_jspx_th_s_005fform_005f1);
    return false;
  }
}
