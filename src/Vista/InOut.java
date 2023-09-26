package Vista;

import javax.swing.*;

public class InOut
{
    public int solicitarEnteros(String m){
        String d= JOptionPane.showInputDialog(m);
        //Convertir a tipo entero
        int dato=Integer.parseInt(d);
        return dato;
    }

    public String solicitarString(String m){
        //Dato tipo string
        String dato=JOptionPane.showInputDialog(m);
        return dato;
    }

    public void mensaje(String r){
        JOptionPane.showMessageDialog(null,r);
    }

    public double solicitarDouble(String m){
        String d= JOptionPane.showInputDialog(m);
        double dato=Double.parseDouble(d);
        return dato;
    }

}