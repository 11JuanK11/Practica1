
package Model;

public class Planta {
    //Atributos
    private int codigo;
    private String nombre;
    private String cuidados;
    //tolerante a sol o sombra
    private String tolerancia;
    private int precio;

    public Planta(int codigo, String nombre, String cuidados, String tolerancia, int precio) {
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

    public void setCodigo(int codigo) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
       
}
