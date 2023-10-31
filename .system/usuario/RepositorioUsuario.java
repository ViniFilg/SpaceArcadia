package system.usuario;

import java.util.Vector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class RepositorioUsuario {
  private Vector<UsuarioAbstract> usuarios;

  public RepositoriouUsuario(){
    usuarios = new Vector<UsuarioAbstract>();
    desserializar();
  }

  public void inserir(UsuarioAbstract usuario) {
    if (!existe(usuario.getNome())) {
      usuarios.add(usuario);
      serializar();
    } else {

    }
  }

  public void remover(String nome) {
    if (existe(nome)) {
      usuarios.remove(procurar(nome));
      removerArquivo(nome);
      serializar();
    }
  }

  public boolean existe(String nome) {
    if (procurar(nome) != null)
      return true;
    else
      return false;
  }

  public usuario procurar(String nome) {
    for (int i = 0; i < usuarios.size(); i++) {
      if (usuarios.get(i).getNome().equals(nome))
        return usuarios.get(i);
    }
    return null;
  }

  public void apresentarusuario(String nome) {
    if (existe(nome)) {
      usuario usuario = procurar(nome);
      System.out.println("Nome do usuario: " + usuario.getNome());
      System.out.println("Créditos do usuario: " + usuario.getValor());
      System.out.println("Jogos do usuario: ");
      for (Jogo jogo : usuario.getJogos()) {
        System.out.println(jogo.getNome());
      }
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

  private void desserializar() {
    File arquivoConta = new File("./arquivo/usuarios.bin");

    if (arquivoConta.listFiles() != null) {
      for (File file : arquivoConta.listFiles()) {
        try {
          ObjectInputStream conversor = new ObjectInputStream(new FileInputStream(file));
          UsuarioAbstract usuario = (UsuarioAbstract) conversor.readObject();
          if (!existe(usuario.getNome()))
            inserir(usuario);
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