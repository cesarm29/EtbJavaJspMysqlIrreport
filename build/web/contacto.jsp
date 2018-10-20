<%-- 
    Document   : contacto
    Created on : 24/06/2014, 08:11:20 AM
    Author     : cesar1
--%>
<%@page import="mail.SendEmail" %>
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
        <link rel="stylesheet" href="assets/plugins/flexslider/flexslider.css" type="text/css" media="screen">          
        <!-- CSS Theme -->    
        <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color">
        <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1">  
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <!--estilo tabla responsive-->
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
        <div class="breadcrumbs">
            <div class="container">
                <h1 class="color-green pull-left">Contacto</h1>
                <ul class="pull-right breadcrumb">
                    <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>
                    <li class="active">Contacto</li>
                </ul>
            </div><!--/container-->
        </div><!--/breadcrumbs-->
        <!--=== End Breadcrumbs ===-->
        <!-- Google Map -->
        <iframe src="https://www.google.com/maps/embed?pb=!1m16!1m12!1m3!1d3976.583199700412!2d-74.08230700000004!3d4.6681537313276875!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!2m1!1setb+near+San+Fernando%2C+Bogot%C3%A1+-+Cundinamarca%2C+Colombia!5e0!3m2!1sen!2ses!4v1403121555124" width="100%" height="100%" frameborder="0" style="border:0"></iframe>
        <!---/map-->
        <!-- End Google Map -->
        <!--=== Content Part ===-->
        <div class="container">		
            <div class="row-fluid">
                <div class="span9">
                    <div class="headline">
                        <h3>Contacto</h3></div>
                    <p>&nbsp;</p><br/>
                    <%@include file="nojavascript.jsp" %>
                    <form action="Controlador2" id="sky-form" class="sky-form">
                        <label>Asunto</label>
                        <input title="Ingrese el asunto"  type="text" name="asunto" id="fullname" placeholder="Ingrese el Asunto" class="span7 border-radius-none" required />
                        <label>E-mail <span class="color-red">*</span></label>
                        <input title="Ingrese el e-mail" type="email" name="correo" id="email" placeholder="Ingrese el E-mail" class="span7 border-radius-none" required />
                        <label>Mensaje</label>
                        <textarea  rows="4" name="mensaje" id="message" placeholder="Ingrese el Mensaje" class="span10"></textarea>                       
                        <%
                            if (request.getParameter("msg") != null) {

                        %>
                        <p class="goodtogo end" style="color: red">Correo enviado satisfactoriamente</p>
                        <%            } else {
                        %>
                        <p class="warning end" style="color: red">Error el correo no pudo ser enviado, intente de nuevo</p>
                        <%            }

                        %>                      
                        <p><button type="submit" class="btn-u" value="Enviar" name="send" id="send" >Enviar</button>
                            <input type="button" class="btn-u" onclick="location.href = 'menu.jsp'" name="btnSalir" id="btnSalir" value="Salir" /></p>                                
                    </form>
                    <a href="#" class="back-to-top">Ir al Menu</a>   
                </div><!--/span9-->
                <div class="span3">
                    <!-- Contacts -->
                    <div class="headline"><h3>Contactos</h3></div>
                    <ul class="unstyled who margin-bottom-20">
                        <li><i class="icon-home"></i>Cra 58 # 67 B -15 San Fernando</li>
                        <li><a href="http://www.etb.com.co"><i class="icon-globe"></i>http://www.etb.com.co</a></li>
                    </ul>
                    <!-- Business Hours -->
                    <ul class="unstyled">
                    </ul>
                </div><!--/span3-->
            </div><!--/row-fluid-->        
            <!-- Our Clients -->
            <!--/flexslider-->
            <!-- //End Our Clients -->
        </div><!--/container-->		
        <!--=== End Content Part ===-->
        <!--=== Footer ===-->
        <div class="footer">
            <div class="container">
                <div class="row-fluid"><!--/span3--><!--/span3--><!--/span3--><!--/span3-->
                </div><!--/row-fluid-->	
            </div><!--/container-->	
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
        <script type="text/javascript" src="assets/js/jquery-1.8.2.min.js"></script>
        <script type="text/javascript" src="assets/js/modernizr.custom.js"></script>        
        <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
        <!-- JS Implementing Plugins -->           
        <script type="text/javascript" src="assets/plugins/flexslider/jquery.flexslider-min.js"></script>
        <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"></script>
        <script type="text/javascript" src="assets/plugins/gmap/gmap.js"></script>
        <!-- JS Page Level -->           
        <script type="text/javascript" src="assets/js/app.js"></script>
        <script type="text/javascript" src="assets/js/pages/contact.js"></script>
        <script type="text/javascript">
                                jQuery(document).ready(function() {
                                    App.init();
                                    App.initSliders();
                                    Contact.initMap();
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
