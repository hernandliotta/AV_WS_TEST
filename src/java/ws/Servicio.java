/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;


import Services.CiudadesService;
import Services.ClimaService;
import Services.PaisesService;
import bean.Ciudad;
import bean.Pais;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hernan.liotta
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    PaisesService ds = new PaisesService();
    CiudadesService cs = new CiudadesService();
    ClimaService cli = new ClimaService();

    @WebMethod(operationName = "validarUsuario")
    public String validarUsuario(@WebParam(name = "usr") String usr, @WebParam(name = "psw") String psw) {
        //TODO write your implementation code here:
       if(usr.equals("aaa")){
       return "ok";
       }
       else
           return "nok";
    }

    /**
     *
     * @return
     */
    @WebMethod(operationName = "obtenerPaises")
    public String obtenerPaises() {
        //TODO write your implementation code here:
        Gson g = new Gson();
        List<String> L = new ArrayList<>();
        L.add("Argentina");
        L.add("Brasil");
        L.add("Chile");
        
        return g.toJson(L);

        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerCiudades")
    public String obtenerCiudades(@WebParam(name = "pais") int pais) {
        //TODO write your implementation code here:
        Gson g = new Gson();
        List<String> C = cs.obtenerCiudadesXPais(pais+1);
        
         return g.toJson(C);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerClimaHoy")
    public String obtenerClimaHoy(@WebParam(name = "idPais") int idPais, @WebParam(name = "idCiudad") int idCiudad) {
        //TODO write your implementation code here:
        return cli.obtenerClimaHoy(idPais, idCiudad);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "obtenerClimaSemana")
    public String obtenerClimaSemana(@WebParam(name = "idPais") int idPais, @WebParam(name = "idCiudad") int idCiudad) {
        //TODO write your implementation code here:
        return cli.obtenerClimaSemana(idPais, idCiudad);
    }



}
