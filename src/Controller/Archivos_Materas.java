
package Controller;

import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Archivos_Materas {
    private File F = new File("./src/Data/Informacion.txt");
    
    public ArrayList Ingresar( ArrayList Materas, Matera matera){
            if (matera != null){
                Materas.add(matera);
            }
            return Materas;
    } 

    public ArrayList<Matera> Recuperar_Info(ArrayList<Matera> Materas) {
        byte i = 0;
        String S="";
        ArrayList<Matera> arrayMatera = new ArrayList<>();
        try {
            FileReader B = new FileReader(F);
            BufferedReader leer = new BufferedReader(B);
            if(!Materas.isEmpty()){
                for (Matera Matera1 : Materas) {
                    arrayMatera.add(Matera1);
                }
            }
            while (S != null) {
                S = leer.readLine();
                if(S != null && i == 1) {    
                    arrayMatera = new ArrayList<>();
                    String[] cadena = S.split(",");
                    for (int j = 0; j < cadena.length ; j++) {
                        String[] atributos = cadena[j].split(";");
                        Matera aux = new Matera();
                        aux.setCodigo( Integer.parseInt(atributos[0]));
                        aux.setNombre(atributos[1]);
                        aux.setMaterial(atributos[2]);
                        aux.setTamaño(Float.parseFloat(atributos[3]));
                        aux.setPrecio(Integer.parseInt(atributos[4]));
                        arrayMatera.add(aux);
                    }
                }
                i++;
            }
            leer.close();
        } catch (Exception e) {}
        return arrayMatera;
    }
    
    public int TotalPesos(ArrayList M){
        int Total = 0;
        ArrayList<Matera> Materas = M;
        
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
        if(Menor != 100000){
            S = "Matera: " + M.get(Pos).getNombre() + "\n";
        }else{
            S = "No se han encontrado Materas.";
        }
        return S;
    }
    
    public int BuscarPos(Vivero General){
        int Pos = -1, i = 0;
        try {
            while(i < General.getPos().length && Pos == -1){
                if (General.getCont(i).equals("M")){
                    Pos = i;
                }
                i++;
            }   
        } catch (Exception e) {}
        
        return Pos;
    }
}
