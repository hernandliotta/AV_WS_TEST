/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bean.Ciudad;
import bean.Clima;
import bean.Pais;
import dao.CiudadesDao;
import dao.ClimaDao;
import dao.PaisesDao;
import java.util.List;

/**
 *
 * @author hernan.liotta
 */
public class datosServicios {

    public datosServicios() {
    }
    
    public List<Pais> obtenerPaises(){
        PaisesDao p = new PaisesDao();
        
        return p.obtenerPaises();
    }
    
    public List<Ciudad> obtenerCiudadesXPais(int idpais){
        CiudadesDao c = new CiudadesDao();
        return  c.obtenerCiudades(idpais);
        
    }
    

    
}
