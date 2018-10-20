/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.RolesDTO;
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

public class RolesDAO {
    PreparedStatement ps;
    ResultSet rs=null;
    ArrayList<RolesDTO> ArregloRoles = new ArrayList<RolesDTO>();
    RolesDTO objlogin = new RolesDTO();
    public RolesDAO() throws NamingException, SQLException {    
    }      
// crea roles
    public String crearRol (RolesDTO  contrdto)throws SQLException, NamingException, Exception {
           
            String Respuesta = "";       
            Connection cnn = Conectar.getInstace();
            try{
            ps=cnn.prepareStatement("INSERT INTO `roles`(`idROLES`, `nombre`, `descripcion`) "
                + "VALUES (?,?,?)");     
            ps.setInt(1, contrdto.getIdRoles());
            ps.setString(2, contrdto.getNombre());
            ps.setString(3, contrdto.getDescripcion());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Insersion De Roles  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Insersion De Roles Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Rol Ya Existe";
        }
        return Respuesta;   
    } 
//modifica roles 
    public String ModificarRol ( RolesDTO ejecudto)throws SQLException, NamingException, Exception {
        
        String Respuesta;
        Connection cnn = Conectar.getInstace();     
        try {            
            ps=cnn.prepareStatement("UPDATE roles set nombre=?, descripcion=? where idROLES=?");
            ps.setString(1, ejecudto.getNombre());
            ps.setString(2, ejecudto.getDescripcion());
            ps.setInt(3, ejecudto.getIdRoles());
            
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Modificacion De Roles  Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Modificacion De Roles  Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Rol Ya Existe";
        }
        return Respuesta;
    }   
//elimina roles   
    public String EliminarRol ( RolesDTO ejecudto)throws SQLException, NamingException, Exception {
        
        String Respuesta;
        Connection cnn = Conectar.getInstace();        
        try {
            ps=cnn.prepareStatement("DELETE FROM roles  WHERE idROLES = " + ejecudto.getIdRoles());
            int result = ps.executeUpdate();
            if (result != 0) {
                Respuesta = "Tu Eliminacion De Roles Ha Sido Exitosa";
            } else {
                Respuesta = "Tu Eliminacion De Roles Ha Fallado";
            }
        } catch (SQLException ex) {
            Respuesta = ex.getMessage();
            Respuesta = "El Rol Ya Existe";
        }
        return Respuesta;
    }
// muestra datos en una tabla, en este caso no se pasan parametros         
    public ResultSet getTabla() throws SQLException, NamingException, Exception{       
        Connection cnn = Conectar.getInstace();
        return cnn.createStatement().executeQuery("SELECT * FROM roles");
}
//consulta de datos, la busqueda se realiza pasandole el paramatro id   
public RolesDTO getPorID (int idROLES)throws SQLException, NamingException, Exception {
    
        RolesDTO contdton=null;     
        Connection cnn = Conectar.getInstace();
        ps=cnn.prepareStatement("SELECT *FROM roles WHERE (idROLES= ? ) ");              
        ps.setInt(1, idROLES);
        ResultSet resul =ps.executeQuery();
        while(resul.next()){
          contdton=new RolesDTO();  
          contdton.setNombre(resul.getString("nombre"));
          contdton.setDescripcion(resul.getString("descripcion"));
          contdton.setIdRoles(idROLES);
        }
        return contdton;
    }
//verifica si el id esta registrado en la base de datos
 public Boolean Exists(String idROLES) throws Exception{
        
        Connection cnn = Conectar.getInstace();
        ResultSet r =  cnn.createStatement().executeQuery("SELECT * FROM roles where idROLES="+idROLES);
        boolean existe = false;
        while (r.next()) {          
          existe = true;
      }
        return existe;
  }
// muestra datos  en un arreglo 
 public ArrayList<RolesDTO>  ListarTodos ()throws Exception{    
       Connection cnn = Conectar.getInstace();
       try {
            ps=cnn.prepareStatement("SELECT * FROM  roles");
            rs = ps.executeQuery();
            while (rs.next()){
            RolesDTO objl = new RolesDTO();
            objl.setIdRoles(rs.getInt("idROLES"));
            objl.setNombre(rs.getString("nombre"));
            objl.setDescripcion(rs.getString("descripcion"));
            ArregloRoles.add(objl);
            }   
        }
        catch(SQLException ex){
            objlogin.setDescripcion(ex.getMessage());    
        }   
    return ArregloRoles;
    } 
}
