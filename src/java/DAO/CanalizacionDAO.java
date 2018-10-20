/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CanalizacionDTO;
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
public class CanalizacionDAO {

PreparedStatement ps = null;
ResultSet rs = null;
CanalizacionDTO objlogin = new CanalizacionDTO();
ArrayList<CanalizacionDTO> ArregloUsuario = new ArrayList<CanalizacionDTO>(); 
private int rol;
private int opcion = 0;   

    public CanalizacionDAO() {
    }
//consulta de datos, se pasa como parametro pr
public CanalizacionDTO getConsulta(int pr) throws SQLException, NamingException, Exception {
        
        CanalizacionDTO contdto = null; 
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM canalizacion WHERE (pr = ? )");
        ps.setInt(1, pr);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new CanalizacionDTO();
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
            contdto.setIdCANALIZACION(pr);
        }
        return contdto;
    }
    
//consulta de datos, se pasa como parametro id    
public CanalizacionDTO getPorID(int idCANALIZACION) throws SQLException, NamingException, Exception {
        

        CanalizacionDTO contdto = null;
       
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM canalizacion WHERE (idCANALIZACION = ? )");
        ps.setInt(1, idCANALIZACION);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new CanalizacionDTO();
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
            contdto.setIdCANALIZACION(idCANALIZACION);
        }
        return contdto;
    }    
    
//crea registro canalizacion    
public String crearCanalizacion(CanalizacionDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `canalizacion` (`central`, `distrito`, `pr`, `tema`, `costocontrato`, `costoproyecto`, `pares`, `estado`, `fechaentrega`, `inicioprogramado`, `finprogramado`, `avance`, `fechareporte`, `mesfacturacion`, `contratista`, `USUARIOS_idUSUARIOS`)"
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
                Respuesta = "Tu Insersion De Mantenimiento Canalizacion Regionales  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Mantenimiento Canalizacion Regionales Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Mantenimiento Canalizacion Regionales Ya Existe";
        }
        return Respuesta;
    }    
    
//modifica registro canalizacion
public String ModificarCanalizacion(CanalizacionDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE canalizacion SET central = ?, distrito = ?, pr = ?, tema = ?, costocontrato = ?, costoproyecto = ?, pares = ?, estado = ?, fechaentrega = ?, inicioprogramado = ?, finprogramado = ?, avance = ?, fechareporte = ?, mesfacturacion = ?, contratista = ?, USUARIOS_idUSUARIOS = ?   WHERE (idCANALIZACION = ?)");
            
           
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
            ps.setInt(17, contrdto.getIdCANALIZACION());
            
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion Mantenimiento Canalizacion Regionales  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion Mantenimiento Canalizacion Regionales  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Mantenimiento Canalizacion Regionales Ya Existe";
        }
        return Respuesta;
    }
    
    
    //elimina registro canalizacion
    public String EliminarCanalizacion(CanalizacionDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from canalizacion  where idCANALIZACION= " + contrdto.getIdCANALIZACION());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Mantenimiento Canalizacion Regionales Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Mantenimiento Canalizacion Regionales Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Mantenimiento Canalizacion Regionales Ya Existe";
        }
        return Respuesta;
    }
//trae datos en una tabla, se pasa el parametro filtro para la busqueda de los datos
public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {        
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM canalizacion where pr like '%"+filtro+"%'";
        return cnn.createStatement().executeQuery(sql);
    }
//trae datos en una tabla, se pasa el parametro filtro para la busqueda de los datos, el parametro page se usa para contar las paginas
public ResultSet getTabla2(String filtro, int page) throws Exception {
        Connection cnn = Conectar.getInstace();
        String fil = "where pr like '" + filtro + "%'";
        String limit = "  limit " + ((page== 1||page==0?0:page-1) * 10) + ",10";
        if(filtro.equals("")) fil= "";
        else {
            //limit="";
        }
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM canalizacion "+fil+ limit;
        return cnn.createStatement().executeQuery(sql);
    }
    //cuenta el total de registros
    public int getTotalRegistro(Boolean filtrado)throws Exception{
        String sql = "select count(central)as t from canalizacion";
        if(filtrado)sql= "SELECT FOUND_ROWS() as t";
        Connection cnn = Conectar.getInstace();
        ResultSet t= cnn.createStatement().executeQuery(sql);
        t.next();
        return t.getInt("t");
    }
//busca en la base de datos si el id esta registrado
public Boolean Exists(String idCANALIZACION) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM canalizacion where idCANALIZACION="+idCANALIZACION);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }
//muestra todos los datos en un arreglo        
public ArrayList<CanalizacionDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  canalizacion");
            rs = ps.executeQuery();
            while (rs.next()){
            CanalizacionDTO objl = new CanalizacionDTO();
            objl.setIdCANALIZACION(rs.getInt("idCANALIZACION"));
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
