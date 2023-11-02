package system;

interface IRepo{
  public void inserir(Jogo jogo);
  public void remover(String nome);
  public boolean existe(String nome);
  public Jogo procurar(String nome);
}


