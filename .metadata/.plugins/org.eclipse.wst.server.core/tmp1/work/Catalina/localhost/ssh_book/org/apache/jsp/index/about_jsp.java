/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-06-07 04:58:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>书店简介</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"center_content\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"left_content\" style=\"width: 750px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet1.png\"/></span>书店简介</div>\r\n");
      out.write("\t\t<div class=\"feat_prod_box_details\">\r\n");
      out.write("\t\t\t<p class=\"details\" style=\"line-height: 30px;\">\r\n");
      out.write("\t\t\t\t<img src=\"images/book.gif\" class=\"right\" style=\"width: 100%;height: 300px;margin-bottom: 40px;\" />\r\n");
      out.write("\t\t\t\t林海书店创立于1999年，经过十几年的努力打拼，由小到大，逐步发展成为初具规模，各类设施齐全的图书售销市场的旗舰店。书店现已拥有直营连锁店十六家，总营业面积达四万多平方米，\r\n");
      out.write("\t\t\t    仅改造扩建后的旗舰店经营面积就达到一万八千多平方米。经营图书、音像制品近五十余万种，文化用品近万种。通过统一进货、统一物流、统一标准、统一品牌、统一促销活动，扩大市场份额、降低管理成本、增加调整品种结构，\r\n");
      out.write("\t\t\t    从而提高了书城的连锁经营效率，且于2003年建立了商业发展前沿的B-TO-C电子商务模式，一直稳步发展前进至今。\r\n");
      out.write("\t\t\t    <br/><br/>\r\n");
      out.write("\t\t\t\t书店除经营各类图书、学辅用书的批发销售外，还经营学生所用的各类学习机以及各种电子产品和各种学习文具、体育用品和办公用品。林海书店在经营规模不断扩大的同时，更加注重服务质量和产品质量，\r\n");
      out.write("\t\t\t\t自觉抵制和不良图书进入书店和销售场所，为保护知识产权，打击盗版，维护广大顾客和消费者权益，做出了良好的表率，取得了良好的社会效益和经济效益。\r\n");
      out.write("\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t通过与读者的互动，为其提供优雅、明快的购书环境和人性化的高水准服务，让读者在购书时尽情地享受生活，\r\n");
      out.write("\t\t\t    全方位彰显了书店“行业先导，国际一流”的独特品质。\r\n");
      out.write("\t\t\t    <br/><br/>\r\n");
      out.write("\t\t    </p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("   \r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
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
}
