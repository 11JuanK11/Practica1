
package Model;

public class Abono {
    //código, nombre, descripción, utilidad y precio.
    private int codigo;
    private String nombre;
    private String descripcion;
    private String utilidad;
    private int precio;

    public Abono(int codigo, String nombre, String descripcion, String utilidad, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.utilidad = utilidad;
        this.precio = precio;
    }
    
    public Abono() {
        this.codigo = 0;
        this.nombre = "";
        this.descripcion = "";
        this.utilidad = "";
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
      
}

