package boletin13.pkg1;

public class TemperaturaErradaExcepcion extends Exception{
    
    public TemperaturaErradaExcepcion(){
        
        super("A temperatura non pode ser maior de 80º C");
    }
}
