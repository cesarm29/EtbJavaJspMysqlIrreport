/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author cesar1
 */
public class UsuariosDTO {
    //se definen los datos
    private int idUSUARIOS=0;
    private String nombres="";
    private String apellidos="";
    private String userName="";
    private String password="";
    private int estado=0;
    private String mensaje;
    //constructor vacio
    public UsuariosDTO() {
    }
    //constructor con datos
    public UsuariosDTO(int idUSUARIOS, String nombres, String apellidos, String userName, String password, int estado, String mensaje) {
        this.idUSUARIOS = idUSUARIOS;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.userName = userName;
        this.password = password;
        this.estado = estado;
        this.mensaje = mensaje;
    }
    
        //get y set datos

    /**
     * @return the idUSUARIOS
     */
    public int getIdUSUARIOS() {
        return idUSUARIOS;
    }

    /**
     * @param idUSUARIOS the idUSUARIOS to set
     */
    public void setIdUSUARIOS(int idUSUARIOS) {
        this.idUSUARIOS = idUSUARIOS;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
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
