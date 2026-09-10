/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author ArthurGiuvannucci
 */import java.util.Scanner;
public class Desafio {
    public static void main(String[] args) {
        //VARIAVEIS
        String nome, tipoIngresso;
        int idade;
        boolean autorizacao = false;
        
        Scanner entradaTexto= new Scanner (System.in);
        Scanner entradaNumero = new Scanner (System.in);
        Scanner entradaLogica = new Scanner (System.in);
        
        //
        System.out.println("Ola, informe seu nome: ");
        nome=entradaTexto.nextLine();
        
        System.out.println("Ola, informe sua idade por favor:");
            idade= entradaNumero.nextInt();
         
            System.out.println("Voce possui autorizacao ? (True para sim/False para nao)");
        autorizacao = entradaLogica.nextBoolean();
        
        System.out.println("Qual o tipo do seu ingresso ?");
            tipoIngresso= entradaTexto.nextLine();    
        
        
        
    // VALIDAÇÕES COM IF ELSE 
    
        System.out.println("Ola "+nome+", voce possui "+idade+" anos e seu ");
    
    
    
      if (idade >= 18 && tipoIngresso.equals("Vip")){ 
          System.out.println("Acesso Vip liberado");
      }else if (idade >= 18 && tipoIngresso.equals ("Comum")){
            System.out.println("Acesso Comum liberado");
      }else if ((idade== 16 || idade== 17 ) && autorizacao== true){
          System.out.println("Acesso Liberado com Autorizacao"); 
      }else if (tipoIngresso.equals("Professor") || tipoIngresso.equals("Funcionario")) {
          System.out.println("Acesso Especial Liberado!");
      }else {
          System.out.println("Acesso Negado!");
      }
       
        
        
        
        
    }
}
