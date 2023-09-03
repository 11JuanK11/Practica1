
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
         
	public ArrayList<Abono> Recuperar_Info() {
            byte i = 0;
            String S="";
            ArrayList<Abono> arrayAbono = null;
            try {
                FileReader B = new FileReader(F);
                BufferedReader leer = new BufferedReader(B);

                while (S != null) {
                    S = leer.readLine();
                    if(S != null && i == 2) {    
                        arrayAbono = new ArrayList<>();
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
        
    public String AbonosMayorPrecio(ArrayList<Abono> Abonos){
        String S = "";
        
        for (int i = 0; i < Abonos.size(); i++) {
            if (Abonos.get(i).getPrecio() > 6500){
                S += "Nombre: " + Abonos.get(i).getNombre() + " Utilidad: " + Abonos.get(i).getUtilidad();
            }
        }
        return S;
    }
}
