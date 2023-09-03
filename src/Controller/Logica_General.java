
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
        ArrayList<Planta>  Plantas = new ArrayList<>();
        Plantas.add(P);
        
        Matera M = new Matera();
        ArrayList<Matera>  Materas = new ArrayList<>();
        Materas.add(M);
        
        Abono A = new Abono();
        ArrayList<Abono>  Abonos = new ArrayList<>();
        Abonos.add(A);
        
        for (int i = 0; i < General.getArraygeneral().size(); i++) {
            if (General.getArraygeneral().get(i).get(0).getClass().equals(Plantas.get(0).getClass())){
                    S += AP.ValorMenor(General.getArraygeneral().get(i));
            }else{
                if (General.getArraygeneral().get(i).get(0).getClass().equals(Materas.get(0).getClass())){
                    S += AM.ValorMenor(General.getArraygeneral().get(i));
                }else{
                    S += AA.ValorMenor(General.getArraygeneral().get(i));
                }
            }
        }
       
        return S;
    }
    
}
