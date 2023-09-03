
package Model;

public class Matera {
    //Atributos
    private int codigo;
    private String nombre;
    private String material;
    private float tamaño;
    private int precio;

    public Matera(int codigo, String nombre, String material, float tamaño, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.material = material;
        this.tamaño = tamaño;
        this.precio = precio;
    }
    
    public Matera() {
        this.codigo = 0;
        this.nombre = "";
        this.material = "";
        this.tamaño = 0;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}
