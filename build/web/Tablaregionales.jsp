<%-- 
    Document   : Tablaregionales
    Created on : 15/07/2014, 01:58:27 PM
    Author     : cesar1
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.RegionalesDAO"%>
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
                td:nth-of-type(1):before { content: "Central"; }
                td:nth-of-type(2):before { content: "Distrito"; }
                td:nth-of-type(3):before { content: "Pr"; }
                td:nth-of-type(4):before { content: "Tema"; }
                td:nth-of-type(5):before { content: "Costo Contrato"; }
                td:nth-of-type(6):before { content: "Costo Proyecto"; }
                td:nth-of-type(7):before { content: "Pares"; }
                td:nth-of-type(8):before { content: "Estado"; }
                td:nth-of-type(9):before { content: "Fecha Entrega"; }
                td:nth-of-type(10):before { content: "Inicio Programado"; }
                td:nth-of-type(11):before { content: "Fin Programado"; }
                td:nth-of-type(12):before { content: "Avance"; }
                td:nth-of-type(13):before { content: "Fecha Reporte"; }
                td:nth-of-type(14):before { content: "Mes Facturacion"; }
                td:nth-of-type(15):before { content: "Contratista"; }
                td:nth-of-type(16):before { content: "Editar"; }
                td:nth-of-type(17):before { content: "Eliminar"; }
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
                    location.href = 'formulariocrearregionales.jsp?ID=0&Accion=';
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
                <h1 class="pull-left">Tabla Regionales</h1>
                <ul class="pull-right breadcrumb">
                    <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>
                    <li class="active">Tabla Regionales</li>
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
                        <div id="busqueda">
                        <form action="">
			<right><input type="text" id="q" name="q" value="" placeholder="Busqueda por pr"/></right>
                        </br>
                        <input type="submit" class="btn-u pull-rgt" value="Buscar" />
                        </form>
		        </div>
                        
                        <div style=”display:none; border: 0px;” id=”NavPosicion”></div>
                        <p>Paginas
                            <%
                            //codigo paginacion y filtro
                            //nueva instanciacion de RegionalesDAO
                            RegionalesDAO obj2 = new RegionalesDAO();
                            //se recibe parametro q y se asigna a la variable filtro
                            String filtro = request.getParameter("q");
                            if (filtro == null)filtro = "";
                            int pageNro= 1;
                            //se recibe el parametro page cuando sea diferente de null y diferente a vacio
                            if(request.getParameter("page") != null && request.getParameter("page") !=""){
                                //se asigna a la variable pageNro el parametro page
                                pageNro = Integer.parseInt(request.getParameter("page"));
                            }
                            //se reciben los datos de un resulset pasandole los parametros filtro, pageNro
                            ResultSet resul = obj2.getTabla2(filtro,  pageNro);
                            //se asignan a las variables y se verifica el total de registros, por ultimo se divide el total
                            //por la cantidad de filas que se quiere mostrar
                            int total = obj2.getTotalRegistro(filtro != "");
                            int totalPag = (total / 10);
                            for(int x = 1; x <= totalPag ; x++){
                                %>
                                <a href="Tablaregionales.jsp?page=<%=x%>"><b><%=x%></b></a>&nbsp;&nbsp;&nbsp;
                           <% }
                            %>
                                <strong> <%=total < 10 ? total+"" : "10"%> Registros de <%=total%> Pagina : <%=pageNro%></strong>
                        </p>
                        
                        <table>
                            <thead>
                                <tr>
                                    <th>Central</th>
                                    <th>Distrito</th>
                                    <th>Pr</th>
                                    <th>Tema</th>
                                    <th>Costo Contrato</th>
                                    <th>Costo Proyecto</th>
                                    <th>Pares</th>
                                    <th>Estado</th>
                                    <th>Fecha Entrega</th>
                                    <th>Inicio Programado</th>
                                    <th>Fin Programado</th>
                                    <th>Avance</th>
                                    <th>Fecha Reporte</th>
                                    <th>Mes Facturacion</th>
                                    <th>Contratista</th>
                                    <th><center><IMG SRC="img/44.png"></center></th><th><center><IMG SRC="img/75.png"></center></th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <%
                                        //muestra datos en tabla
                                        try {
                                            while (resul.next()) {
                                                String html = "<tr>";
                                                html += "<td>" + resul.getString("central") + "</td>";
                                                html += "<td>" + resul.getString("distrito") + "</td>";
                                                html += "<td>" + resul.getString("pr") + "</td>";
                                                html += "<td>" + resul.getString("tema") + "</td>";
                                                html += "<td>" + resul.getString("costocontrato") + "</td>";
                                                html += "<td>" + resul.getString("costoproyecto") + "</td>";
                                                html += "<td>" + resul.getString("pares") + "</td>";
                                                html += "<td>" + resul.getString("estado") + "</td>";
                                                html += "<td>" + resul.getString("fechaentrega") + "</td>";
                                                html += "<td>" + resul.getString("inicioprogramado") + "</td>";
                                                html += "<td>" + resul.getString("finprogramado") + "</td>";
                                                html += "<td>" + resul.getString("avance") + "</td>";
                                                html += "<td>" + resul.getString("fechareporte") + "</td>";
                                                html += "<td>" + resul.getString("mesfacturacion") + "</td>";
                                                html += "<td>" + resul.getString("contratista") + "</td>";
                                                html += "<td><a href='formularioregionales.jsp?ID=" + resul.getString("idREGIONALES") + "&Accion=Editar'><center>Editar</center></a></td>";
                                                html += "<td><a href='formularioregionales.jsp?ID=" + resul.getString("idREGIONALES") + "&Accion=Eliminar'><center>Eliminar</center></a></td>";
                                                html += "</tr>";
                                                out.print(html);
                                            }
                                        } catch (Exception ex) {
                                            out.print("\" <h1>" + ex.getMessage() + "</h1>");
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
                            </tr>
                            </tbody>
                        </table>
                         <a href="#" class="back-to-top">Ir al Menu</a>   
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