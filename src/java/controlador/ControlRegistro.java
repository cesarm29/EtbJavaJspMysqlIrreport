/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.UsuariosDAO;
import DTO.UsuariosDTO;
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
public class ControlRegistro extends HttpServlet {

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
        String v_que_va_a_retornar = "";
        
        try{
            //Se genera una nueva instancia de UsuariosDAO,UsuariosDTO
            UsuariosDAO acdao=new UsuariosDAO();
            UsuariosDTO actdto=new UsuariosDTO();
            //se pasan los id's del formulario
            String s = request.getParameter("idUSUARIOS");
            actdto.setIdUSUARIOS(Integer.parseInt(request.getParameter("idUSUARIOS")));
            actdto.setUserName(request.getParameter("username"));
            actdto.setPassword(request.getParameter("password"));
            actdto.setNombres(request.getParameter("Nombres"));
            actdto.setApellidos(request.getParameter("Apellidos"));
            actdto.setEstado(Integer.parseInt(request.getParameter("Estado")));
            //condicionales cuando se presione el boton (btnsubmit) en el formulario correspondiente a crear,modificar o eliminar va a la correspondiente accion, la genera y muestra el mensaje en pantalla y se redirecciona al jsp
                if (request.getParameter("btnSubmit") !=null && request.getParameter("btnSubmit").equals("Crear")){
                      
                       String salida1=acdao.crearUsuarios(actdto);
                       response.sendRedirect("TablaUsuarios.jsp?msg="+salida1);       
                }  
               else if(request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Modificar")){                 
                        String salida1=acdao.ModificarUsuarios(actdto);
                        response.sendRedirect("TablaUsuarios.jsp?msg="+salida1); 

                 }      
               else if (request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Eliminar")){

                        String salida1=acdao.EliminarUsuarios(actdto);
                        response.sendRedirect("TablaUsuarios.jsp?msg="+salida1); 
                }                
            }catch (Exception ex){
                out.println(ex.getMessage()); 
            } 
        if(v_que_va_a_retornar.equals("")){
            String salida1 = "OK"; 
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
