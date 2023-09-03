
package Controller;

import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Archivos_Materas {
    private File F = new File("./Archivo/Informacion.txt");

    public ArrayList<Matera> Recuperar_Info() {
        byte i = 0;
        String S="";
        ArrayList<Matera> arrayMatera = null;
        try {
            FileReader B = new FileReader(F);
            BufferedReader leer = new BufferedReader(B);

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
        S = "Matera: " + M.get(Pos).getNombre() + "\n";
        
        return S;
    }
    
}
