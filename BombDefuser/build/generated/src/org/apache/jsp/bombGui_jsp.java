package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bombGui_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<style>       \n");
      out.write("        video#bgvid { \n");
      out.write("             position: fixed;\n");
      out.write("            top: 50%;\n");
      out.write("            left: 50%;\n");
      out.write("            min-width: 100%;\n");
      out.write("            min-height: 100%;\n");
      out.write("            width: auto;\n");
      out.write("            height: auto;\n");
      out.write("            z-index: -100;\n");
      out.write("            -ms-transform: translateX(-50%) translateY(-50%);\n");
      out.write("            -moz-transform: translateX(-50%) translateY(-50%);\n");
      out.write("            -webkit-transform: translateX(-50%) translateY(-50%);\n");
      out.write("            transform: translateX(-50%) translateY(-50%);\n");
      out.write("            background: url(polina.jpg) no-repeat;\n");
      out.write("            background-size: cover; \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <img id=\"scream\" width=\"80\" height=\"80\" src=\"Image/pic4.jpg\" alt=\"The Chips\" hidden=\"true\">\n");
      out.write("        <img id=\"board\" width=\"80\" height=\"80\" src=\"Image/img4.jpg\" alt=\"The Board\" hidden=\"true\">\n");
      out.write("        <img id=\"timer\" width=\"80\" height=\"80\" src=\"Image/timer2.jpg\" alt=\"The Timer\" hidden=\"true\">\n");
      out.write("        <br>\n");
      out.write("         <canvas id=\"canvas\" width=\"1500\" height=\"675\" style=\"margin-top: 140px;margin-left: 250px\">\n");
      out.write("            \n");
      out.write("            your browser does not support html5 canvas\n");
      out.write("        </canvas>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("        var c = document.getElementById(\"canvas\");\n");
      out.write("        var ctx = c.getContext(\"2d\");\n");
      out.write("        var xrt=20;\n");
      out.write("        var yrt=0;\n");
      out.write("        var rwidth=1400;\n");
      out.write("        var rht=650;\n");
      out.write("        var depth=100;\n");
      out.write("        var uplimit=40;\n");
      out.write("        var chipsq=200;\n");
      out.write("        \n");
      out.write("        var timerx=250;\n");
      out.write("        var timery=395;\n");
      out.write("        var timerwidth=950;\n");
      out.write("        var timerht=180;\n");
      out.write("        var timerdepth=10;\n");
      out.write("        var antht=100;\n");
      out.write("        \n");
      out.write("        ctx.rect(xrt, yrt, rwidth, rht);\n");
      out.write("        ctx.stroke();\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        window.onload = function() {        \n");
      out.write("            c = document.getElementById(\"canvas\");\n");
      out.write("            ctx = c.getContext(\"2d\");\n");
      out.write("            \n");
      out.write("            ctx.rect(xrt-15, yrt+5, rwidth+5, rht+10);\n");
      out.write("        ctx.fillStyle = \"grey\";\n");
      out.write("        ctx.fill();\n");
      out.write("        ctx.stroke();\n");
      out.write("        \n");
      out.write("        var img = document.getElementById(\"board\");\n");
      out.write("        ctx.drawImage(img,xrt, yrt, rwidth, rht);\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        ctx.beginPath();\n");
      out.write("         ctx.strokeStyle = \"black\";\n");
      out.write("         ctx.lineWidth = 5;\n");
      out.write("//        ctx.moveTo(xrt-depth,yrt+depth);\n");
      out.write("//        ctx.lineTo(xrt,yrt);\n");
      out.write("        ctx.moveTo(xrt-depth,yrt+depth);\n");
      out.write("        ctx.lineTo(xrt-depth,yrt+depth+rht);\n");
      out.write("//        ctx.moveTo(xrt-depth,yrt+depth+rht);\n");
      out.write("//        ctx.lineTo(xrt,yrt+rht);\n");
      out.write("        ctx.moveTo(xrt-depth,yrt+depth+rht);\n");
      out.write("        ctx.lineTo(xrt+rwidth-depth,yrt+rht+depth);\n");
      out.write("//        ctx.moveTo(xrt+rwidth-depth,yrt+rht+depth);\n");
      out.write("//        ctx.lineTo(xrt+rwidth,yrt+rht);\n");
      out.write("        ctx.closePath();\n");
      out.write("        ctx.lineWidth = 5;\n");
      out.write("        ctx.fillStyle = 'red';\n");
      out.write("        ctx.fill();\n");
      out.write("        ctx.stroke();\n");
      out.write("        \n");
      out.write("        ctx.rect(xrt+4*uplimit+20-10,yrt+uplimit,chipsq,chipsq+5);\n");
      out.write("        ctx.rect(xrt+4*uplimit+chipsq+40-10,yrt+uplimit,chipsq,chipsq+5);\n");
      out.write("        ctx.rect(xrt+4*uplimit+2*chipsq+60-10,yrt+uplimit,chipsq,chipsq+5);\n");
      out.write("        ctx.rect(xrt+4*uplimit+3*chipsq+80-10,yrt+uplimit,chipsq,chipsq+5);\n");
      out.write("        ctx.rect(xrt+4*uplimit+4*chipsq+100-10,yrt+uplimit,chipsq,chipsq+5);\n");
      out.write("        \n");
      out.write("        ctx.fillStyle = \"black\";\n");
      out.write("        ctx.fill();\n");
      out.write("        ctx.stroke();\n");
      out.write("        \n");
      out.write("          var img = document.getElementById(\"scream\");\n");
      out.write("        ctx.drawImage(img,xrt+4*uplimit+20,yrt+uplimit,chipsq,chipsq);\n");
      out.write("        ctx.drawImage(img,xrt+4*uplimit+chipsq+40,yrt+uplimit,chipsq,chipsq);\n");
      out.write("        ctx.drawImage(img,xrt+4*uplimit+2*chipsq+60,yrt+uplimit,chipsq,chipsq);\n");
      out.write("        ctx.drawImage(img,xrt+4*uplimit+3*chipsq+80,yrt+uplimit,chipsq,chipsq);\n");
      out.write("        ctx.drawImage(img,xrt+4*uplimit+4*chipsq+100,yrt+uplimit,chipsq,chipsq);\n");
      out.write("        \n");
      out.write("        var img = document.getElementById(\"timer\");\n");
      out.write("        ctx.drawImage(img,timerx, timery, timerwidth, timerht);\n");
      out.write("        \n");
      out.write("//        ctx.rect(timerx, timery, timerwidth, timerht);\n");
      out.write("//        ctx.fillStyle = \"black\";\n");
      out.write("//        ctx.fill();\n");
      out.write("//\n");
      out.write("//        ctx.stroke();\n");
      out.write("        \n");
      out.write("         ctx.beginPath();\n");
      out.write("         ctx.strokeStyle = \"black\";\n");
      out.write("         ctx.lineWidth = 5;\n");
      out.write("        ctx.moveTo(timerx,timery);\n");
      out.write("        ctx.lineTo(timerx-timerdepth,timery+timerdepth);\n");
      out.write("        ctx.moveTo(timerx-timerdepth,timery+timerdepth);\n");
      out.write("        ctx.lineTo(timerx-timerdepth,timery+timerdepth+timerht);\n");
      out.write("        ctx.moveTo(timerx-timerdepth,timery+timerdepth+timerht);\n");
      out.write("        ctx.lineTo(timerx,timery+timerht);\n");
      out.write("        \n");
      out.write("        ctx.moveTo(timerx,timery+timerht);\n");
      out.write("        ctx.lineTo(timerx,timery);\n");
      out.write("                ctx.closePath();\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        ctx.moveTo(timerx-timerdepth,timery+timerdepth+timerht);\n");
      out.write("        ctx.lineTo(timerx+timerwidth-timerdepth,timery+timerht+timerdepth);\n");
      out.write("        ctx.moveTo(timerx+timerwidth-timerdepth,timery+timerht+timerdepth);\n");
      out.write("        ctx.lineTo(timerx+timerwidth,timery+timerht);\n");
      out.write("        \n");
      out.write("        ctx.moveTo(timerx+timerwidth,timery+timerht);\n");
      out.write("        ctx.lineTo(timerx,timery+timerht);\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        ctx.moveTo(timerx+3*timerdepth,timery);\n");
      out.write("        ctx.lineTo(timerx+3*timerdepth,timery-antht);\n");
      out.write("        ctx.moveTo(timerx+5*timerdepth,timery);\n");
      out.write("        ctx.lineTo(timerx+5*timerdepth,timery-antht);\n");
      out.write("        ctx.fillStyle = \"black\";\n");
      out.write("        ctx.fill();\n");
      out.write("        ctx.stroke();\n");
      out.write("        \n");
      out.write("        ctx.beginPath();\n");
      out.write("        ctx.arc(1110,timery+timerht,45,0,1*Math.PI);\n");
      out.write("        ctx.closePath();\n");
      out.write("        ctx.lineWidth = 5;\n");
      out.write("        ctx.fillStyle = 'red';\n");
      out.write("        ctx.fill();\n");
      out.write("        ctx.strokeStyle = 'black';\n");
      out.write("        ctx.stroke();\n");
      out.write("        \n");
      out.write("        ctx.beginPath();\n");
      out.write("        ctx.arc(timerx+3*timerdepth+10,timery-antht,10,1*Math.PI,0);\n");
      out.write("        ctx.closePath();\n");
      out.write("        ctx.lineWidth = 5;\n");
      out.write("        ctx.fillStyle = 'black';\n");
      out.write("        ctx.fill();\n");
      out.write("        ctx.strokeStyle = 'black';\n");
      out.write("        ctx.stroke();\n");
      out.write("        \n");
      out.write("//        ctx.beginPath();\n");
      out.write("//        ctx.arc(timerx+3*timerdepth+10,timery-antht,10,1*Math.PI,0);\n");
      out.write("//        ctx.stroke();\n");
      out.write("//        ctx.beginPath();\n");
      out.write("//        ctx.arc(1110,timery+timerht,45,0,1*Math.PI);\n");
      out.write("//        ctx.stroke();\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("//        c = document.getElementById(\"canvas\");\n");
      out.write("//        ctx = c.getContext(\"2d\");\n");
      out.write("//        \n");
      out.write("//        //ctx.fillStyle=\"#FF0000\";\n");
      out.write("//        ctx.beginPath();\n");
      out.write("//        ctx.rect(xrt+4*uplimit+20,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.fillStyle = \"blue\";\n");
      out.write("//        ctx.fill();\n");
      out.write("//        ctx.rect(xrt+4*uplimit+chipsq+40,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.rect(xrt+4*uplimit+2*chipsq+60,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.rect(xrt+4*uplimit+3*chipsq+80,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.rect(xrt+4*uplimit+4*chipsq+100,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.stroke();\n");
      out.write("        \n");
      out.write("//        photo.onload = function() {        \n");
      out.write("//        var img = document.getElementById(\"scream\");\n");
      out.write("//        ctx.drawImage(img,xrt+4*uplimit+20,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.drawImage(img,xrt+4*uplimit+chipsq+40,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.drawImage(img,xrt+4*uplimit+2*chipsq+60,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.drawImage(img,xrt+4*uplimit+3*chipsq+80,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        ctx.drawImage(img,xrt+4*uplimit+4*chipsq+100,yrt+uplimit,chipsq,chipsq);\n");
      out.write("//        }\n");
      out.write("        //------\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <video playsinline autoplay muted loop poster=\"video/digital-technology-interface-background_e_aodthix__PM.mp4\" id=\"bgvid\">\n");
      out.write("    <source src=\"video/digital-technology-interface-background_e_aodthix__PM.webm\" type=\"video/webm\">\n");
      out.write("    <source src=\"video/digital-technology-interface-background_e_aodthix__PM.mp4\" type=\"video/mp4\">\n");
      out.write("    </video>\n");
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
