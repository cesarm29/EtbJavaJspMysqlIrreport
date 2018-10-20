/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.RolesDTO;
import DTO.UsuariosDTO;
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
public class UsuariosDAO {

    PreparedStatement ps = null;
    ResultSet rs = null;
    UsuariosDTO objlogin = new UsuariosDTO();
    ArrayList<UsuariosDTO> ArregloUsuario = new ArrayList<UsuariosDTO>();
    private int rol;
    private int opcion = 0;

    public UsuariosDAO() throws NamingException, SQLException {
    }
//validacion de usuario como parametros se pasan u, p referentes a usuario y contraseña

    public RolesDTO validarUsuario(String u, String p) throws SQLException, NamingException, Exception {

        RolesDTO uvalido = new RolesDTO();
        String salida;
        try {
            Connection cnn = Conectar.getInstace();
            ps = cnn.prepareStatement("SELECT u.username, u.`password`, r.ROLES_idROLES, u.idUSUARIOS FROM usuarios AS u "
                    + "INNER JOIN usuarios_has_roles AS r ON r.USUARIOS_idUSUARIOS = u.idUSUARIOS WHERE\n"
                    + "u.username = ? AND u.`password` = ?");

            ps.setString(1, u);
            ps.setString(2, p);
            rs = ps.executeQuery();

            if (rs.next()) {
                uvalido.setIdRoles(Integer.parseInt(rs.getString("r.ROLES_idRoles")));
                uvalido.setUserName(rs.getString("u.username"));
                uvalido.setNombres(rs.getString("u.username"));
                uvalido.setIdUSUARIOS(Integer.parseInt(rs.getString("u.idUSUARIOS")));
                salida = "QueryOk";
                uvalido.setMensaje(salida);
                rol = uvalido.getIdRoles();
                opcion = 1;
            } else {
                salida = "Error  los datos no son correctos";
                uvalido.setMensaje(salida);
            }
            //<editor-fold defaultstate="collapsed" desc="comment">
        /*if(opcion==1){
             * switch (rol){
             * case 1:
             * ps=cnn.prepareStatement("SELECT u.username, u.`password`, u.Estado, ur.ROLES_idROLES, adm.Nombres, adm.Apellidos \n" +
             * "FROMusuarios AS u\n" +
             * "INNER JOIN usuarios_has_roles AS ur ON ur.USUARIOS_idUSUARIOS = u.idUSUARIOS\n" +
             * "INNER JOIN administrativo AS adm ON u.ADMINISTRATIVO_idADMINISTRATIVO = adm.idADMINISTRATIVO\n" +
             * "WHERE\n" +
             * "u.username = ? AND u.`password` = MD5(?)");
             * ps.setString(1, u);
             * ps.setString(2, p);
             * rs=ps.executeQuery();
             * if (rs.next()){
             * uvalido.setApellidos(rs.getString("adm.Apellidos"));
             * uvalido.setNombres(rs.getString("adm.Nombres"));
             * uvalido.setIdRoles(Integer.parseInt(rs.getString("ur.ROLES_idROLES")));
             * uvalido.setEstado(Integer.parseInt(rs.getString("u.Estado")));
             * uvalido.setUserName(rs.getString("u.username"));
             * salida="QueryOk";
             * uvalido.setMensaje(salida);
             * }else{
             * salida="Error, Datos no válidos";
             * uvalido.setMensaje(salida);
             * }
             * break;
             * case 2:
             * ps=cnn.prepareStatement("SELECT u.username, u.`password`, u.Estado, ur.ROLES_idROLES, adm.Nombres, adm.Apellidos \n" +
             * "FROMusuarios AS u\n" +
             * "INNER JOIN usuarios_has_roles AS ur ON ur.USUARIOS_idUSUARIOS = u.idUSUARIOS\n" +
             * "INNER JOIN administrativo AS adm ON u.ADMINISTRATIVO_idADMINISTRATIVO = adm.idADMINISTRATIVO\n" +
             * "WHERE\n" +
             * "u.username = ? AND u.`password` = MD5(?)");
             * ps.setString(1, u);
             * ps.setString(2, p);
             * rs=ps.executeQuery();
             * if (rs.next()){
             * uvalido.setApellidos(rs.getString("adm.Apellidos"));
             * uvalido.setNombres(rs.getString("adm.Nombres"));
             * uvalido.setIdRoles(Integer.parseInt(rs.getString("ur.ROLES_idROLES")));
             * uvalido.setEstado(Integer.parseInt(rs.getString("u.Estado")));
             * uvalido.setUserName(rs.getString("u.username"));
             * salida="QueryOk";
             * uvalido.setMensaje(salida);
             * }else{
             * salida="Error";
             * uvalido.setMensaje(salida);
             * }
             * break;
             * case 3:
             * ps=cnn.prepareStatement("SELECT u.username, u.`password`, u.Estado, r.ROLES_idROLES, ct.Nombres, ct.Apellidos\n" +
             * "FROM usuarios AS u\n" +
             * "INNER JOIN usuarios_has_roles AS r ON r.USUARIOS_idUSUARIOS = u.idUSUARIOS\n" +
             * "INNER JOIN contrato AS c ON c.USUARIOS_idUSUARIOS = u.idUSUARIOS\n" +
             * "INNER JOIN contratista AS ct ON c.CONTRATISTA_idCONTRATISTA = ct.idCONTRATISTA\n" +
             * "WHERE u.username = ? AND u.`password` = MD5(p)");
             * ps.setString(1, u);
             * ps.setString(2, p);
             * rs=ps.executeQuery();
             * if (rs.next()){
             * uvalido.setApellidos(rs.getString("ct.Apellidos"));
             * uvalido.setNombres(rs.getString("ct.Nombres"));
             * uvalido.setIdRoles(Integer.parseInt(rs.getString("r.ROLES_idROLEES")));
             * uvalido.setEstado(Integer.parseInt(rs.getString("u.Estado")));
             * uvalido.setUserName(rs.getString("u.username"));
             * salida="QueryOk";
             * uvalido.setMensaje(salida);
             * }else{
             * salida="Error";
             * uvalido.setMensaje(salida);
             * }
             * break;
             * default:
             * salida="error";
             * uvalido.setMensaje(salida);
             * break;
             * }
             * }*/
            //</editor-fold>
        } catch (SQLException ex) {
            salida = ex.getMessage();
            uvalido.setMensaje(salida);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return uvalido;
    }
//consulta datos, para la busqueda se pasa como parametro id

    public UsuariosDTO getPorID(int idUSUARIOS) throws SQLException, NamingException, Exception {
        UsuariosDTO contdto = null;
        Connection cnn = Conectar.getInstace();
        ps = cnn.prepareStatement("SELECT * FROM usuarios WHERE (idUSUARIOS = ? ) ");
        ps.setInt(1, idUSUARIOS);
        ResultSet resul = ps.executeQuery();
        while (resul.next()) {
            contdto = new UsuariosDTO();
            contdto.setUserName(resul.getString("username"));
            contdto.setPassword(resul.getString("password"));
            contdto.setNombres(resul.getString("Nombres"));
            contdto.setApellidos(resul.getString("Apellidos"));
            contdto.setIdUSUARIOS(idUSUARIOS);
        }
        return contdto;
    }
//crea registro usuarios   

    public String crearUsuarios(UsuariosDTO contrdto) throws SQLException, NamingException, Exception {

        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("INSERT INTO `usuarios` (`idUSUARIOS`, `username`, `password`, `Nombres`, `Apellidos`,`Estado`)"
                    + " VALUES (?,?,?,?,?,?)");
            ps.setInt(1, contrdto.getIdUSUARIOS());
            ps.setString(2, contrdto.getUserName());
            ps.setString(3, contrdto.getPassword());
            ps.setString(4, contrdto.getNombres());
            ps.setString(5, contrdto.getApellidos());
            ps.setInt(6, contrdto.getEstado());
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion De Usuario  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Usuario Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Usuario Ya Existe";
        }
        return Respuesta;
    }

