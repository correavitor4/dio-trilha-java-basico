package models;

public record Conta(
    int numero,
    String agencia,
    String nomeClient,
    float saldo
) {
}
