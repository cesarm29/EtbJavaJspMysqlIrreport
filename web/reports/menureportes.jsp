<%-- 
    Document   : menureportes
    Created on : 10/07/2014, 07:43:46 AM
    Author     : cesar1
--%>
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
        <link rel="stylesheet" href="../assets/plugins/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="../assets/css/style.css">
        <link rel="stylesheet" href="../assets/css/headers/header1.css">
        <link rel="stylesheet" href="../assets/plugins/bootstrap/css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="../assets/css/style_responsive.css">
        <link rel="shortcut icon" href="favicon.ico">        
        <!-- CSS Implementing Plugins -->    
        <link rel="stylesheet" href="../assets/plugins/font-awesome/css/font-awesome.css">
        <!-- CSS Theme -->    
        <link rel="stylesheet" href="../assets/css/themes/default.css" id="style_color">
        <link rel="stylesheet" href="../assets/css/themes/headers/default.css" id="style_color-header-1">    
        <!-- favicon -->
        <link rel="icon" type="image/png" href="../assets/images/icono_etb.png" /> 
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

        <style>
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
    </head> 
    <body>
        <!--=== Top ===-->
        <div class="top">
            <div class="container">
                <div class="top-widget pull-right">
                    <ul class="loginbar">
                        <li><a href="../login.jsp" class="login-btn">Login</a></li>
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
                    <a href="../index.jsp"><img id="logo-header" src="../assets/img/logo_etb.png" alt="Logo"></a>
                </div><!-- /logo -->        
                <!-- Menu -->       
                <div class="navbar">                                
                    <div class="navbar-inner">                                  
                        <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </a><!-- /nav-collapse -->                                                            
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
                    <h1 class="color-green pull-left">Menu Reportes</h1>
                    <ul class="pull-right breadcrumb">
                        <li><a href="../index.jsp">Inicio</a> <span class="divider">/</span></li>
                        <li class="active">Menu Reportes</li>
                    </ul>
                </div><!--/container-->
            </div><!--/breadcrumbs-->
            <div class="container">		
                <div class="row-fluid margin-bottom-10">                    
                                </br>
                                </br>       
                                <center>
                                <form action="ReporteAcometidasElectricas.jsp" id="sky-form" class="sky-form" />
                                
                                </br>
                                <footer>
                                <input align: center type="submit" class="btn-u pull-rgt" value="Reporte Acometidas Electricas" STYLE="text-align:center;width:400px"/>
                                </footer>
                                </form>
                                </center>
                                
                                <center>
                                <form action="ReporteArmarios.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value=" Reporte Armarios" STYLE="text-align:center;width:400px" /> 
                                </footer>
                                </form>
                                </center>
                    
                                <center>
                                <form action="ReporteBaseDeArmario.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Base de Armario" STYLE="text-align:center;width:400px"/> 
                                </footer>
                                </form>
                                </center>
                           
                                <center>
                                <form action="ReporteBogota.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Bogota" STYLE="text-align:center;width:400px"/> 
                                </footer>
                                </form>
                                </center>
                                
                                <center>
                                <form action="ReporteCanalizacion.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Canalizacion" STYLE="text-align:center;width:400px"/> 
                                </footer>
                                </form>
                                </center>    
                                
                                <center>    
                                <form action="ReporteConstruccionBase.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Construccion Base" STYLE="text-align:center;width:400px"/> 
                                </footer>
                                </form>
                                </center>    
                                
                                <center>
                                <form action="ReporteDemolicionBase.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Demolicion Base" STYLE="text-align:center;width:400px"/> 
                                </form>
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteMantenimientoCanalizacionBogota.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Mantenimiento Canalizacion Bogota" STYLE="text-align:center;width:400px"/> 
                                </form>
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteMicromotores.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Micromotores" STYLE="text-align:center;width:400px"/> 
                                </form>
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteModernizacionGirardot.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Renovacion Girardot" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteModernizacionLlanos.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Renovacion Llanos Fase 1" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteModernizacionLlanos2.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Renovacion Llanos Fase 2" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteOrganizacionRed.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Organizacion Red" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteOrganizacionRedFttc.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Organizacion Red Fttc" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReportePosteria.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Posteria" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteConstruccionConDemolicion.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Construccion con Demolicion" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteRedesInternasRegionales.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Redes Internas Regionales" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteRegionales.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Regionales" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteRegionalesBase.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Regionales Base" STYLE="text-align:center;width:400px" /> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteRegistrosRCFibraOptica.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Registros Rc Fibra Optica" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteRenovacionArmariosFttc.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Renovacion Armarios Fttc" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteRiesgoElectrico.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte Riesgo Electrico" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="ReporteSpt.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Reporte SPT" STYLE="text-align:center;width:400px"/> 
                                </form>  
                                </footer>
                                </center>
                                
                                <center>
                                <form action="../menu.jsp" id="sky-form" class="sky-form" />
                                <footer>
                                <input type="submit" class="btn-u pull-rgt" value="Salir del Menu" STYLE="text-align:center;width:400px" /> 
                                </form>    
                                </footer>
                                </center>
                                
                                </form> 
                                <a href="#" class="back-to-top">Ir al Menu</a>
                                </br>
                                </br>
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
                    <div class="span4"></div>
                </div><!--/row-fluid-->
            </div><!--/container-->	
        </div><!--/copyright-->	
        <!--=== End Copyright ===-->
        <!-- JS Global Compulsory -->           
        <script type="text/javascript" src="assets/js/jquery-1.8.2.min.js"></script>
        <script type="text/javascript" src="assets/js/modernizr.custom.js"></script>        
        <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
        
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
