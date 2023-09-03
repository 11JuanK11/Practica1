
package Model;

import java.util.ArrayList;

public class Vivero {
    
    //Atributos
    private ArrayList<ArrayList<?>> arraygeneral; 
    private String nombre;
    
    
    public Vivero(ArrayList<ArrayList<?>> arraygeneral, String nombre) {
        this.arraygeneral = arraygeneral;
        this.nombre = nombre;
    }
    
    public Vivero() {
        this.arraygeneral = new ArrayList<ArrayList<?>>();
        this.nombre = "";
    }
    
    public ArrayList<ArrayList<?>> getArraygeneral() {
        return arraygeneral;
    }

    public void setArraygeneral(ArrayList<ArrayList<?>> arraygeneral) {
        this.arraygeneral = arraygeneral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
