package services;
import models.Conta;

import java.util.Scanner;
public class ContaService {
    public Conta registrarConta() {
        int numero;
        String agencia;
        String nomeClient;
        float saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Digite a agência da conta:");
        agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        nomeClient = scanner.next();

        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextFloat();

        return new Conta(numero, agencia, nomeClient, saldo);
    }
}
