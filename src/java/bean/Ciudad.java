/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author hernan.liotta
 */
public class Ciudad {
    private int idCiudad;
    private int idPais;
    private String nombre;

    public Ciudad(int idCiudad, int idPais, String nombre) {
        this.idCiudad = idCiudad;
        this.idPais = idPais;
        this.nombre = nombre;
    }

    

    public int getIdCiudad() {
        return idCiudad;
    }

    public int getIdPais() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
