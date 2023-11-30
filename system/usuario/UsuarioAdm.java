package system.usuario;

import java.io.Serializable;
import system.jogos.RepositorioJogos;
import system.jogos.Jogo;
import system.usuario.RepositorioUsuario;
import system.usuario.exceptions.UDNEException;
import system.jogos.exceptions.JEException;

public class UsuarioAdm extends UsuarioAbstract implements Serializable {
  
  // Adicionado um campo para o repositório de jogos

    public UsuarioAdm(String nome, String senha){
        super(nome, senha);
      
    }

    public void removerUsuario(String nome) throws UDNEException {
        RepositorioUsuario repositorioUsuarios = new RepositorioUsuario();
        if (repositorioUsuarios.existe(nome)) {
            repositorioUsuarios.remover(nome);
        } else {
            throw new UDNEException("Nome de usuário não existe");
        }
    }

    public void inserir(Jogo jogo) throws JEException{
        RepositorioJogos repositorioJogos = new RepositorioJogos();
        repositorioJogos.inserir(jogo);
    }

    public void remover(String nome) {
        RepositorioJogos repositorioJogos = new RepositorioJogos();
        repositorioJogos.remover(nome);
    }

    public void editarJogo(String nome, String novoNome, Double novoValor, String novaDescricao) {
        RepositorioJogos repositorioJogos = new RepositorioJogos();
        repositorioJogos.editarJogo(nome, novoNome, novoValor, novaDescricao);
    }
}
