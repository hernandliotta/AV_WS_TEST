/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import bean.Ciudad;
import dao.CiudadesDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan.liotta
 */
public class CiudadesService {
    

    public CiudadesService() {
    }
    
    public List<String> obtenerCiudadesXPais(int idpais){
        CiudadesDao ciudades = new CiudadesDao();
        List<Ciudad> c = ciudades.obtenerCiudades(idpais);                
        List<String> res = new ArrayList<>();
        for(int i = 0; i < c.size();i++){
             
            res.add(((Ciudad)c.get(i)).getNombre());
        }
        return res;
    }
    
}
