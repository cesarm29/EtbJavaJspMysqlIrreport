/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ConstruccionBaseDTO;
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
public class ConstruccionBaseDAO {
    
PreparedStatement ps = null;
ResultSet rs = null;
ConstruccionBaseDTO objlogin = new ConstruccionBaseDTO();
ArrayList<ConstruccionBaseDTO> ArregloUsuario = new ArrayList<ConstruccionBaseDTO>(); 
private int rol;
private int opcion = 0;

    public ConstruccionBaseDAO() {
    }

//consulta de datos, se pasa como parametro el pr     
public ConstruccionBaseDTO getConsulta(int pr) throws SQLException, NamingException, Exception {
        
        ConstruccionBaseDTO contdto = null;  
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM construccionbase WHERE (pr = ? )");
        ps.setInt(1, pr);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ConstruccionBaseDTO();
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
            contdto.setIdCONSTRUCCIONBASE(pr);
        }
        return contdto;
    }    

    
//consulta de datos, se pasa como parametro el id    
public ConstruccionBaseDTO getPorID(int idCONSTRUCCIONBASE) throws SQLException, NamingException, Exception {
        
        ConstruccionBaseDTO contdto = null;    
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM construccionbase WHERE (idCONSTRUCCIONBASE = ? )");
        ps.setInt(1, idCONSTRUCCIONBASE);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new ConstruccionBaseDTO();
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
            contdto.setIdCONSTRUCCIONBASE(idCONSTRUCCIONBASE);
        }
        return contdto;
    }
//crea registro construccion base 
public String crearConstruccionBase(ConstruccionBaseDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("INSERT INTO `construccionbase` (`central`, `distrito`, `pr`, `tema`, `costocontrato`, `costoproyecto`, `pares`, `estado`, `fechaentrega`, `inicioprogramado`, `finprogramado`, `avance`, `fechareporte`, `mesfacturacion`, `contratista`, `USUARIOS_idUSUARIOS`)"
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
                Respuesta = "Tu Insersion De Construccion Base  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Construccion Base  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Construccion Base Ya Existe";
        }
        return Respuesta;
    }

// modifica registro construccion base
public String ModificarConstruccionBase(ConstruccionBaseDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("UPDATE construccionbase SET central = ?, distrito = ?, pr = ?, tema = ?, costocontrato = ?, costoproyecto = ?, pares = ?, estado = ?, fechaentrega = ?, inicioprogramado = ?, finprogramado = ?, avance = ?, fechareporte = ?, mesfacturacion = ?, contratista = ?, USUARIOS_idUSUARIOS = ?   WHERE (idCONSTRUCCIONBASE = ?)");
            
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
            ps.setInt(17, contrdto.getIdCONSTRUCCIONBASE());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Construccion Base  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Construccion Base  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Construccion Base Ya Existe";
        }
        return Respuesta;
    }
 
//elimina registro construccion base
public String EliminarConstruccionBase(ConstruccionBaseDTO contrdto) throws Exception {
        
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        
        try{
            ps = cnn.prepareStatement("delete from construccionbase  where idCONSTRUCCIONBASE= " + contrdto.getIdCONSTRUCCIONBASE());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Construccion Base Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Construccion Base Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Construccion Base Ya Existe";
        }
        return Respuesta;
    }
//muestra en una tabla todos los registros, como parametro se pasa filtro 
public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {        
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM construccionbase where pr like '%"+filtro+"%'";
        return cnn.createStatement().executeQuery(sql);
    }
//muestra en una tabla todos los registros, como parametro se pasa filtro, y para el conteo de las paginas se pasa el parametro page
public ResultSet getTabla2(String filtro, int page) throws Exception {
        Connection cnn = Conectar.getInstace();
        String fil = "where pr like '" + filtro + "%'";
        String limit = "  limit " + ((page== 1||page==0?0:page-1) * 10) + ",10";
        if(filtro.equals("")) fil= "";
        else {
            //limit="";
        }
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM construccionbase "+fil+ limit;
        return cnn.createStatement().executeQuery(sql);
    }
    //cuenta el total de registros
    public int getTotalRegistro(Boolean filtrado)throws Exception{
        String sql = "select count(central)as t from construccionbase";
        if(filtrado)sql= "SELECT FOUND_ROWS() as t";
        Connection cnn = Conectar.getInstace();
        ResultSet t= cnn.createStatement().executeQuery(sql);
        t.next();
        return t.getInt("t");
    }

//busca en la base de datos si el id esta registrado
public Boolean Exists(String idCONSTRUCCIONBASE) throws Exception{
            
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM construccionbase where idCONSTRUCCIONBASE="+idCONSTRUCCIONBASE);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }
//muestra datos en arreglo
public ArrayList<ConstruccionBaseDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  construccionbase");
            rs = ps.executeQuery();
            while (rs.next()){
            ConstruccionBaseDTO objl = new ConstruccionBaseDTO();
            objl.setIdCONSTRUCCIONBASE(rs.getInt("idCONSTRUCCIONBASE"));
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
