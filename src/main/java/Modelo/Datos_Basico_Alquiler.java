/*
 * Carlos Steven Portilla Botero
 * 1015473300
 * Ing. Sistemas y telecomunicaciones 
 *   * 
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author user
 */
class Datos_Basico_Alquiler {
    private int id_Alquiler;

    public int getId_Alquiler() {
        return id_Alquiler;
    }

    public void setId_Alquiler(int id_Alquiler) {
        this.id_Alquiler = id_Alquiler;
    }

    public Date getFI() {
        return FI;
    }

    public void setFI(Date FI) {
        this.FI = FI;
    }

    public Date getFF() {
        return FF;
    }

    public void setFF(Date FF) {
        this.FF = FF;
    }

    public int getId_Hotel() {
        return id_Hotel;
    }

    public void setId_Hotel(int id_Hotel) {
        this.id_Hotel = id_Hotel;
    }

    public int getResponsable() {
        return responsable;
    }

    public void setResponsable(int responsable) {
        this.responsable = responsable;
    }

    public int getId_Habitacion() {
        return id_Habitacion;
    }

    public void setId_Habitacion(int id_Habitacion) {
        this.id_Habitacion = id_Habitacion;
    }
    private java.sql.Date FI;
    private java.sql.Date FF;
    private int id_Hotel;
    private int responsable;
    private int id_Habitacion;
}
