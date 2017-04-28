/*
 * Carlos Steven Portilla Botero
 * 1015473300
 * Ing. Sistemas y telecomunicaciones 
 *   * 
 */
package Modelo;

/**
 *
 * @author user
 */
class Datos_Basico_Grupo {
    private int Id_grupo;
    private int Id_Hotel;
    private int Id_Alquiler;
    private int Num_personas;

    public int getId_grupo() {
        return Id_grupo;
    }

    public void setId_grupo(int Id_grupo) {
        this.Id_grupo = Id_grupo;
    }

    public int getId_Hotel() {
        return Id_Hotel;
    }

    public void setId_Hotel(int Id_Hotel) {
        this.Id_Hotel = Id_Hotel;
    }

    public int getId_Alquiler() {
        return Id_Alquiler;
    }

    public void setId_Alquiler(int Id_Alquiler) {
        this.Id_Alquiler = Id_Alquiler;
    }

    public int getNum_personas() {
        return Num_personas;
    }

    public void setNum_personas(int Num_personas) {
        this.Num_personas = Num_personas;
    }
}
