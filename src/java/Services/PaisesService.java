/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import bean.Pais;
import dao.PaisesDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan.liotta
 */
public class PaisesService {
    List<Pais> paises = new ArrayList<>();
    
    public PaisesService() {
    }
    
    public String obtenerPaises(){
        PaisesDao p = new PaisesDao();
        
        return "argentina,Brasil";//p.obtenerPaises().toString()
    }
}
