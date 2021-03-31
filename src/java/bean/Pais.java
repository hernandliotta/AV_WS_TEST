package bean;
 
public class Pais {
    private int idPais;
    private String nombre;

    public Pais(int idPais, String nombre) {
        this.idPais = idPais;
        this.nombre = nombre;
    }

    public int getIdPais() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
