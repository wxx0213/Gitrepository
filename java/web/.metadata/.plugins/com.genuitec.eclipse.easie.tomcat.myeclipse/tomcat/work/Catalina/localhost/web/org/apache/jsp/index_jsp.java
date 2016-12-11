package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005fid_005faction.release();
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>Welcome</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"jsp/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t<script src=\"jsp/js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("\t<!-- Custom Theme files -->\r\n");
      out.write("\t<link href=\"jsp/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\r\n");
      out.write("\t<!-- Custom Theme files -->\r\n");
      out.write("\t<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("\t<!--Google Fonts-->\r\n");
      out.write("\t<!-- start-smoth-scrolling -->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"jsp/js/move-top.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"jsp/js/easing.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t<!-- //end-smoth-scrolling -->\r\n");
      out.write("\t<script src=\"jsp/js/menu_jquery.js\"></script>\r\n");
      out.write("</head> \r\n");
      out.write("  <body>\r\n");
      out.write("  \r\n");
      out.write("  <!--header start here-->\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t <div class=\"header-main\">\r\n");
      out.write("\t\t\t<div class=\"top-menu\">\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"index.html\" >首页</a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"jsp/guide.html\">玩遍校园 </a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"jsp/Culture.html\">校园文化</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\"> <img src=\"jsp/images/lo1.png\" alt=\"\"> </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"jsp/building.html\">特色建筑 </a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"jsp/service.html\">周边服务</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><div class=\"header-login\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <div class=\"top-nav-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"loginContainer\"> <a href=\"#\" id=\"loginButton\"><span>Login</span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <div id=\"loginBox\">                \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t        ");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t   </div>\r\n");
      out.write("\t\t                         </div>\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!--script-->\r\n");
      out.write("\t\t\t<div class=\"bann-bottom\">\r\n");
      out.write("\t\t\t\t<h1>Welcome To MINZU University Of China ！</h1>\r\n");
      out.write("\t\t\t\t<p>美美与共   知行合一 </p>\r\n");
      out.write("\t\t\t\t<div class=\"bann-main\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 bann-grid\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"jsp/images/i1.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<h4>特色建筑</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 bann-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"jsp/images/i2.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<h4>特色文化</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 bann-grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"jsp/images/i3.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<h4>特色服务</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t </div>\r\n");
      out.write("   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--header end here-->\r\n");
      out.write("  <!--baner-info start here-->\r\n");
      out.write("<div class=\"banner-info\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"banner-info-main\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6 bann-info-left\">\r\n");
      out.write("\t\t\t\t<img src=\"jsp/images/2.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t<p>中央民族大学民族博物馆始建于1951年，是以全国56个民族的文物为主要收藏、展示和研究对象的民族学专业博物馆。馆舍总面积近5000平方米。馆藏有各民族的锦旗、革命文物、土特产品、生产工具、服装、皮毛、古器物、历史文献、珠宝器、武器、乐器、宗教用品等14类文物，及国外部分国家和民族的瓷器、钱币、图片等文物，共2万余件。这些藏品的特点，一是族属、内容全面丰富，反映全国56个民族历史、文化、精神风貌的各类文物几乎都有收藏.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6 bann-info-left\">\r\n");
      out.write("\t\t\t\t<img src=\"jsp/images/auditorium.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t<p>中央民族大学大礼堂是民族大学早期建筑的最典型代表，始建于上世纪五六十年代的学校建初，大礼堂采用早期中国大学红梁灰砖瓦盖的普遍风格，古朴清幽典雅庄严，出自当时建筑名家梁思成之手，是中央民族大学历史见证性的标志建筑。</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t  <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"bann-info-btn\"><a href=\"building.html\" class=\"hvr-bounce-to-right\">Find More</a></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--banner-info end here-->\r\n");
      out.write("<!--testimonal start here-->\r\n");
      out.write("<div class=\"testimonal\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"testimonal-main\">\r\n");
      out.write("\t\t\t <h2>走进民大，感受别样的风情</h2>\r\n");
      out.write("\t\t\t <p> 漫步校园，古朴的建筑映衬下，流动的服饰，鲜丽的色彩，还有美丽的少男少女。置身古朴幽美的民大校园，在“各美其美，美美与共”的各民族文化熏染下，我们有幸去感受绚丽多彩的民族服饰。</p>\r\n");
      out.write("\t\t\t <a href=\"Culture.html\" class=\"hvr-bounce-to-right  testimo-btn\">Find More</a>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--testimonal end here-->\r\n");
      out.write("<!--we work strat her-->\r\n");
      out.write("<div class=\"we-work\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"we-work-main\">\r\n");
      out.write("\t\t\t<div class=\"we-work-top\">\r\n");
      out.write("\t\t\t\t<h3>Tour  Guide</h3>\r\n");
      out.write("\t\t\t\t<p>中央民族大学（Minzu University of China）坐落于北京学府林立的海淀区，南邻国家图书馆，北依中关村科技园，校园环境典雅，古朴幽美，人文氛围浓郁，具有鲜明的民族特色。</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"we-work-bottom\">\r\n");
      out.write("\t\t\t\t <div class=\"col-md-6 we-work-left\">\r\n");
      out.write("\t\t\t\t \t<div class=\"col-md-6 we-left-img1\">\r\n");
      out.write("\t\t\t\t \t\t<img src=\"jsp/images/w1.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t \t</div>\r\n");
      out.write("\t\t\t\t \t<div class=\"col-md-6 we-left-img2\">\r\n");
      out.write("\t\t\t\t \t\t<img src=\"jsp/images/w2.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t \t</div>\r\n");
      out.write("\t\t\t\t \t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t <div class=\"col-md-6 we-work-right\">\r\n");
      out.write("\t\t\t\t \t<p>食堂：学生第二、四食堂       \r\n");
      out.write("\t\t\t\t\t\t\t  清真风味食堂           \r\n");
      out.write("\t\t\t\t\t\t\t  地下风味食堂        \r\n");
      out.write("\t\t\t\t\t\t\t  清真第三食堂</p>\r\n");
      out.write("\t\t\t\t\t<p>宿舍：学生1-8号公寓   <br>     \r\n");
      out.write("\t\t\t\t\t   澡堂、开水房：清真第三食堂旁边<br>         \r\n");
      out.write("\t\t\t\t\t   理发店、洗衣房、眼镜店、地下超市</p>\r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--we work end here-->\r\n");
      out.write("<!--feature start here-->\r\n");
      out.write("<div class=\"features\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"features-main\">\r\n");
      out.write("\t\t\t  <div class=\"features-top\">\r\n");
      out.write("\t\t\t  \t <h3>Services</h3>\r\n");
      out.write("\t\t\t  \t <p> </p>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"features-bottom\">\r\n");
      out.write("\t\t\t  \t <div class=\"col-md-3 feature-grid\">\r\n");
      out.write("\t\t\t  \t \t<img src=\"jsp/images/f1.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t  \t \t<h4>衣</h4>\r\n");
      out.write("\t\t\t  \t \t<p>天成市场<br>首体滑冰馆地下一层<br>生活用品、小商品批发市场</p>\r\n");
      out.write("\t\t\t  \t </div>\r\n");
      out.write("\t\t\t  \t  <div class=\"col-md-3 feature-grid\">\r\n");
      out.write("\t\t\t  \t \t<img src=\"jsp/images/f2.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t  \t \t<h4>食</h4>\r\n");
      out.write("\t\t\t  \t \t<p>民族苑<br>学生8号公寓一层东侧<br>民族特色菜、价格略高</p>\r\n");
      out.write("\t\t\t  \t </div>\r\n");
      out.write("\t\t\t  \t  <div class=\"col-md-3 feature-grid\">\r\n");
      out.write("\t\t\t  \t \t<img src=\"jsp/images/f3.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t  \t \t<h4>住</h4>\r\n");
      out.write("\t\t\t  \t \t<p>中协宾馆<br>民大西门<br>三星级</p>\r\n");
      out.write("\t\t\t  \t </div>\r\n");
      out.write("\t\t\t  \t  <div class=\"col-md-3 feature-grid\">\r\n");
      out.write("\t\t\t  \t \t<img src=\"jsp/images/f4.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t  \t \t<h4>行</h4>\r\n");
      out.write("\t\t\t  \t \t<p>中央民族大学校园坐落于北京高校林立的海淀区中关村南大街，位于西北三环内，交通便利，周边资源丰富。</p>\r\n");
      out.write("\t\t\t  \t </div>\r\n");
      out.write("\t\t\t  \t <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--services end here-->\r\n");
      out.write("<!--footer start here-->\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"footer-main\">\r\n");
      out.write("\t\t\t <div class=\"col-md-4 ftr-grid\">\r\n");
      out.write("\t\t\t \t<div class=\"ftr-grid-left\">\r\n");
      out.write("\t\t\t \t    <img src=\"jsp/images/location.png\" alt=\"\">\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t \t<div class=\"ftr-grid-right\">\r\n");
      out.write("\t\t\t \t\t<p>地址：海淀区中关村南大街27号<span class=\"local\">邮编：100081</span></p>\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"col-md-4 ftr-grid\">\r\n");
      out.write("\t\t\t \t <div class=\"ftr-grid-left\">\r\n");
      out.write("\t\t\t \t    <img src=\"jsp/images/email.png\" alt=\"\">\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t \t<div class=\"ftr-grid-right\">\r\n");
      out.write("\t\t\t \t\t<p>联系我们<span class=\"local\">zzmzdx@muc.edu.cn</span></p>\r\n");
      out.write("\t\t\t \t</div>\r\n");
      out.write("\t\t\t   <div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t <div class=\"col-md-4 ftr-grid\">\r\n");
      out.write("\t\t\t \t <div class=\"ftr-grid-left\">\r\n");
      out.write("\t\t\t \t    <img src=\"jsp/images/phone.png\" alt=\"\">\r\n");
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
      if (_jspx_meth_s_005fform_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <a href=register.jsp>注册</a>|<a href=index.jsp>重置密码</a>\r\n");
      out.write("  <a href=newactivity.jsp>添加活动</a>\r\n");
      out.write("  <a href=delete.jsp>删除</a>\r\n");
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
    // /index.jsp(59,19) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("LoginAction.action");
    // /index.jsp(59,19) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /index.jsp(59,19) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t\t\t\t\t\t\t\t\t\t                <fieldset id=\"body\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                          <label for=\"email\">Username</label>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                          <input type=\"text\" name=\"username\" id=\"email\"/>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                    </fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                    <fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                            <label for=\"password\">Password</label>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                            <input type=\"password\" name=\"password\" id=\"password\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                     </fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                    <input type=\"submit\" name=\"login\" id=\"login\" value=\"Sign in\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                     \r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t                \t<label for=\"checkbox\"><input type=\"checkbox\" id=\"checkbox\"> <i>Remember me</i></label>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t            \t</fieldset>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t            \t<span><a href=\"register.jsp\">Register here</a></span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t            <span><a href=\"index.jsp\">Forgot your password?</a></span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t  ");
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

  private boolean _jspx_meth_s_005fform_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f1 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f1.setParent(null);
    // /index.jsp(251,0) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("LoginAction.action");
    // /index.jsp(251,0) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    int _jspx_eval_s_005fform_005f1 = _jspx_th_s_005fform_005f1.doStartTag();
    if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("   用户名：<input type=\"text\" name=\"username\"/><br><br>\r\n");
        out.write("   密码:&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"password\"></input><br><br>\r\n");
        out.write("   <input type=\"submit\" name=\"login\" value=\"登录\"/>  <br>\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_s_005fform_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f1);
    return false;
  }
}
