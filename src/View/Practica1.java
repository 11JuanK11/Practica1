
package View;

import Controller.*;
import Model.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Practica1 {

    public static void main(String[] args) {
        int Opc = 0, Opc2;
        boolean BP = true , BM = true, BA = true;
        Vivero General = new Vivero();
        
        do {
            try {
                Opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar Arrays al general. \n"
                    + "2. Cargar toda la información a los Arrays.\n"
                    + "3. Ingresar información adicional. \n"
                    + "4. Toda la información ha sido ingresada. \n"
                    + "5. Salir", "MENÚ PRINCIPAL", 3));
            } catch (Exception e) {
                Opc = 0;
            }
            switch (Opc) {
                case 1:
                    do{
                        try {
                            Opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar ArrayPlantas. \n"
                            + "2. Ingresar ArrayMateras.\n"
                            + "3. Ingresar ArrayAbonos.\n"
                            + "4. Salir", "MENÚ ARRAYS", 3));
                        } catch (Exception e) {
                            Opc2 = 0;
                        }
                        
                        
                        Logica_General LG = new Logica_General();
                        switch (Opc2){
                            case 1:
                                if (BP){
                                    ArrayList<Planta> P = new ArrayList<>();
                                    General.setCont(General.getEspacio(),"P" );
                                    General.setEspacio((byte)(General.getEspacio()+1));
                                    General.setArraygeneral(LG.Ingresar(General.getArraygeneral(), P));
                                    BP = false;
                                    JOptionPane.showMessageDialog(null, "El Array ha sido ingresado exitosamente.");
                                }else{
                                    JOptionPane.showMessageDialog(null, "El Array ya ha sido ingresado.");
                                }
                                break;

                            case 2:
                                if (BM){
                                    ArrayList<Matera> M = new ArrayList<>();
                                    General.setCont(General.getEspacio(),"M" );
                                    General.setEspacio((byte)(General.getEspacio()+1));
                                    General.setArraygeneral(LG.Ingresar(General.getArraygeneral(), M));
                                    BM = false;
                                    JOptionPane.showMessageDialog(null, "El Array ha sido ingresado exitosamente.");
                                }else{
                                    JOptionPane.showMessageDialog(null, "El Array ya ha sido ingresado.");
                                }
                                break;

                            case 3: 
                                if (BA){
                                    ArrayList<Abono> A = new ArrayList<>();
                                    General.setCont(General.getEspacio(), "A");
                                    General.setEspacio((byte)(General.getEspacio()+1));
                                    General.setArraygeneral(LG.Ingresar(General.getArraygeneral(), A));
                                    BA = false;
                                    JOptionPane.showMessageDialog(null, "El Array ha sido ingresado exitosamente.");
                                }else{
                                    JOptionPane.showMessageDialog(null, "El Array ya ha sido ingresado.");
                                }
                                break;

                            case 4:
                                break;
                            
                            default:
                                JOptionPane.showInternalMessageDialog(null, "Opción incorrecta.");
                        }
                    }while (Opc2 != 4);
                    break;

                case 2:
                    if (General.getEspacio() == 3){
                        //Para Plantas
                        Archivos_Plantas RAP = new Archivos_Plantas();
                        ArrayList ArrayR = General.getArraygeneral();

                        int PosPB = RAP.BuscarPos(General);
                        ArrayR.set(PosPB, RAP.Recuperar_Info((ArrayList<Planta>) ArrayR.get(PosPB)));
                        General.setArraygeneral(ArrayR);

                        //Para Materas
                        Archivos_Materas RAM = new Archivos_Materas();
                        ArrayList Array1R = General.getArraygeneral();

                        int PosMB = RAM.BuscarPos(General);
                        Array1R.set(PosMB, RAM.Recuperar_Info((ArrayList<Matera>) ArrayR.get(PosMB)));
                        General.setArraygeneral(Array1R);

                        //Para Abonos
                        Archivos_Abonos RAA = new Archivos_Abonos();
                        ArrayList Array2R = General.getArraygeneral();

                        int PosAB = RAA.BuscarPos(General);
                        Array2R.set(PosAB, RAA.Recuperar_Info((ArrayList<Abono>) ArrayR.get(PosAB)));
                        General.setArraygeneral(Array2R);
                        JOptionPane.showInternalMessageDialog(null, "Toda la información ha sido guardada.");
                    }else{
                        JOptionPane.showInternalMessageDialog(null, "No se ha ingresado todos los Arrays.");
                    }
                    break;

                case 3:
                    if (General.getEspacio() > 0){
                        do{
                            try {
                                Opc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Ingresar Plantas. \n"
                                + "2. Ingresar Materas.\n"
                                + "3. Ingresar Abonos.\n"
                                + "4. Salir", "MENÚ INGRESAR", 3));
                            } catch (Exception e) {
                                Opc2 = 0;
                            }
                        
                        
                        Procesos Pro = new Procesos();
                        switch (Opc2){
                            case 1:
                                Archivos_Plantas AP = new Archivos_Plantas();
                                ArrayList Array = General.getArraygeneral();
                                
                                int PosP = AP.BuscarPos(General);
                                if (PosP != -1){
                                    Array.set(PosP, AP.Ingresar((ArrayList) Array.get(PosP), Pro.Crear_P()));
                                    General.setArraygeneral(Array);
                                    JOptionPane.showInternalMessageDialog(null, "Información Guardada.");
                                }else{
                                    JOptionPane.showInternalMessageDialog(null, "No se ha ingresado el array plantas.");
                                }
                                
                                break;

                            case 2:
                                Archivos_Materas AM = new Archivos_Materas();
                                ArrayList Array1 = General.getArraygeneral();
                                
                                int PosM = AM.BuscarPos(General);
                                if (PosM != -1){
                                    Array1.set(PosM, AM.Ingresar((ArrayList) Array1.get(PosM), Pro.Crear_M()));
                                    General.setArraygeneral(Array1);
                                    JOptionPane.showInternalMessageDialog(null, "Información Guardada.");
                                }else{
                                    JOptionPane.showInternalMessageDialog(null, "No se ha ingresado el array materas.");
                                }
                                break;

                            case 3: 
                                Archivos_Abonos AA = new Archivos_Abonos();
                                ArrayList Array2 = General.getArraygeneral();
                                
                                int PosA = AA.BuscarPos(General);
                                if (PosA != -1){
                                    Array2.set(PosA, AA.Ingresar((ArrayList) Array2.get(PosA), Pro.Crear_A()));
                                    General.setArraygeneral(Array2);
                                    JOptionPane.showInternalMessageDialog(null, "Información Guardada.");
                                }else{
                                    JOptionPane.showInternalMessageDialog(null, "No se ha ingresado el array abonos.");
                                }
                                break;

                            case 4:
                                break;
                            
                            default:
                                JOptionPane.showInternalMessageDialog(null, "Opción incorrecta.");
                        }
                        }while (Opc2 != 4);
                    }else{
                        JOptionPane.showInternalMessageDialog(null, "No se ha ingresado Arrays.");
                    }
                    
                    break;

                case 4: 
                    Logica_General LG = new Logica_General();
                    if (General.getEspacio() == 3){
                        JOptionPane.showInternalMessageDialog(null, LG.InformacionFinal(General));
                    }else{
                        JOptionPane.showInternalMessageDialog(null, "No se ha ingresado todos los Arrays.");
                    }
                    break;

                case 5:
                    break;

                default:
                    JOptionPane.showInternalMessageDialog(null, "Opción incorrecta.");
            }
        } while (Opc != 5);
    }
        
 }
