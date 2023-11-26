package system.jogos;

import java.io.Serializable;
import java.util.Vector;
import system.usuario.Comentario;

public class Jogo implements Serializable {

    private String nome;
    private double valor;
    private String descricao;
    private Vector<Comentario> comentarios; 

    public Jogo(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.comentarios = new Vector<Comentario>(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Metodos dos comentarios:

    public Vector<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

  public void comentar(String nomeUsuario, String textoComentario) throws CLEException{
    if (textoComentario.length() > 300) {
        throw new CLEException("Limite de 300 caracteres para o comentário excedido");
    } else{
      Comentario comentario = new Comentario(nomeUsuario, textoComentario);
      adicionarComentario(comentario);
    }
  }
}