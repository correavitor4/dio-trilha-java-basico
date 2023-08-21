import models.Conta;
import services.ContaService;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaService contaService = new ContaService();
        Conta conta = contaService.registrarConta();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.",
                conta.nomeClient(),
            conta.agencia(),
            conta.numero(),
            conta.saldo());
    }
}