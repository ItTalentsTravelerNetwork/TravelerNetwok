/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-09-24 13:14:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import functionality.UsersManager;
import functionality.DestinationsManager;
import models.*;
import java.util.ArrayList;

public final class Destination_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("models");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("functionality.UsersManager");
    _jspx_imports_classes.add("functionality.DestinationsManager");
    _jspx_imports_classes.add("java.util.ArrayList");
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"Error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\"    content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<meta name=\"author\"      content=\"David & Yasen\">\r\n");
      out.write("\t<title>The Traveler Bulgaria</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"assets/images/gt_favicon.png\">\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" media=\"screen\" href=\"http://fonts.googleapis.com/css?family=Open+Sans:300,400,700\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom styles for our template -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/bootstrap-theme.css\" media=\"screen\" >\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/main.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"assets/js/html5shiv.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");

   		response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   		response.addHeader("Pragma", "no-cache"); 
   		response.addDateHeader ("Expires", 0);
  	
      out.write("\r\n");
      out.write("\t<!-- Fixed navbar -->\r\n");
      out.write("\t");
if (request.getParameter("name") == null){ 
      out.write("\r\n");
      out.write("\t\t");
response.sendRedirect("AllDestinations.jsp"); 
      out.write('\r');
      out.write('\n');
      out.write('	');
} 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"navbar navbar-inverse navbar-fixed-top headroom\" >\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<!-- Button for smallest screens -->\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\"><span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> </button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><img src=\"assets/images/logo4.png\" alt=\"The Traveler Bulgaria\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav pull-right\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"AllDestinations.jsp\">Destinations</a></li>\r\n");
      out.write("\t\t\t\t\t");
if(request.getSession().getAttribute("user") == null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"btn\" href=\"SignIn.jsp\">SIGN IN / SIGN UP</a></li>\r\n");
      out.write("\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"btn\" href=\"LogoutServlet\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"btn\" href=\"profile.jsp\">PROFILE</a></li>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div><!--/.nav-collapse -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("\t<!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"head\" class=\"secondary\"></header>\r\n");
      out.write("\r\n");
      out.write("\t<!-- container -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t<li class=\"active\">Profile Page</li>\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- Sidebar -->\r\n");
      out.write("\t\t\t");
 Destination dest = null; 
      out.write("\r\n");
      out.write("\t\t\t");
