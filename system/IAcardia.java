import system.jogos.Jogo;
import java.util.Vector;

interface IArcadia{

  public void criarUsuario();

  public void excluirUsuario();

  public void criarJogo(String nome, double valor, String descricao);

  public void  excluirJogo(String nome);

  public Vector<Jogo> getCatalogo();

  // public void comprarJogo(Jogo jogo);

  public void comprarCredito(double valor);

  
}