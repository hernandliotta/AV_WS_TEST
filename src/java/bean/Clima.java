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
public class Clima {
    private String dia;
    private String estadoCielo;
    private int temperatura;
    private int presion;
    private float precipitaciones ;
    private float humedad;
    private float viento;

    public Clima() {
    }

    public Clima(String dia, String estadoCielo, int temperatura, int presion, float precipitaciones, float humedad, float viento) {
        this.dia = dia;
        this.estadoCielo = estadoCielo;
        this.temperatura = temperatura;
        this.presion = presion;
        this.precipitaciones = precipitaciones;
        this.humedad = humedad;
        this.viento = viento;
    }

    public String getDia() {
        return dia;
    }

    public String getEstadoCielo() {
        return estadoCielo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public int getPresion() {
        return presion;
    }

    public float getPrecipitaciones() {
        return precipitaciones;
    }

    public float getHumedad() {
        return humedad;
    }

    public float getViento() {
        return viento;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setEstadoCielo(String estadoCielo) {
        this.estadoCielo = estadoCielo;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public void setPrecipitaciones(float precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public void setViento(float viento) {
        this.viento = viento;
    }
    
    
}