    //modifico registro usuarios
    public String ModificarUsuarios(UsuariosDTO contrdto) throws SQLException, NamingException, Exception {
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("UPDATE usuarios SET username = ?, password = ?, Nombres = ?, Apellidos = ?, Estado = ?  WHERE idUSUARIOS = ? ");
            ps.setString(1, contrdto.getUserName());
            ps.setString(2, contrdto.getPassword());
            ps.setString(3, contrdto.getNombres());
            ps.setString(4, contrdto.getApellidos());
            ps.setInt(5, contrdto.getEstado());
            ps.setInt(6, contrdto.getIdUSUARIOS());
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Usuario  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Usuario Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Usuario Ya Existe";
        }
        return Respuesta;
    }

    //elimino registro usuarios
    public String EliminarUsuarios(UsuariosDTO contrdto) throws SQLException, NamingException, Exception {
        String Respuesta = "";
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("DELETE FROM usuarios  WHERE idUSUARIOS = " + contrdto.getIdUSUARIOS());
            //ps.setInt(1, contrdto.getIdCONTRATO());
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Usuario  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Usuario Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Usuario Ya Existe";
        }
        return Respuesta;
    }
//muestra datos en tabla, para hacer busqueda se pasa como parametro filtro

    public ResultSet getTabla(String filtro) throws SQLException, NamingException, Exception {
        Connection cnn = Conectar.getInstace();
        String sql = "SELECT * FROM usuarios where Nombres like '%" + filtro + "%'";
        return cnn.createStatement().executeQuery(sql);
    }
