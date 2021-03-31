/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Pais;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hernan.liotta
 */
public class PaisesDao {

    public PaisesDao() {
    }
    
    public List<Pais> obtenerPaises(){
        List<Pais> paises = new ArrayList<Pais>();
        paises.add(new Pais(1,"Argentina"));
        paises.add(new Pais(2,"Brasil"));
        paises.add(new Pais(3,"Chile"));
        return paises;
    }
    
}
