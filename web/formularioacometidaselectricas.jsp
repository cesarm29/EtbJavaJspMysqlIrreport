<%-- 
    Document   : formularioacometidaselectricas
    Created on : 24/06/2014, 09:42:03 AM
    Author     : cesar1
--%>

<%@page import="DTO.AcometidasElectricasDTO"%>
<%@page import="DAO.AcometidasElectricasDAO"%>
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
        <script type="text/javascript">
            <%  //se crea string y se le asigna un titulo
                String Title = "Crear";
                //se crea una nueva instancia de AcometidasElectricasDTO
                AcometidasElectricasDTO a = new AcometidasElectricasDTO();
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
                    //nueva instancia de AcometidasElectricasDAO
                    AcometidasElectricasDAO d = new AcometidasElectricasDAO();
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
                    <h1 class="color-green pull-left">Formulario Acometidas Electricas</h1>
                    <ul class="pull-right breadcrumb">
                        <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>               
                        <li class="active"> Formulario Acometidas Electricas</li>
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

                    <%  //muestra mensaje en pantalla
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
                    <center><form class="reg-page" action="ControlAcometidasElectricas" method="post">

                            <div class="container-fluid">
                                <div class="row-fluid">
                                    <div class="span8">
                                        <center><h1></h1></center>
                                        <div class="span7">
                                            <label>Identificacion :</label>
                                            <input type="number" name="idACOMETIDASELECTRICAS" value="<%= a.getIdACOMETIDASELECTRICAS()%>" id="idACOMETIDASELECTRICAS" /> 
                                            <label>Central :</label>
                                            <input title="Se necesita el nombre de la central" type="text" value="<%= a.getCentral()%>" name="central" id="central" required/> 
                                            <br/>
                                        </div>
                                        <div class="span3">
                                            <label>Distrito:</label>
                                            <input title="Se necesita un numero de distrito" type="number" name="distrito" id="distrito" value="<%= a.getDistrito()%>" required /> 
                                            <br/>
                                            <label>Pr :</label>
                                            <input title="Se necesita un numero de Pr" type="number" value="<%= a.getPr()%>" name="pr" id="pr" required /> 
                                            <br/>
                                        </div>
                                        <div class="span7">
                                            <label>Tema:</label>
                                            <input title="Se necesita el nombre del tema" type="text" name="tema" id="tema" value="<%= a.getTema()%>" required/> 
                                            <br/>
                                            <label>Costo Contrato:</label>
                                            <input title="Se necesita el numero del costo del contrato" type="number" name="costocontrato" id="costocontrato" value="<%= a.getCostocontrato()%>" required/> 
                                            <br/>
                                        </div>
                                        <div class="span4">
                                            <label>Costo Proyecto:</label>
                                            <input title="Se necesita el numero del costo del proyecto" type="number" name="costoproyecto" id="costoproyecto" value="<%= a.getCostoproyecto()%>" required/> 
                                            <br/>
                                            <label>Pares:</label>
                                            <input title="Se necesita el numero de pares" type="number" name="pares" id="pares" value="<%= a.getPares()%>" required/> 
                                            <br/>
                                        </div>
                                        <div class="span7">
                                            <label>Estado:</label>
                                            <select type="text" name="estado" id="estado" value="<%= a.getEstado()%>" required >
                                                <option value="Seleccione la opcion" />Seleccione la opcion
                                                <option value="En construccion" />En construccion
                                                <option value="Construido" />Construido
                                                <option value="Devolucion" />Devolucion
                                                <option value="Garantia" />Garantia
                                            </select> 
                                            <br/>
                                            <label>Fecha de Entrega:</label>
                                            <input type="date" name="fechaentrega" id="fechaentrega" value="<%= a.getFechaentrega()%>" required/> 

                                        </div>
                                        <div class="span3">
                                            <label>Inicio:</label>
                                            <input type="date" name="inicioprogramado" id="inicioprogramado" value="<%= a.getInicioprogramado()%>" required/> 
                                            <br/>
                                            <label>Fin:</label>
                                            <input type="date" name="finprogramado" id="finprogramado" value="<%= a.getFinprogramado()%>" required/> 
                                            <br/>
                                        </div>
                                        <div class="span7">
                                            <label>Avance:</label>
                                            <select type="text" name="avance" id="avance" value="<%= a.getAvance()%>" required>                              
                                                <option value="Seleccione la opcion" />Seleccione la opcion
                                                <option value="0%" />0%
                                                <option value="1%" />1%
                                                <option value="2%" />2%
                                                <option value="3%" />3%
                                                <option value="4%" />4%
                                                <option value="5%" />5%
                                                <option value="6%" />6%
                                                <option value="7%" />7%
                                                <option value="8%" />8%
                                                <option value="9%" />9%
                                                <option value="10%" />10%
                                                <option value="11%" />11%
                                                <option value="12%" />12%
                                                <option value="13%" />13%
                                                <option value="14%" />14%
                                                <option value="15%" />15%
                                                <option value="16%" />16%
                                                <option value="17%" />17%
                                                <option value="18%" />18%
                                                <option value="19%" />19%
                                                <option value="20%" />20%
                                                <option value="21%" />21%
                                                <option value="22%" />22%
                                                <option value="23%" />23%
                                                <option value="24%" />24%
                                                <option value="24%" />24%
                                                <option value="25%" />25%
                                                <option value="26%" />26%
                                                <option value="27%" />27%
                                                <option value="28%" />28%
                                                <option value="29%" />29%
                                                <option value="30%" />30%
                                                <option value="31%" />31%
                                                <option value="32%" />32%
                                                <option value="33%" />33%
                                                <option value="34%" />34%
                                                <option value="35%" />35%
                                                <option value="36%" />36%
                                                <option value="37%" />37%
                                                <option value="38%" />38%
                                                <option value="39%" />39%
                                                <option value="40%" />40%
                                                <option value="41%" />41%
                                                <option value="42%" />42%
                                                <option value="43%" />43%
                                                <option value="44%" />44%
                                                <option value="45%" />45%
                                                <option value="46%" />46%
                                                <option value="47%" />47%
                                                <option value="48%" />48%
                                                <option value="49%" />49%
                                                <option value="50%" />50%
                                                <option value="51%" />51%
                                                <option value="52%" />52%
                                                <option value="53%" />53%
                                                <option value="54%" />54%
                                                <option value="55%" />55%
                                                <option value="56%" />56%
                                                <option value="57%" />57%
                                                <option value="58%" />58%
                                                <option value="59%" />59%
                                                <option value="60%" />60%
                                                <option value="61%" />61%
                                                <option value="62%" />62%
                                                <option value="63%" />63%
                                                <option value="64%" />64%
                                                <option value="65%" />65%
                                                <option value="66%" />66%
                                                <option value="67%" />67%
                                                <option value="68%" />68%
                                                <option value="69%" />69%
                                                <option value="70%" />70%
                                                <option value="71%" />71%
                                                <option value="72%" />72%
                                                <option value="73%" />73%
                                                <option value="74%" />74%
                                                <option value="75%" />75%
                                                <option value="76%" />76%
                                                <option value="77%" />77%
                                                <option value="78%" />78%
                                                <option value="79%" />79%
                                                <option value="80%" />80%
                                                <option value="81%" />81%
                                                <option value="82%" />82%
                                                <option value="83%" />83%
                                                <option value="84%" />84%
                                                <option value="85%" />85%
                                                <option value="86%" />86%
                                                <option value="87%" />87%
                                                <option value="88%" />88%
                                                <option value="89%" />89%
                                                <option value="90%" />90%
                                                <option value="91%" />91%
                                                <option value="92%" />92%
                                                <option value="93%" />93%
                                                <option value="94%" />94%
                                                <option value="95%" />95%
                                                <option value="96%" />96%
                                                <option value="97%" />97%
                                                <option value="98%" />98%
                                                <option value="99%" />99%
                                                <option value="100%" />100%
                                            </select> 
                                            <br/>
                                            <label>Fecha Reporte:</label>
                                            <input type="date" name="fechareporte" id="fechareporte" value="<%= a.getFechareporte()%>" required/> 
                                            <br/>
                                        </div>
                                        <div class="span3">
                                            <label>Mes Facturacion:</label>
                                            <select type="text" name="mesfacturacion" id="mesfacturacion" value="<%= a.getMesfacturacion()%>" required>                               
                                                <option value="Seleccione la opcion" />Seleccione la opcion
                                                <option value="Enero" />Enero
                                                <option value="Febrero" />Febrero
                                                <option value="Marzo" />Marzo
                                                <option value="Abril" />Abril
                                                <option value="Mayo" />Mayo
                                                <option value="Junio" />Junio
                                                <option value="Julio" />Julio
                                                <option value="Agosto" />Agosto
                                                <option value="Septiembre" />Septiembre
                                                <option value="Octubre" />Octubre
                                                <option value="Noviembre" />Noviembre
                                                <option value="Diciembre" />Diciembre
                                            </select> 
                                            <br/>
                                            <label>Contratista:</label>
                                            <input title="Se necesita el nombre del contratista" type="text" name="contratista" id="contratista" value="<%= a.getContratista()%>" required/> 
                                            <br/>
                                        </div>
                                        <div class="span7">
                                            <label>Documento persona que diligencia:</label>
                                            <input title="Se necesita el numero del documento de identidad" type="number" name="USUARIOS_idUSUARIOS" id="USUARIOS_idUSUARIOS" value="<%= a.getUSUARIOS_idUSUARIOS()%>" required/> 
                                            <br/>
                                        </div>
                                        <div class="span12">
                                            <input type="submit" class="btn-u pull-rgt" name="btnSubmit" id="btnSubmit" value="<%=Title%>"/>
                                            <input type="button" class="btn-u pull-lft" onclick="location.href = 'TablaAcometidaselectricas.jsp'" name="btnSalir" id="btnSalir" value="Salir" /> 
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </form></center> 
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
                    <div class="span4"></div>
                </div><!--/row-fluid-->
            </div><!--/container-->	
        </div>
    </div>
    <!--/copyright-->	
    <!--=== End Copyright ===-->
    <!-- JS Global Compulsory -->           
    <script type="text/javascript" src="assets/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="assets/js/modernizr.custom.js"></script>        
    <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script> 
    
    <!-- JS Page Level -->           
    <script type="text/javascript" src="assets/js/app.js"></script>
    <script type="text/javascript">
     jQuery(document).ready(function(){
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
