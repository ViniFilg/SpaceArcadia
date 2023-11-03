package system.usuario.exceptions;

// Exceção UserDoNotExist

public class UDNEException extends Exception {
  public UDNEException(String answer){
    super(answer);
  }
}