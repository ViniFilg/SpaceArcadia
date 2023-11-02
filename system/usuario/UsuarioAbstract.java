package system.usuario;

import java.io.Serializable;
import java.util.Vector;
import system.Jogo;

import system.usuario.exceptions.SIException;
import system.usuario.exceptions.VNException;

public abstract class UsuarioAbstract implements Serializable {
  private String nome;
  private double creditos;
  private String senha;

  public UsuarioAbstract(String nome, double creditos, String senha) {
    this.nome = nome;
    this.senha = senha;
    this.creditos = 0.0;
  }

  public String getNome(){
    return nome;
  }
  
  public double getCreditos() {
    return creditos;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getSenha(){
    return senha;
  }

  public void creditar(double valor) throws VNException {
    if (valor > 0)
      this.creditos += valor;
    else
      throw new VNException(nome, creditos);
  }

  public void debitar(double valor) throws VNException, SIException {
    if (valor > 0)
      if (this.creditos >= valor)
        this.creditos -= valor;
      else
        throw new SIException(nome, creditos);
    else
      throw new VNException(nome, creditos);
  }

}