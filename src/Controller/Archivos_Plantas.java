
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import Model.*;
import java.util.ArrayList;

public class Archivos_Plantas {
    private File F = new File("./Archivo/Informacion.txt");
    
    public ArrayList Ingresar( ArrayList Plantas, Planta planta){
        Plantas.add(planta);
        return Plantas;
    } 
    
    public ArrayList<Planta> Recuperar_Info( ArrayList<Planta> Plantas) {
        byte i = 0;
        String S="";
        ArrayList<Planta> arrayPlanta = new ArrayList<>();
        try {
            FileReader B = new FileReader(F);
            BufferedReader leer = new BufferedReader(B);
            
            if(!Plantas.isEmpty()){
                for (Planta Planta1 : Plantas) {
                    arrayPlanta.add(Planta1);
                }
            }
            while (S != null) {
                S = leer.readLine();
                if(S != null && i == 0) {    
                    String[] cadena = S.split(",");
                    if(Plantas.isEmpty()){}
                    for (int j = 0; j < cadena.length ; j++) {
                        String[] atributos = cadena[j].split(";");
                        Planta aux = new Planta();
                        aux.setCodigo( Integer.parseInt(atributos[0]) );
                        aux.setNombre(atributos[1]);
                        aux.setCuidados(atributos[2]);
                        aux.setTolerancia(atributos[3]);
                        aux.setPrecio(Integer.parseInt(atributos[4]));
                        arrayPlanta.add(aux);   
                    }   
                }
                i++;
            }
            leer.close();
        } catch (Exception e) {}
        return arrayPlanta;
    }   
            
    public int CantidadSombras (ArrayList P){
        int CantSom = 0;
        ArrayList<Planta> Plantas = P;
        
        for (int i = 0; i < Plantas.size(); i++) {
            if(Plantas.get(i).getTolerancia().equalsIgnoreCase("Sombra")){
                CantSom++;
            }
        }
        return CantSom;
    }
    
    public String PlantasSolares(ArrayList P){
        String S = "";
        ArrayList<Planta> Plantas = P;
        
        for (int i = 0; i < Plantas.size(); i++) {
            if(Plantas.get(i).getTolerancia().equalsIgnoreCase("Solar")){
                S += "Nombre: " + Plantas.get(i).getTolerancia() + " Cuidados: " + Plantas.get(i).getCuidados() + "\n";
            }
        }
        
        return S;
    }
    
    public String ValorMenor(ArrayList Plantas){
        String S = "";
        ArrayList<Planta> P = Plantas;
        int Menor = 100000, Pos = 0;
      
        for (int i = 0; i < P.size(); i++) {
            if (P.get(i).getPrecio() < Menor){
                Menor = P.get(i).getPrecio();
                Pos = i;
            }
        }
        S = "Planta: " + P.get(Pos).getNombre() + "\n";
        
        return S;
    }
    
}
