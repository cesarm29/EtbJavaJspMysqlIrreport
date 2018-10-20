/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author cesar1
 */
public class ArmariosDTO {
    //se define el tipo de variable
    private int idARMARIOS=0;
    private String central="";
    private int distrito=0;
    private int pr=0;
    private String tema="";
    private int costocontrato=0;
    private int costoproyecto=0;
    private int pares=0;
    private String estado="";
    private String fechaentrega="";
    private String inicioprogramado="";
    private String finprogramado="";
    private String avance="";
    private String fechareporte="";
    private String mesfacturacion="";
    private String contratista="";
    private int USUARIOS_idUSUARIOS=0;
    //constructor vacio
    public ArmariosDTO() {
    }
    //constructor con variables
    public ArmariosDTO(int idARMARIOS, String central, int distrito, int pr, String tema, int costocontrato, int costoproyecto, int pares, String estado, String fechaentrega, String inicioprogramado, String finprogramado, String avance, String fechareporte, String mesfacturacion, String contratista, int USUARIOS_idUSUARIOS) {
        this.idARMARIOS = idARMARIOS;
        this.central = central;
        this.distrito = distrito;
        this.pr = pr;
        this.tema = tema;
        this.costocontrato = costocontrato;
        this.costoproyecto = costoproyecto;
        this.pares = pares;
        this.estado = estado;
        this.fechaentrega = fechaentrega;
        this.inicioprogramado = inicioprogramado;
        this.finprogramado = finprogramado;
        this.avance = avance;
        this.fechareporte = fechareporte;
        this.mesfacturacion = mesfacturacion;
        this.contratista = contratista;
        this.USUARIOS_idUSUARIOS = USUARIOS_idUSUARIOS;
    }
    //get y set de datos
    public int getIdARMARIOS() {
        return idARMARIOS;
    }

    public String getCentral() {
        return central;
    }

    public int getDistrito() {
        return distrito;
    }

    public int getPr() {
        return pr;
    }

    public String getTema() {
        return tema;
    }

    public int getCostocontrato() {
        return costocontrato;
    }

    public int getCostoproyecto() {
        return costoproyecto;
    }

    public int getPares() {
        return pares;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public String getInicioprogramado() {
        return inicioprogramado;
    }

    public String getFinprogramado() {
        return finprogramado;
    }

    public String getAvance() {
        return avance;
    }

    public String getFechareporte() {
        return fechareporte;
    }

    public String getMesfacturacion() {
        return mesfacturacion;
    }

    public String getContratista() {
        return contratista;
    }

    public int getUSUARIOS_idUSUARIOS() {
        return USUARIOS_idUSUARIOS;
    }

    public void setIdARMARIOS(int idARMARIOS) {
        this.idARMARIOS = idARMARIOS;
    }

    public void setCentral(String central) {
        this.central = central;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setCostocontrato(int costocontrato) {
        this.costocontrato = costocontrato;
    }

    public void setCostoproyecto(int costoproyecto) {
        this.costoproyecto = costoproyecto;
    }

    public void setPares(int pares) {
        this.pares = pares;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public void setInicioprogramado(String inicioprogramado) {
        this.inicioprogramado = inicioprogramado;
    }

    public void setFinprogramado(String finprogramado) {
        this.finprogramado = finprogramado;
    }

    public void setAvance(String avance) {
        this.avance = avance;
    }

    public void setFechareporte(String fechareporte) {
        this.fechareporte = fechareporte;
    }

    public void setMesfacturacion(String mesfacturacion) {
        this.mesfacturacion = mesfacturacion;
    }

    public void setContratista(String contratista) {
        this.contratista = contratista;
    }

    public void setUSUARIOS_idUSUARIOS(int USUARIOS_idUSUARIOS) {
        this.USUARIOS_idUSUARIOS = USUARIOS_idUSUARIOS;
    }
    
    
    
    
    
    
    
}
