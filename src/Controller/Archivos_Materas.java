
package Controller;

import Model.*;
import java.util.ArrayList;

public class Archivos_Materas {
    
    public int TotalPesos(ArrayList<Matera> Materas){
        int Total = 0;
        
        for (int i = 0; i < Materas.size(); i++) {
            Total += Materas.get(i).getPrecio();       
        }
        
        return Total;
    }
    
    public String ValorMenor(ArrayList Materas){
        String S = "";
        ArrayList<Matera> M = Materas;
        int Menor = 100000, Pos = 0;
        
        for (int i = 0; i < M.size(); i++) {
            if (M.get(i).getPrecio() < Menor){
                Menor = M.get(i).getPrecio();
                Pos = i;
            }
        }
        S = "Matera: " + M.get(Pos).getNombre() + "\n";
        
        return S;
    }
    
}
