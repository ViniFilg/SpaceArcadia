package system.usuario;

import java.io.Serializable;
import java.util.Vector;
import system.jogos.Jogo;

import java.io.Serializable;

public class UsuarioPadrao extends UsuarioAbstract implements Serializable{

  private Vector<Jogo> jogos;

  public UsuarioPadrao(String nome, String senha){
    super(nome, senha);
    jogos = new Vector<Jogo>();
  }

  public Vector<Jogo> getJogos(){
    return jogos;
  }

  public void inserir(Jogo jogo){
    if(procurarJogo(jogo.getNome()) == null){
      jogos.add(jogo);
    }
    else{

    }
  }

  public Jogo procurarJogo(String nome){
    for(int i = 0; i < jogos.size(); i++){
      if(jogos.get(i).getNome().equals(nome))
        return jogos.get(i);
    }
    return null;
  }
}