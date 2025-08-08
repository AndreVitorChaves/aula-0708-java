/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author IFSP
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Hello, " + nome);
        System.out.println(nome + ", Qual é o seu curso? ");
        String curso = entrada.nextLine();
        System.out.println("Que legal, " + nome + ", espero que esteja gostando de cursar " + curso + "!"  );
        
    }
    
}
