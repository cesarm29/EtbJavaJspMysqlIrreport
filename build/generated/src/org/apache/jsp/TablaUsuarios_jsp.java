package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.UsuariosDAO;
import java.sql.ResultSet;

public final class TablaUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 7]> <html lang=\"en\" class=\"ie7\"> <![endif]-->  \n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->  \n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->  \n");
      out.write("<!--[if !IE]><!--> <html lang=\"es\"> <!--<![endif]-->  \n");
      out.write("    <head>\n");
      out.write("        <title>|ETB|</title>\n");
      out.write("        <!-- Meta -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\"> \n");
      out.write("        <!-- CSS Global Compulsory-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/headers/header1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/bootstrap/css/bootstrap-responsive.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style_responsive.css\">                \n");
      out.write("        <!-- CSS Implementing Plugins -->    \n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/plugins/font-awesome/css/font-awesome.css\">\n");
      out.write("        <!-- CSS Theme --> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themes/default.css\" id=\"style_color\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/themes/headers/default.css\" id=\"style_color-header-1\"> \n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/images/icono_etb.png\" />\n");
      out.write("        <script src=\"js/jquery-1.9.1.min.js\"></script>\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!--[if !IE]><!-->\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            /* \n");
      out.write("            Max width before this PARTICULAR table gets nasty\n");
      out.write("            This query will take effect for any screen smaller than 760px\n");
      out.write("            and also iPads specifically.\n");
      out.write("            */\n");
      out.write("            @media \n");
      out.write("            only screen and (max-width: 760px),\n");
      out.write("            (min-device-width: 768px) and (max-device-width: 1024px)  {\n");
      out.write("\n");
      out.write("                /* Force table to not be like tables anymore */\n");
      out.write("                table, thead, tbody, th, td, tr { \n");
      out.write("                    display: block; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                /* Hide table headers (but not display: none;, for accessibility) */\n");
      out.write("                thead tr { \n");
      out.write("                    position: absolute;\n");
      out.write("                    top: -9999px;\n");
      out.write("                    left: -9999px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                tr { border: 1px solid #ccc; }\n");
      out.write("\n");
      out.write("                td { \n");
      out.write("                    /* Behave  like a \"row\" */\n");
      out.write("                    border: none;\n");
      out.write("                    border-bottom: 1px solid #eee; \n");
      out.write("                    position: relative;\n");
      out.write("                    padding-left: 50%; \n");
      out.write("                }\n");
      out.write("\n");
      out.write("                td:before { \n");
      out.write("                    /* Now like a table header */\n");
      out.write("                    position: absolute;\n");
      out.write("                    /* Top/left values mimic padding */\n");
      out.write("                    top: 6px;\n");
      out.write("                    left: 6px;\n");
      out.write("                    width: 45%; \n");
      out.write("                    padding-right: 10px; \n");
      out.write("                    white-space: nowrap;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                /*\n");
      out.write("                Label the data\n");
      out.write("                */\n");
      out.write("                td:nth-of-type(1):before { content: \"ID usuarios\"; }\n");
      out.write("                td:nth-of-type(2):before { content: \"usuario\"; }\n");
      out.write("                td:nth-of-type(3):before { content: \"contraseña\"; }\n");
      out.write("                td:nth-of-type(4):before { content: \"nombres\"; }\n");
      out.write("                td:nth-of-type(5):before { content: \"apellidos\"; }\n");
      out.write("                td:nth-of-type(6):before { content: \"estado\"; }\n");
      out.write("                td:nth-of-type(7):before { content: \"Editar\"; }\n");
      out.write("                td:nth-of-type(8):before { content: \"Eliminar\"; }\n");
      out.write("                td:nth-of-type(9):before { content: \"Conf.\"; }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Smartphones (portrait and landscape) ----------- */\n");
      out.write("            @media only screen\n");
      out.write("            and (min-device-width : 320px)\n");
      out.write("            and (max-device-width : 480px) {\n");
      out.write("                body { \n");
      out.write("                    padding: 0; \n");
      out.write("                    margin: 0; \n");
      out.write("                    width: 320px; }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* iPads (portrait and landscape) ----------- */\n");
      out.write("            @media only screen and (min-device-width: 768px) and (max-device-width: 1024px) {\n");
      out.write("                body { \n");
      out.write("                    width: 495px; \n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            /* estilo del top-bar */\n");
      out.write("            .back-to-top {\n");
      out.write("                position: fixed;\n");
      out.write("                bottom: 2em;\n");
      out.write("                right: 0px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #000000;\n");
      out.write("                background-color: rgba(235, 235, 235, 0.80);\n");
      out.write("                font-size: 12px;\n");
      out.write("                padding: 1em;\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .back-to-top:hover {\t\n");
      out.write("                background-color: rgba(135, 135, 135, 0.50);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <!--<![endif]-->       \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#btnNuevo\").click(function() {\n");
      out.write("                    location.href = 'Regusuario.jsp?ID=0&Accion=';\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script> \n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <!--=== Top ===-->\n");
      out.write("        <div class=\"top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"top-widget pull-right\">\n");
      out.write("                    <ul class=\"loginbar\">\n");
      out.write("                        <li><a href=\"login.jsp\" class=\"login-btn\">Login</a></li>\n");
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
      out.write("                    <a href=\"index.jsp\"><img id=\"logo-header\" src=\"assets/img/logo_etb.png\" alt=\"Logo\"></a>\n");
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
      out.write("                                        <li><a href=\"Consultaacomedidaselectricas.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Acometidas Electricas</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"TablaAcometidaselectricas.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Acometidas Electricas</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaorganizacionredfttc.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Organizacion Red Fttc</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaorganizacionredfttc.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Organizacion Red Fttc</a></li>\n");
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
      out.write("                                        <li><a href=\"Consultarbasearmarios.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Base Armario</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablabasearmario.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Base Armario</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaconstruccionbase.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Construccion Base</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaconstruccionbase.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Construccion Base</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultademolicionbase.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Demolicion Base</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablademolicionbase.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar,Eliminar Demolicion Base</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaregionalesbase.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Regionales Base</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaregionalesbase.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Regionales Base</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultabogota.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Bogota</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablabogota.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Bogota</a></li>\n");
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
      out.write("                                        <li><a href=\"Consultacanalizacion.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Mantenimiento Canalizacion Regionales</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"TablaCanalizacion.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Mantenimiento Canalizacion Regionales</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultarmantenimientocanalizacionbogota.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Mantenimiento Canalizacion Bogota</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamantenimientocanalizacionbogota.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Mantenimiento Canalizacion Bogota</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultamicromotores.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Micromotores</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamicromotores.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Micromotores</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaregistrosrcfibraoptica.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Registros Rc Fibra Optica</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaregistrosrcfibraoptica.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Registros Rc Fibra Optica</a></li>\n");
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
      out.write("                                        <li><a href=\"Consultamodernizacionllanos.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consulta Renovacion Red Llanos Fase 1</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamodernizacionllanos.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Renovacion Red Llanos Fase 1</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultamodernizacionllanos2.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consulta Renovacion Red Llanos Fase 2</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamodernizacionllanos2.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Renovacion Red Llanos Fase 2</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultarmodernizaciongirardot.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consulta Renovacion Red Girardot</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablamodernizaciongirardot.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Renovacion Red Girardot</a></li>\n");
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
      out.write("                                        <li><a href=\"reports/menureportes.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Reportes</a></li>\n");
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
      out.write("                                        <li><a href=\"Consultaorganizacionred.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Organizacion Red</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaorganizacionred.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Organizacion Red      </a></li>\n");
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
      out.write("                                        <li><a href=\"Consultaproyectos.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Construccion con Demolicion</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaproyectos.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Construccion con Demolicion</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaarmarios.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Armarios</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaarmario.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Armarios</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaregionales.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Regionales</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaregionales.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Regionales</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultarenovacionarmariosfttc.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Renovacion Armarios Fttc</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablarenovacionarmariosfttc.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Renovacion Armarios Fttc</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaredesinternasregionales.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Redes Internas Regionales</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaredesinternasregionales.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Redes Internas Regionales</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultariesgoelectrico.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Riesgo Electrico</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablariesgoelectrico.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Riesgo Electrico</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        ");
if (rol == 1 || rol == 2 || rol == 3) {
      out.write("\n");
      out.write("                                        <li><a href=\"Consultaposteria.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Posteria</a></li> \n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablaposteria.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Posteria</a></li>\n");
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
      out.write("                                        <li><a href=\"Consultastp.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar SPT</a></li>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        ");
if (rol == 1 || rol == 2) {
      out.write("\n");
      out.write("                                        <li><a href=\"Tablastp.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar SPT</a></li>  \n");
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
      out.write("                                        <li><a href=\"contacto.jsp\"><IMG SRC=\"img/1.png\" width=\"20px\"> Contacto</a></li>\n");
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
      out.write("                                        <li><a href=\"Backup.jsp\"><IMG SRC=\"img/23.png\" width=\"20px\"> Crear Copia de Seguridad</a></li>\n");
      out.write("                                        <li><a href=\"TablaUsuarios.jsp\"><IMG SRC=\"img/7.png\" width=\"20px\"> Crear, Modificar, Eliminar Usuarios          </a></li>\n");
      out.write("                                        <li><a href=\"Consultarol.jsp\"><IMG SRC=\"img/49.png\" width=\"20px\"> Consultar Roles del Sistema</a></li>\n");
      out.write("                                        <li><a href=\"Tablaroles.jsp\"><IMG SRC=\"img/3.png\" width=\"20px\"> Crear, Modificar, Eliminar Roles</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <b class=\"caret-out\"></b>                        \n");
      out.write("                                </li> \n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                ");
if (rol == 1) {
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Migracion                                                                    \n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"pageacometidaselectricas.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Acometidas Electricas</a></li>\n");
      out.write("                                        <li><a href=\"pagearmarios.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Armarios</a></li>\n");
      out.write("                                        <li><a href=\"pagebasedearmario.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Base de Armario</a></li>\n");
      out.write("                                        <li><a href=\"pagebogota.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Bogota</a></li>\n");
      out.write("                                        <li><a href=\"pagecanalizacion.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Mantenimiento Canalizacion Regionales</a></li>\n");
      out.write("                                        <li><a href=\"pageconstruccionbase.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Construccion Base</a></li>\n");
      out.write("                                        <li><a href=\"pagedemolicionbase.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Demolicion Base</a></li>\n");
      out.write("                                        <li><a href=\"pagemantenimientocanalizacionbogota.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Mantenimiento Canalizacion Bogota</a></li>\n");
      out.write("                                        <li><a href=\"pagemicromotores.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Micromotores</a></li>\n");
      out.write("                                        <li><a href=\"pagemodernizaciongirardot.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Renovacion Red Girardot</a></li>\n");
      out.write("                                        <li><a href=\"pagemodernizacionllanos.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Renovacion Red Llanos Fase I</a></li>\n");
      out.write("                                        <li><a href=\"pagemodernizacionllanos2.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Renovacion Red Llanos Fase II</a></li>\n");
      out.write("                                        <li><a href=\"pageorganizacionred.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Organizacion Red</a></li>\n");
      out.write("                                        <li><a href=\"pageorganizacionredfttc.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Organizacion Red Fttc</a></li>\n");
      out.write("                                        <li><a href=\"pageposteria.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Posteria</a></li>\n");
      out.write("                                        <li><a href=\"pageproyectos.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Construccion con Demolicion</a></li>\n");
      out.write("                                        <li><a href=\"pageredesinternasregionales.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Redes Internas Regionales</a></li>\n");
      out.write("                                        <li><a href=\"pageregionales.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Regionales</a></li>\n");
      out.write("                                        <li><a href=\"pageregionalesbase.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Regionales Base</a></li>\n");
      out.write("                                        <li><a href=\"pageregistrosrcfibraoptica.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Registros Rc Fibra Optica</a></li>\n");
      out.write("                                        <li><a href=\"pagerenovacionarmariosfttc.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Renovacion Armarios Fttc</a></li>\n");
      out.write("                                        <li><a href=\"pageriesgoelectrico.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla Riesgo Electrico</a></li>\n");
      out.write("                                        <li><a href=\"pagestp.jsp\"><IMG SRC=\"img/51.png\" width=\"20px\"> Migracion Archivo CSV a Tabla SPT</a></li>\n");
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
      out.write("        <div class=\"row-fluid breadcrumbs margin-bottom-20\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"pull-left\">Tabla Usuarios</h1>\n");
      out.write("                <ul class=\"pull-right breadcrumb\">\n");
      out.write("                    <li><a href=\"index.jsp\">Inicio</a> <span class=\"divider\">/</span></li>\n");
      out.write("                    <li class=\"active\">Tabla Usuarios</li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--/container-->\n");
      out.write("        </div><!--/breadcrumbs-->\n");
      out.write("        <!--=== End Breadcrumbs ===-->\n");
      out.write("        <!--=== Content Part ===-->\n");
      out.write("        <div class=\"container\">\t\t\n");
      out.write("            <div class=\"row-fluid\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>NoJavaScript</title>\n");
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
      out.write("                <!-- Default Tables styles -->\n");
      out.write("                <div class=\"row-fluid margin-bottom-20\">\n");
      out.write("                    <div class=\"span6\">\n");
      out.write("                        <input type=\"button\" class=\"btn-u pull-rgt\" id=\"btnNuevo\" name=\"btnNuevo\" value=\"Crear Nuevo Usuario\" />\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <div id=\"busqueda\">\n");
      out.write("                            <form action=\"\">\n");
      out.write("                                <right><input type=\"text\" id=\"q\" name=\"q\" value=\"\" placeholder=\"Busqueda por Nombres\"/></right>\n");
      out.write("                                </br>\n");
      out.write("                                <input type=\"submit\" class=\"btn-u pull-rgt\" value=\"Buscar\" />\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <table style=\"width:900px\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>ID usuarios</th>\n");
      out.write("                                    <th>Usuario</th>\n");
      out.write("                                    <th>Contraseña</th>\n");
      out.write("                                    <th>Nombres</th>\n");
      out.write("                                    <th>Apellidos</th>\n");
      out.write("                                    <th>Estado</th>\n");
      out.write("                                    <th><center><IMG SRC=\"img/44.png\" style=\"width:30px\"></center></th>\n");
      out.write("                                    <th><center><IMG SRC=\"img/75.png\" style=\"width:30px\"></center></th>\n");
      out.write("                                    <th><center><IMG SRC=\"img/51.png\" style=\"width:30px\"></center></th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    ");

                                        UsuariosDAO obj2 = new UsuariosDAO();
                                        try {
                                            String filtro = request.getParameter("q");
                                            if (filtro == null) {
                                                filtro = "";
                                            }
                                            ResultSet resul = obj2.getTabla(filtro);
                                            while (resul.next()) {
                                                String html = "<tr>";
                                                html += "<td>" + resul.getString("idUSUARIOS") + "</td>";
                                                html += "<td>" + resul.getString("username") + "</td>";
                                                html += "<td>" + resul.getString("password") + "</td>";
                                                html += "<td>" + resul.getString("Nombres") + "</td>";
                                                html += "<td>" + resul.getString("Apellidos") + "</td>";
                                                html += "<td>" + resul.getString("Estado") + "</td>";
                                                html += "<td><a href='Regusuario.jsp?ID=" + resul.getString("idUSUARIOS") + "&Accion=Editar'><center>Editar</center></a></td>";
                                                html += "<td><a href='Regusuario.jsp?ID=" + resul.getString("idUSUARIOS") + "&Accion=Eliminar'><center>Eliminar</center></a></td>";
                                                html += "<td><a href='UsuarioRol.jsp?IDUsuario=" + resul.getString("idUSUARIOS") + "&Usu=" + resul.getString("username") + "'><center>Conf.</center></td>";
                                                html += "</tr>";
                                                out.print(html);
                                            }
                                        } catch (Exception ex) {
                                            out.print("\" <h1>" + ex.getMessage() + "</h1>");
                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    ");

                                        if (request.getParameter("msg") != null) {
                                    
      out.write("\n");
      out.write("                            <div class=\"alert alert-info\" role=\"alert\">\n");
      out.write("                                ");

                                    out.print(request.getParameter("msg"));
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <a href=\"#\" class=\"back-to-top\">Ir al Menu</a>    \n");
      out.write("                    </div>\n");
      out.write("                </div><!--/row-fluid-->\n");
      out.write("                <div class=\"row-fluid\"></div><!--/row-fluid-->\n");
      out.write("                <div class=\"row-fluid\"></div><!--/row-fluid-->\n");
      out.write("            </div><!--/row-fluid-->\n");
      out.write("            <!--//Default Tables styles -->        \n");
      out.write("        </div><!--/container-->\t\t\n");
      out.write("        <!--=== End Content Part ===-->\n");
      out.write("        <!--=== Footer ===-->\n");
      out.write("        <div class=\"footer\"><!--/container-->\t\n");
      out.write("        </div><!--/footer-->\t\n");
      out.write("        <!--=== End Footer ===-->\n");
      out.write("        <!--=== Copyright ===-->\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"span8\">\t\t\t\t\t\t\n");
      out.write("                        <p>2014 &copy; Cesar Mayorga. ALL Rights Reserved.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/row-fluid-->\n");
      out.write("            </div><!--/container-->\t\n");
      out.write("        </div><!--/copyright-->\t\n");
      out.write("        <!--=== End Copyright ===-->\n");
      out.write("        <!-- JS Global Compulsory -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.8.2.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/modernizr.custom.js\"></script>        \n");
      out.write("        <script type=\"text/javascript\" src=\"assets/plugins/bootstrap/js/bootstrap.min.js\"></script> \n");
      out.write("        <!-- JS Implementing Plugins -->           \n");
      out.write("        \n");
      out.write("        <!-- JS Page Level -->           \n");
      out.write("        <script type=\"text/javascript\" src=\"js/app.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function() {\n");
      out.write("                App.init();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            jQuery(document).ready(function() {\n");
      out.write("                var offset = 220;\n");
      out.write("                var duration = 500;\n");
      out.write("                jQuery(window).scroll(function() {\n");
      out.write("                    if (jQuery(this).scrollTop() > offset) {\n");
      out.write("                        jQuery('.back-to-top').fadeIn(duration);\n");
      out.write("                    } else {\n");
      out.write("                        jQuery('.back-to-top').fadeOut(duration);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                jQuery('.back-to-top').click(function(event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    jQuery('html, body').animate({scrollTop: 0}, duration);\n");
      out.write("                    return false;\n");
      out.write("                })\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("            <script src=\"assets/js/respond.js\"></script>\n");
      out.write("        <![endif]-->\n");
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
