
package paquete02;

import java.util.Locale;
import java.util.Scanner;
import paquete01.Ciudad;
import paquete01.Enfermeros;
import paquete01.Hospitales;
import paquete01.Medicos;


public class Principal {

public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        String nombre, nomHospital, provincia, ciudad, especialidad, contrato, dirHospital;
        
        double sueldo;
        
        int especialidades;
        
        System.out.println("Ingrese el nombre del Hospital");
        nomHospital = sc.nextLine();
        
        System.out.println("Ingrese la direccion del Hospital");
        dirHospital = sc.nextLine();
        
        System.out.println("Ingrese la ciudad del Hospital");
        ciudad = sc.nextLine();
        
        System.out.println("Ingrese la Provincia del Hospital");
        provincia = sc.nextLine();
        
        
        System.out.println("Ingrese el numero de especialidades del Hospital");
        especialidades = sc.nextInt();
        
        sc.nextLine();
        
        
        Ciudad cid = new Ciudad(ciudad, provincia);
        int n, m;
        
        System.out.println("Ingrese la cantidad de doctores que tiene el hospital");
        n = sc.nextInt();
        
        sc.nextLine();
        
        Medicos[] med = new Medicos[n];
        
        for (int i = 0; i < med.length; i++) {
            
            System.out.printf("Ingrese el nombre del doctor %d\n", i + 1);
            nombre = sc.nextLine();
            
            System.out.printf("Ingrese el sueldo del doctor %d\n", i + 1);
            sueldo = sc.nextDouble();
            
            sc.nextLine();
            
            System.out.printf("Ingrese la especialidad del doctor %d\n", i + 1);
            especialidad = sc.nextLine();
            
  
            
            med[i] = new Medicos(nombre, especialidad, sueldo);
        }
        
        System.out.println("Ingrese la cantidad de enfermeros(as)  que tiene el hospital");
        m = sc.nextInt();
        
        sc.nextLine();
        
        Enfermeros[] enfer = new Enfermeros[m];
        
        for (int i = 0; i < enfer.length; i++) {
            
            System.out.printf("Ingrese el nombre del enfermero %d\n", i + 1);
            nombre = sc.nextLine();
            
            System.out.printf("Ingrese el sueldo del enfermero %d\n", i + 1);
            sueldo = sc.nextDouble();
            
            sc.nextLine();
            
            System.out.printf("Ingrese el tipo de contrato del enfermero %d\n", i + 1);
            contrato = sc.nextLine();
            

            
            enfer[i] = new Enfermeros(nombre, contrato, sueldo);
        }

        Hospitales hosp = new Hospitales(
                
                nomHospital, cid, especialidades, med, enfer, dirHospital);
        
        hosp.establecerTSueldos();
        System.out.printf("%s", hosp);
        

    }

}

