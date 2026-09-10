/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author ArthurGiuvannucci
 */ import java.util.Scanner;
public class ExemplosComtextos {
    public static void main(String[] args) {
        // DESAFIO - BARRACO DA FESTA
        
        String nome;
        Scanner entradaTexto = new Scanner (System.in);
        
        System.out.println("Ola, me diga seu nome para ver se esta na lista: ");
        nome= entradaTexto.nextLine();
        
        // PARA AVALIAR IGUALDADE UTILIZAMOS A FUNÇÃO EQUALS 
        if (nome.equals("Enzo")){
        System.out.println("Desculpe, seu nome nao esta na lista");
        } else if (nome.equals("Antonio")){
        System.out.println("Sai ja daqui seu penetra! ");
    } else if (nome.equals("Jordana")){
        System.out.println("Bem vinda Chefona! ");
    }else if  (!nome.equals("Enzo") && !nome.equals("Antonio") && !nome.equals("Maria")) {
            System.out.println("Seja bem vindo ");
    }
        
        
        
    }
}
