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
public class Produtos {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Olá, usuário. Digite o nome do produto: ");
        String produto = entrada.nextLine();
        System.out.println("Digite o valor de custo do/a " + produto + ": R$");
        String valor = entrada.nextLine();
        System.out.println("Por fim, digite o percentual de lucro que deseja obter (1-100) %");
        String lucro = entrada.nextLine();
        double v =Double.parseDouble(valor);
        double l = Double.parseDouble(lucro);
        double venda = (v*(l/100)) + v;
        String venda1 = String.format("%.2f", venda);
        System.out.println("NOME: " + produto + "\n" + "CUSTO: " + v + "\n" + "% LUCRO: " + l + "\n" + "VALOR DE VENDA: R$" + venda1  );
                
        
        
        
    }
    
}
