
package paquete01;

public class Enfermeros {
    
    private String nombre;
    private String nombramiento;
    private String contrato;
    private double sueldo;
    
    public Enfermeros(String n, String t, String c, double s){
        
        nombre = n;
        nombramiento = t;
        contrato = c;
        sueldo = s;
    
    }


    
    // metodos establecer
    
    public void establecerNombre(String n){
        nombre = n;
    
    }
    public void establecerNombramiento(String n){
        nombramiento = n;
    
    }
     public void establecerContrato(String n){
        contrato = n;
    
    }
    public void establecerSueldo(double n){
        sueldo = n;
    
    }
    
    // metodos obtener
    
    public String obtenerNombre(){
        return nombre;
        
    }
    public String obtenerNombramiento(){
        return nombramiento;
    
    }
    public String obtenerContrato(){
        return contrato;
    
    }
    public double obtenerSueldo(){
        return sueldo;
    
    }
    
}
