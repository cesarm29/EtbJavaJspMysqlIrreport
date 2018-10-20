<%-- 
    Document   : sesion
    Created on : 7/07/2014, 03:12:38 PM
    Author     : cesar1
--%>

<%  //datos de sesion de usuario y envio a pagina de login si idUsuario es igual a null
    
    //definicion de variable idUsuario
    String idUsuario = "";
    //definicion de variables rol,iduser
    int rol = 0, iduser = 0;
    //definicion de variable rolId
    String rolId = "";
    //definicion de variable nombreUsuario
    String nombreUsuario = "";
    //trae la sesion
    HttpSession sesionOk = request.getSession();
    //si la variable idUsuario es igual a null se envia a el jsp login y se envia un mensaje 
    if (sesionOk.getAttribute("idUsuario") == null) {
        response.sendRedirect("login.jsp?msg= Es necesario identificarse");
    } else {
        //si no se cumple el if  las variables toman  los datos  de la sesion
        //idUsuario toma el valor de la sesion y recibe el valor de idUsuario
        idUsuario = "" + session.getAttribute("idUsuario");
        //rolId toma el valor de la sesion y recibe el valor de rol
        rolId = "" + session.getAttribute("rol");
        //rol toma el valor haciendole un parseo entero de rolId 
        rol = Integer.parseInt(rolId);
        //iduser toma el valor haciendole un parseo entero de idUsuario 
        iduser = Integer.parseInt(idUsuario);
        //nombreUsuario toma el valor de vacio, y de la sesion recibiendo el nombreUsuario
        nombreUsuario = "" + session.getAttribute("nombreUsuario");   
        //se envia sesionOk con los parametros iduser 
        sesionOk.setAttribute("iduser", iduser);
        //finaliza el codigo de sesion
    }   
%>
