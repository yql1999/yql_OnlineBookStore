/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-07-01 12:10:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
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
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/book.js\"></script>\r\n");
      out.write("<title>图书详情</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"center_content\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"left_content\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.codrops-demos a{\r\n");
      out.write("    \t\tcolor: #fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.codrops-demos {\r\n");
      out.write("    \t\tpadding-top: 50px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.codrops-demos a {\r\n");
      out.write("    \t\ttext-transform: uppercase;\r\n");
      out.write("    \t\tletter-spacing: 1px;\r\n");
      out.write("   \t\t\tmargin: 15px;\r\n");
      out.write("    \t\tpadding: 5px 2px;\r\n");
      out.write("    \t\tfont-weight: 900;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.codrops-demos a.current-demo {\r\n");
      out.write("    \t\tcolor: #fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t</style>\r\n");
      out.write("\t\t<nav class=\"codrops-demos\"><a href=\"special.jsp\">\r\n");
      out.write("                    <h2 class=\"section-title\">图书");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <span>详细介绍</span></h2></a>\r\n");
      out.write("        </nav>\r\n");
      out.write("\t\t<div class=\"feat_prod_box_details\">\r\n");
      out.write("\t\t\t<div class=\"prod_img\">\r\n");
      out.write("\t\t\t\t<img src=\"../");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.cover}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"thumb_big\" border=\"0\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"prod_det_box\">\r\n");
      out.write("\t\t\t\t<div class=\"box_top\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"box_center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"prod_title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t<p class=\"details\">");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"price\"><strong>价格:</strong> <span class=\"red\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span></div>\r\n");
      out.write("\t\t\t\t\t<div style=\"text-align: right;margin-right:11px;margin-top:-20px\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" onclick=\"buy(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/button.png\" width=\"150px\"/>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"box_bottom\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"demo\" class=\"demolayout\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<ul id=\"demo-nav\" class=\"demolayout\">\r\n");
      out.write("\t\t\t\t<li><a class=\"active\">详细介绍</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<div class=\"tabs-container\">\r\n");
      out.write("\t\t\t\t<div style=\"display: block;\" class=\"tab\" id=\"tab1\">\r\n");
      out.write("\t\t\t\t\t<p class=\"more_details\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.intro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<ul class=\"list\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">出版日期: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.pubdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "right.jsp", out, false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    boolean _jspx_th_s_005fproperty_005f0_reused = false;
    try {
      _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fproperty_005f0.setParent(null);
      // /index/detail.jsp(49,24) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fproperty_005f0.setValue("book.intro.substring(0,(intro.length()>70?70:intro.length()))+'...'");
      int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
      if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      _jspx_th_s_005fproperty_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fproperty_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fproperty_005f0_reused);
    }
    return false;
  }
}
