package system.usuario.exceptions;

public class SIException extends Exception {
  private String nome;
  private double saldo;

  public SIException(String nome, double saldo) {
    super("Exceção de Saldo Insuficiente [Nome: " + nome + ", Saldo: " + saldo + "]");
    this.nome = nome;
    this.saldo = saldo;
  }

  public String getNome() {
    return this.nome;
  }

  public double getSaldo() {
    return this.saldo;
  }
}