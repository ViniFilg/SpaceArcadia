package system.usuario;
package system.jogos;
import java.io.Serializable;

public class Comentario implements Serializable {
    private String nome;
    private String comentario;

    public Comentario(String nome, String comentario) {
        this.nome = nome;
        this.comentario = comentario;
    }

    public String getNome() {
        return nome;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}