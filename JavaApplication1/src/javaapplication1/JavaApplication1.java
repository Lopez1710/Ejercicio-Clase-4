/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import Beans.Acceso;
import Beans.Decicion;
import Pojos.Estudiante;
import Pojos.Numeros;
import java.util.Scanner;

/**
 *
 * @author dead1
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Estudiante es = new Estudiante();
//        Acceso ac = new Acceso();
//        Scanner sc = new Scanner(System.in);
//        es.setUser("Lopez");
//        es.setPassword("123");
//        
//        int logica = ac.Acess(es);
//        
//        if (logica == 0){
//            System.out.println("Inicio Coreecto");
//        }
//        else{
//            System.out.println("Incorrecto");
//        }
//        
        Numeros nm = new Numeros();
        Decicion Dc = new Decicion();
        
        nm.setNumero1(-2);
        nm.setNumero2(-2);
        
        
        
      
        // TODO code application logic here
        Dc.decicion(nm);
    }
    
}
