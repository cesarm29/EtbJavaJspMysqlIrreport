/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ProyectoDTO;
import bd.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.NamingException;

/**
 *
 * @author cesar1
 */
public class ProyectoDAO{ 

PreparedStatement ps = null;
ResultSet rs = null;
ProyectoDTO objlogin = new ProyectoDTO();
ArrayList<ProyectoDTO> ArregloUsuario = new ArrayList<ProyectoDTO>(); 
private int rol;
private int opcion = 0;

public ProyectoDAO() {
}
//consulta de datos, la busqueda se hace pasando el parametro pr
public ProyectoDTO getConsulta(int pr) throws SQLException, NamingException, Exception {
        
        ProyectoDTO contdto = null;
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM proyectos WHERE (pr = ? )");
        ps.setInt(1, pr);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ProyectoDTO();
            contdto.setCentral(resul.getString("central"));
            contdto.setDistrito(resul.getInt("distrito"));
            contdto.setPr(resul.getInt("pr"));
            contdto.setTema(resul.getString("tema"));
            contdto.setCostocontrato(resul.getInt("costocontrato"));
            contdto.setCostoproyecto(resul.getInt("costoproyecto"));
            contdto.setPares(resul.getInt("pares"));
            contdto.setEstado(resul.getString("estado"));
            contdto.setInicioprogramado(resul.getString("inicioprogramado"));
            contdto.setFinprogramado(resul.getString("finprogramado"));
            contdto.setAvance(resul.getString("avance"));
            contdto.setFechareporte(resul.getString("fechareporte"));
            contdto.setMesfacturacion(resul.getString("mesfacturacion"));
            contdto.setContratista(resul.getString("contratista"));
            contdto.setUSUARIOS_idUSUARIOS(resul.getInt("USUARIOS_idUSUARIOS"));
            contdto.setIdPROYECTOS(pr);
        }
        return contdto;
    }
//consulta de datos, la busqueda se hace pasando el parametro id
public ProyectoDTO getPorID(int idPROYECTOS) throws SQLException, NamingException, Exception {
        
        ProyectoDTO contdto = null;
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM proyectos WHERE (idPROYECTOS = ? )");
        ps.setInt(1, idPROYECTOS);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ProyectoDTO();
            contdto.setCentral(resul.getString("central"));
            contdto.setDistrito(resul.getInt("distrito"));
            contdto.setPr(resul.getInt("pr"));
            contdto.setTema(resul.getString("tema"));
            contdto.setCostocontrato(resul.getInt("costocontrato"));
            contdto.setCostoproyecto(resul.getInt("costoproyecto"));
            contdto.setPares(resul.getInt("pares"));
            contdto.setEstado(resul.getString("estado"));
            contdto.setInicioprogramado(resul.getString("inicioprogramado"));
            contdto.setFinprogramado(resul.getString("finprogramado"));
            contdto.setAvance(resul.getString("avance"));
            contdto.setFechareporte(resul.getString("fechareporte"));
            contdto.setMesfacturacion(resul.getString("mesfacturacion"));
            contdto.setContratista(resul.getString("contratista"));
            contdto.setUSUARIOS_idUSUARIOS(resul.getInt("USUARIOS_idUSUARIOS"));
            contdto.setIdPROYECTOS(idPROYECTOS);
        }
        return contdto;
    }
