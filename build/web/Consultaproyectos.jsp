<%-- 
    Document   : Consultaproyectos
    Created on : 2/07/2014, 11:38:27 AM
    Author     : cesar1
--%>
<%@page import="DTO.ProyectoDTO"%>
<%@page import="DAO.ProyectoDAO"%>
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
        <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color">
        <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1">    
        <!-- favicon -->
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        
        <style>
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
        
        <script type="text/javascript">
            <%
                //ProyectoDto se le da el valor de null
                ProyectoDTO contrado = null;
                //se recibe el parametro numero_identidad se le asigna a id, verifica si es null o vacio
                String id = request.getParameter("numero_identidad");
                if (id != null && !id.equals("")) {
                    //nueva instanciacion de ProyectoDAO
                    ProyectoDAO d = new ProyectoDAO();
                    //se hace la consulta de contrado y se le hace un parseo a el id
                    contrado = d.getConsulta(Integer.parseInt(id));
                }
            %>
            $(function() {
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
        <!--=== Content Part ===-->
        <div class="body">
            <div class="breadcrumbs margin-bottom-50">
                <div class="container">
                    <h1 class="color-green pull-left">Consulta Construccion con Demolicion</h1>
                    <ul class="pull-right breadcrumb">
                        <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>
                        <li class="active"> Consulta Construccion con Demolicion</li>
                    </ul>
                </div><!--/container-->
            </div><!--/breadcrumbs-->
            <div class="container">		
                <div class="row-fluid margin-bottom-10">                    
                    </br>
                    </br>
                    <%@include file="nojavascript.jsp" %>
                    <form action="" method="post" name="contratoctrol" id="sky-form" class="reg-page" />
                    <center><header>Construccion con Demolicion</header></center>                         
                    <fieldset>
                        <center><label class="input"> 
                            <input type="number" name="numero_identidad" id="numero_identidad" value="<%=id%>"/>
                            <label for="numero_identidad">Ingrese el Pr</label>
                            </label></center>
                    </fieldset>
                    <div style="width: 70%; margin: 0px auto;">         
                        <% if (contrado != null) {
                                out.print("<h3>Datos Consulta:</h3>");
                                out.print("<br>");
                                out.print("<h3>Central: " + contrado.getCentral() + "</h3>");
                                out.print("<h3>Distrito: " + contrado.getDistrito() + "</h3>");
                                out.print("<h3>Pr: " + contrado.getPr() + "</h3>");
                                out.print("<h3>Tema: " + contrado.getTema() + "</h3>");
                                out.print("<h3>Costo Contrato: " + contrado.getCostocontrato() + "</h3>");
                                out.print("<h3>Costo Proyecto: " + contrado.getCostoproyecto() + "</h3>");
                                out.print("<h3>Pares: " + contrado.getPares() + "</h3>");
                                out.print("<h3>Estado: " + contrado.getEstado() + "</h3>");
                                out.print("<h3>Inicio Programado: " + contrado.getInicioprogramado() + "</h3>");
                                out.print("<h3>Fin Programado: " + contrado.getFinprogramado() + "</h3>");
                                out.print("<h3>Avance: " + contrado.getAvance() + "</h3>");
                                out.print("<h3>Fecha Reporte: " + contrado.getFechareporte() + "</h3>");
                                out.print("<h3>Mes Facturacion: " + contrado.getMesfacturacion() + "</h3>");
                                out.print("<h3>Contratista: " + contrado.getContratista() + "</h3>");
                                out.print("<h3>Cedula Persona Que Diligencio: " + contrado.getUSUARIOS_idUSUARIOS() + "</h3>");
                            } else {
                                if (id != null)//ejecuta
                                {
                                    out.print("<center><div style=\"color: red\">El Proyecto No Existe</div></center>");
                                }
                            }
                        %>
                    </div>
                    <center><footer>
                        <input type="submit" class="btn-u pull-rgt" name="btnSubmit" id="btnSubmit" value="Consultar"/>
                        <input type="button" class="btn-u pull-rgt" onclick="location.href = 'menu.jsp'" name="btnSalir" id="btnSalir" value="Salir" />             
                    </footer></center>
                    </form> 
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    <a href="#" class="back-to-top">Ir al Menu</a>
                </div><!--/row-fluid-->
            </div><!--/container-->		
        </div><!--/body-->
        <!--=== End Content Part ===-->
        <!--=== Footer ===--><!--/footer-->	
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
        <script type="text/javascript" src="assets/js/jquery-1.8.2.min.js"></script>
        <script type="text/javascript" src="assets/js/modernizr.custom.js"></script>        
        <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
        <!-- JS Implementing Plugins -->           
        
        <!-- JS Page Level -->           
        <script type="text/javascript" src="assets/js/app.js"></script>
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
