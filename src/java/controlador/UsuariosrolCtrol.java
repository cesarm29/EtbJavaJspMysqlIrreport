/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.UsuariosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cesar1
 */
public class UsuariosrolCtrol extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String msj = "";
        try {
            //nueva instanciacion de UsuariosDAO
            UsuariosDAO dao = new UsuariosDAO();
            //parametros recibidos en formulario
            String accion = request.getParameter("ACCION");
            String id_usu = request.getParameter("IDUsuario");
            String id_rol = request.getParameter("IDRol");
            String sql= "";
            if(accion.equals("AGREGAR")){
                sql = "INSERT INTO usuarios_has_roles VALUES("+id_usu+","+id_rol+")";
                //esto tiene que ejecutar en MYSQL la varialbe sql 
                
            }else if(accion.equals("ELIMINAR")){
                sql  ="delete  from  usuarios_has_roles  where    usuarios_idUSUARIOS =  "+id_usu +" and roles_idROLES = "+id_rol;
                 
                //ejecuta en sql
            }else msj="ACCION NO VALIDA";
             if(!(sql.equals("")))dao.ejecutar(sql);
        } 
        catch(Exception ex)
        {msj = ex.getMessage();
        }finally {            
            
        }
    out.print(msj);
    out.close();
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
        processRequest(request, response);
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
        processRequest(request, response);
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
