package system.jogos.exceptions;

public class JIException extends Exception {
  private String nome;

  public JIException(String nome) {
    super("Exceção de jogo inexistente, jogo procurado: " + nome);
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

}