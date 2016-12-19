package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addActivityImage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fenctype_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fenctype_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fenctype_005faction.release();
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
      out.write("<title>测试页面</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    //下面用于多图片上传预览功能\r\n");
      out.write("\r\n");
      out.write("    function setImagePreviews(avalue)  {\r\n");
      out.write("\r\n");
      out.write("        var docObj = document.getElementById(\"doc\");\r\n");
      out.write("\r\n");
      out.write("        var dd = document.getElementById(\"dd\");\r\n");
      out.write("\r\n");
      out.write("        dd.innerHTML = \"\";\r\n");
      out.write("\r\n");
      out.write("        var fileList = docObj.files;\r\n");
      out.write("\r\n");
      out.write("        for (var i = 0; i < fileList.length; i++) {            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            dd.innerHTML += \"<div style='float:left' > <img id='img\" + i + \"'  /> </div>\";\r\n");
      out.write("\r\n");
      out.write("            var imgObjPreview = document.getElementById(\"img\"+i); \r\n");
      out.write("\r\n");
      out.write("            if (docObj.files && docObj.files[i]) {\r\n");
      out.write("\r\n");
      out.write("                //火狐下，直接设img属性\r\n");
      out.write("\r\n");
      out.write("                imgObjPreview.style.display = 'block';\r\n");
      out.write("\r\n");
      out.write("                imgObjPreview.style.width = '150px';\r\n");
      out.write("\r\n");
      out.write("                imgObjPreview.style.height = '180px';\r\n");
      out.write("\r\n");
      out.write("                //imgObjPreview.src = docObj.files[0].getAsDataURL();\r\n");
      out.write("\r\n");
      out.write("                //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式\r\n");
      out.write("\r\n");
      out.write("                imgObjPreview.src = window.URL.createObjectURL(docObj.files[i]);\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            else {\r\n");
      out.write("\r\n");
      out.write("                //IE下，使用滤镜\r\n");
      out.write("\r\n");
      out.write("                docObj.select();\r\n");
      out.write("\r\n");
      out.write("                var imgSrc = document.selection.createRange().text;\r\n");
      out.write("\r\n");
      out.write("                alert(imgSrc)\r\n");
      out.write("\r\n");
      out.write("                var localImagId = document.getElementById(\"img\" + i);\r\n");
      out.write("\r\n");
      out.write("                //必须设置初始大小\r\n");
      out.write("\r\n");
      out.write("                localImagId.style.width = \"150px\";\r\n");
      out.write("\r\n");
      out.write("                localImagId.style.height = \"180px\";\r\n");
      out.write("\r\n");
      out.write("                //图片异常的捕捉，防止用户修改后缀来伪造图片\r\n");
      out.write("\r\n");
      out.write("                try {\r\n");
      out.write("\r\n");
      out.write("                    localImagId.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)\";\r\n");
      out.write("\r\n");
      out.write("                    localImagId.filters.item(\"DXImageTransform.Microsoft.AlphaImageLoader\").src = imgSrc;\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                catch (e) {\r\n");
      out.write("\r\n");
      out.write("                    alert(\"您上传的图片格式不正确，请重新选择!\");\r\n");
      out.write("\r\n");
      out.write("                    return false;\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                imgObjPreview.style.display = 'none';\r\n");
      out.write("\r\n");
      out.write("                document.selection.empty();\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        }  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        return true;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
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
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fenctype_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /addActivityImage.jsp(114,2) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("AddActivityImageAction.action");
    // /addActivityImage.jsp(114,2) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /addActivityImage.jsp(114,2) name = enctype type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setEnctype("multipart/form-data");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  <div style=\"margin :0px auto; width:990px;\">\r\n");
        out.write("  <!-- multiple=\"multiple\"使得多张图片可以同时被上传 -->\r\n");
        out.write("  <input type=\"file\"  name=\"upload\" id=\"doc\" multiple=\"multiple\" onchange=\"javascript:setImagePreviews();\" accept=\"image/*\" />\r\n");
        out.write("  <input type=\"submit\" name=\"uploadImage\" value=\"上传\"/> \r\n");
        out.write("  </div>\r\n");
        out.write("  <!-- 照片预览 -->\r\n");
        out.write("  <div id=\"dd\" style=\" width:990px;\"></div>\r\n");
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
      _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fenctype_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }
}
