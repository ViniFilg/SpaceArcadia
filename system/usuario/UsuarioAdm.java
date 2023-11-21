package system.usuario;

import java.io.Serializable;
import system.jogos.RepositorioJogos;
import system.jogos.Jogo;
import system.usuario.RepositorioUsuario;
import system.usuario.exceptions.UDNEException;
import system.jogos.exceptions.JEException;

public class UsuarioAdm extends UsuarioAbstract implements Serializable {
    private RepositorioUsuario repositorioUsuarios;
    private RepositorioJogos repositorioJogos; 
  
  // Adicionado um campo para o repositório de jogos

    public UsuarioAdm(String nome, String senha) throws JEException{
        super(nome, senha);
        repositorioUsuarios = new RepositorioUsuario();
        repositorioJogos = new RepositorioJogos(); 
      
      // Aqui, é criado o repositório de jogos no construtor
    }

    public void removerUsuario(String nome) throws UDNEException {
        if (repositorioUsuarios.existe(nome)) {
            repositorioUsuarios.remover(nome);
        } else {
            throw new UDNEException("Nome de usuário não existe");
        }
    }

    public void inserir(Jogo jogo) throws JEException{
        repositorioJogos.inserir(jogo);
    }

    public void remover(String nome) {
        repositorioJogos.remover(nome);
    }

    public void editarJogo(String nome, String novoNome, Double novoValor, String novaDescricao) {
        repositorioJogos.editarJogo(nome, novoNome, novoValor, novaDescricao);
    }
}
