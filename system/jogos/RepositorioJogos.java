package system.jogos;
import java.util.Vector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import system.jogos.Jogo;

import system.jogos.exceptions.JIException;
import system.jogos.exceptions.JEException;
import system.jogos.exceptions.CLEException;

public class RepositorioJogos implements IRepo{
  private Vector<Jogo> jogos;

  public RepositorioJogos() {
    jogos = new Vector<Jogo>();
    try{
      desserializar();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
  
  public void inserir(Jogo jogo) throws JEException{
    if(!existe(jogo.getNome())){
      jogos.add(jogo);
      serializar();
    }
    else{
      throw new JEException(jogo.getNome());
    }
  }

  public void remover(String nome){
    if(existe(nome)){
      jogos.remove(procurar(nome));
      removerArquivo(nome);
      serializar();
    }
  }

  public void editarJogo(String nome, String novoNome, Double novoValor, String novaDescricao) {
      if (existe(nome)) {
          Jogo jogo = procurar(nome);

          // Abaixo, verificamos se o nome que foi fornecido não é igual ao nome atual
          if (novoNome != null && !novoNome.equals(jogo.getNome())) {
              // Logo abaixo, é verificado se o novo nome já existe em outros jogos
              if (!existe(novoNome)) {
                  jogo.setNome(novoNome);
                  removerArquivo(nome);
              } else {
                  
                  return;
              }
          }

          if (novoValor != null) {
              jogo.setValor(novoValor);
          }

          if (novaDescricao != null) {
              jogo.setDescricao(novaDescricao);
          }

          serializar();
      }
  }

  public boolean existe(String nome){
    if (procurar(nome) != null)
      return true;
    else
      return false;
  }

  public Jogo procurar(String nome){
    for(int i = 0; i < jogos.size(); i++){
      if(jogos.get(i).getNome().equals(nome))
        return jogos.get(i);
    }
    return null;
  }

  public Vector<Jogo> getJogos(){
    return jogos;
  }

  public void adicionarComentario(String nomeJogo, Comentario comentario) throws CLEException{
    Jogo jogo = procurar(nomeJogo);
    jogo.adicionarComentario(comentario);
    serializar();
  }

  private void serializar() {
    File arquivoConta = new File("./arquivo/jogos.bin");
    arquivoConta.mkdir();

    for (int i = 0; i < jogos.size(); i++){
      try{
        FileOutputStream fileOut = new FileOutputStream(arquivoConta + "/" + jogos.get(i).getNome() + ".ser");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(jogos.get(i));
        objectOut.close();

      } catch(IOException ioe){
        ioe.printStackTrace();
      }
    }
  }

  private void desserializar() throws JEException{
    File arquivoConta = new File("./arquivo/jogos.bin");

    if(arquivoConta.listFiles() != null){
      for (File file : arquivoConta.listFiles()) {
        try{
          ObjectInputStream conversor = new ObjectInputStream(new FileInputStream(file));
          Jogo jogo = (Jogo) conversor.readObject();
          if(!existe(jogo.getNome()));
            inserir(jogo);
          conversor.close();

        } catch(ClassNotFoundException fnfe){
          fnfe.printStackTrace();
        } catch(IOException ioe){
          ioe.printStackTrace();
        }
      }
    }
  }

  // Auxiliar para remover o arquivo da conta quando este é removido do vetor
  private void removerArquivo(String nome) {
    File arquivoJogo = new File("./arquivo/jogos.bin");
    arquivoJogo.mkdir();

    File conta = new File(arquivoJogo + "/" + nome + ".ser");
    conta.delete();
  }
}

