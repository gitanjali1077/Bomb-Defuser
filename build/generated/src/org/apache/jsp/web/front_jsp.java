package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class front_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        img{ position:absolute;\n");
      out.write("            width:1366px;  height:662px;\n");
      out.write("       top:0px; left:0px;  }\n");
      out.write("       body {\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tbackground: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p {\n");
      out.write("\t\tcolor: #ddd;\n");
      out.write("\t\tfont-family: Helvetica;\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t\tmargin: 20px 0 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a {\n");
      out.write("\t\tcolor: #000;\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\ttext-transform: uppercase;\n");
      out.write("\t\tfont-family: Helvetica;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a,\n");
      out.write("span {\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("svg {\n");
      out.write("\t\twidth: 130px;\n");
      out.write("\t\theight: 40px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* THE ROUND PSEUDO-ELEMENT HOVER STYLES */\n");
      out.write(".round,\n");
      out.write(".svg,\n");
      out.write(".highlight {\n");
      out.write("\t\tmax-width: 960px;\n");
      out.write("\t\tmargin:0 auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round a {\n");
      out.write("\t\tcolor: crimson;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button {\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\twidth: 130px;\n");
      out.write("\t\theight: 40px;\n");
      out.write("\t\tline-height: 40px;\n");
      out.write("                margin-left:600px;\n");
      out.write("\t\tmargin: 20px;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\toverflow: hidden;\n");
      out.write("\t\tborder: 2px solid crimson;\n");
      out.write("\t\ttransition: color .5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:before {\n");
      out.write("\t\tcontent: \"\";\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tz-index: -1;\n");
      out.write("\t\tbackground: crimson;\n");
      out.write("\t\theight: 150px;\n");
      out.write("\t\twidth: 200px;\n");
      out.write("\t\tborder-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:hover {\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:nth-child(1):before {\n");
      out.write("\t\ttop: 100%;\n");
      out.write("\t\tleft: 100%;\n");
      out.write("\t\ttransition: all .7s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:nth-child(1):hover:before {\n");
      out.write("\t\ttop: -30px;\n");
      out.write("\t\tleft: -30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:nth-child(2):before {\n");
      out.write("\t\tleft: -30px;\n");
      out.write("\t\tbottom: 100%;\n");
      out.write("\t\ttransition: all .7s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:nth-child(2):hover:before {\n");
      out.write("\t\tbottom: -50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:nth-child(3):before {\n");
      out.write("\t\ttop: 0;\n");
      out.write("\t\tleft: -200%;\n");
      out.write("\t\ttransition: all .7s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round .button:nth-child(3):hover:before {\n");
      out.write("\t\ttop: -30px;\n");
      out.write("\t\tleft: -30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* THE SVG HOVER EFFECTS */\n");
      out.write(".svg .button {\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\twidth: 130px;\n");
      out.write("\t\theight: 40px;\n");
      out.write("\t\tmargin: 20px;\n");
      out.write("\t\toverflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button:nth-child(3) {\n");
      out.write("\t\toverflow: visible;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\ttop: -20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button rect {\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\ttop: 0;\n");
      out.write("\t\tleft: 0;\n");
      out.write("\t\tstroke-width: 4px;\n");
      out.write("\t\tstroke-dashoffset: 400px;\n");
      out.write("\t\tstroke: olivedrab;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button span {\n");
      out.write("\t\tcolor: olivedrab;\n");
      out.write("\t\twidth: 130px;\n");
      out.write("\t\theight: 40px;\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\ttext-align: center;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft: 0;\n");
      out.write("\t\ttop: 0;\n");
      out.write("\t\tline-height: 40px;\n");
      out.write("\t\ttransition: all .2s linear;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button span:hover {\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t\tbackground: olivedrab;\n");
      out.write("\t\ttransition: all 1s cubic-bezier(1.25s 0, 1.15, 1, 1);\n");
      out.write("\t\ttransition-delay: .5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button:nth-child(1):hover rect {\n");
      out.write("\t\tanimation: draw1 .75s linear forwards;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button:nth-child(2):hover rect {\n");
      out.write("\t\tanimation: draw2 .75s linear forwards;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button:nth-child(3) span {\n");
      out.write("\t\tborder: 3px solid olivedrab;\n");
      out.write("\t\ttransform: scale(1);\n");
      out.write("\t\twidth: 125px;\n");
      out.write("\t\theight: 35px;\n");
      out.write("\t\tline-height: 37px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".svg .button:nth-child(3):hover span {\n");
      out.write("\t\tanimation: draw3 .75s linear forwards;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes draw1 {\n");
      out.write("\t\t0% {\n");
      out.write("\t\t\t\tstroke-dasharray: 300;\n");
      out.write("\t\t\t\tstroke-dashoffset: 700;\n");
      out.write("\t\t\t\tstroke-width: 4px;\n");
      out.write("\t\t}\n");
      out.write("\t\t75% {\n");
      out.write("\t\t\t\tstroke-dasharray: 900;\n");
      out.write("\t\t\t\tstroke-width: 1px;\n");
      out.write("\t\t}\n");
      out.write("\t\t100% {\n");
      out.write("\t\t\t\tstroke-dasharray: 900;\n");
      out.write("\t\t\t\tstroke-width: 1px;\n");
      out.write("\t\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes draw2 {\n");
      out.write("\t\t0% {\n");
      out.write("\t\t\t\tstroke-dashoffset: 350;\n");
      out.write("\t\t\t\tstroke-dasharray: 350;\n");
      out.write("\t\t}\n");
      out.write("\t\t50% {\n");
      out.write("\t\t\t\tstroke-dashoffset: 600;\n");
      out.write("\t\t\t\tstroke-dasharray: 400;\n");
      out.write("\t\t\t\tstroke-width: 1px;\n");
      out.write("\t\t}\n");
      out.write("\t\t100% {\n");
      out.write("\t\t\t\tstroke-dashoffset: 900;\n");
      out.write("\t\t\t\tstroke-dasharray: 400;\n");
      out.write("\t\t\t\tstroke-width: 1px;\n");
      out.write("\t\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes draw3 {\n");
      out.write("\t\t100% {\n");
      out.write("\t\t\t\ttransform: scale(1.35);\n");
      out.write("\t\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@font-face{\n");
      out.write("                font-family: youmurdererbb_reg;\n");
      out.write("                /*src: url(font/SUBWT___.ttf);*/\n");
      out.write("                src: url(font/youmurdererbb_reg.ttf);\n");
      out.write("            }\n");
      out.write("/* HIGHLIGHT */\n");
      out.write(".highlight .button {\n");
      out.write("\t\tdisplay: inline-block;\n");
      out.write("\t\tcolor: #fff;\n");
      out.write("\t\t//background: darkred;\n");
      out.write("\t\tmargin: 20px;\n");
      out.write("\t\t//width: 130px;\n");
      out.write("\t\t//height: 40px;\n");
      out.write("                 margin-left:340px;\n");
      out.write("\t\tmargin-top:290px;\n");
      out.write("\t\tline-height: 40px;\n");
      out.write("                width: 190px;\n");
      out.write("\t\tborder-radius: 10px;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\toverflow: hidden;\n");
      out.write("                font-size:60px;\n");
      out.write("               font-family: youmurdererbb_reg;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".highlight .button:before {\n");
      out.write("     margin-left:490px;\n");
      out.write("\t\tmargin-top:260px;\n");
      out.write("\t\t\n");
      out.write("\t\tcontent: \"\";\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\ttop: -30px;\n");
      out.write("\t\tleft: -80px;\n");
      out.write("\t\theight: 100px;\n");
      out.write("\t\twidth: 76px;\n");
      out.write("\t\tbackground: rgba(255, 255, 255, .7);\n");
      out.write("\t\ttransform: rotate(20deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".highlight .button:hover:before {\n");
      out.write("\t\tleft: 150px;\n");
      out.write("\t\ttransition: all .5s;\n");
      out.write("}\n");
      out.write(".highlight {margin-bottom:100px;}\n");
      out.write("        </style>\n");
      out.write("        <body style=\"background-image: url(Image/bg9.jpg);background-repeat: no-repeat; background-size: 1600px 780px;\">\n");
      out.write("        \n");
      out.write("      \n");
      out.write("\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("<div class=\"highlight\">\n");
      out.write("\t\t<a class=\"button\" href=\"startVideo.jsp\">Enter</a>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
