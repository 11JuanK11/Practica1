
package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import Model.*;
import java.util.ArrayList;

public class Archivos_Abonos {
    private File F = new File("./src/Data/Informacion.txt");
        
        public ArrayList Ingresar( ArrayList Abonos, Abono abono){
            if (abono != null){
                Abonos.add(abono);
            }
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
            try{
                if (Abonos.get(i).getPrecio() > 6500){
                    S += "Nombre: " + Abonos.get(i).getNombre() + " Utilidad: " + Abonos.get(i).getUtilidad() + "\n";
                }
            }catch (Exception e){}
        }
        if(S.equals("")){
            S = "No se han encontrado Abonos.";
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
        if(Menor != 100000){
            S = "Abono: " + A.get(Pos).getNombre() + "\n";
        }else{
            S = "No se han encontrado Abonos.";
        }
        
        return S;
    }
    
    public int BuscarPos(Vivero General){
        int Pos = -1, i = 0;
        try {
            while(i < General.getPos().length && Pos == -1){
                if (General.getCont(i).equals("A") ){
                    Pos = i;
                }
                i++;
            }
        } catch (Exception e) {}
        
        return Pos;
    }
}
