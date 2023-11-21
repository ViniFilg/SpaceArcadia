import system.jogos.Jogo;
import system.jogos.RepositorioJogos;

import system.usuario.RepositorioUsuario;
import system.usuario.UsuarioAbstract;
import system.usuario.UsuarioPadrao;

public class Teste{
  public void TestaRepositorio(){
    Jogo SoTC = new Jogo("Shadow of The Colossus", 250, "Shadow of The colossus é um jogo \n no qual você tem que matar titãs para ressuscitar a princesa que foi morta como sacrifício pela sua tribo");
    RepositorioJogos repo = new RepositorioJogos();
    try{
      repo.inserir(SoTC);
    } catch(Exception e){
      e.printStackTrace();
    }
  }

  
  public void TestaDesserializacao(){
    RepositorioJogos repo = new RepositorioJogos();
    repo.apresentarJogo("Shadow of The Colossus");
    repo.remover("Shadow of The Colossus");
  }

  public void TestaRepoUsuario(){
    RepositorioUsuario repo = new RepositorioUsuario();
    UsuarioAbstract user = repo.procurar("João");
    RepositorioJogos repoJogos = new RepositorioJogos();
    
    try{
      repo.inserirJogo("João", repoJogos.procurar("Shadow of The Colossus"));
    } catch(Exception e){

    }
    repo.apresentarusuario("João");
  }
}