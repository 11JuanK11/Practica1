
package View;

import Controller.Logica_General;
import Model.Vivero;
import javax.swing.JOptionPane;

public class Practica1 {

    public static void main(String[] args) {
        int Opc = 0;
        boolean BP = true , BM = true, BA = true;
        Vivero General;
        
        do {
            Opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar Arrays al general. \n"
                    + "2. Cargar información a los Arrays.\n"
                    + "3. Ingresar información adicional. \n"
                    + "4. Toda la información ha sido ingresada. \n"
                    + "5. Salir", "MENÚ PRINCIPAL", 3));

            switch (Opc) {
                case 1:
                    do{
                        Opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar ArrayPlantas. \n"
                        + "2. Ingresar ArrayMateras.\n"
                        + "3. Ingresar ArrayAbonos.\n"
                        + "4. Salir", "MENÚ ARRAYS", 3));

                        switch (Opc){
                            case 1:
                                if (BP){
                                    
                                }
                                break;

                            case 2:
                                if (BM){
                                    
                                }
                                break;

                            case 3: 
                                if (BA){
                                    
                                }
                                break;

                            case 4:
                                break;
                            
                            default:
                                JOptionPane.showInternalMessageDialog(null, "Opción incorrecta.");
                        }
                    }while (Opc != 4);
                    
                    
                    
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4: 
                    Logica_General LG = new Logica_General();
                    //JOptionPane.showInternalMessageDialog(null, LG.InformacionFinal(General));
                    break;

                case 5:
                    break;

                default:
                    JOptionPane.showInternalMessageDialog(null, "Opción incorrecta.");
            }
        } while (Opc != 5);
    }
        
 }
    
