/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.UsuariosDAO;
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

/**
 *
 * @author cesar1
 */
public class RegistroCtrol extends HttpServlet {

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
            throws ServletException, IOException, NamingException, SQLException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String v_que_va_a_retornar = "";
        
        try {
            //nueva instanciacion de UsuariosDAO, UsuariosDTO
            UsuariosDAO contdao=new UsuariosDAO(); 
            UsuariosDTO contrdto=new UsuariosDTO();
            //se pasan los id's del formulario
            String s = request.getParameter("idUSUARIOS");
            contrdto.setIdUSUARIOS(Integer.parseInt(request.getParameter("idUSUARIOS")));
            contrdto.setUserName(request.getParameter("username"));
            contrdto.setPassword(request.getParameter("password"));
            contrdto.setNombres(request.getParameter("Nombres"));
            contrdto.setApellidos(request.getParameter("Apellidos"));
            contrdto.setEstado(Integer.parseInt(request.getParameter("Estado")));
            //condicionales cuando se presione el boton (btnsubmit) en el formulario correspondiente a crear,modificar o eliminar va a la correspondiente accion, la genera y muestra el mensaje en pantalla y se redirecciona al jsp
             if (request.getParameter("btnSubmit") !=null && request.getParameter("btnSubmit").equals("Crear")){               
                 Boolean existe = contdao.Exists(contrdto.getIdUSUARIOS() + "");
                if (existe) {
                    v_que_va_a_retornar = "El usuario ya se encuentra registrado";
                } else {
                       String salida1=contdao.crearUsuarios(contrdto);
                       response.sendRedirect("TablaUsuarios.jsp?msg="+salida1);
             }}
             else if(request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Modificar")){                 
                       String salida1=contdao.ModificarUsuarios(contrdto);
                       response.sendRedirect("TablaUsuarios.jsp?msg="+salida1); 
                 }      
               else if (request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Eliminar")){
                       String salida1=contdao.EliminarUsuarios(contrdto);
                       response.sendRedirect("TablaUsuarios.jsp?msg="+salida1); 
                 }
        }catch (SQLException ex){
                v_que_va_a_retornar = ex.getMessage(); 
            } 
        if(v_que_va_a_retornar.equals("")){
            v_que_va_a_retornar = "OK"; 
        }
        out.print(v_que_va_a_retornar); 
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
        } catch (NamingException ex) {
            Logger.getLogger(RegistroCtrol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroCtrol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegistroCtrol.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (NamingException ex) {
            Logger.getLogger(RegistroCtrol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistroCtrol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(RegistroCtrol.class.getName()).log(Level.SEVERE, null, ex);
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
