package system;
import java.util.Vector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class RepositorioJogos implements IRepo{
  private Vector<Jogo> jogos;

  public RepositorioJogos(){
    jogos = new Vector<Jogo>();
    desserializar();
  }
  
  public void inserir(Jogo jogo){
    if(!existe(jogo.getNome())){
      jogos.add(jogo);
      serializar();
    }
    else{
        
    }
  }

  public void remover(String nome){
    if(existe(nome)){
      jogos.remove(procurar(nome));
      removerArquivo(nome);
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

  public void apresentarJogo(String nome){
    if(existe(nome)){
      Jogo jogo = procurar(nome);
      System.out.println("Nome do jogo: " + jogo.getNome());
      System.out.println("Valor do jogo: " + jogo.getValor());
      System.out.println("Descrição do jogo: " + jogo.getDescricao());
    }
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

  private void desserializar() {
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