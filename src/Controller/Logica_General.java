
package Controller;

import Model.*;
import java.util.ArrayList;

public class Logica_General {
    
    Archivos_Plantas AP = new Archivos_Plantas();
    Archivos_Materas AM = new Archivos_Materas();
    Archivos_Abonos AA = new Archivos_Abonos();
    
    public ArrayList Ingresar( ArrayList general, ArrayList productos){
        general.add(productos);
        return general;
    } 
    
    public String PreciosBajos(Vivero General){
        String S = "";
        Planta P = new Planta();
        
        Matera M = new Matera();
        try {
            for (int i = 0; i < General.getArraygeneral().size(); i++) {
            //Compara la clase del arraylist en la posición i con el arraylist que se creo anterior.
            if (General.getArraygeneral().get(i).get(0).getClass().equals(P.getClass())){
                    S += AP.ValorMenor(General.getArraygeneral().get(i));
            }else{
                if (General.getArraygeneral().get(i).get(0).getClass().equals(M.getClass())){
                    S += AM.ValorMenor(General.getArraygeneral().get(i));
                }else{
                    S += AA.ValorMenor(General.getArraygeneral().get(i));
                }
            }
        }
        } catch (Exception e) {}

        return S;
    }
    
    //Mostrar últimos puntos
    public String InformacionFinal(Vivero General){
        String S = "";
        Planta P = new Planta();
        
        Matera M = new Matera();
        try {
            for (int i = 0; i < General.getArraygeneral().size(); i++) {
            if (General.getArraygeneral().get(i).get(0).getClass().equals(P.getClass())){
                        int T = AP.CantidadSombras(General.getArraygeneral().get(i));
                        //S += "Cantidad de Plantas de Sombra: " + AP.CantidadSombras(General.getArraygeneral().get(i)) + "\n";
                        if (T != 0 ){
                            S += "Cantidad de Plantas de Sombra: " + T + "\n";
                        }else{
                            S += "Cantidad de Plantas de Sombra: No se encontró plantas de sombra.";
                        }
                        S += "Plantas Solares y sus Cuidados: \n" + AP.PlantasSolares(General.getArraygeneral().get(i)) + "\n";
            }else{
                if (General.getArraygeneral().get(i).get(0).getClass().equals(M.getClass())){
                    S += "Total en Pesos de las Materas: " + AM.TotalPesos(General.getArraygeneral().get(i)) + "\n";
                }else{
                    S += "Abonos con Precio Mayor a 6500: \n" + AA.AbonosMayorPrecio(General.getArraygeneral().get(i)) + "\n";
                }
            }
        }
        } catch (Exception e) {}
        S += PreciosBajos(General);
        if(!"".equals(S)){
            return S;
        }else{
            return "No ingresaste toda la informacion";
        }
        
    }
       
}
