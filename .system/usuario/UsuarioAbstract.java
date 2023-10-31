import java.io.Serializable;
import java.util.Vector;
import system.Jogo;

public abstract class UsuarioAbstract implements Serializable{
  private String nome;
  private double creditos;

  public UsuarioAbstract(String nome, double creditos){
    this.nome = nome;
    this.creditos = 0.0;
  }

  public double getCreditos(){
    return creditos;
  }

  public void creditar(double valor) throws VNException{
    if (valor > 0)
      this.creditos += valor;
    else
      throw new VNException(nome, creditos);
  }

  public void debitar(double valor) throws VNException, SIException{ 
    if (valor > 0)
      if (this.creditos >= valor)
        this.creditos -= valor;
      else
        throw new SIException(nome, creditos);
    else
      throw new VNException(nome, creditos);
  }
  
}
  