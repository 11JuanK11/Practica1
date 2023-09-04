
package View;

import Model.Abono;
import Model.Matera;
import Model.Planta;
import javax.swing.JOptionPane;

public class Procesos {
    private Planta P = new Planta();
    private Abono A = new Abono();
    private Matera M = new Matera();
    
    
    public Planta Crear_P(){
        try {
            P.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codigo de la Planta.")));
            P.setNombre(JOptionPane.showInputDialog("Ingresa el nombre de la Planta."));
            P.setCuidados(JOptionPane.showInputDialog("Ingresa los cuidados de la Planta."));
            P.setTolerancia(JOptionPane.showInputDialog("¿La Planta tolera el sol o la sombra?."));
            P.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio de la Planta.")));
            return P;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresaste un dato equivocado");
            return null;
        }
    }
    
    public Abono Crear_A(){
        try{
            A.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codigo del Abono.")));
            A.setNombre(JOptionPane.showInputDialog("Ingresa el nombre del Abono."));
            A.setDescripcion(JOptionPane.showInputDialog("Ingresa la descripcion del Abono."));
            A.setUtilidad(JOptionPane.showInputDialog("¿Cual es la utilidad del Abono?."));
            A.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio del Abono.")));
            return A;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ingresaste un dato equivocado");
            return null;
        }
    }
    
    public Matera Crear_M(){
        try {
            M.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el codigo de la Matera.")));
            M.setNombre(JOptionPane.showInputDialog("Ingresa el nombre de la Matera."));
            M.setMaterial(JOptionPane.showInputDialog("Ingresa el material de la Matera."));
            M.setTamaño(Float.parseFloat(JOptionPane.showInputDialog("Ingresa el tamaño de la Matera")));
            M.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio de la Matera.")));
            return M;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresaste un dato equivocado");
            return null;
        }
    }
}
