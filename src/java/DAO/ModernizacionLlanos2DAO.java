/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ModernizacionLlanos2DTO;
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
public class ModernizacionLlanos2DAO {
    
PreparedStatement ps = null;
ResultSet rs = null;
ModernizacionLlanos2DTO objlogin = new ModernizacionLlanos2DTO();
ArrayList<ModernizacionLlanos2DTO> ArregloUsuario = new ArrayList<ModernizacionLlanos2DTO>(); 
private int rol;
private int opcion = 0; 

    public ModernizacionLlanos2DAO() {
    }

//consulta de datos, se pasa el parametro pr para hacer la busqueda    
public ModernizacionLlanos2DTO getConsulta(int pr) throws SQLException, NamingException, Exception {
        

        ModernizacionLlanos2DTO contdto = null;
       
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM modernizacionllanos2 WHERE (pr = ? )");
        ps.setInt(1, pr);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ModernizacionLlanos2DTO();
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
            contdto.setIdMODERNIZACIONLLANOS2(pr);
        }
        return contdto;
    }

//consulta de datos, se pasa el parametro id para hacer la busqueda    
public ModernizacionLlanos2DTO getPorID(int idMODERNIZACIONLLANOS2) throws SQLException, NamingException, Exception {
        
        ModernizacionLlanos2DTO contdto = null;  
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM modernizacionllanos2 WHERE (idMODERNIZACIONLLANOS2 = ? )");
        ps.setInt(1, idMODERNIZACIONLLANOS2);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ModernizacionLlanos2DTO();
            contdto.setCentral(resul.getString("central"));
            contdto.setDistrito(resul.getInt("distrito"));
            contdto.setPr(resul.getInt("pr"));
            contdto.setTema(resul.getString("tema"));
            contdto.setCostocontrato(resul.getInt("costocontrato"));
            contdto.setCostoproyecto(resul.getInt("costoproyecto"));
            contdto.setPares(resul.getInt("pares"));
            contdto.setEstado(resul.getString("estado"));
            contdto.setFechaentrega(resul.getString("fechaentrega"));
            contdto.setInicioprogramado(resul.getString("inicioprogramado"));
            contdto.setFinprogramado(resul.getString("finprogramado"));
            contdto.setAvance(resul.getString("avance"));
            contdto.setFechareporte(resul.getString("fechareporte"));
            contdto.setMesfacturacion(resul.getString("mesfacturacion"));
            contdto.setContratista(resul.getString("contratista"));
            contdto.setUSUARIOS_idUSUARIOS(resul.getInt("USUARIOS_idUSUARIOS"));
            contdto.setIdMODERNIZACIONLLANOS2(idMODERNIZACIONLLANOS2);
        }
        return contdto;
    }

//crear registro modernizacion llanos 2
public String crearModernizacionLlanos2(ModernizacionLlanos2DTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `modernizacionllanos2` (`central`, `distrito`, `pr`, `tema`, `costocontrato`, `costoproyecto`, `pares`, `estado`, `fechaentrega`, `inicioprogramado`, `finprogramado`, `avance`, `fechareporte`, `mesfacturacion`, `contratista`, `USUARIOS_idUSUARIOS`)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, contrdto.getCentral());
            ps.setInt(2, contrdto.getDistrito());
            ps.setInt(3, contrdto.getPr());
            ps.setString(4, contrdto.getTema());
            ps.setInt(5, contrdto.getCostocontrato());
            ps.setInt(6, contrdto.getCostoproyecto());
            ps.setInt(7, contrdto.getPares());
            ps.setString(8, contrdto.getEstado());
            ps.setString(9, contrdto.getFechaentrega());
            ps.setString(10, contrdto.getInicioprogramado());
            ps.setString(11, contrdto.getFinprogramado());
            ps.setString(12, contrdto.getAvance());
            ps.setString(13, contrdto.getFechareporte());
            ps.setString(14, contrdto.getMesfacturacion());
            ps.setString(15, contrdto.getContratista());
            ps.setInt(16, contrdto.getUSUARIOS_idUSUARIOS());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion De Renovacion Red Llanos  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Renovacion Red Llanos  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Renovacion Red Llanos Ya Existe";
        }
        return Respuesta;
    }

