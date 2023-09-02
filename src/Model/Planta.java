/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 57301
 */
public class Planta {
    //Atributos
    private int codigo;
    private String nombre;
    private String cuidados;
    //tolerante a sol o sombra
    private String tolerancia;
    private float precio;

    public Planta(byte codigo, String nombre, String cuidados, String tolerancia, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cuidados = cuidados;
        this.tolerancia = tolerancia;
        this.precio = precio;
    }

    public Planta() {
        this.codigo = 0;
        this.nombre = "";
        this.cuidados = "";
        this.tolerancia = "";
        this.precio = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuidados() {
        return cuidados;
    }

    public void setCuidados(String cuidados) {
        this.cuidados = cuidados;
    }

    public String getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(String tolerancia) {
        this.tolerancia = tolerancia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
}
