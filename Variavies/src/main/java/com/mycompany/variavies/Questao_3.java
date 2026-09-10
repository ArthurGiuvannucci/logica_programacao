/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author ArthurGiuvannucci
 */
import java.util.Scanner;
public class Questao_3 {
    public static void main(String[] args) {
        
        int valor1;
        int valor2;
        
         Scanner entradaNumero= new Scanner (System.in);
         
         System.out.println("Digite o primeiro valor ");
         valor1 = entradaNumero.nextInt ();
         
        System.out.println("Digite o segundo valor ");
         valor2 = entradaNumero.nextInt () ;
         
         double media = (valor1 + valor2) / 2 ;
         
        System.out.println("A media dos valores e igual a "+media);
        
        
        
        
        
        
        
        
    }
}
