public class VNException extends Exception {
  private String nome;
  private double valor;

  public VNException(String nome, double valor) {
    super("Exceção de Valor Negativo [nome: " + nome + ", Valor: " + valor + "]");
    this.nome = nome;
    this.valor = valor;
  }

  public String getNome() {
    return this.nome;
  }

  public double getValor() {
    return this.valor;
  }
}