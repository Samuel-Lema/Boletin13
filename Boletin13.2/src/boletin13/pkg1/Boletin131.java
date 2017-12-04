package boletin13.pkg1;

import javax.swing.JOptionPane;

public class Boletin131 {

    public static void main(String[] args) {
        
        ConversorTemperaturas conversor1 = new ConversorTemperaturas();
        float grados;
                
        try {
            
            do {
                
                grados = Integer.parseInt(JOptionPane.showInputDialog("Añade los centígrados"));
                
            } while(grados > 80);
            
            System.out.println("Reamur: " + conversor1.centigradosAReamur(grados));
            System.out.println("Fharenheir: " + conversor1.centigradosAFharenheit(grados));
            
            
        } catch(TemperaturaErradaExcepcion e1) {
            
            System.out.println(e1.getMessage());
        }
        
    }
    
}
