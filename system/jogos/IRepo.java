package system.jogos;
import system.jogos.Jogo;
import system.jogos.exceptions.JEException;

public interface IRepo{
  public void inserir(Jogo jogo) throws JEException;
  public void remover(String nome);
  public boolean existe(String nome);
  public Jogo procurar(String nome);
}


