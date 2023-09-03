
package Controller;

import Model.*;
import java.util.ArrayList;

public class Logica_General {
    
    Archivos_Plantas AP;
    Archivos_Materas AM;
    Archivos_Abonos AA;
    
    public ArrayList Ingresar( ArrayList general, ArrayList productos){
        general.add(productos);
        return general;
    } 
    
    public String PreciosBajos(Vivero General){
        String S = "";
        Planta P = new Planta();
        
        Matera M = new Matera();

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
       
        return S;
    }
    
    //Mostrar últimos puntos
    public String InformacionFinal(Vivero General){
        String S = "";
        Planta P = new Planta();
        
        Matera M = new Matera();
        
        for (int i = 0; i < General.getArraygeneral().size(); i++) {
            if (General.getArraygeneral().get(i).get(0).getClass().equals(P.getClass())){
                        S += "Cantidad de Plantas de Sombra: " + AP.CantidadSombras(General.getArraygeneral().get(i)) + "\n";
                        S += "Plantas Solares y sus Cuidados: \n" + AP.PlantasSolares(General.getArraygeneral().get(i)) + "\n";
            }else{
                if (General.getArraygeneral().get(i).get(0).getClass().equals(M.getClass())){
                    S += "Total en Pesos de las Materas: " + AM.TotalPesos(General.getArraygeneral().get(i)) + "\n";
                }else{
                    S += "Abonos con Precio Mayor a 6500: \n" + AA.AbonosMayorPrecio(General.getArraygeneral().get(i)) + "\n";
                }
            }
        }
        S += PreciosBajos(General);
        
        return S;
    }
       
}
