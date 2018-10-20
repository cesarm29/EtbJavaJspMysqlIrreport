/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author cesar1
 */
public class RiesgoElectricoDTO {
//se definen los datos    
private int idRIESGOELECTRICO=0;
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
    //constructor sin datos
    public RiesgoElectricoDTO() {
    }
    //constructor con datos
    public RiesgoElectricoDTO(int idRIESGOELECTRICO, String central, int distrito, int pr, String tema, int costocontrato, int costoproyecto, int pares, String estado, String fechaentrega, String inicioprogramado, String finprogramado, String avance, String fechareporte, String mesfacturacion, String contratista, int USUARIOS_idUSUARIOS) {
        this.idRIESGOELECTRICO = idRIESGOELECTRICO;
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
    //get y set datos
    
    /**
     * @return the idRIESGOELECTRICO
     */
    public int getIdRIESGOELECTRICO() {
        return idRIESGOELECTRICO;
    }

    /**
     * @param idRIESGOELECTRICO the idRIESGOELECTRICO to set
     */
    public void setIdRIESGOELECTRICO(int idRIESGOELECTRICO) {
        this.idRIESGOELECTRICO = idRIESGOELECTRICO;
    }

    /**
     * @return the central
     */
    public String getCentral() {
        return central;
    }

    /**
     * @param central the central to set
     */
    public void setCentral(String central) {
        this.central = central;
    }

    /**
     * @return the distrito
     */
    public int getDistrito() {
        return distrito;
    }

    /**
     * @param distrito the distrito to set
     */
    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }

    /**
     * @return the pr
     */
    public int getPr() {
        return pr;
    }

    /**
     * @param pr the pr to set
     */
    public void setPr(int pr) {
        this.pr = pr;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the costocontrato
     */
    public int getCostocontrato() {
        return costocontrato;
    }

    /**
     * @param costocontrato the costocontrato to set
     */
    public void setCostocontrato(int costocontrato) {
        this.costocontrato = costocontrato;
    }

    /**
     * @return the costoproyecto
     */
    public int getCostoproyecto() {
        return costoproyecto;
    }

    /**
     * @param costoproyecto the costoproyecto to set
     */
    public void setCostoproyecto(int costoproyecto) {
        this.costoproyecto = costoproyecto;
    }

    /**
     * @return the pares
     */
    public int getPares() {
        return pares;
    }

    /**
     * @param pares the pares to set
     */
    public void setPares(int pares) {
        this.pares = pares;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the fechaentrega
     */
    public String getFechaentrega() {
        return fechaentrega;
    }

    /**
     * @param fechaentrega the fechaentrega to set
     */
    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    /**
     * @return the inicioprogramado
     */
    public String getInicioprogramado() {
        return inicioprogramado;
    }

    /**
     * @param inicioprogramado the inicioprogramado to set
     */
    public void setInicioprogramado(String inicioprogramado) {
        this.inicioprogramado = inicioprogramado;
    }

    /**
     * @return the finprogramado
     */
    public String getFinprogramado() {
        return finprogramado;
    }

    /**
     * @param finprogramado the finprogramado to set
     */
    public void setFinprogramado(String finprogramado) {
        this.finprogramado = finprogramado;
    }

    /**
     * @return the avance
     */
    public String getAvance() {
        return avance;
    }

    /**
     * @param avance the avance to set
     */
    public void setAvance(String avance) {
        this.avance = avance;
    }

    /**
     * @return the fechareporte
     */
    public String getFechareporte() {
        return fechareporte;
    }

    /**
     * @param fechareporte the fechareporte to set
     */
    public void setFechareporte(String fechareporte) {
        this.fechareporte = fechareporte;
    }

    /**
     * @return the mesfacturacion
     */
    public String getMesfacturacion() {
        return mesfacturacion;
    }

    /**
     * @param mesfacturacion the mesfacturacion to set
     */
    public void setMesfacturacion(String mesfacturacion) {
        this.mesfacturacion = mesfacturacion;
    }

    /**
     * @return the contratista
     */
    public String getContratista() {
        return contratista;
    }

    /**
     * @param contratista the contratista to set
     */
    public void setContratista(String contratista) {
        this.contratista = contratista;
    }

    /**
     * @return the USUARIOS_idUSUARIOS
     */
    public int getUSUARIOS_idUSUARIOS() {
        return USUARIOS_idUSUARIOS;
    }

    /**
     * @param USUARIOS_idUSUARIOS the USUARIOS_idUSUARIOS to set
     */
    public void setUSUARIOS_idUSUARIOS(int USUARIOS_idUSUARIOS) {
        this.USUARIOS_idUSUARIOS = USUARIOS_idUSUARIOS;
    }
    
}
