/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import bean.Clima;
import dao.ClimaDao;
import java.util.List;

/**
 *
 * @author hernan.liotta
 */
public class ClimaService {

    public ClimaService() {
    }
    
    
    
        public String obtenerClimaSemana(int idPais, int idCiudad){
        ClimaDao cd = new ClimaDao();
        List<Clima> lc = cd.obtenerClimaSemana(idPais, idCiudad);
        //No es el mejor lugar (capa incorrecta) pero la realidad es que el tiempo me apremia y deseo entregar         
        
        
        String res ="<div class='row'>"+
            "<div class='col-lg-2 col-lg-offset-2 col-md-2 col-md-offset-2 col-xs-12 col-sm-12'>" +
                "<div class='panel' style='border-right: 1px solid gray;text-align: center'>" + 
                    "<label>"+lc.get(0).getDia()+"</label><br/>"+
                    "<image src=img\'"+lc.get(0).getEstadoCielo()+".png"+"'></image><br/>"+
                    "<label>"+lc.get(0).getTemperatura()+ "</label><br/>"+
                    "<label>"+lc.get(0).getPresion()+ "</label>"+
                "</div>"+
            "</div>"
                +
                        "<div class='col-lg-2 col-md-2 col-xs-12 col-sm-12'>" +
                "<div class='panel' style='border-right: 1px solid gray;text-align: center'>" + 
                    "<label>"+lc.get(1).getDia()+"</label><br/>"+
                    "<image src=img\'"+lc.get(1).getEstadoCielo()+".png"+"'></image><br/>"+
                    "<label>"+lc.get(1).getTemperatura()+ "</label><br/>"+
                    "<label>"+lc.get(1).getPresion()+ "</label>"+
                "</div>"+
            "</div>"+
                        "<div class='col-lg-2 col-md-2 col-xs-12 col-sm-12'>" +
                "<div class='panel' style='border-right: 1px solid gray;text-align: center'>" + 
                    "<label>"+lc.get(2).getDia()+"</label><br/>"+
                    "<image src=img\'"+lc.get(2).getEstadoCielo()+".png"+"'></image><br/>"+
                    "<label>"+lc.get(2).getTemperatura()+ "</label><br/>"+
                    "<label>"+lc.get(2).getPresion()+ "</label>"+
                "</div>"+
            "</div>"+
                        "<div class='col-lg-2 col-md-2 col-xs-12 col-sm-12'>" +
                "<div class='panel' style='border-right: 1px solid gray;text-align: center'>" + 
                    "<label>"+lc.get(3).getDia()+"</label><br/>"+
                    "<image src=img\'"+lc.get(3).getEstadoCielo()+".png"+"'></image><br/>"+
                    "<label>"+lc.get(3).getTemperatura()+ "</label><br/>"+
                    "<label>"+lc.get(3).getPresion()+ "</label>"+
                "</div>"+
            "</div>"+
                        "<div class='col-lg-2 col-md-2 col-xs-12 col-sm-12'>" +
                "<div class='panel' style='border-right: 1px solid gray;text-align: center'>" + 
                    "<label>"+lc.get(4).getDia()+"</label><br/>"+
                    "<image src=img\'"+lc.get(4).getEstadoCielo()+".png"+"'></image><br/>"+
                    "<label>"+lc.get(4).getTemperatura()+ "</label><br/>"+
                    "<label>"+lc.get(4).getPresion()+ "</label>"+
                "</div>"+
            "</div>"+
        "</div>" +
    "</div>";

        return res;
    } 

    public String obtenerClimaHoy(int idPais, int idCiudad){
        ClimaDao cd = new ClimaDao();
        Clima c = cd.obtenerClimaHoy(idPais, idCiudad);
        
        return"";
    } 
}
