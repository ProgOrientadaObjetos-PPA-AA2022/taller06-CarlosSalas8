
package paquete01;

public class Hospitales {
    private String nombre;
    private Ciudad ciudad;
    private int nEspecialidades;
    private Medicos[] cMedicos;
    private Enfermeros[] cEnfermeros;
    private double tSueldos;
    private String dirHospital;
    
    
    public  Hospitales(String n){
        nombre = n;   
    }

    
    //metodos establecer

        public void establecerNombre(String n){
            nombre = n;
        }
        public void establecerCiudad(Ciudad n){
            ciudad = n;    
        }
        public void establecerNEspecialidades(int n){
            nEspecialidades = n;
        
        }
        public void establecerCMedicos(Medicos [] n){
            cMedicos = n;
        
        }
        public void establecerCEnfermeros(Enfermeros [] n){
            cEnfermeros = n;
          
        }
        public void establecerTSueldos(double n){
            tSueldos = n;
            
        }
        public void establecerDirHospital(String n){
            dirHospital = n;
        
        }
        
    //metodos obtener
        
        public String obtenerNombre(){
            return nombre;
    
        }
        public Ciudad obtenerCiudad(){
            return ciudad;
        
        }
        public int obtenerNEspcialidades(){
            return nEspecialidades;
        
        }
        public Medicos[] obtenerCMedicos(){
            return cMedicos;
        
        }
        public Enfermeros[] obtenerCEnfermeros(){
            return cEnfermeros;
        
        }
        
        public double obtenerTSueldos(){
            return tSueldos;
        
        }
        public String obtenerDirHospital(){
            return dirHospital;
        
        }
        /*
        }
    @Override
    public String ToString() {
        String cadena = String.format("HOSPITAL %s\nDireccion: %s\n"
                + "Ciudad: %s\nProvincia: %s\n", obtenerNombreHospital(),
                obtenerCiudad().obtenerBarrio(), obtenerCiudad().obtenerNombre(),
                obtenerCiudad().obtenerProvincia());
        for (int i = 0; i < obtenerConjuntoMedicos().length; i++) {
            cadena = String.format("%s-%s - sueldo: %.2f - %s", cadena,
                    obtenerConjuntoMedicos()[i].obtenerNombreMedico(),
                    obtenerConjuntoMedicos()[i].obtenerSueldoMensualMedico(),
                    obtenerConjuntoMedicos()[i].obtenerEspecialidadMedico());
        }
        for (int i = 0; i < obtenerConjuntoEnfermeros().length; i++) {
            cadena = String.format("%s-%s - sueldo: %.2f - %s", cadena,
                    obtenerConjuntoEnfermeros()[i].obtenerNombreEnfermero(),
                    obtenerConjuntoEnfermeros()[i].obtenerSueldoEnfermero(),
                    obtenerConjuntoEnfermeros()[i].obtenerTipoEnfermero());
        }
        return cadena;
    }
}
    */     
}

                