//muestra datos en tabla, para hacer busqueda se pasas como parametro filtro, para hacer el conteo de paginas se pasa como parametro page

    public ResultSet getTabla2(String filtro, int page) throws Exception {
        Connection cnn = Conectar.getInstace();
        String fil = "where pr like '" + filtro + "%'";
        String limit = "  limit " + ((page == 1 || page == 0 ? 0 : page - 1) * 10) + ",10";
        if (filtro.equals("")) {
            fil = "";
        } else {
            //limit="";
        }
        String sql = "SELECT SQL_CALC_FOUND_ROWS * FROM usuarios " + fil + limit;
        return cnn.createStatement().executeQuery(sql);
    }
//cuenta el total de registros    

    public int getTotalRegistro(Boolean filtrado) throws Exception {
        String sql = "select count(username)as t from usuarios";
        if (filtrado) {
            sql = "SELECT FOUND_ROWS() as t";
        }
        Connection cnn = Conectar.getInstace();
        ResultSet t = cnn.createStatement().executeQuery(sql);
        t.next();
        return t.getInt("t");
    }

//muestra los datos de roles en una tabla por id
    public ResultSet getgetRoles(String user_id) throws Exception {
        Connection cnn = Conectar.getInstace();
        String sql = "select r.descripcion, r.idRoles, usuarios_idUSUARIOS from  `usuarios_has_roles` as ur inner join `roles` as r "
                + "on r.idROLES = ur.roles_idROLES where usuarios_idUSUARIOS =" + user_id;
        return cnn.createStatement().executeQuery(sql);
    }
//esta parte es para ejecutar sentencia sql

    public void ejecutar(String sql) throws Exception {
        Connection cnn = Conectar.getInstace();
        cnn.createStatement().executeUpdate(sql);
    }
//verifica en la base de datos si el id existe

    public Boolean Exists(String idUSUARIOS) throws Exception {
        Connection cnn = Conectar.getInstace();
        ResultSet r = cnn.createStatement().executeQuery("SELECT * FROM usuarios where idUSUARIOS=" + idUSUARIOS);
        boolean existe = false;
        while (r.next()) {
            existe = true;
        }
        return existe;
    }
//lista todos los datos de los usuarios

    public ArrayList<UsuariosDTO> ListarTodos() throws Exception {
        Connection cnn = Conectar.getInstace();
        try {
            ps = cnn.prepareStatement("SELECT * FROM usuarios");
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuariosDTO objl = new UsuariosDTO();
                objl.setIdUSUARIOS(rs.getInt("idUSUARIOS"));
                objl.setUserName(rs.getString("username"));
                objl.setPassword(rs.getString("password"));
                objl.setNombres(rs.getString("Nombres"));
                objl.setApellidos(rs.getString("Apellidos"));
                ArregloUsuario.add(objl);
            }
        } catch (SQLException ex) {
            objlogin.setNombres(ex.getMessage());
        }
        return ArregloUsuario;
    }
}