//crea registro proyecto
public String crearProyecto(ProyectoDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();     
        try{
            ps = cnn.prepareStatement("INSERT INTO `proyectos` (`central`, `distrito`, `pr`, `tema`, `costocontrato`, `costoproyecto`, `pares`, `estado`,`inicioprogramado`, `finprogramado`, `avance`, `fechareporte`, `mesfacturacion`, `contratista`, `USUARIOS_idUSUARIOS`)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1, contrdto.getCentral());
            ps.setInt(2, contrdto.getDistrito());
            ps.setInt(3, contrdto.getPr());
            ps.setString(4, contrdto.getTema());
            ps.setInt(5, contrdto.getCostocontrato());
            ps.setInt(6, contrdto.getCostoproyecto());
            ps.setInt(7, contrdto.getPares());
            ps.setString(8, contrdto.getEstado());
            ps.setString(9, contrdto.getInicioprogramado());
            ps.setString(10, contrdto.getFinprogramado());
            ps.setString(11, contrdto.getAvance());
            ps.setString(12, contrdto.getFechareporte());
            ps.setString(13, contrdto.getMesfacturacion());
            ps.setString(14, contrdto.getContratista());
            ps.setInt(15, contrdto.getUSUARIOS_idUSUARIOS());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion de Construccion Con Demolicion  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion de Construccion Con Demolicion Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Construccion Con Demolicion Ya Existe";
        }
        return Respuesta;
    }

//modificar registro proyecto
public String ModificarProyecto(ProyectoDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE proyectos SET central = ?, distrito = ?, pr = ?, tema = ?, costocontrato = ?, costoproyecto = ?, pares = ?, estado = ?, inicioprogramado = ?, finprogramado = ?, avance = ?, fechareporte = ?, mesfacturacion = ?, contratista = ?, USUARIOS_idUSUARIOS = ?   WHERE (idPROYECTOS = ?)");
            
            ps.setString(1, contrdto.getCentral());
            ps.setInt(2, contrdto.getDistrito());
            ps.setInt(3, contrdto.getPr());
            ps.setString(4, contrdto.getTema());
            ps.setInt(5, contrdto.getCostocontrato());
            ps.setInt(6, contrdto.getCostoproyecto());
            ps.setInt(7, contrdto.getPares());
            ps.setString(8, contrdto.getEstado());
            ps.setString(9, contrdto.getInicioprogramado());
            ps.setString(10, contrdto.getFinprogramado());
            ps.setString(11, contrdto.getAvance());
            ps.setString(12, contrdto.getFechareporte());
            ps.setString(13, contrdto.getMesfacturacion());
            ps.setString(14, contrdto.getContratista());
            ps.setInt(15, contrdto.getUSUARIOS_idUSUARIOS());
            ps.setInt(16, contrdto.getIdPROYECTOS());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Construccion Con Demolicion  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Construccion Con Demolicion  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Construccion Con Demolicion Ya Existe";
        }
        return Respuesta;
    }
//eliminar registro proyecto
public String EliminarProyecto(ProyectoDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from proyectos  where idPROYECTOS= " + contrdto.getIdPROYECTOS());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Construccion Con Demolicion Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Construccion Con Demolicion Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Construccion Con Demolicion Ya Existe";
        }
        return Respuesta;
    }

//mostrar datos en tabla, para la busqueda se pasa el parametro filtro
public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {       
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM proyectos where  pr  like '%"+ filtro+"%'";
        return cnn.createStatement().executeQuery(sql);
    }

//mostrar datos en tabla, para la busqueda se pasa el parametro filtro, para hacer el conteo de paginas se pasa el parametro page 
public ResultSet getTabla2(String filtro, int page) throws Exception {
        Connection cnn = Conectar.getInstace();
        String fil = "where pr like '" + filtro + "%'";
        String limit = "  limit " + ((page== 1||page==0?0:page-1) * 10) + ",10";
        if(filtro.equals("")) fil= "";
        else {
            //limit="";
        }
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM proyectos "+fil+ limit;
        return cnn.createStatement().executeQuery(sql);
    }
    //cuenta el total de registros
    public int getTotalRegistro(Boolean filtrado)throws Exception{
        String sql = "select count(central)as t from proyectos";
        if(filtrado)sql= "SELECT FOUND_ROWS() as t";
        Connection cnn = Conectar.getInstace();
        ResultSet t= cnn.createStatement().executeQuery(sql);
        t.next();
        return t.getInt("t");
    }

//verifica si el id se encuentra registrado en la base de datos
public Boolean Exists(String idPROYECTOS) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM proyectos where idPROYECTOS="+idPROYECTOS);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }
//muestra datos en un arreglo
public ArrayList<ProyectoDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  proyectos");
            rs = ps.executeQuery();
            while (rs.next()){
            ProyectoDTO objl = new ProyectoDTO();
            objl.setIdPROYECTOS(rs.getInt("idPROYECTOS"));
            objl.setCentral(rs.getString("central"));
            objl.setDistrito(rs.getInt("distrito"));
            objl.setPr(rs.getInt("pr"));
            objl.setTema(rs.getString("tema"));
            objl.setCostocontrato(rs.getInt("costocontrato"));
            objl.setCostoproyecto(rs.getInt("costoproyecto"));
            objl.setPares(rs.getInt("pares"));
            objl.setEstado(rs.getString("estado"));
            objl.setInicioprogramado(rs.getString("inicioprogramado"));
            objl.setFinprogramado(rs.getString("finprogramado"));
            objl.setAvance(rs.getString("avance"));
            objl.setFechareporte(rs.getString("fechareporte"));
            objl.setMesfacturacion(rs.getString("mesfacturacion"));
            objl.setContratista(rs.getString("contratista"));
            objl.setUSUARIOS_idUSUARIOS(rs.getInt("USUARIOS_idUSUARIOS"));
            
            ArregloUsuario.add(objl);
            }   
        }
        catch(SQLException ex){
            objlogin.setEstado(ex.getMessage());    
        }   
    return ArregloUsuario;
    }   
}



