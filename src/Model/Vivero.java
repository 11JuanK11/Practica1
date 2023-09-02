/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 57301
 */
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
