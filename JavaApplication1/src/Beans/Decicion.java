/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Pojos.Numeros;
import Services.INumero;

/**
 *
 * @author dead1
 */
public class Decicion implements INumero{

    @Override
    public void decicion(Numeros n) {
      
        if (n.getNumero1() >0){
            System.out.println("Numero 1 Positivo");
        }else{
            System.out.println("Numero 1 Negativos");
        }
        if (n.getNumero2() > 0){
            
            System.out.println("Numero 2 Positivo");
        }else{
            System.out.println("Numero 2 Negativo");
        }
    }
        
 }