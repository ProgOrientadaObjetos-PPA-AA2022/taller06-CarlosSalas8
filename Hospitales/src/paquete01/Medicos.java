
package paquete01;

public class Medicos {
    
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    
    public Medicos(String n,String e, double s){
        
        nombre = n;
        especialidad = e;
        sueldo = s;
    }
    // metodos establecer
    
    public void establecerNombre(String n){
        nombre = n;
    
    }
    public void establecerEspecialidad(String n){
        especialidad = n;
    
    }
    public void establecerSueldo(double n){
        sueldo = n;
    
    }
    
    // metodos obtener
    
    public String obtenerNombre(){
        return nombre;
        
    }
    public String obtenerEspecialidad(){
        return especialidad;
    
    }
    public double obtenerSueldo(){
        return sueldo;
    
    }
    
}
