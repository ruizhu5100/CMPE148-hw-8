/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-12-12 05:09:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class submit_002drecipe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--Jiaxiang Guo-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String username=request.getParameter("username");
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipe", "root", "root");
Statement st=conn.createStatement();

String[] category;
category = new String[16];
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM category");
while (rs.next()) {
    category[rs.getInt(1)] = rs.getString(2);
}
rs.close();
stmt.close();
conn.close();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html lang=\"en\"> <!--<![endif]-->\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Basic Page Needs\r\n");
      out.write("================================================== -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Daily Recipes</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Mobile Specific Metas\r\n");
      out.write("================================================== -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\r\n");
      out.write("<!-- CSS\r\n");
      out.write("================================================== -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/colors/green.css\" id=\"colors\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"overflow-reset\">\r\n");
      out.write("<form method=\"post\" action=\"submit.jsp\">\r\n");
      out.write("<!-- Wrapper -->\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Header\r\n");
      out.write("================================================== -->\r\n");
      out.write("<header id=\"header\">\r\n");
      out.write("\r\n");
      out.write("<!-- Container -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Logo / Mobile Menu\r\n");
      out.write("\t<div class=\"three columns\">\r\n");
      out.write("\t\t//<div id=\"logo\">\r\n");
      out.write("\t\t\t<h1><a href=\"index.html\"><img src=\"images/logo.png\" alt=\"Chow\" /></a></h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Navigation\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"thirteen columns navigation\">\r\n");
      out.write("\t\r\n");
      out.write("\t<nav id=\"navigation\" class=\"menu nav-collapse\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"index.jsp?username=");
      out.print(username );
      out.write("\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"#\">Recipes</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"browse-recipes.jsp?username=");
      out.print(username );
      out.write("\">Browse Recipes</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"submit-recipe.jsp?username=");
      out.print(username );
      out.write("\" id=\"current\">Submit Recipe</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"#\">");
      out.print( username );
      out.write("</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"profile.jsp?username=");
      out.print(username );
      out.write("\">View Profile</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"login.html\">Sign out</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- Container / End -->\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Titlebar\r\n");
      out.write("================================================== -->\r\n");
      out.write("<section id=\"titlebar\">\r\n");
      out.write("\t<!-- Container -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"eight columns\">\r\n");
      out.write("\t\t\t<h2>Submit Recipe</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"eight columns\">\r\n");
      out.write("\t\t\t<nav id=\"breadcrumbs\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>You are here:</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li>Submit Recipe</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Container / End -->\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Content\r\n");
      out.write("================================================== -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"sixteen columns\">\r\n");
      out.write("\t\t<div class=\"submit-recipe-form\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Recipe Title -->\r\n");
      out.write("\t\t\t<h4>Recipe Title</h4>\r\n");
      out.write("\t\t\t<nav class=\"title\">\r\n");
      out.write("\t\t\t\t<input class=\"search-field\" type=\"text\" placeholder=\"\" name=\"title\" required/>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"margin-top-25\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"select\">\r\n");
      out.write("\t\t\t\t<h4>Creator</h4>\t\r\n");
      out.write("\t\t\t\t<select class=\"chosen-select-no-single\" name=username>\r\n");
      out.write("\t\t\t\t\t<option>");
      out.print(username );
      out.write("</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Choose Category -->\r\n");
      out.write("\t\t\t<div class=\"select\">\r\n");
      out.write("\t\t\t\t<h4>Choose Category</h4>\t\r\n");
      out.write("\t\t\t\t<select data-placeholder=\"Choose Category\" class=\"chosen-select-no-single\" name=category required>\r\n");
      out.write("\t\t\t\t    <option value=\"0\"></option>\r\n");
      out.write("\t\t\t\t\t");
for(int i = 1; i < category.length; i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=");
      out.print( i );
      out.write('>');
      out.print( category[i] );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<select data-placeholder=\"Choose Category\" class=\"chosen-select-no-single\" name=category1>\r\n");
      out.write("\t\t\t\t    <option value=\"0\">Null</option>\r\n");
      out.write("\t\t\t\t\t");
for(int i = 1; i < category.length; i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=");
      out.print( i );
      out.write('>');
      out.print( category[i] );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<select data-placeholder=\"Choose Category\" class=\"chosen-select-no-single\" name=category2>\r\n");
      out.write("\t\t\t\t    <option value=\"0\">Null</option>\r\n");
      out.write("\t\t\t\t\t");
for(int i = 1; i < category.length; i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<option value=");
      out.print( i );
      out.write('>');
      out.print( category[i] );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"margin-top-25\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Short Summary -->\r\n");
      out.write("\t\t\t<h4>Description</h4>\r\n");
      out.write("\t\t\t<textarea class=\"WYSIWYG\" name=\"summary\" cols=\"40\" rows=\"3\" id=\"summary\" spellcheck=\"true\" required></textarea>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"margin-top-25\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Ingredients -->\r\n");
      out.write("<fieldset class=\"addrecipe-cont\" name=\"ingredients\">\r\n");
      out.write("\t\t\t\t<h4>Ingredients:</h4>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table id=\"ingredients-sort\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr class=\"ingredients-cont ing\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"icon\"><i class=\"fa fa-arrows\"></i></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_name\" tabindex=\"5\" type=\"text\" placeholder=\"Name of ingredient\" required/> </td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_note\" tabindex=\"6\" type=\"text\" placeholder=\"Notes (quantity, additional info)\" required/></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"action\"><a title=\"Delete\" class=\"delete\" href=\"#\"><i class=\"fa fa-remove\"></i></a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"ingredients-cont ing\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"icon\"><i class=\"fa fa-arrows\"></i></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_name1\" tabindex=\"5\" type=\"text\" placeholder=\"Name of ingredient\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_note1\" tabindex=\"6\" type=\"text\" placeholder=\"Notes (quantity, additional info)\"/></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"action\"><a title=\"Delete\" class=\"delete\" href=\"#\"><i class=\"fa fa-remove\"></i></a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"ingredients-cont ing\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"icon\"><i class=\"fa fa-arrows\"></i></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_name2\" tabindex=\"5\" type=\"text\" placeholder=\"Name of ingredient\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_note2\" tabindex=\"6\" type=\"text\" placeholder=\"Notes (quantity, additional info)\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"action\"><a title=\"Delete\" class=\"delete\" href=\"#\"><i class=\"fa fa-remove\"></i></a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"ingredients-cont ing\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"icon\"><i class=\"fa fa-arrows\"></i></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_name3\" tabindex=\"5\" type=\"text\" placeholder=\"Name of ingredient\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_note3\" tabindex=\"6\" type=\"text\" placeholder=\"Notes (quantity, additional info)\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"action\"><a title=\"Delete\" class=\"delete\" href=\"#\"><i class=\"fa fa-remove\"></i></a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"ingredients-cont ing\">\r\n");
      out.write("\t\t\t\t\t\t<td class=\"icon\"><i class=\"fa fa-arrows\"></i></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_name4\" tabindex=\"5\" type=\"text\" placeholder=\"Name of ingredient\" /> </td>\r\n");
      out.write("\t\t\t\t\t\t<td><input name=\"ingredient_note4\" tabindex=\"6\" type=\"text\" placeholder=\"Notes (quantity, additional info)\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td class=\"action\"><a title=\"Delete\" class=\"delete\" href=\"#\"><i class=\"fa fa-remove\"></i></a> </td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"margin-top-25\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<button  type=\"submit\" class=\"submit\">Submit</button>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Java Script\r\n");
      out.write("================================================== -->\r\n");
      out.write("<script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.superfish.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.royalslider.min.js\"></script>\r\n");
      out.write("<script src=\"js/responsive-nav.js\"></script>\r\n");
      out.write("<script src=\"js/hoverIntent.js\"></script>\r\n");
      out.write("<script src=\"js/isotope.pkgd.min.js\"></script>\r\n");
      out.write("<script src=\"js/chosen.jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.tooltips.min.js\"></script>\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- WYSIWYG Editor -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery.sceditor.bbcode.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"scripts/jquery.sceditor.js\"></script>\r\n");
      out.write("<script src=\"js/switcher.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
