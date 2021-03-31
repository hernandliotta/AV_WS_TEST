/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Clima;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan.liotta
 */
public class ClimaDao {

    public ClimaDao() {
    }
    
    public Clima obtenerClimaHoy(int idPais, int idCiudad){
    //con el id pais y ciudad se debera buscar en las bdd o bien consumir algun servicio que nos de el esta del clina
        Clima c = new Clima();
        //c = conexionDB.GetDataClima(idPais,idCiudad);
        c.setDia("Viernes");
        c.setEstadoCielo("Soleado");
        c.setHumedad(54);
        c.setPrecipitaciones(0);
        c.setPresion(71);
        c.setTemperatura(22);
        c.setViento(10);
        
        return c;
    }
    
    public List<Clima> obtenerClimaSemana(int idPais, int idCiudad){
    //con el id pais y ciudad se debera buscar en las bdd o bien consumir algun servicio que nos de el esta del clina
        List<Clima> lc = new ArrayList<>();
        //c = conexionDB.GetDataClimaSemanal(idPais,idCiudad);
        lc.add(new Clima("Lunes","Nublado",22,71,0,0,0));
        lc.add(new Clima("Martes","Cubierto",22,71,0,0,0));
        lc.add(new Clima("Miercoles","Lluvias",22,71,0,0,0));
        lc.add(new Clima("Jueves","Tormenta",22,71,0,0,0));
        lc.add(new Clima("Viernes","Nieve",22,71,0,0,0));
        
        return lc;
    }
}
