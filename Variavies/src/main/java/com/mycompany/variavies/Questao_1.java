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
public class Questao_1 {
    public static void main(String[] args) {
        //varaivel
        String nome; 
        //criar a entrada
        Scanner entradaTexto= new
        Scanner (System.in);
        
//solicitar que o usuário digite seu nome 
        System.out.println("Digite seu nome:");
        nome=entradaTexto.nextLine();
        
        //Imprimir a mensagem
        System.out.println("Ola,"+nome+"! Seja bem vindo(a) ao Java.");
        
        
    }
}
