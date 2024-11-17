package main;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //TODO: exibir a mensagem para os usuários
        System.out.println("Bem-vindo!");

        //TODO: obter pelo Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o nome do cliente!");
        sc.nextLine();
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = sc.nextDouble();

        sc.close();

        //TODO: exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}