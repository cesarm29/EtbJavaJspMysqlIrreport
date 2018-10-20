<%-- 
    Document   : UsuarioRol
    Created on : 1/07/2014, 01:39:11 PM
    Author     : cesar1
--%>

<%@page import="DAO.RolesDAO"%>
<%@page import="DTO.RolesDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DAO.UsuariosDAO"%>
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
        <link rel="shortcut icon" href="favicon.ico">
        <link rel="stylesheet" href="css/style.css">
        <link rel="icon" type="image/png" href="assets/images/icono_etb.png" />
        <script src="js/jquery-1.9.1.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>


        <%  //trae el usuario y lo muestra en pantalla
            String user_id = request.getParameter("IDUsuario");

        %> 


        <script type="text/javascript">
            $(document).ready(function() {
                $("#Agregar").click(function() {
                    var idrol = $("#cboRol").val();
                    var id_usu = "<%=user_id%>";
                    $.ajax({
                        type: "POST",
                        url: "UsuariosrolCtrol",
                        data: "IDUsuario=" + id_usu + "&IDRol=" + idrol + "&ACCION=AGREGAR",
                        error: function(d) {
                            $("#div_error").html(d.responseText);
                        }
                    }).done(function(data) {
                        if (data == "") {

                            alert("Rol Agregado");
                            location.href = "TablaUsuarios.jsp";

                            var des_rol = $("#cboRol option:selected").html();
                            var ht = "<tr>"
                            ht += "<td>" + des_rol + "</td>";
                            ht += "<td><a onclick='eliminarRol(" + idrol + ", this)' >Eliminar</a></td>";

                            $("#tab_rol").append(ht + "</tr>");
                        } else {
                            alert(data);
                        }
                    });
                });
            });
            function eliminarRol(idrol, e) {
                var id_usu = "<%=user_id%>";
                $.ajax({
                    type: "POST",
                    url: "UsuariosrolCtrol",
                    data: "IDUsuario=" + id_usu + "&IDRol=" + idrol + "&ACCION=ELIMINAR",
                    error: function(d) {
                        $("#div_error").html(d.responseText);
                    }
                }).done(function(data) {
                    if (data == "") {

                        alert("Rol eliminado");
                        location.href = "TablaUsuarios.jsp";

                        $(e).parents("tr").fadeOut(function() {
                            $(this).remove();
                        });
                    } else {
                        alert(data);
                    }
                });
            }
        </script>
        <script LANGUAGE="JavaScript">
            function mi_alerta() {
                alert("Rol Asignado");
                location.href = "TablaUsuarios.jsp";
            }
        </script>
        <script language="JavaScript">

            function mi_alertas() {
                history.back();
            }

        </script>
        
        <script type="text/javascript">

            <%  //arreglo de roles con fin de que en el formulario se vean los datos actuales de roles y se muestren
                //en una lista de seleccion
                ArrayList<RolesDTO> listado_temas = new ArrayList<RolesDTO>();
                try{
                    listado_temas = new RolesDAO().ListarTodos();
                }catch (Exception ex) {
                        out.print("$('#divError').html(\"<h5>" + ex.getMessage() + "</h5>\");");
                    }
                
            %>
            
        </script> 
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
                td:nth-of-type(1):before { content: "Nombre"; }
                td:nth-of-type(2):before { content: "Eliminar"; }
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
                        <li><a href="#" data-original-title="Facebook" class="social_facebook"></a></li>
                        <li><a href="#" data-original-title="Twitter" class="social_twitter"></a></li>
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
                    <h1 class="color-green pull-left">Formulario Asignacion Roles</h1>
                    <ul class="pull-right breadcrumb">
                        <li><a href="index.jsp">Inicio</a> <span class="divider">/</span></li>
                        <li class="active">Formulario Asignacion Roles</li>
                    </ul>
                </div><!--/container-->
            </div><!--/breadcrumbs-->
            <div class="container">		
                <div class="row-fluid margin-bottom-10">
                    <div class="main">
                        <div id="page-wrap">
                            <%@include file="nojavascript.jsp" %>
                            <h3><IMG SRC="img/user.png">Usuario Consultado: <%=request.getParameter("Usu")%></h3>
                            <center><p>Asignacion de Roles</p></center>
                            
                            
                            <select id="cboRol">
                            <% 
                                //trae de la bd los datos de roles
                            for(RolesDTO item : listado_temas){
                            %>
                             <option value="<%=item.getIdRoles() %>"><%=item.getNombre() %></option>
                             <%
                              }
                             %>    
                            </select>
                            
                            </br>
                                <input type="button" class="btn-u pull-rgt" value="Agregar" id="Agregar"   /> <input type="button" class="btn-u pull-rgt" id="btnSalir" value="Salir" onClick=mi_alertas() /> 
                                <br>
                                </br>
                                <table>
                                    <thead>
                                        <tr> 
                                            <th>Nombre</th>
                                            <th><center><IMG SRC="img/75.png" style="width:30px"></center></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <%  //crea una nueva instancia de UsuariosDAO
                                            UsuariosDAO obj = new UsuariosDAO();
                                            try {
                                                //muestra en una tabla todos los roles del usuario
                                                ResultSet resul = obj.getgetRoles(user_id);
                                                while (resul.next()) {
                                                    String html = "<tr>";
                                                    html += "<td>" + resul.getString(1) + "</td>";
                                                    html += "<td><a onclick='eliminarRol(" + resul.getString(2) + ", this)' ><center>Eliminar</center></a></td>";
                                                    out.print(html);
                                                }
                                            } catch (Exception ex) {
                                                out.print("\" <h1>" + ex.getMessage() + "</h1>");
                                            }
                                        %> 
                                    </tbody>
                                </table>
                                <a href="#" class="back-to-top">Ir al Menu</a>                                    
                        </div>     
                    </div>       
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