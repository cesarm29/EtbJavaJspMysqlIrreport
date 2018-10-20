/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import DAO.ProyectoDAO;
import DTO.ProyectoDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cesar
 */
public class ControlCrearProyecto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
            //Se genera una nueva instancia de ProyectoDAO,ProyectoDTO
            ProyectoDAO acdao=new ProyectoDAO();
            ProyectoDTO actdto=new ProyectoDTO();
            //se pasan los id's del formulario
            actdto.setCentral(request.getParameter("central"));
            actdto.setDistrito(Integer.parseInt(request.getParameter("distrito")));
            actdto.setPr(Integer.parseInt(request.getParameter("pr")));
            actdto.setTema(request.getParameter("tema"));
            actdto.setCostocontrato(Integer.parseInt(request.getParameter("costocontrato")));
            actdto.setCostoproyecto(Integer.parseInt(request.getParameter("costoproyecto")));
            actdto.setPares(Integer.parseInt(request.getParameter("pares")));
            actdto.setEstado(request.getParameter("estado"));
            actdto.setInicioprogramado(request.getParameter("inicioprogramado"));
            actdto.setFinprogramado(request.getParameter("finprogramado"));
            actdto.setAvance(request.getParameter("avance"));
            actdto.setFechareporte(request.getParameter("fechareporte")); 
            actdto.setMesfacturacion(request.getParameter("mesfacturacion"));
            actdto.setContratista(request.getParameter("contratista"));
            actdto.setUSUARIOS_idUSUARIOS(Integer.parseInt(request.getParameter("USUARIOS_idUSUARIOS"))); 
            //condicionales cuando se presione el boton (btnsubmit) en el formulario correspondiente a crear,modificar o eliminar va a la correspondiente accion, la genera y muestra el mensaje en pantalla y se redirecciona al jsp
                if (request.getParameter("btnSubmit") !=null && request.getParameter("btnSubmit").equals("Crear")){
                      
                       String salida1=acdao.crearProyecto(actdto);
                       response.sendRedirect("Tablaproyectos.jsp?msg="+salida1);       
                }  
               else if(request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Modificar")){                 
                        String salida1=acdao.ModificarProyecto(actdto);
                        response.sendRedirect("Tablaproyectos.jsp?msg="+salida1); 

                 }      
               else if (request.getParameter("btnSubmit")!= null && request.getParameter("btnSubmit").equals("Eliminar")){

                        String salida1=acdao.EliminarProyecto(actdto);
                        response.sendRedirect("Tablaproyectos.jsp?msg="+salida1); 
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
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
