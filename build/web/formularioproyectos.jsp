<%-- 
    Document   : formularioproyectos
    Created on : 26/06/2014, 08:17:24 AM
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
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />
        <script type="text/javascript">
            <%  //se crea string y se le asigna un titulo
                String Title = "Crear";
                //se crea una nueva instancia de ProyectoDTO
                ProyectoDTO a = new ProyectoDTO();
                //se crean dos string's y van a ser igual a 2 parametros Accion y ID que se reciben por un request
                String accion = request.getParameter("Accion");
                String id = request.getParameter("ID");
                //evalua si la accion es igual a Eliminar o Editar o Vacio, si es igual a Editar les asigna a la variable
                //Title otro nombre puede ser Modificar o Eliminar
                if ((accion.equals("Eliminar") || accion.equals("Editar")) && !(id.equals(""))) {
                    if (accion.equals("Editar")) {
                        Title = "Modificar";
                    } else {
                        Title = "Eliminar";
                    }
                    //nueva instancia de ProyectoDAO
                    ProyectoDAO d = new ProyectoDAO();
                    try {
                        //trae los datos por id a el formulario
                        a = d.getPorID(Integer.parseInt(id));
                    } catch (Exception ex) {
                        out.print("$('#divError').html(\"<h5>" + ex.getMessage() + "</h5>\");");
                    }
                } else {
                    Title = "Crear";
                }
            %>
        function btn_click() {
            history.back();
        }
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
                    <h1 class="color-green pull-left">Formulario Proyectos</h1>
                    <ul class="pull-right breadcrumb">
                        <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>
                        <li class="active"> Formulario Proyectos</li>
                    </ul>
                </div><!--/container-->
            </div><!--/breadcrumbs-->
            <div class="container">		
                <div class="row-fluid margin-bottom-10">
                    <%
                        if (request.getParameter("temp") != null) {
                    %>
                    <div style="color: red">
                        <%
                            out.print(request.getParameter("temp"));
                        %>
                    </div>
                    <%
                        }
                    %>

                    <%
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
                    <%@include file="nojavascript.jsp" %>
                    <center><form class="reg-page" action="ControlProyecto" method="post">
                            <label>Identificacion :</label>
                            <input type="number" name="idPROYECTOS" value="<%= a.getIdPROYECTOS()%>" id="idPROYECTOS" /> 
                            <label>Central :</label>
                            <input title="Se necesita el nombre de la central" type="text" value="<%= a.getCentral()%>" name="central" id="central" required/> 
                            <br/>
                            <br/>
                            <label>Distrito:</label>
                            <input title="Se necesita un numero de distrito" type="number" name="distrito" id="distrito" value="<%= a.getDistrito()%>" required /> 
                            <br/>
                            <br/>
                            <label>Pr :</label>
                            <input title="Se necesita un numero de Pr" type="number" value="<%= a.getPr()%>" name="pr" id="pr"required /> 
                            <br/>
                            <br/>
                            <label>Tema:</label>
                            <input title="Se necesita el nombre del tema" type="text" name="tema" id="tema" value="<%= a.getTema()%>" required/> 
                            <br/>
                            <label>Costo Contrato:</label>
                            <input title="Se necesita el numero del costo del contrato" type="number" name="costocontrato" id="costocontrato" value="<%= a.getCostocontrato()%>" required/> 
                            <br/>
                            <label>Costo Proyecto:</label>
                            <input title="Se necesita el numero del costo del proyecto" type="number" name="costoproyecto" id="costoproyecto" value="<%= a.getCostoproyecto()%>" required/> 
                            <br/>
                            <label>Pares:</label>
                            <input title="Se necesita el numero de pares" type="number" name="pares" id="pares" value="<%= a.getPares()%>" required/> 
                            <br/>
                            <label>Estado:</label>
                            <input type="text" name="estado" id="estado" value="<%= a.getEstado()%>" required/> 
                            <br/>
                            <label>Fecha de Entrega:</label>
                            <input type="text" name="fechaentrega" id="fechaentrega" value="<%= a.getFechaentrega()%>" required/> 
                            <br/>
                            <label>Inicio Programado:</label>
                            <input type="text" name="inicioprogramado" id="inicioprogramado" value="<%= a.getInicioprogramado()%>" required/> 
                            <br/>
                            <label>Fin Programado:</label>
                            <input type="text" name="finprogramado" id="finprogramado" value="<%= a.getFinprogramado()%>" required/> 
                            <br/>
                            <label>Avance:</label>
                            <input type="text" name="avance" id="avance" value="<%= a.getAvance()%>" required/> 
                            <br/>
                            <label>Fecha Reporte:</label>
                            <input type="text" name="fechareporte" id="fechareporte" value="<%= a.getFechareporte()%>" required/> 
                            <br/>
                            <label>Mes Facturacion:</label>
                            <input type="text" name="mesfacturacion" id="mesfacturacion" value="<%= a.getMesfacturacion()%>" required/> 
                            <br/>
                            <label>Contratista:</label>
                            <input title="Se necesita el nombre del contratista" type="text" name="contratista" id="contratista" value="<%= a.getContratista()%>" required/> 
                            <br/>
                            <label>Documento persona que diligencia:</label>
                            <input title="Se necesita el numero del documento de identidad" type="number" name="USUARIOS_idUSUARIOS" id="USUARIOS_idUSUARIOS" value="<%= a.getUSUARIOS_idUSUARIOS()%>" required/> 
                            <br/>
                            <input type="submit" class="btn-u pull-rgt" name="btnSubmit" id="btnSubmit" value="<%=Title%>"/>
                            <input type="button" class="btn-u pull-lft" onclick="location.href = 'Tablabasearmario.jsp'" name="btnSalir" id="btnSalir" value="Salir" /> 
                        </form></center>
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
        <!-- JS Implementing Plugins -->           
        <script type="text/javascript" src="assets/plugins/back-to-top.js"></script>
        <!-- JS Page Level -->           
        <script type="text/javascript" src="assets/js/app.js"></script>
        <script type="text/javascript">
                jQuery(document).ready(function() {
                    App.init();
                });
        </script>
        <!--[if lt IE 9]>
            <script src="assets/js/respond.js"></script>
        <![endif]-->
    </body>
</html>
