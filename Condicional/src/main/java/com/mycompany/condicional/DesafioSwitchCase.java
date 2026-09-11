/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

/**
 *
 * @author ArthurGiuvannucci
 */import java.util.Scanner;
public class DesafioSwitchCase {
    public static void main(String[] args) {
        
        int numProduto, quantidade;
       double valorTotal;
       
       //Scaners
      Scanner entradaNumero = new Scanner (System.in);
    
      //SOLICITAR OS DADOS
        System.out.println("========= LANCHONETE =========");
        System.out.println("1- Hambuerguer ........ R$ 15,00\n 2- Pizza ................... R$ 25,00\n 3- Cachorro-quente .... R$ 6,00 \n 4- Refrigerante ....... R$ 12,00\n 5- Suco .................... R$ 8.00");
     
        System.out.println("Ola, seja bem vindo(a),qual o numero do seu pedido ? ");
        numProduto = entradaNumero.nextInt();
        System.out.println("Quantas unidades voce deseja ?");
        quantidade = entradaNumero.nextInt();
        
        switch (numProduto){
            case 1:
                valorTotal = 15 * quantidade;
                System.out.println("Voce escolheu:\n produto: Hamburguer\n preco: R$ 15,00\nquantidade: "+quantidade+"\n valor total da compra: "+valorTotal);
                break;
            case 2:     
                valorTotal = 25 * quantidade;
                System.out.println("Voce escolheu:\n produto: Pizza\n preco: R$ 25,00\nquantidade: "+quantidade+"\n valor total da compra: "+valorTotal);
                break;
            case 3: 
                valorTotal = 6 * quantidade;
                System.out.println("Voce escolheu:\n produto: Cachorro-quente\n preco: R$ 6,00\nquantidade: "+quantidade+"\n valor total da compra: "+valorTotal);
                break;
            case 4: 
                valorTotal = 12 * quantidade;
                System.out.println("Voce escolheu:\n produto: Refrigerante\n preco: R$ 12,00\nquantidade: "+quantidade+"\n valor total da compra: "+valorTotal);
                break;
            case 5: 
                valorTotal = 8 * quantidade;
                
                System.out.println("Voce escolheu:\n produto: Suco\n preco: R$ 8,00\nquantidade: "+quantidade+"\n valor total da compra: "+valorTotal);
                break;
            default: 
                System.out.println("Desculpe, essa opcao e invalida, tente novamente!");
                break; 
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
