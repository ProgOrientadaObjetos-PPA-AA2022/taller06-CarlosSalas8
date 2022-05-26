/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nHospital;
        String bHospital;
        String nCiudad;
        String pCiudad;
        int nm;
        String nM;
        String eM;
        double smM;
        Medicos[] numeroMedico;
        Enfermero[] numeroEnfermero;
        int ne;
        String nE;
        double smE;
        String tE;
        System.out.println("Ingrese el nombre del Hospital: ");
        nHospital = entrada.nextLine();
        Hospital h = new Hospital(nHospital);
        h.establecerNombreHospital(nHospital);

        System.out.println("Ingrese el barrio del Hospital: ");
        bHospital = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Hospital: ");
        nCiudad = entrada.nextLine();
        System.out.println("Ingrese la provincia del Hospital: ");
        pCiudad = entrada.nextLine();
        Ciudad c = new Ciudad(bHospital, nCiudad, pCiudad);
        h.establecerCiudad(c);

        System.out.println("Ingrese el numero de medicos del hospital: ");
        nm = entrada.nextInt();
        entrada.nextLine();
        numeroMedico = new Medico[nm];

        for (int i = 0; i < nm; i++) {
            System.out.println("Ingrese el nombre del Medico; ");
            nM = entrada.nextLine();
            System.out.println("Ingrese la especialidad del Medico; ");
            eM = entrada.nextLine();
            System.out.println("Ingrese el sueldo mensual del Medico; ");
            smM = entrada.nextDouble();
            entrada.nextLine();
            Medico m = new Medico(nM, eM, smM);
        }

        System.out.println("Ingrese el numero de enfermeros del hospital: ");
        ne = entrada.nextInt();
        entrada.nextLine();
        numeroEnfermero = new Enfermero[ne];

        for (int i = 0; i < nm; i++) {
            System.out.println("Ingrese el nombre del Enfermero: ");
            nE = entrada.nextLine();
            System.out.println("Ingrese el sueldo mensual del Enfermero: ");
            smE = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de Enfermero: ");
            tE = entrada.nextLine();
            Enfermero e = new Enfermero(nE, smE, tE);
        }

        System.out.println(h);
    }

}
