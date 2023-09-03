
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import Model.*;
import java.util.ArrayList;

public class Archivos_Abonos {
    private File F = new File("./Archivo/Informacion.txt");
        
        public ArrayList Ingresar( ArrayList Abonos, Abono abono){
            Abonos.add(abono);
            return Abonos;
        } 
	public ArrayList<Abono> Recuperar_Info(ArrayList<Abono> Abonos) {
            byte i = 0;
            String S="";
            ArrayList<Abono> arrayAbono = new ArrayList<>();
            try {
                FileReader B = new FileReader(F);
                BufferedReader leer = new BufferedReader(B);
                if(!Abonos.isEmpty()){
                    for (Abono Abono1 : Abonos) {
                        arrayAbono.add(Abono1);
                    }
                }
                while (S != null) {
                    S = leer.readLine();
                    if(S != null && i == 2) {    
                        
                        String[] cadena = S.split(",");
                        for (int j = 0; j < cadena.length ; j++) {
                            String[] atributos = cadena[j].split(";");
                            Abono aux = new Abono();
                            aux.setCodigo( Integer.parseInt(atributos[0]));
                            aux.setNombre(atributos[1]);
                            aux.setDescripcion(atributos[2]);
                            aux.setUtilidad(atributos[3]);
                            aux.setPrecio(Integer.parseInt(atributos[4]));
                            arrayAbono.add(aux);
                        }
                    }
                    i++;
                }
                leer.close();
            } catch (Exception e) {}
            return arrayAbono;
	}
        
    public String AbonosMayorPrecio(ArrayList A){
        String S = "";
        ArrayList<Abono> Abonos = A;
        
        for (int i = 0; i < Abonos.size(); i++) {
            if (Abonos.get(i).getPrecio() > 6500){
                S += "Nombre: " + Abonos.get(i).getNombre() + " Utilidad: " + Abonos.get(i).getUtilidad() + "\n";
            }
        }
        return S;
    }
    
    public String ValorMenor(ArrayList Abonos){
        String S = "";
        ArrayList<Abono> A = Abonos;
        int Menor = 100000, Pos = 0;
      
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).getPrecio() < Menor){
                Menor = A.get(i).getPrecio();
                Pos = i;
            }
        }
        S = "Abono: " + A.get(Pos).getNombre() + "\n";
        
        return S;
    }
    
    public int BuscarPos(Vivero General){
        int Pos = -1;
        Abono A = new Abono();
        
        for (int i = 0; i < General.getArraygeneral().size(); i++) {
            if (General.getArraygeneral().get(i).get(0).getClass().equals(A.getClass())){
                Pos = i;
            }
        }
        
        return Pos;
    }
}