//modificar registro modernizacion llanos 2
public String ModificarModernizacionLlanos2(ModernizacionLlanos2DTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE modernizacionllanos2 SET central = ?, distrito = ?, pr = ?, tema = ?, costocontrato = ?, costoproyecto = ?, pares = ?, estado = ?, fechaentrega = ?, inicioprogramado = ?, finprogramado = ?, avance = ?, fechareporte = ?, mesfacturacion = ?, contratista = ?, USUARIOS_idUSUARIOS = ?   WHERE (idMODERNIZACIONLLANOS2 = ?)");
            
            ps.setString(1, contrdto.getCentral());
            ps.setInt(2, contrdto.getDistrito());
            ps.setInt(3, contrdto.getPr());
            ps.setString(4, contrdto.getTema());
            ps.setInt(5, contrdto.getCostocontrato());
            ps.setInt(6, contrdto.getCostoproyecto());
            ps.setInt(7, contrdto.getPares());
            ps.setString(8, contrdto.getEstado());
            ps.setString(9, contrdto.getFechaentrega());
            ps.setString(10, contrdto.getInicioprogramado());
            ps.setString(11, contrdto.getFinprogramado());
            ps.setString(12, contrdto.getAvance());
            ps.setString(13, contrdto.getFechareporte());
            ps.setString(14, contrdto.getMesfacturacion());
            ps.setString(15, contrdto.getContratista());
            ps.setInt(16, contrdto.getUSUARIOS_idUSUARIOS());
            ps.setInt(17, contrdto.getIdMODERNIZACIONLLANOS2());
                      
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Renovacion Red Llanos  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Renovacion Red Llanos  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Renovacion Red Llanos Ya Existe";
        }
        return Respuesta;
    }
//eliminar registro modernizacion llanos 2
public String EliminarModernizacionLlanos2(ModernizacionLlanos2DTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from modernizacionllanos2  where idMODERNIZACIONLLANOS2= " + contrdto.getIdMODERNIZACIONLLANOS2());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Renovacion Red Llanos Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Renovacion Red Llanos Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Renovacion Red Llanos Ya Existe";
        }
        return Respuesta;
    }
//muestra datos en una tabla, para la busqueda se pasa el parametro filtro
public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {    
        Connection cnn = Conectar.getInstace();     
        String sql = "SELECT * FROM modernizacionllanos2 where  pr  like '%"+ filtro+"%'";
        return cnn.createStatement().executeQuery(sql);
    }
//muestra datos en una tabla, para la busqueda se pasa el parametro filtro, para hacer el conteo de paginas se pasa el parametro page
public ResultSet getTabla2(String filtro, int page) throws Exception {
        Connection cnn = Conectar.getInstace();
        String fil = "where pr like '" + filtro + "%'";
        String limit = "  limit " + ((page== 1||page==0?0:page-1) * 10) + ",10";
        if(filtro.equals("")) fil= "";
        else {
            //limit="";
        }
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM modernizacionllanos2 "+fil+ limit;
        return cnn.createStatement().executeQuery(sql);
    }
    //cuenta el total de registros
    public int getTotalRegistro(Boolean filtrado)throws Exception{
        String sql = "select count(central)as t from modernizacionllanos2";
        if(filtrado)sql= "SELECT FOUND_ROWS() as t";
        Connection cnn = Conectar.getInstace();
        ResultSet t= cnn.createStatement().executeQuery(sql);
        t.next();
        return t.getInt("t");
    }

//verifica si el id se encuentra registrado en la base de datos
public Boolean Exists(String idMODERNIZACIONLLANOS2) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM modernizacionllanos2 where idMODERNIZACIONLLANOS2="+idMODERNIZACIONLLANOS2);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }

//muestra datos en arreglo
public ArrayList<ModernizacionLlanos2DTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  modernizacionllanos2");
            rs = ps.executeQuery();
            while (rs.next()){
            ModernizacionLlanos2DTO objl = new ModernizacionLlanos2DTO();
            objl.setIdMODERNIZACIONLLANOS2(rs.getInt("idMODERNIZACIONLLANOS2"));
            objl.setCentral(rs.getString("central"));
            objl.setDistrito(rs.getInt("distrito"));
            objl.setPr(rs.getInt("pr"));
            objl.setTema(rs.getString("tema"));
            objl.setCostocontrato(rs.getInt("costocontrato"));
            objl.setCostoproyecto(rs.getInt("costoproyecto"));
            objl.setPares(rs.getInt("pares"));
            objl.setEstado(rs.getString("estado"));
            objl.setFechaentrega(rs.getString("fechaentrega"));
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