if (request.getParameter("name") != null){ 
      out.write("\r\n");
      out.write("\t\t\t<aside class=\"col-md-4 sidebar sidebar-left\">\r\n");
      out.write("\t\t\t\t\t\t");
 dest = DestinationsManager.getInstance().getDestinationFromCache(request.getParameter("name")); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
if(dest == null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
request.getRequestDispatcher("AllDestinations.jsp").forward(request, response); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row widget\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12\">\t\r\n");
      out.write("\t\t\t\t\t\t\t<h4>");
out.println(request.getParameter("name")); 
      out.write("</h4>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row widget\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<p><img src=\"DestinationPictureServlet?destination=");
      out.print(request.getParameter("name") );
      out.write("\" height=\"150\" width=\"150\" alt=\"\"></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"row widget\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xs-12\">\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btn\" href=\"Comment.jsp?name=");
      out.print(dest.getName());
      out.write("\">Add Comment</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t</aside>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- /Sidebar -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Article main content -->\r\n");
      out.write("\t\t\t<article class=\"col-md-8 maincontent\">\r\n");
      out.write("\t\t\t\t<header class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"page-title\">Description</h1>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t<h4>");
out.print(dest.getDescription()); 
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t\t\t");
if(dest.getComments().size()>0){ 
      out.write("\r\n");
      out.write("\t\t\t\t<article class=\"col-md-8 maincontent\">\r\n");
      out.write("\t\t\t\t\t<header class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t\t<h1 class=\"page-title\">Comments</h1>\r\n");
      out.write("\t\t\t\t\t</header>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
for(Comment comment : dest.getComments()){ 
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
 User user = UsersManager.getInstance().getUserFromCache(comment.getAuthorEmail()); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h6>");
      out.print( (user.getFirstName()+ " " + user.getLastName()) );
      out.write("</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"PictureServlet?user=");
      out.print( user.getEmail());
      out.write("\" height=\"60\" width=\"60\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.print(comment.getText() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</article>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<article class=\"col-md-8 maincontent\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</article>\r\n");
      out.write("\t\t\t<!-- /Article -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"map\" style=\"width:100% height:100%\"></div>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</div>\t<!-- /container -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"footer\" class=\"top-space\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer1\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-3 widget\">\r\n");
      out.write("                        <h3 class=\"widget-title\">Contact</h3>\r\n");
      out.write("                        <div class=\"widget-body\">\r\n");
      out.write("                            <p><br>\r\n");
      out.write("                                <a href=\"mailto:#\">thetravellerbulgaria@gmail.com</a><br>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                Infinity Tower, Sofia City, Bulgaria\r\n");
      out.write("                            </p>    \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-3 widget\">\r\n");
      out.write("                        <h3 class=\"widget-title\">Follow us</h3>\r\n");
      out.write("                        <div class=\"widget-body\">\r\n");
      out.write("                            <p class=\"follow-me-icons\">\r\n");
      out.write("                                <a href=\"\"><i class=\"fa fa-twitter fa-2\"></i></a>\r\n");
      out.write("                                <a href=\"\"><i class=\"fa fa-dribbble fa-2\"></i></a>\r\n");
      out.write("                                <a href=\"\"><i class=\"fa fa-github fa-2\"></i></a>\r\n");
      out.write("                                <a href=\"https://www.facebook.com/TheTravellerBulgaria/\"><i class=\"fa fa-facebook fa-2\"></i></a>\r\n");
      out.write("                            </p>    \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6 widget\">\r\n");
      out.write("                        <h3 class=\"widget-title\">Our motto</h3>\r\n");
      out.write("                        <div class=\"widget-body\">\r\n");
      out.write("                            <p>\"The whole object of travel is not to set foot on foreign land; it is to set foot on one's own country as on a foreign land.\" - G.K. Chesterton</p>\r\n");
      out.write("                            <p>So keep moving! But don't forget to take time to stop and smell the roses!</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- /row of widgets -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer2\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-6 widget\">\r\n");
      out.write("                        <div class=\"widget-body\">\r\n");
      out.write("                            <p class=\"simplenav\">\r\n");
      out.write("                                <a href=\"#\">Home</a> | \r\n");
      out.write("                                <a href=\"SectionUnderConstructionPage.html\">About</a> |\r\n");
      out.write("                                <a href=\"SectionUnderConstructionPage.html\">Sidebar</a> |\r\n");
      out.write("                                <a href=\"SectionUnderConstructionPage.html\">Contact</a> |\r\n");
      out.write("                                <b><a href=\"signup.html\">Sign up</a></b>\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6 widget\">\r\n");
      out.write("                        <div class=\"widget-body\">\r\n");
      out.write("                            <p class=\"text-right\">\r\n");
      out.write("                                Copyright &copy; 2016, The Traveler Bulgaria. Designed by David & Yasen</a> \r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div> <!-- /row of widgets -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- JavaScript libs are placed at the end of the document so the pages load faster -->\r\n");
      out.write("\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/headroom.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/jQuery.headroom.min.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/template.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction myMap() {\r\n");
      out.write("\t\t\t");
if (request.getParameter("name") != null){ 
      out.write("\r\n");
      out.write("\t\t\tvar myCenter = new google.maps.LatLng(");
      out.print( dest.getLocation().getLattitude());
      out.write(',');
      out.print( dest.getLocation().getLongitude());
      out.write(");\r\n");
      out.write("\t\t\t  var mapCanvas = document.getElementById(\"map\");\r\n");
      out.write("\t\t\t  var mapOptions = {\r\n");
      out.write("\t\t\t\t  \tcenter: myCenter, zoom: 7,\r\n");
      out.write("\t\t\t\t    panControl: true,\r\n");
      out.write("\t\t\t\t    zoomControl: true,\r\n");
      out.write("\t\t\t\t    mapTypeControl: true,\r\n");
      out.write("\t\t\t\t    scaleControl: true,\r\n");
      out.write("\t\t\t\t    streetViewControl: true,\r\n");
      out.write("\t\t\t\t    overviewMapControl: true,\r\n");
      out.write("\t\t\t\t    rotateControl: true\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  var map = new google.maps.Map(mapCanvas, mapOptions);\r\n");
      out.write("\t\t\t  var marker = new google.maps.Marker({position:myCenter});\r\n");
      out.write("\t\t\t  marker.setMap(map);\r\n");
      out.write("\t\t\t ");
}
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBQKyIgPewrgRCgagA1sDItFSRZh5hZlL4&callback=myMap\"></script>\r\n");
      out.write("\t\r\n");
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
