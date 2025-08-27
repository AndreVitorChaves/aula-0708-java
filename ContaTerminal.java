import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        String nome, agencia;

        System.out.println("Olá, usuário! Seja bem vindo ao banco Deko! Para realizarmos o seu cadastro, precisaremos de alguns dados. \n");
        System.out.println("Por favor, digite o seu nome completo: ");
        nome = entrada.nextLine();
        System.out.println("Por favor, digite o número da agência (Ex: xxx-x): ");
        agencia = entrada.nextLine();
        System.out.println("Por favor, digite o número da conta )(Ex: xxxx): ");
        int num = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite o saldo que deseja inserir: R$");
        double saldo = Double.parseDouble(entrada.nextLine());

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + num + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        entrada.close();




    }
        
    


    
}