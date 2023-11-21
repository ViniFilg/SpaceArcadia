package system.jogos.exceptions;

public class JEException extends Exception {
  private String nome;

  public JEException(String nome) {
    super("Exceção de jogo existente, jogo procurado: " + nome);
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

}