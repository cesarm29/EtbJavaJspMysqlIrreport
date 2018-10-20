|<%-- 
    Document   : login
    Created on : 24/06/2014, 08:07:36 AM
    Author     : cesar1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!--> <html lang="es"> <!--<![endif]-->  
    <head>
        <title> |ETB|</title>
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
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />
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
                        <div class="nav-collapse collapse">                                     
                            <ul class="nav top-2">
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Inicio
                                        <b class="caret"></b>                            
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="index.jsp">Pagina Inicio</a></li>                               
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Contacto
                                        <b class="caret"></b>                            
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="contacto.jsp">Contacto</a></li>                               
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>
                            </ul>
                        </div><!-- /nav-collapse -->                                
                    </div><!-- /navbar-inner -->
                </div><!-- /navbar -->                          
            </div><!-- /container -->               
        </div><!--/header -->      
        <!--=== End Header ===-->
        <!--=== Breadcrumbs ===-->
        <div class="breadcrumbs margin-bottom-40">
            <div class="container">
                <h1 class="color-green pull-left">Login</h1>
                <ul class="pull-right breadcrumb">
                    <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>
                    
                    <li class="active">Login</li>
                </ul>
            </div><!--/container-->
        </div><!--/breadcrumbs-->
        <!--=== End Breadcrumbs ===-->
        <!--=== Content Part ===-->
        <div class="container">		
            <div class="row-fluid">  
                <%@include file="nojavascript.jsp" %>
                <form class="log-page" action="Controlador">
                    <h3>Login</h3>    
                    <div class="input-prepend">
                        <label>Usuario</label>
                        <span class="add-on"><i class="icon-user"></i></span>
                        <input class="input-xlarge" type="text" id="username" name="username">              
                    </div>
                    <div class="input-prepend">
                        <label>Contraseña</label>
                        <span class="add-on"><i class="icon-lock"></i></span>
                        <input class="input-xlarge" type="password" id="password" name="pass">  
                    </div>
                    <div class="controls form-inline">                
                        <button class="btn-u pull-right" type="submit" name="btningresar" value="ingresar">Ingreso</button>
                        </br> 
                        <% //mensaje en pantalla
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
                    </div>
                    <hr />
                    <h4>&nbsp;</h4>
                </form>            
            </div><!--/row-fluid-->
        </div><!--/container-->		
        <!--=== End Content Part ===-->
        </br>
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
            </div>
        </div>
        <!--=== End Copyright ===-->
        <!-- JS Global Compulsory -->           
        <script type="text/javascript" src="assets/js/jquery-1.8.2.min.js"></script>
        <script type="text/javascript" src="assets/js/modernizr.custom.js"></script>        
        <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
        <!-- JS Implementing Plugins -->           
        <script type="text/javascript" src="assets/plugins/back-to-top.js"></script>
        <!-- JS Page Level -->           
        <script type="text/javascript" src="assets/js/app.js"></script>
        <!--[if lt IE 9]>
            <script src="assets/js/respond.js"></script>
        <![endif]-->
    </div>
    <script type="text/javascript">
        jQuery(document).ready(function() {
            App.init();
        });
    </script>
</body>
</html> 
