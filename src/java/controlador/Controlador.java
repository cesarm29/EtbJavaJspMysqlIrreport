/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.UsuariosDAO;
import DTO.RolesDTO;
import DTO.UsuariosDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mail.SendEmail;

/**
 *
 * @author cesar1
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, NamingException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter(); 
        UsuariosDAO udao = null;
        try {
            udao = new UsuariosDAO(); 
        //nueva instancia UsuariosDTO    
        UsuariosDTO udto = new UsuariosDTO();
        //condicionales cuando se presione el boton (btningresar) en el formulario correspondiente a ingresar va a la validar los datos del usuario y sus roles y muestra el mensaje en pantalla si el usuario no es valido, se redirecciona al jsp
        if (request.getParameter("btningresar") != null && request.getParameter("btningresar").equals("ingresar")) {
            String user = request.getParameter("username");
            String clave = request.getParameter("pass");
            RolesDTO rdto = null;
            String salida = "";
            try {
                rdto = udao.validarUsuario(user, clave);
                salida = (String) rdto.getMensaje();
            } catch (Exception ex) {
                out.println(ex.getMessage());
                response.sendRedirect("login.jsp?msg=" + ex.getMessage());
            }
            // cuando se verifique en la base de datos que el usuario esta bien se redirecciona al menu de la aplicacion 
            if (salida.equalsIgnoreCase("QueryOk")) {               
                HttpSession sesion = request.getSession();
                sesion.setAttribute("idUsuario", rdto.getIdUSUARIOS());
                sesion.setAttribute("id", rdto.getIdUSUARIOS());
                sesion.setAttribute("nombreUsuario", rdto.getNombres());
                sesion.setAttribute("rol", rdto.getIdRoles());
                sesion.setAttribute("Estado", rdto.getEstado());    
                response.sendRedirect("menu.jsp?msg1= Bienvenido(a)");
            } else {
                out.print(rdto);
                System.out.println("Error" + rdto);
                response.sendRedirect("login.jsp?msg=" + (String) rdto.getMensaje());
            }       
        }}catch (Exception e) {
            out.println(e.getMessage());
        }
        }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NamingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
