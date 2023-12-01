package system.usuario;

import java.util.Vector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import system.jogos.Jogo;

import system.usuario.exceptions.SIException;
import system.usuario.exceptions.UEException;
import system.usuario.exceptions.VNException;
import system.usuario.exceptions.UDNEException;
import system.usuario.exceptions.IPException;

public class RepositorioUsuario {
  private Vector<UsuarioAbstract> usuarios;

  public RepositorioUsuario(){
    usuarios = new Vector<UsuarioAbstract>();
    desserializar();
  }

  public void inserir(UsuarioAbstract usuario) throws UEException{
    if (!existe(usuario.getNome())) {
      usuarios.add(usuario);
      serializar();
    } else {
      throw new UEException(usuario.getNome());
    }
  }

  public void remover(String nome) throws UDNEException {
    if (existe(nome)) {
      usuarios.remove(procurar(nome));
      removerArquivo(nome);
      serializar();
    } else{
      throw new UDNEException(nome);
    }
  }

  public boolean existe(String nome) {
    if (procurar(nome) != null)
      return true;
    else
      return false;
  }

  public Vector<UsuarioAbstract> getUsuarios(){
    return usuarios;
  }

  public UsuarioAbstract procurar(String nome) {
    for (int i = 0; i < usuarios.size(); i++) {
      if (usuarios.get(i).getNome().equals(nome))
        return usuarios.get(i);
    }
    return null;
  }

  public void creditar(String nome, double valor) throws VNException {
    if(existe(nome)){
      UsuarioAbstract user = procurar(nome);
      user.creditar(valor); 
      serializar();
    } else{
      throw new VNException(nome, valor);
    }
  }

  public void debitar(String nome, double valor) throws VNException, SIException {
    if(existe(nome)){
      UsuarioAbstract user = procurar(nome);
      user.debitar(valor);
      serializar();
    }
  }

  public void removerJogo(String nome, String nomeJogo){
    if(existe(nome)){
      UsuarioAbstract user = procurar(nome);
      ((UsuarioPadrao)user).remover(nomeJogo);
      serializar();
    }
  }

  public void inserirJogo(String nome, Jogo jogo) {
    if(existe(nome)){
      UsuarioAbstract user = procurar(nome);
      ((UsuarioPadrao)user).inserir(jogo);
      serializar();
    }
  }


  public void mudarNome(String nome, String novoNome) throws UEException {
    if (!existe(novoNome) && novoNome.length() > 0) {
      UsuarioAbstract usuario = procurar(nome);
      usuario.setNome(novoNome);
      removerArquivo(nome);
      serializar();
    } else {
      throw new UEException(nome);
    }
  }

  public void mudarSenha(String nome, String novaSenha) {
    UsuarioAbstract usuario = procurar(nome);
    usuario.setSenha(novaSenha);
    serializar();
  }

  public boolean validar(String nome, String senha) throws IPException, UDNEException {
    if(existe(nome)){
      UsuarioAbstract usuario = procurar(nome);
      if(usuario.getSenha().equals(senha)){
        return true; //O nome do Usuário e da senha são válidos
      } else{
        throw new IPException("Senha inválida");
      }
    }else{
      throw new UDNEException("Nome de usuário não existe");
    }
    
  }

  private void serializar() {
    File arquivoConta = new File("./arquivo/usuarios.bin");
    arquivoConta.mkdir();

    for (int i = 0; i < usuarios.size(); i++) {
      try {
        FileOutputStream fileOut = new FileOutputStream(arquivoConta + "/" + usuarios.get(i).getNome() + ".ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(usuarios.get(i));
        objectOut.close();

      } catch (IOException ioe) {
        ioe.printStackTrace();
      }
    }
  }

  private void desserializar(){
    File arquivoConta = new File("./arquivo/usuarios.bin");

    if (arquivoConta.listFiles() != null) {
      for (File file : arquivoConta.listFiles()) {
        try {
          ObjectInputStream conversor = new ObjectInputStream(new FileInputStream(file));
          UsuarioAbstract usuario = (UsuarioAbstract) conversor.readObject();
          if (!existe(usuario.getNome()))
            try{
              inserir(usuario);
            } catch(Exception e){
              e.printStackTrace();
            }
          conversor.close();

        } catch (ClassNotFoundException fnfe) {
          fnfe.printStackTrace();
        } catch (IOException ioe) {
          ioe.printStackTrace();
        }
      }
    }
  }

  
  // Auxiliar para remover o arquivo da conta quando este é removido do vetor
  private void removerArquivo(String nome) {
    File arquivousuario = new File("./arquivo/usuarios.bin");
    arquivousuario.mkdir();

    File conta = new File(arquivousuario + "/" + nome + ".ser");
    conta.delete();
  }
}