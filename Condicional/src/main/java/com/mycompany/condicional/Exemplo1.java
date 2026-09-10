/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author ArthurGiuvannucci
 */ import java.util.Scanner;
public class Exemplo1 {
    public static void main(String[] args) {
     
        //Variaveis 
        double altura, peso, imc;
        String nome;
        
        //Scanner
        Scanner entradaNumero = new Scanner (System.in);
        Scanner entradaTexto = new Scanner (System.in);
        
        //Solicitar os dados ao usuário
        System.out.println("Digite seu nome: ");
        nome = entradaTexto.nextLine();
        System.out.println("Digite sua altura: ");
        altura = entradaNumero.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = entradaNumero.nextDouble();
        
        //calculo de imc
        imc = peso / (altura*altura) ;
        
        //Analisando meu imc
        
        
       /* if (imc <= 16.9){
            System.out.println(nome +" esta muito abaixo do peso");
        }if (imc >= 17 && imc <= 18.5){
            System.out.println(nome +" esta abaixo do peso");
        }if (imc >= 18.5 && imc <= 24.9){
        System.out.println(nome +" esta com o peso normal");
        }if (imc >=25 && imc <= 29.9){
        System.out.println(nome +" esta acima do peso ");
        }if (imc >= 30 && imc <= 34.9){
        System.out.println(nome +" esta com obsidade grau I");
        }if (imc >= 35 && imc <= 40){
        System.out.println(nome+" esta com obsidade grau II");
        }
        else {System.out.println(nome+" esta com obesidade grau III ");
        }
        **/
       if (imc <= 16.9) {
    System.out.println(nome + " esta muito abaixo do peso");
} else if (imc <= 18.5) {
    System.out.println(nome + " esta abaixo do peso");
} else if (imc <= 24.9) {
    System.out.println(nome + " esta com o peso normal");
} else if (imc <= 29.9) {
    System.out.println(nome + " esta acima do peso");
} else if (imc <= 34.9) {
    System.out.println(nome + " esta com obsidade grau I");
} else if (imc <= 40) {
    System.out.println(nome + " esta com obsidade grau II");
} else {
    System.out.println(nome + " esta com obesidade grau III");
}
        
        
        
        
        
        
        
    }  
}
