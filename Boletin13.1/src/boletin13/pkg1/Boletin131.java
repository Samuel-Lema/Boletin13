package boletin13.pkg1;

import javax.swing.JOptionPane;

public class Boletin131 {

    public static void main(String[] args) {
        
        ConversorTemperaturas conversor1 = new ConversorTemperaturas();
        
        try {
            
            float grados = Integer.parseInt(JOptionPane.showInputDialog("Añade los centígrados"));
            System.out.println("Fharenheir: " + conversor1.centigradosAFharenheit(grados));
            System.out.println("Reamur: " + conversor1.centigradosAReamur(grados));
            
        } catch(TemperaturaErradaExcepcion e1) {
            
            System.out.println(e1.getMessage());
        }
        
    }
    
}
