<%-- 
    Document   : index
    Created on : 24/06/2014, 07:37:18 AM
    Author     : cesar1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 7]> <html lang="en" class="ie7"> <![endif]-->  
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->  
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->  
<!--[if !IE]><!-->
<html lang="es" xmlns="http://www.w3.org/1999/html"> <!--<![endif]-->
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
    <link rel="stylesheet" href="assets/css/service-hover.css">
    <link rel="shortcut icon" href="favicon.ico">
    <!-- CSS Implementing Plugins -->    
    <link rel="stylesheet" href="assets/plugins/font-awesome/css/font-awesome.css">
    <link rel="stylesheet" href="assets/plugins/flexslider/flexslider.css" type="text/css" media="screen">    	
    <link rel="stylesheet" href="assets/plugins/parallax-slider/css/parallax-slider.css" type="text/css">
    <!-- CSS Theme -->    
    <link rel="stylesheet" href="assets/css/themes/default.css" id="style_color">
    <link rel="stylesheet" href="assets/css/themes/headers/default.css" id="style_color-header-1"> 
    <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />
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
        </div>
        <!-- /logo -->                             
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
<%@include file="nojavascript.jsp" %>
<!--=== End Header ===-->
<!--=== Slider ===-->
<div class="slider-inner">
    <div id="da-slider" class="da-slider">
        <div class="da-slide">
            <h2><i>Empresa <br /> de Telecomunicaciones</i> <br /> <i>de Bogotá</i> </h2>
            <p><i>SAN FERNANDO</i> <br /> <i> INFRAESTRUCTURA - TERCER PISO</i>
                </br></br>   
            </p>
            <div class="da-img span6">
            	<div class="span6"> 
                    <IMG SRC="assets/images/web_etb_big_tp.jpg">
                </div>  
            </div>
        </div>
        <nav class="da-arrows">
            <span class="da-arrows-prev"></span>
            <span class="da-arrows-next"></span>		
        </nav>
    </div><!--/da-slider-->
</div><!--/slider-->
<!--=== End Slider ===-->
<!--=== Purchase Block ===-->
<div class="row-fluid purchase margin-bottom-30">
    <div class="container"></div>
</div><!--/row-fluid-->
<!-- End Purchase Block -->
<!--=== Content Part ===--><!--/container-->		
<!-- End Content Part -->
<!--=== Footer ===--><!--/footer-->	
<!--=== End Footer ===-->
<!--=== Copyright ===-->
</br>
</br>
<a href="#" class="back-to-top">Ir al Menu</a>
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
<script type="text/javascript" src="assets/plugins/parallax-slider/js/modernizr.js"></script>
<script type="text/javascript" src="assets/plugins/parallax-slider/js/jquery.cslider.js"></script> 
<!-- JS Page Level -->           
<script type="text/javascript" src="assets/js/services-hover.js"></script>
<script type="text/javascript" src="assets/js/app.js"></script>
<script type="text/javascript" src="assets/js/pages/index.js"></script>
<script type="text/javascript">
    jQuery(document).ready(function() {
      	App.init();
        App.initSliders();
        Index.initParallaxSlider();
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
