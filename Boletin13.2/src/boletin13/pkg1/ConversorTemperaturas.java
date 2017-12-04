package boletin13.pkg1;

public class ConversorTemperaturas {
    
    final float grados = 80;
    
    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion{
    
        float fharenheir;
            
        if(centigrados > 80){
            
            throw new TemperaturaErradaExcepcion();
        } else {
            
            fharenheir = (float) (9.0 / 5.0 * centigrados + 32.4);
            return fharenheir;
        }    
    }
    
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
    
        float reamur = 0;
            
        if(centigrados > 80){
            
            throw new TemperaturaErradaExcepcion();
        } else {
            
            reamur = (float) (4.0 / 5.0 * centigrados);
            return reamur;
        }   
        
    }
}
