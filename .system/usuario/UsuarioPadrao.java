import java.io.Serializable;
import java.util.Vector;
import system.Jogo;

import java.io.Serializable;

public class UsuarioPadrao extends UsuarioAbstract implements Serializable{

  private Vector<Jogo> jogos;

  public UsuarioPadrao(String nome, double creditos, Vector<jogo> jogos){
    super(nome, creditos);
    this.jogos = jogos;
  }

  public Vector<jogos> getJogos(){
    return jogos;
  }
}