<%-- 
    Document   : Tablaroles
    Created on : 25/06/2014, 03:11:03 PM
    Author     : cesar1
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.RolesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="es"> <!--<![endif]-->  
    <head>
        <title>|ETB|</title>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">        
        <!-- CSS Global Compulsory-->
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/headers/header1.css">
        <link rel="stylesheet" href="assets/plugins/bootstrap/css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="assets/css/style_responsive.css">
        <link rel="shortcut icon" href="favicon.ico">        
        <!-- CSS Implementing Plugins -->    
        <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css">
        <!-- CSS Theme --> 
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color">
        <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1"> 
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />
        <script src="js/jquery-1.9.1.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <!--[if !IE]><!-->
        <!--estilo tabla responsive-->
        <style>
            /* 
            Max width before this PARTICULAR table gets nasty
            This query will take effect for any screen smaller than 760px
            and also iPads specifically.
            */
            @media 
            only screen and (max-width: 760px),
            (min-device-width: 768px) and (max-device-width: 1024px)  {

                /* Force table to not be like tables anymore */
                table, thead, tbody, th, td, tr { 
                    display: block; 
                }
                /* Hide table headers (but not display: none;, for accessibility) */
                thead tr { 
                    position: absolute;
                    top: -9999px;
                    left: -9999px;
                }
                tr { border: 1px solid #ccc; }

                td { 
                    /* Behave  like a "row" */
                    border: none;
                    border-bottom: 1px solid #eee; 
                    position: relative;
                    padding-left: 50%; 
                }

                td:before { 
                    /* Now like a table header */
                    position: absolute;
                    /* Top/left values mimic padding */
                    top: 6px;
                    left: 6px;
                    width: 45%; 
                    padding-right: 10px; 
                    white-space: nowrap;
                }

                /*
                Label the data
                */
                td:nth-of-type(1):before { content: "Id"; }
                td:nth-of-type(2):before { content: "Nombre"; }
                td:nth-of-type(3):before { content: "Descripcion"; }
                td:nth-of-type(15):before { content: "Editar"; }
                td:nth-of-type(16):before { content: "Eliminar"; }
            }

            /* Smartphones (portrait and landscape) ----------- */
            @media only screen
            and (min-device-width : 320px)
            and (max-device-width : 480px) {
                body { 
                    padding: 0; 
                    margin: 0; 
                    width: 320px; }
            }

            /* iPads (portrait and landscape) ----------- */
            @media only screen and (min-device-width: 768px) and (max-device-width: 1024px) {
                body { 
                    width: 495px; 
                }
            }  
            /* estilo del top-bar */
            .back-to-top {
                position: fixed;
                bottom: 2em;
                right: 0px;
                text-decoration: none;
                color: #000000;
                background-color: rgba(235, 235, 235, 0.80);
                font-size: 12px;
                padding: 1em;
                display: none;
            }
            .back-to-top:hover {	
                background-color: rgba(135, 135, 135, 0.50);
            }
        </style>
        <!--<![endif]-->       
        <script type="text/javascript">
            $(document).ready(function() {
                $("#btnNuevo").click(function() {
                    location.href = 'formularioroles.jsp?ID=0&Accion=';
                });
            });
        </script> 
    </head> 
    <body>
        <!--=== Top ===-->
        <div class="top">
            <div class="container">
                <div class="top-widget pull-right">
                    <ul class="loginbar">
                        <li><a href="login.jsp" class="login-btn">Login</a></li>
                    </ul>
                    <ul class="social-icons">
                        <li><a href="#" data-original-title="Feed" class="social_rss"></a></li>
                        <li><a href="https://es-es.facebook.com/solucionesetbhogares" data-original-title="Facebook" class="social_facebook"></a></li>
                        <li><a href="https://twitter.com/ETBRadio" data-original-title="Twitter" class="social_twitter"></a></li>
                        <li><a href="#" data-original-title="Goole Plus" class="social_googleplus"></a></li>
                        <li><a href="#" data-original-title="Pinterest" class="social_pintrest"></a></li>
                        <li><a href="#" data-original-title="Linkedin" class="social_linkedin"></a></li>
                        <li><a href="#" data-original-title="Vimeo" class="social_vimeo"></a></li>
                    </ul>
                </div>
            </div>
        </div><!--/top-->
        <!--=== End Top ===-->
        <!--=== Header ===-->
        <div class="header">               
            <div class="container"> 
                <!-- Logo -->       
                <div class="logo">                                             
                    <a href="index.jsp"><img id="logo-header" src="assets/img/logo_etb.png" alt="Logo"></a>
                </div><!-- /logo -->        
                <!-- Menu -->       
                <div class="navbar">                                
                    <div class="navbar-inner">                                  
                        <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </a><!-- /nav-collapse -->                                  
                        <%@include file="navbar.jsp" %>
                        <!-- /nav-collapse -->                                
                    </div><!-- /navbar-inner -->
                </div><!-- /navbar -->                          
            </div><!-- /container -->               
        </div><!--/header -->      
        <!--=== End Header ===-->
        <!--=== Breadcrumbs ===-->
        <div class="row-fluid breadcrumbs margin-bottom-20">
            <div class="container">
                <h1 class="pull-left">Tabla Roles</h1>
                <ul class="pull-right breadcrumb">
                    <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>
                    <li class="active">Tabla Roles</li>
                </ul>
            </div><!--/container-->
        </div><!--/breadcrumbs-->
        <!--=== End Breadcrumbs ===-->
        <!--=== Content Part ===-->
        <div class="container">		
            <div class="row-fluid">
                <%@include file="nojavascript.jsp" %>
                <!-- Default Tables styles -->
                <div class="row-fluid margin-bottom-20">
                    <div class="span6">
                        <input type="button" class="btn-u pull-rgt" id="btnNuevo" name="btnNuevo" value="Nuevo Registro" />
                        <br>
                        <br>
                        <table style="width:900px">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Nombre</th>
                                    <th>Descripcion</th>
                                    <th><center><IMG SRC="img/44.png" width="35px"></center></th><th><center><IMG SRC="img/75.png" width="35px"></center></th>
                            </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <%
                                        //codigo paginacion y filtro
                                        //nueva instanciacion de RolesDAO
                                        RolesDAO obj2 = new RolesDAO();
                                        try {
                                            //se muestra en una tabla los datos
                                            ResultSet resul = obj2.getTabla();
                                            while (resul.next()) {
                                                String html = "<tr>";
                                                html += "<td>" + resul.getString("idROLES") + "</td>";
                                                html += "<td>" + resul.getString("nombre") + "</td>";
                                                html += "<td>" + resul.getString("descripcion") + "</td>";
                                                html += "<td><a href='formularioroles.jsp?ID=" + resul.getString("idROLES") + "&Accion=Editar'><center>Editar</center></a></td>";
                                                html += "<td><a href='formularioroles.jsp?ID=" + resul.getString("idROLES") + "&Accion=Eliminar'><center>Eliminar</center></a></td>";
                                                html += "</tr>";
                                                out.print(html);
                                            }
                                        } catch (Exception ex) {
                                            out.print("\" <h1>" + ex.getMessage() + "</h1>");
                                        }
                                    %>
                                    
                                    <%  //mensaje en pantalla
                                        if (request.getParameter("msg") != null) {
                                    %>
                                        <div style="color: red">
                                    <%
                                        out.print(request.getParameter("msg"));
                                    %>
                            </div>
                            <%
                                }
                            %>
                            </tr>
                            </tbody>
                        </table>
                        <a href="#" class="back-to-top">Ir al Menu</a> 
                        </br>
                        </br>
                        </br>
                        </br>
                        </br>
                        </br>
                        </br>
                    </div>
                </div><!--/row-fluid-->
                <div class="row-fluid"></div><!--/row-fluid-->
                <div class="row-fluid"></div><!--/row-fluid-->
            </div><!--/row-fluid-->
            <!--//Default Tables styles -->        
        </div><!--/container-->		
        <!--=== End Content Part ===-->
        <!--=== Footer ===-->
        <div class="footer"><!--/container-->	
        </div><!--/footer-->	
        <!--=== End Footer ===-->
        <!--=== Copyright ===-->
        <div class="copyright">
            <div class="container">
                <div class="row-fluid">
                    <div class="span8">						
                        <p>2014 &copy; Cesar Mayorga. ALL Rights Reserved.</p>
                    </div>
                </div><!--/row-fluid-->
            </div><!--/container-->	
        </div><!--/copyright-->	
        <!--=== End Copyright ===-->
        <!-- JS Global Compulsory -->
        <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
        <script type="text/javascript" src="js/modernizr.custom.js"></script>        
        <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>     
        <!-- JS Page Level -->           
        <script type="text/javascript" src="js/app.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function() {
                App.init();
            });
        </script>

        <script>
            jQuery(document).ready(function() {
                var offset = 220;
                var duration = 500;
                jQuery(window).scroll(function() {
                    if (jQuery(this).scrollTop() > offset) {
                        jQuery('.back-to-top').fadeIn(duration);
                    } else {
                        jQuery('.back-to-top').fadeOut(duration);
                    }
                });
                jQuery('.back-to-top').click(function(event) {
                    event.preventDefault();
                    jQuery('html, body').animate({scrollTop: 0}, duration);
                    return false;
                })
            });
        </script>
        <!--[if lt IE 9]>
            <script src="assets/js/respond.js"></script>
        <![endif]-->
    </body>
</html> 