/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class Hospitales {
    private String nombre;
    private Ciudad ciudad;
    private int nEspecialidades;
    private Medicos[] cMedicos;
    private Enfermeros[] cEnfermeros;
    private double tSueldos;
    private String dirHospital;

        public void establecerNombre(String n){
            nombre = n;
        }
        public void establecerCiudad(Ciudad n){
            ciudad = n;    
        }
        public void establecerNEspecialidades(int n){
            nEspecialidades = n;
        
        }
                
}


