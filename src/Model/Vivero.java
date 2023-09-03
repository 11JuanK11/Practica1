
package Model;

import java.util.ArrayList;

public class Vivero {
    
    //Atributos
    private ArrayList<ArrayList<?>> arraygeneral; 
    private String[] Pos;
    private byte espacio;    

    public byte getEspacio() {
        return espacio;
    }

    public void setEspacio(byte espacio) {
        this.espacio = espacio;
    }
    
    public Vivero(ArrayList<ArrayList<?>> arraygeneral, String[] pos, byte espacio) {
        this.arraygeneral = arraygeneral;
        this.Pos = pos;
        this.espacio = espacio;
    }
    
    public Vivero() {
        this.arraygeneral = new ArrayList<ArrayList<?>>();
        this.Pos = new String[3];
        this.espacio = 0;
    }
    
    public ArrayList<ArrayList<?>> getArraygeneral() {
        return arraygeneral;
    }

    public void setArraygeneral(ArrayList<ArrayList<?>> arraygeneral) {
        this.arraygeneral = arraygeneral;
    }

    public String[] getPos() {
        return Pos;
    }

    public void setPos(String[] Pos) {
        this.Pos = Pos;
    }
    
    public String getCont(int i) {
        return Pos[i];
    }

    public void setCont(int i, String S) {
        Pos[i] = S ;
    }

    
}
