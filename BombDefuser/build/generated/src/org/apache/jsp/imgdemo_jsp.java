package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imgdemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <img src=\"image/pic3.jpg\" id=\"lamp\" width=\"32\" height=\"32\">\n");
      out.write("\n");
      out.write("<canvas id=\"myCanvas\" width=\"300\" height=\"150\" style=\"border:1px solid #d3d3d3;\">\n");
      out.write("Your browser does not support the HTML5 canvas tag.</canvas>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    var c = document.getElementById(\"myCanvas\");\n");
      out.write("    var ctx = c.getContext(\"2d\");\n");
      out.write("    ctx.clearRect(0, 0, c.width, c.height);\n");
      out.write("    var img = document.getElementById(\"lamp\")\n");
      out.write("    var pat = ctx.createPattern(img, \"no-repeat\");\n");
      out.write("    ctx.rect(0, 0, 150, 100);\n");
      out.write("    ctx.fillStyle = pat;\n");
      out.write("    ctx.fill();\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<p><strong>Note:</strong> The canvas tag is not supported in Internet\n");
      out.write("Explorer 8 and earlier versions.</p>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
