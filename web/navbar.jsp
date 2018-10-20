<%-- 
    Document   : navbar
    Created on : 3/07/2014, 03:48:19 PM
    Author     : cesar1
--%>
<%@include file="sesion.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
    </head>    
    <body>
        <!--=== Header ===-->
        <div class="header">               
            <div class="container"> 
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
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Acometidas Electricas                                                                   
                                    </a>
                                    <ul class="dropdown-menu">
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaacomedidaselectricas.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Acometidas Electricas</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="TablaAcometidaselectricas.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Acometidas Electricas</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaorganizacionredfttc.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Organizacion Red Fttc</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaorganizacionredfttc.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Organizacion Red Fttc</a></li>
                                        <%}%>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>                               
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Base Armarios                                                                    
                                    </a>
                                    <ul class="dropdown-menu">
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultarbasearmarios.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Base Armario</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablabasearmario.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Base Armario</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaconstruccionbase.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Construccion Base</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaconstruccionbase.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Construccion Base</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultademolicionbase.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Demolicion Base</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablademolicionbase.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar,Eliminar Demolicion Base</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaregionalesbase.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Regionales Base</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaregionalesbase.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Regionales Base</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultabogota.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Bogota</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablabogota.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Bogota</a></li>
                                        <%}%>
                                        
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>                                
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Canalizacion                                                                   
                                    </a>
                                    <ul class="dropdown-menu">
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultacanalizacion.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Mantenimiento Canalizacion Regionales</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="TablaCanalizacion.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Mantenimiento Canalizacion Regionales</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultarmantenimientocanalizacionbogota.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Mantenimiento Canalizacion Bogota</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablamantenimientocanalizacionbogota.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Mantenimiento Canalizacion Bogota</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultamicromotores.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Micromotores</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablamicromotores.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Micromotores</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaregistrosrcfibraoptica.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Registros Rc Fibra Optica</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaregistrosrcfibraoptica.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Registros Rc Fibra Optica</a></li>
                                        <%}%>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>                                    
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Renovacion Red                                                                   
                                    </a>
                                    <ul class="dropdown-menu">
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultamodernizacionllanos.jsp"><IMG SRC="img/49.png" width="20px"> Consulta Renovacion Red Llanos Fase 1</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablamodernizacionllanos.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Renovacion Red Llanos Fase 1</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultamodernizacionllanos2.jsp"><IMG SRC="img/49.png" width="20px"> Consulta Renovacion Red Llanos Fase 2</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablamodernizacionllanos2.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Renovacion Red Llanos Fase 2</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultarmodernizaciongirardot.jsp"><IMG SRC="img/49.png" width="20px"> Consulta Renovacion Red Girardot</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablamodernizaciongirardot.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Renovacion Red Girardot</a></li>
                                        <%}%>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>
                                <!--evalua condicionales para mostrar links por rol-->
                                <%if (rol == 1|| rol == 2) {%>
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Reportes                                                                  
                                    </a>
                                    <ul class="dropdown-menu">                   
                                        <li><a href="reports/menureportes.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Reportes</a></li>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>
                                <%}%>
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Organizacion Red                                                                   
                                    </a>
                                    <ul class="dropdown-menu">
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaorganizacionred.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Organizacion Red</a></li> 
                                        <%}%>
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaorganizacionred.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Organizacion Red      </a></li>
                                        <%}%>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>                                
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Proyectos Renovacion                                                                
                                    </a>
                                    <ul class="dropdown-menu">
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaproyectos.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Construccion con Demolicion</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaproyectos.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Construccion con Demolicion</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaarmarios.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Armarios</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaarmario.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Armarios</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaregionales.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Regionales</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaregionales.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Regionales</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultarenovacionarmariosfttc.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Renovacion Armarios Fttc</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablarenovacionarmariosfttc.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Renovacion Armarios Fttc</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaredesinternasregionales.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Redes Internas Regionales</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaredesinternasregionales.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Redes Internas Regionales</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultariesgoelectrico.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Riesgo Electrico</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablariesgoelectrico.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Riesgo Electrico</a></li>
                                        <%}%>
                                        
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultaposteria.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Posteria</a></li> 
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablaposteria.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Posteria</a></li>
                                        <%}%>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>                                
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">SPT                                                                   
                                    </a>
                                    <ul class="dropdown-menu">
                                        <!--evalua condicionales para mostrar links por rol-->
                                        <%if (rol == 1 || rol == 2 || rol == 3) {%>
                                        <li><a href="Consultastp.jsp"><IMG SRC="img/49.png" width="20px"> Consultar SPT</a></li>
                                        <%}%>
                                        <%if (rol == 1 || rol == 2) {%>
                                        <li><a href="Tablastp.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar SPT</a></li>  
                                        <%}%>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Contacto                                                                    
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="contacto.jsp"><IMG SRC="img/1.png" width="20px"> Contacto</a></li>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li>
                                <!--evalua condicionales para mostrar links por rol-->
                                <%if (rol == 1) {%>
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Utilidades del Sistema                                                                    
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="Backup.jsp"><IMG SRC="img/23.png" width="20px"> Crear Copia de Seguridad</a></li>
                                        <li><a href="TablaUsuarios.jsp"><IMG SRC="img/7.png" width="20px"> Crear, Modificar, Eliminar Usuarios          </a></li>
                                        <li><a href="Consultarol.jsp"><IMG SRC="img/49.png" width="20px"> Consultar Roles del Sistema</a></li>
                                        <li><a href="Tablaroles.jsp"><IMG SRC="img/3.png" width="20px"> Crear, Modificar, Eliminar Roles</a></li>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li> 
                                <%}%>
                                <!--evalua condicionales para mostrar links por rol-->
                                <%if (rol == 1) {%>
                                <li>
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Migracion                                                                    
                                    </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="pageacometidaselectricas.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Acometidas Electricas</a></li>
                                        <li><a href="pagearmarios.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Armarios</a></li>
                                        <li><a href="pagebasedearmario.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Base de Armario</a></li>
                                        <li><a href="pagebogota.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Bogota</a></li>
                                        <li><a href="pagecanalizacion.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Mantenimiento Canalizacion Regionales</a></li>
                                        <li><a href="pageconstruccionbase.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Construccion Base</a></li>
                                        <li><a href="pagedemolicionbase.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Demolicion Base</a></li>
                                        <li><a href="pagemantenimientocanalizacionbogota.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Mantenimiento Canalizacion Bogota</a></li>
                                        <li><a href="pagemicromotores.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Micromotores</a></li>
                                        <li><a href="pagemodernizaciongirardot.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Renovacion Red Girardot</a></li>
                                        <li><a href="pagemodernizacionllanos.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Renovacion Red Llanos Fase I</a></li>
                                        <li><a href="pagemodernizacionllanos2.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Renovacion Red Llanos Fase II</a></li>
                                        <li><a href="pageorganizacionred.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Organizacion Red</a></li>
                                        <li><a href="pageorganizacionredfttc.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Organizacion Red Fttc</a></li>
                                        <li><a href="pageposteria.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Posteria</a></li>
                                        <li><a href="pageproyectos.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Construccion con Demolicion</a></li>
                                        <li><a href="pageredesinternasregionales.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Redes Internas Regionales</a></li>
                                        <li><a href="pageregionales.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Regionales</a></li>
                                        <li><a href="pageregionalesbase.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Regionales Base</a></li>
                                        <li><a href="pageregistrosrcfibraoptica.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Registros Rc Fibra Optica</a></li>
                                        <li><a href="pagerenovacionarmariosfttc.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Renovacion Armarios Fttc</a></li>
                                        <li><a href="pageriesgoelectrico.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla Riesgo Electrico</a></li>
                                        <li><a href="pagestp.jsp"><IMG SRC="img/51.png" width="20px"> Migracion Archivo CSV a Tabla SPT</a></li>
                                    </ul>
                                    <b class="caret-out"></b>                        
                                </li> 
                                <%}%>
                                <li>
                                    <a href="index.jsp">Salir                                                                    
                                    </a>
                                    <b class="caret-out"></b>                        
                                </li>
                            </ul>
                        </div><!-- /nav-collapse --> 
                    </div><!-- /navbar-inner -->
                </div><!-- /navbar -->   
            </div><!-- /container -->               
        </div><!--/header -->      
        <!--=== End Header ===-->
        <!--=== Content Part ===-->
        <div class="body">
            <!-- JS Global Compulsory -->           
            <script type="text/javascript" src="../assets/js/jquery-1.8.2.min.js"></script>
            <script type="text/javascript" src="../assets/js/modernizr.custom.js"></script>        
            <script type="text/javascript" src="../assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
            <!-- JS Implementing Plugins -->           
            <script type="text/javascript" src="../assets/plugins/back-to-top.js"></script>
            <!-- JS Page Level -->           
            <script type="text/javascript" src="../assets/js/app.js"></script>
            <script type="text/javascript">
                jQuery(document).ready(function() {
                    App.init();
                });
            </script>
            <!--[if lt IE 9]>  -->             
    </body>
    </html>