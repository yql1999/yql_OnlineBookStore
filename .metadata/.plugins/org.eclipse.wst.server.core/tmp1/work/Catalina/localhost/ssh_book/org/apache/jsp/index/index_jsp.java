/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-06-07 11:02:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.5.10.1.jar", Long.valueOf(1558585065844L));
    _jspx_dependants.put("jar:file:/C:/Users/hp/Desktop/实验/Web应用实验/web应用课程设计/OnlineBookstore/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/ssh_book_mysql/WEB-INF/lib/struts2-core-2.5.10.1.jar!/META-INF/struts-tags.tld", Long.valueOf(1488770942000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("<title>书店首页</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div class=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"center_content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"left_content\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 精品推荐 -->\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t<span class=\"title_icon\"><img src=\"images/bullet1.png\" /></span>精品推荐\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"feat_prod_box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"prod_img\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"detail.action?bookid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><img src=\"../picture/7.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"thumb_big\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"prod_det_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_top\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"special_icon\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"images/special_icon.gif\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prod_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"detail.action?bookid=7\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"details\" style=\"margin-right: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t《明朝那些事儿》这篇文主要讲述的是从1344年到1644年这三百年间关于明朝的一些事情，以史料为基础，以年代和具体人物为主线，并加入了小说的笔法，对明朝十七帝和其他王公权贵和小人物的命运进行全景展示，尤其对官场政治、战争、帝王心术着墨最多，并加入对当时政治经济制度、人伦道德的演义。\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"detail.action?bookid=7\" class=\"more\">- DETAILS -</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_bottom\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"feat_prod_box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"prod_img\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"detail.action?bookid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><img src=\"../picture/29.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"thumb_big\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"prod_det_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_top\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"special_icon\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"images/special_icon.gif\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prod_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"detail.action?bookid=29\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"details\" style=\"margin-right: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t《你是人间四月天》收录了林徽因几乎所有的诗歌、散文、小说。包括诗歌《谁爱这不息的变幻》《你是人间的四月天》《激昂》，散文《悼志摩》《一片阳光》，小说《九十九度中》《模影零篇》等脍炙人口的名篇，内容含量大且丰富，一本书即可了解全部的林徽因。\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"detail.action?bookid=29\" class=\"more\">- DETAILS -</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_bottom\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"feat_prod_box\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"prod_img\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"detail.action?bookid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><img src=\"../picture/40.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"thumb_big\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"prod_det_box\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_top\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"special_icon\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"images/special_icon.gif\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"prod_title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"detail.action?bookid=40\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"details\" style=\"margin-right: 20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t本书以最小最精之篇幅反映《傅雷家书》全貌，再现傅氏兄弟成长的家教背景，全面展示傅雷家风。</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"detail.action?bookid=40\" class=\"more\">- DETAILS -</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box_bottom\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 最新出版 -->\r\n");
      out.write("\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t<span class=\"title_icon\"><img src=\"images/bullet2.gif\" /></span>最新出版\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"feat_prod_box\">\r\n");
      out.write("\t\t\t\t<div class=\"prod_img\">\r\n");
      out.write("\t\t\t\t\t<a href=\"detail.action?bookid=1\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"../picture/1.jpg\" alt=\"图书图片\" class=\"thumb_big\" border=\"0\"/>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"prod_det_box\"><span class=\"new_icon\"><img src=\"images/new_icon.gif\"/></span>\r\n");
      out.write("\t\t\t\t\t<div class=\"box_top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"box_center\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"details\" style=\"margin-right: 30px;\"><a href=\"detail.action?bookid=1\"></a>罗伯特家族在其生前全面增修版基础上，倾力修订改进的权威、详尽的议学经典！根据2000年由美国Perseus出版的官方版本翻译而成，原版总销量已逾500万册。</p>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.action?bookid=1\" class=\"more\">- DETAILS -</a>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"box_bottom\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "right.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<!-- Include All JavaScript -->\r\n");
      out.write("<script src=\"../js/news/masonry.pkgd.min.js\"></script>\r\n");
      out.write("<script src=\"../js/news/imagesloaded.pkgd.min.js\"></script>\r\n");
      out.write("<script src=\"../js/news/modernizr.custom.js\"></script>\r\n");
      out.write("<script src=\"../js/news/classie.js\"></script>\r\n");
      out.write("<script src=\"../js/news/colorfinder-1.1.js\"></script>\r\n");
      out.write("<script src=\"../js/news/gridScrollFx.js\"></script>\r\n");
      out.write("<script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"../js/jquery.appear.js\"></script>\r\n");
      out.write("<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"../js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
