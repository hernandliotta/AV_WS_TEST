/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Ciudad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan.liotta
 */
public class CiudadesDao {

    public CiudadesDao() {
    }
    
    public List<Ciudad> obtenerCiudades(int idPais){
        if (idPais == 1){
            List<Ciudad> ciudades = new ArrayList<>();
            ciudades.add(new Ciudad(1,1,"caba"));
            ciudades.add(new Ciudad(2,1,"La Plata"));
            ciudades.add(new Ciudad(3,1,"Rosario"));
            ciudades.add(new Ciudad(4,1,"Sant Fe"));
            ciudades.add(new Ciudad(5,1,"Cordoba"));
            return ciudades;
        }
        return null;   
    }
    
}
