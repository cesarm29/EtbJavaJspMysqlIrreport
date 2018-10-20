/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author cesar1
 */
public class RolesDTO extends UsuariosDTO {
    //se definen los datos
    private int idRoles=0;
    private String nombre="";
    private String descripcion="";
    private String mensaje;   
    //constructor vacio
    public RolesDTO() {
    }
    //constructor con datos
    public RolesDTO(int idRoles, String nombre, String descripcion, String mensaje) {
        this.idRoles = idRoles;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.mensaje = mensaje;
    }
       
    //get y set datos
    
    /**
     * @return the idRoles
     */
    public int getIdRoles() {
        return idRoles;
    }

    /**
     * @param idRoles the idRoles to set
     */
    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
    
}
