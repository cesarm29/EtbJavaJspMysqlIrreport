/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ModernizacionGirardotDTO;
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
public class ModernizacionGirardotDAO {

PreparedStatement ps = null;
ResultSet rs = null;
ModernizacionGirardotDTO objlogin = new ModernizacionGirardotDTO();
ArrayList<ModernizacionGirardotDTO> ArregloUsuario = new ArrayList<ModernizacionGirardotDTO>(); 
private int rol;
private int opcion = 0;

    public ModernizacionGirardotDAO() {
    }
//consulta de datos, se hace la busqueda pasando el parametro pr 
public ModernizacionGirardotDTO getConsulta(int pr) throws SQLException, NamingException, Exception {
        
        ModernizacionGirardotDTO contdto = null;
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM modernizaciongirardot WHERE (pr = ? )");
        ps.setInt(1, pr);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ModernizacionGirardotDTO();
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
            contdto.setIdMODERNIZACIONGIRARDOT(pr);
        }
        return contdto;
    }
//consulta registro, se filtran los datos por id  
public ModernizacionGirardotDTO getPorID(int idMODERNIZACIONGIRARDOT) throws SQLException, NamingException, Exception {
        
        ModernizacionGirardotDTO contdto = null;
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM modernizaciongirardot WHERE (idMODERNIZACIONGIRARDOT = ? )");
        ps.setInt(1, idMODERNIZACIONGIRARDOT);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ModernizacionGirardotDTO();
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
            contdto.setIdMODERNIZACIONGIRARDOT(idMODERNIZACIONGIRARDOT);
        }
        return contdto;
    }
//crea registro modernizacion girardot
public String crearModernizacionGirardot(ModernizacionGirardotDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `modernizaciongirardot` (`central`, `distrito`, `pr`, `tema`, `costocontrato`, `costoproyecto`, `pares`, `estado`, `fechaentrega`, `inicioprogramado`, `finprogramado`, `avance`, `fechareporte`, `mesfacturacion`, `contratista`, `USUARIOS_idUSUARIOS`)"
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
                Respuesta = "Tu Insersion De Modernizacion Girardot  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Modernizacion Girardot  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Modernizacion Girardot Ya Existe";
        }
        return Respuesta;
    }
//modificar registro modernizacion girardot
public String ModificarModernizacionGirardot(ModernizacionGirardotDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE modernizaciongirardot SET central = ?, distrito = ?, pr = ?, tema = ?, costocontrato = ?, costoproyecto = ?, pares = ?, estado = ?, fechaentrega = ?, inicioprogramado = ?, finprogramado = ?, avance = ?, fechareporte = ?, mesfacturacion = ?, contratista = ?, USUARIOS_idUSUARIOS = ?   WHERE (idMODERNIZACIONGIRARDOT = ?)");
            
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
            ps.setInt(17, contrdto.getIdMODERNIZACIONGIRARDOT());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Modernizacion Girardot  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Modernizacion Girardot  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Modificacion Girardot Ya Existe";
        }
        return Respuesta;
    }
//eliminar registro modernizacion girardot
public String EliminarModernizacionGirardot(ModernizacionGirardotDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from modernizaciongirardot  where idMODERNIZACIONGIRARDOT= " + contrdto.getIdMODERNIZACIONGIRARDOT());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Modernizacion Girardot Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Modernizacion Girardot Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Modernizacion Llanos Ya Existe";
        }
        return Respuesta;
    }
//muestra datos en una tabla, para hacer la busqueda se pasa como parametro filtro
public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {
        
        Connection cnn = Conectar.getInstace();
        
        String sql = "SELECT * FROM modernizaciongirardot where pr like '%"+filtro+"%'";
        
        return cnn.createStatement().executeQuery(sql);
    }
//muestra datos en una tabla, para hacer la busqueda se pasa como parametro filtro, para hacer el conteo de las paginas se pasa como parametro page
public ResultSet getTabla2(String filtro, int page) throws Exception {
        Connection cnn = Conectar.getInstace();
        String fil = "where pr like '" + filtro + "%'";
        String limit = "  limit " + ((page== 1||page==0?0:page-1) * 10) + ",10";
        if(filtro.equals("")) fil= "";
        else {
            //limit="";
        }
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM modernizaciongirardot "+fil+ limit;
        return cnn.createStatement().executeQuery(sql);
    }
    //cuenta el total de registros
    public int getTotalRegistro(Boolean filtrado)throws Exception{
        String sql = "select count(central)as t from modernizaciongirardot";
        if(filtrado)sql= "SELECT FOUND_ROWS() as t";
        Connection cnn = Conectar.getInstace();
        ResultSet t= cnn.createStatement().executeQuery(sql);
        t.next();
        return t.getInt("t");
    }

//verifica si el id se encuentra registrado en la base de datos
public Boolean Exists(String idMODERNIZACIONGIRARDOT) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM modernizaciongirardot where idMODERNIZACIONGIRARDOT="+idMODERNIZACIONGIRARDOT);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }

//muestra datos con arreglo
public ArrayList<ModernizacionGirardotDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  modernizaciongirardot");
            rs = ps.executeQuery();
            while (rs.next()){
            ModernizacionGirardotDTO objl = new ModernizacionGirardotDTO();
            objl.setIdMODERNIZACIONGIRARDOT(rs.getInt("idMODERNIZACIONGIRARDOT"));
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
