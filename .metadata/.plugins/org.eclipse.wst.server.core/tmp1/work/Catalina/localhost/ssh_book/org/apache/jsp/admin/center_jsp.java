/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-06-07 10:07:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("html, body, iframe{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tmargin: 0px 0px;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write(".navPoint {\r\n");
      out.write("\tCOLOR: white;\r\n");
      out.write("\tCURSOR: hand;\r\n");
      out.write("\tFONT-FAMILY: Webdings;\r\n");
      out.write("\tFONT-SIZE: 9pt\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<input type=\"hidden\" id=\"emp_input\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\"\r\n");
      out.write("\t\tcellspacing=\"0\" style=\"table-layout: fixed;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"width:4px; background-image:url(images/main_16.gif)\">&nbsp;</td>\r\n");
      out.write("\t\t\t<td width=\"173\" id=\"frmTitle\" noWrap align=\"center\" valign=\"top\" height=\"100%\">\r\n");
      out.write("\t\t\t\t<iframe src=\"left.jsp\" name=\"leftFrame\" id=\"frame_left\" height=\"500\" width=\"180\" frameborder=\"0\" scrolling=\"no\">\r\n");
      out.write("\t\t\t\t\t浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。</iframe>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"8\" valign=\"middle\" background=\"images/main_12.gif\"></td>\r\n");
      out.write("\t\t\t<td align=\"center\" valign=\"top\">\r\n");
      out.write("\t\t\t\t<iframe src=\"right.jsp\" name=\"rightFrame\" id=\"frame_right\" height=\"500\" width=\"100%\" frameborder=\"0\">\r\n");
      out.write("\t\t\t\t\t浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。</iframe>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"4\" align=\"center\" valign=\"top\" background=\"images/main_20.gif\">\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("// ifram高度100%\r\n");
      out.write("function iframeHeight() {\r\n");
      out.write("\t document.getElementById('frame_left').height=\"100%\";\r\n");
      out.write("\t document.getElementById('frame_right').height=\"100%\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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
