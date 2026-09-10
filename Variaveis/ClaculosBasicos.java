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
public class ClaculosBasicos {
    public static void main(String[] args) {
        
        //Trabalar com Calculo de SOMA
        int numero1, numero2,resultadoResto;
        double resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao;
        double media ;
        
        //"in" e de puchar e "out" mandar
        Scanner entradaNumero= new Scanner (System.in);
        
        System.out.println("Digite um valor inteiro ");
        numero1 = entradaNumero.nextInt ();
        
        System.out.println("Digite um segundo valor interio ");
        numero2 =  entradaNumero.nextInt();
        
        resultadoSoma= numero1 + numero2;
        
        System.out.println("A soma desses valores e igual a "+resultadoSoma);
        
        
        // Subtração
        
        resultadoSubtracao= numero1 - numero2;
        
        System.out.println("A subtracao dos numeros "+resultadoSubtracao);
        
        
        //Multiplicaçõa
        
        resultadoMultiplicacao= numero1 * numero2;
        System.out.println("O resultado da multiplicacao foi "+ resultadoMultiplicacao);
       
        //Divisão 
        
        resultadoDivisao= numero1 / numero2;
        System.out.println("O resultado da divisao e "+resultadoDivisao);
        
        //Calculo de resto
        
        resultadoResto = numero1 % numero2 ;
        
        System.out.println("O resto da divisao dos numeros e "+ resultadoResto);
        
        
        
        
        
 
        
    }  
    
}
