import system.Jogo;
import system.RepositorioJogos;

public class Teste{
  public void TestaRepositorio(){
    Jogo SoTC = new Jogo("Shadow of The Colossus", 250, "Shadow of The colossus é um jogo \n no qual você tem que matar titãs para ressuscitar a princesa que foi morta como sacrifício pela sua tribo");
    RepositorioJogos repo = new RepositorioJogos();
    repo.inserir(SoTC);
    repo.apresentarJogo("Shadow of The Colossus");
  }
  
  public void TestaDesserializacao(){
    RepositorioJogos repo = new RepositorioJogos();
    repo.apresentarJogo("Shadow of The Colossus");
    repo.remover("Shadow of The Colossus");
  }
}