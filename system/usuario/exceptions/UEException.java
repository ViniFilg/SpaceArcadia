package system.usuario.exceptions;

public class UEException extends Exception {
  private String nome;

  public UEException(String nome) {
    super("Usuario já existente!");
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

}