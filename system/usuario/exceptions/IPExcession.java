package system.usuario.exceptions;

// Exceção IncorrectPassword

public class IPException extends Exception {
  public IPException(String answer){
    super(answer);
  }
}