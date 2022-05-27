
package paquete01;

public class Hospitales {
    private String nombre;
    private Ciudad ciudad;
    private int nEspecialidades;
    private Medicos[] cMedicos;
    private Enfermeros[] cEnfermeros;
    private double tSueldos;
    private String dirHospital;
    
    
    public  Hospitales(String n, Ciudad c, int ne, Medicos[] cm, Enfermeros[] ce, String dir){
        
        nombre = n;  
        ciudad = c;
        nEspecialidades = ne;
        cMedicos = cm;
        cEnfermeros = ce;
        dirHospital = dir;
        
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
        public void establecerTSueldos(){
            
        double sumaM = 0;
        double sumaE = 0;
        
        for (int i = 0; i < obtenerCMedicos().length; i++) {
            sumaM = sumaM + obtenerCMedicos()[i].obtenerSueldo();
        }
        
        for (int i = 0; i < obtenerCEnfermeros().length; i++) {
            
            sumaE = sumaE + obtenerCEnfermeros()[i].obtenerSueldo();
        }  
        
        double sumaT = sumaM + sumaE;
        
        tSueldos = sumaT;
            
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
       public String toString() {
        String cadena = String.format("%s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de especialidades: %d\n"
                + "Listado de medicos\n", 
                nombre,
                dirHospital,
                ciudad.obtenerNombre(),
                ciudad.obtenerProvincia(),
                nEspecialidades);
        for (int i = 0; i < cMedicos.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                    cadena, 
                    cMedicos[i].obtenerNombre(),
                    cMedicos[i].obtenerSueldo(),
                    cMedicos[i].obtenerEspecialidad());
        }
        cadena = String.format("%sListado de enfermeros(as)\n", cadena);
        for (int i = 0; i < cEnfermeros.length; i++) {
            cadena = String.format("%s- %s - sueldo: %.2f - %s\n",
                    cadena, 
                    cEnfermeros[i].obtenerNombre(),
                    cEnfermeros[i].obtenerSueldo(),
                    cEnfermeros[i].obtenerContrato());
            
         
        }
        cadena = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",
                cadena, obtenerTSueldos());
        
        return cadena;
                   
    }
              
}

                



