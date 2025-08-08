/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author IFSP
 */
public class SegundaParte {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
       //ler 2 numeros e imprimir a soma dos dois
       
        System.out.println("Olá usuário, primeiramente, digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println(nome + ", Digite o primeiro valor: ");
        String valor1 = entrada.nextLine();
        System.out.println(nome + ", por fim, digite o último número: ");
        String valor2 = entrada.nextLine();
        try{
           //converter os valores para "int":
        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        int soma = n1 + n2;
        System.out.println("A soma total é: " + soma); 
        }
        catch(Exception e){ //e = variavel do tipo exception
            System.out.println("Erro ao converter número: " + e.getMessage()); //imprime mensagens pertinentes a respeito do erro que houve
        }
        System.out.println("--Linha executada com sucesso--");
        
        /*conversão de String para int:
        Integer.parseInt(str);
        conversão de String para double:
        Double.parseDouble(str);
        conversão de String para boolean:
        Boolean.parseBoolean(str);
        conversão de int/double/boolean para String:
        String.valueOf(val);
        */
       
        
        
    }
    
}
