import system.jogos.Jogo;
import system.jogos.RepositorioJogos;

import system.usuario.RepositorioUsuario;
import system.usuario.UsuarioAbstract;
import system.usuario.UsuarioPadrao;
import system.usuario.UsuarioAdm;
import system.jogos.Comentario;

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
    repo.remover("Shadow of The Colossus");
  }

  public void inserirAdm(){
    UsuarioAdm adm = new UsuarioAdm("ADM", "ADM");
    RepositorioUsuario repo = new RepositorioUsuario();
    try{
      repo.inserir(adm);
    } catch(Exception e){
      
    }

  }

  public void TestaComentario(){
    RepositorioJogos repo = new RepositorioJogos();
    Jogo SoTC = repo.procurar("Shadow of The Colossus");
    SoTC.getComentarios().clear();
    Comentario comentario = new Comentario("Renan", "Que jogo foda!");
    try{
    repo.adicionarComentario(SoTC.getNome(), comentario);
    } catch(Exception e){
      e.printStackTrace();
    }
}
}