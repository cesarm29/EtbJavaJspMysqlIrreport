/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AcometidasElectricasDTO;
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
public class AcometidasElectricasDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    AcometidasElectricasDTO objlogin = new AcometidasElectricasDTO();
    ArrayList<AcometidasElectricasDTO> ArregloUsuario = new ArrayList<AcometidasElectricasDTO>();
    private int rol;
    private int opcion = 0;

    public AcometidasElectricasDAO() {
    }
//traigo por consulta datos se pasa parametro pr para filtro
    public AcometidasElectricasDTO getConsulta(int pr) throws SQLException, NamingException, Exception {
        AcometidasElectricasDTO contdto = null;
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM acometidaselectricas WHERE (pr = ? )");
        ps.setInt(1, pr);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new AcometidasElectricasDTO();
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
            contdto.setIdACOMETIDASELECTRICAS(pr);
        }
        return contdto;
    }
// traigo consulta por id
    public AcometidasElectricasDTO getPorID(int idACOMETIDASELECTRICAS) throws SQLException, NamingException, Exception {

        AcometidasElectricasDTO contdto = null;
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM acometidaselectricas WHERE (idACOMETIDASELECTRICAS = ? )");
        ps.setInt(1, idACOMETIDASELECTRICAS);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new AcometidasElectricasDTO();
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
            contdto.setIdACOMETIDASELECTRICAS(idACOMETIDASELECTRICAS);
        }
        return contdto;
    }
//crear registro acometida electrica
    public String crearAcometidaElectrica(AcometidasElectricasDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("INSERT INTO `acometidaselectricas` (`central`, `distrito`, `pr`, `tema`, `costocontrato`, `costoproyecto`, `pares`, `estado`, `fechaentrega`, `inicioprogramado`, `finprogramado`, `avance`, `fechareporte`, `mesfacturacion`, `contratista`, `USUARIOS_idUSUARIOS`)"
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
                Respuesta = "Tu Insersion De Acometida Electrica  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Acometida Electrica Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Acometida Electrica Ya Existe";
        }
        return Respuesta;
    }
// modifica registro acometida electrica
    public String ModificarAcometidaElectrica(AcometidasElectricasDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("UPDATE acometidaselectricas SET central = ?, distrito = ?, pr = ?, tema = ?, costocontrato = ?, costoproyecto = ?, pares = ?, estado = ?, fechaentrega = ?, inicioprogramado = ?, finprogramado = ?, avance = ?, fechareporte = ?, mesfacturacion = ?, contratista = ?, USUARIOS_idUSUARIOS = ?   WHERE (idACOMETIDASELECTRICAS = ?)");
            
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
            ps.setInt(17, contrdto.getIdACOMETIDASELECTRICAS());

            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Acometida Electrica  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Acometida Electrica  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Acometida Electrica Ya Existe";
        }
        return Respuesta;
    }
// elimino registro acometida electrica
    public String EliminarAcometidaElectrica(AcometidasElectricasDTO contrdto) throws Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("delete from acometidaselectricas  where idACOMETIDASELECTRICAS= " + contrdto.getIdACOMETIDASELECTRICAS());
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Acometida Electrica Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Acometida Electrica Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "La Acometida Electrica Ya Existe";
        }
        return Respuesta;
    }
// muestro en tabla todos los datos de la bd, tambien se pasa parametro filtro para buscar informacion
    public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {
        Connection cnn = Conectar.getInstace();    
        String sql = "SELECT * FROM acometidaselectricas where pr like '%" + filtro + "%'";
        return cnn.createStatement().executeQuery(sql);
    }
// muestro en tabla todos los datos de la bd, tambien se pasa parametro filtro y page para que haga cuenta de las paginas.    
    public ResultSet getTabla2(String filtro, int page) throws Exception {
        Connection cnn = Conectar.getInstace();
        String fil = "where pr like '" + filtro + "%'";
        String limit = "  limit " + ((page== 1||page==0?0:page-1) * 10) + ",10";
        if(filtro.equals("")) fil= "";
        else {
            //limit="";
        }
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM acometidaselectricas "+fil+ limit;
        return cnn.createStatement().executeQuery(sql);
    }
   //cuenta el total de los registros  
    public int getTotalRegistro(Boolean filtrado)throws Exception{
        String sql = "select count(central)as t from acometidaselectricas";
        if(filtrado)sql= "SELECT FOUND_ROWS() as t";
        Connection cnn = Conectar.getInstace();
        ResultSet t= cnn.createStatement().executeQuery(sql);
        t.next();
        return t.getInt("t");
    }
    // verifica si existe el registro en la base de datos. como parametro se toma el id
    public Boolean Exists(String idACOMETIDASELECTRICAS) throws Exception {

        Connection cnn = Conectar.getInstace();
        ResultSet r = cnn.createStatement().executeQuery("SELECT * FROM acometidaselectricas where idACOMETIDASELECTRICAS=" + idACOMETIDASELECTRICAS);
        boolean existe = false;
        while (r.next()) {
            existe = true;
        }
        return existe;
    }
//lista todos los datos por medio de un arreglo
    public ArrayList<AcometidasElectricasDTO> ListarTodos() throws Exception {
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("SELECT * FROM  acometidaselectricas");
            rs = ps.executeQuery();
            while (rs.next()) {
                AcometidasElectricasDTO objl = new AcometidasElectricasDTO();
                objl.setIdACOMETIDASELECTRICAS(rs.getInt("idACOMETIDASELECTRICAS"));
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
        } catch (SQLException ex) {
            objlogin.setEstado(ex.getMessage());
        }
        return ArregloUsuario;
    }
}
