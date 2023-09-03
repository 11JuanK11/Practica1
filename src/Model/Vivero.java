
package Model;

import java.util.ArrayList;

public class Vivero {
    
    //Atributos
    private ArrayList<ArrayList<Object>> arraygeneral; 
    private String nombre;
    
    
    public Vivero(ArrayList<ArrayList<Object>> arraygeneral, String nombre) {
        this.arraygeneral = arraygeneral;
        this.nombre = nombre;
    }
    
    public Vivero() {
        this.arraygeneral = null;
        this.nombre = "";
    }
    
    public ArrayList<ArrayList<Object>> getArraygeneral() {
        return arraygeneral;
    }

    public void setArraygeneral(ArrayList<ArrayList<Object>> arraygeneral) {
        this.arraygeneral = arraygeneral;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
