package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page400_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/sesion.jsp");
    _jspx_dependants.add("/nojavascript.jsp");
  }

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
      out.write("<!--[if IE 7]> <html lang=\"en\" class=\"ie7\"> <![endif]-->  \n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->  \n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->  \n");
      out.write("<!--[if !IE]><!--> <html lang=\"en\"> <!--<![endif]-->  \n");
      out.write("    <head>\n");
      out.write("        <title>|ETB|</title>\n");
      out.write("        <!-- Meta -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!-- CSS Global Compulsory-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/headers/header1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap-responsive.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style_responsive.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">        \n");
      out.write("        <!-- CSS Implementing Plugins -->    \n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/font-awesome/css/font-awesome.css\">\n");
      out.write("        <!-- CSS Theme -->    \n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themes/default.css\" id=\"style_color\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themes/headers/default.css\" id=\"style_color-header-1\"> \n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/images/icono_etb.png\" />\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <!--=== Top ===-->\n");
      out.write("        <div class=\"top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"top-widget pull-right\">\n");
      out.write("                    <ul class=\"loginbar\">\n");
      out.write("                        <li><a href=\"page_login.html\" class=\"login-btn\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"social-icons\">\n");
      out.write("                        <li><a href=\"#\" data-original-title=\"Feed\" class=\"social_rss\"></a></li>\n");
      out.write("                        <li><a href=\"https://es-es.facebook.com/solucionesetbhogares\" data-original-title=\"Facebook\" class=\"social_facebook\"></a></li>\n");
      out.write("                        <li><a href=\"https://twitter.com/ETBRadio\" data-original-title=\"Twitter\" class=\"social_twitter\"></a></li>\n");
      out.write("                        <li><a href=\"#\" data-original-title=\"Goole Plus\" class=\"social_googleplus\"></a></li>\n");
      out.write("                        <li><a href=\"#\" data-original-title=\"Pinterest\" class=\"social_pintrest\"></a></li>\n");
      out.write("                        <li><a href=\"#\" data-original-title=\"Linkedin\" class=\"social_linkedin\"></a></li>\n");
      out.write("                        <li><a href=\"#\" data-original-title=\"Vimeo\" class=\"social_vimeo\"></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><!--/top-->\n");
      out.write("        <!--=== End Top ===-->\n");
      out.write("        <!--=== Header ===-->\n");
      out.write("        <div class=\"header\">               \n");
      out.write("            <div class=\"container\"> \n");
      out.write("                <!-- Logo -->       \n");
      out.write("                <div class=\"logo\">                                             \n");
      out.write("                    <a href=\"index.html\"><img id=\"logo-header\" src=\"assets/img/logo_etb.png\" alt=\"Logo\"></a>\n");
      out.write("                </div><!-- /logo -->        \n");
      out.write("                <!-- Menu -->       \n");
      out.write("                <div class=\"navbar\">                                \n");
      out.write("                    <div class=\"navbar-inner\">                                  \n");
      out.write("                        <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </a><!-- /nav-collapse -->                                  \n");
      out.write("                        ");
      out.write('\n');
      out.write('\n');
      out.write('\n');

    String idUsuario = "";
    int rol = 0, iduser = 0;
    String rolId = "";
    String nombreUsuario = "";
    HttpSession sesionOk = request.getSession();
    if (sesionOk.getAttribute("idUsuario") == null) {
        response.sendRedirect("login.jsp?msg= Es necesario identificarse");
    } else {
        idUsuario = "" + session.getAttribute("idUsuario");
        rolId = "" + session.getAttribute("rol");
        rol = Integer.parseInt(rolId);
        iduser = Integer.parseInt(idUsuario);
        nombreUsuario = "" + session.getAttribute("nombreUsuario");   
        sesionOk.setAttribute("iduser", iduser);
    }
    

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>|ETB|</title>\n");
      out.write("        <!-- Meta -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!-- CSS Global Compulsory-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/headers/header1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap-responsive.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style_responsive.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">        \n");
      out.write("        <!-- CSS Implementing Plugins -->    \n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/font-awesome/css/font-awesome.css\">\n");
      out.write("        <!-- CSS Theme -->    \n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themes/default.css\" id=\"style_color\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themes/headers/default.css\" id=\"style_color-header-1\">    \n");
      out.write("        <!-- favicon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/images/icono_etb.png\" />\n");
      out.write("    </head>    \n");
      out.write("    <body>\n");
      out.write("        <!--=== Header ===-->\n");
      out.write("        <div class=\"header\">               \n");
      out.write("            <div class=\"container\"> \n");
      out.write("                <!-- Menu -->       \n");
      out.write("                <div class=\"navbar\">                                \n");
      out.write("                    <div class=\"navbar-inner\">                                  \n");
      out.write("                        <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </a><!-- /nav-collapse -->                                  \n");
      out.write("                        <div class=\"nav-collapse collapse\">                                     \n");
      out.write("                            <ul class=\"nav top-2\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Acometidas Electricas                                                                   \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaacomedidaselectricas.jsp\">Consultar Acometidas Electricas</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"TablaAcometidaselectricas.jsp\">Crear, Modificar, Eliminar Acometidas Electricas</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaorganizacionredfttc.jsp\">Consultar Organizacion Red Fttc</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaorganizacionredfttc.jsp\">Crear, Modificar, Eliminar Organizacion Red Fttc</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>                               \n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Base Armarios                                                                    \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultarbasearmarios.jsp\">Consultar Base Armario</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablabasearmario.jsp\">Crear, Modificar, Eliminar Base Armario</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaconstruccionbase.jsp\">Consultar Construccion Base</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaconstruccionbase.jsp\">Crear, Modificar, Eliminar Construccion Base</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultademolicionbase.jsp\">Consultar Demolicion Base</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablademolicionbase.jsp\">Crear, Modificar,Eliminar Demolicion Base</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaregionalesbase.jsp\">Consultar Regionales Base</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaregionalesbase.jsp\">Crear, Modificar, Eliminar Regionales Base</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultabogota.jsp\">Consultar Bogota</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablabogota.jsp\">Crear, Modificar, Eliminar Bogota</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>                                \n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Canalizacion                                                                   \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultacanalizacion.jsp\">Consultar Mantenimiento Canalizacion Regionales</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"TablaCanalizacion.jsp\">Crear, Modificar, Eliminar Mantenimiento Canalizacion Regionales</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultarmantenimientocanalizacionbogota.jsp\">Consultar Mantenimiento Canalizacion Bogota</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamantenimientocanalizacionbogota.jsp\">Crear, Modificar, Eliminar Mantenimiento Canalizacion Bogota</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultamicromotores.jsp\">Consultar Micromotores</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamicromotores.jsp\">Crear, Modificar, Eliminar Micromotores</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaregistrosrcfibraoptica.jsp\">Consultar Registros Rc Fibra Optica</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaregistrosrcfibraoptica.jsp\">Crear, Modificar, Eliminar Registros Rc Fibra Optica</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>                                    \n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Renovacion Red                                                                   \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultamodernizacionllanos.jsp\">Consulta Renovacion Red Llanos Fase 1</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamodernizacionllanos.jsp\">Crear, Modificar, Eliminar Renovacion Red Llanos Fase 1</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultamodernizacionllanos2.jsp\">Consulta Renovacion Red Llanos Fase 2</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamodernizacionllanos2.jsp\">Crear, Modificar, Eliminar Renovacion Red Llanos Fase 2</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultarmodernizaciongirardot.jsp\">Consulta Renovacion Red Girardot</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamodernizaciongirardot.jsp\">Crear, Modificar, Eliminar Renovacion Red Girardot</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>\n");
      out.write("                                ");
if (rol == 1|| rol == 2) {
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Reportes                                                                  \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">                   \n");
      out.write("                                        <li><a href=\"reports/menureportes.jsp\">Consultar Reportes</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Organizacion Red                                                                   \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaorganizacionred.jsp\">Consultar Organizacion Red</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaorganizacionred.jsp\">Crear, Modificar, Eliminar Organizacion Red</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>                                \n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Proyectos Renovacion                                                                \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaproyectos.jsp\">Consultar Construccion con Demolicion</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaproyectos.jsp\">Crear, Modificar, Eliminar Construccion con Demolicion</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaarmarios.jsp\">Consultar Armarios</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaarmario.jsp\">Crear, Modificar, Eliminar Armarios</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaregionales.jsp\">Consultar Regionales</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaregionales.jsp\">Crear, Modificar, Eliminar Regionales</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultarenovacionarmariosfttc.jsp\">Consultar Renovacion Armarios Fttc</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablarenovacionarmariosfttc.jsp\">Crear, Modificar, Eliminar Renovacion Armarios Fttc</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaredesinternasregionales.jsp\">Consultar Redes Internas Regionales</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaredesinternasregionales.jsp\">Crear, Modificar, Eliminar Redes Internas Regionales</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultariesgoelectrico.jsp\">Consultar Riesgo Electrico</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablariesgoelectrico.jsp\">Crear, Modificar, Eliminar Riesgo Electrico</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaposteria.jsp\">Consultar Posteria</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaposteria.jsp\">Crear, Modificar, Eliminar Posteria</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>                                \n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">SPT                                                                   \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultastp.jsp\">Consultar SPT</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablastp.jsp\">Crear, Modificar, Eliminar SPT</a></li>  \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Contacto                                                                    \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"contacto.jsp\">Contacto</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>\n");
      out.write("                                ");
if (rol == 1) {
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Utilidades del Sistema                                                                    \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"Backup.jsp\">Crear Copia de Seguridad</a></li>\n");
      out.write("                                        <li><a href=\"TablaUsuarios.jsp\">Crear, Modificar, Eliminar Usuarios del Sistema</a></li>\n");
      out.write("                                        <li><a href=\"Consultarol.jsp\">Consultar Roles del Sistema</a></li>\n");
      out.write("                                        <li><a href=\"Tablaroles.jsp\">Crear, Modificar, Eliminar Roles del Sistema</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li> \n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index.jsp\">Salir                                                                    \n");
      out.write("                                    </a>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!-- /nav-collapse --> \n");
      out.write("                    </div><!-- /navbar-inner -->\n");
      out.write("                </div><!-- /navbar -->   \n");
      out.write("            </div><!-- /container -->               \n");
      out.write("        </div><!--/header -->      \n");
      out.write("        <!--=== End Header ===-->\n");
      out.write("        <!--=== Content Part ===-->\n");
      out.write("        <div class=\"body\">\n");
      out.write("            <!-- JS Global Compulsory -->           \n");
      out.write("            <script type=\"text/javascript\" src=\"../assets/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\" src=\"../assets/js/modernizr.custom.js\"></script>        \n");
      out.write("            <script type=\"text/javascript\" src=\"../assets/plugins/bootstrap/js/bootstrap.min.js\"></script> \n");
      out.write("            <!-- JS Implementing Plugins -->           \n");
      out.write("            <script type=\"text/javascript\" src=\"../assets/plugins/back-to-top.js\"></script>\n");
      out.write("            <!-- JS Page Level -->           \n");
      out.write("            <script type=\"text/javascript\" src=\"../assets/js/app.js\"></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                jQuery(document).ready(function() {\n");
      out.write("                    App.init();\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <!--[if lt IE 9]>  -->             \n");
      out.write("    </body>\n");
      out.write("    </html>");
      out.write("\n");
      out.write("                        <!-- /nav-collapse -->                                \n");
      out.write("                    </div><!-- /navbar-inner -->\n");
      out.write("                </div><!-- /navbar -->                          \n");
      out.write("            </div><!-- /container -->               \n");
      out.write("        </div><!--/header -->      \n");
      out.write("        <!--=== End Header ===-->\n");
      out.write("        <!--=== Breadcrumbs ===-->\n");
      out.write("        <div class=\"breadcrumbs margin-bottom-40\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"color-green pull-left\">Pagina No Encontrada</h1>\n");
      out.write("                <ul class=\"pull-right breadcrumb\">\n");
      out.write("                    <li><a href=\"index.html\">Inicio</a> <span class=\"divider\">/</span></li>\n");
      out.write("                    <li class=\"active\">400</li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--/container-->\n");
      out.write("        </div><!--/breadcrumbs-->\n");
      out.write("        <!--=== End Breadcrumbs ===-->\n");
      out.write("        <!--=== Content Part ===-->\n");
      out.write("        <div class=\"container\">\t\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>NoJavaScript </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <noscript>\n");
      out.write("        <div style=\"color: red\">\n");
      out.write("            <center><p style=\"color: red\">La página que estás viendo requiere para su funcionamiento el uso de JavaScript. \n");
      out.write("                    Si lo has deshabilitado intencionadamente, por favor vuelve a activarlo.</p></center>\n");
      out.write("        </div>\n");
      out.write("        </noscript>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("            <div class=\"row-fluid page-404\">\n");
      out.write("                <p><span>ERROR</span><i>400</i> <span>La Pagina No Se Encuentra Disponible</span></p>\n");
      out.write("            </div><!--/row-fluid-->        \n");
      out.write("        </div><!--/container-->\t\t\n");
      out.write("        <!--=== End Content Part ===-->\n");
      out.write("        <!--=== Footer ===-->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row-fluid\"><!--/span3--><!--/span3--><!--/span3--><!--/span3-->\n");
      out.write("                </div><!--/row-fluid-->\t\n");
      out.write("            </div><!--/container-->\t\n");
      out.write("        </div><!--/footer-->\t\n");
      out.write("        <!--=== End Footer ===-->\n");
      out.write("        <!--=== Copyright ===-->\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"span8\">\t\t\t\t\t\t\n");
      out.write("                        <p>2014 &copy; Cesar Mayorga. ALL Rights Reserved.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span4\"></div>\n");
      out.write("                </div><!--/row-fluid-->\n");
      out.write("            </div><!--/container-->\t\n");
      out.write("        </div><!--/copyright-->\t\n");
      out.write("        <!--=== End Copyright ===-->\n");
      out.write("        <!-- JS Global Compulsory -->           \n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/modernizr.custom.js\"></script>        \n");
      out.write("        <script type=\"text/javascript\" src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script> \n");
      out.write("        <!-- JS Implementing Plugins -->           \n");
      out.write("        <script type=\"text/javascript\" src=\"assets/plugins/back-to-top.js\"></script>\n");
      out.write("        <!-- JS Page Level -->           \n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/app.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function() {\n");
      out.write("                App.init();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"assets/js/respond.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </body>\n");
      out.write("</html> \n");
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
