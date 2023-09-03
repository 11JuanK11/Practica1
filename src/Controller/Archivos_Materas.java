
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
    
}
