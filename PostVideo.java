
import java.time.LocalDateTime;
import java.util.ArrayList;

/*    

- É permitido criar um post sem um vídeo nele.

*/

public class PostVideo implements Postavel {
    private Video video;
    private LocalDateTime data_postagem;
    private ArrayList<Comentario> lista_comentarios = new ArrayList<Comentario>();
    private int qtde_fixados = 0;

/*----------------------------------------------------------------------------*/

    public PostVideo() {}

    public void adicionaVideo(Video video) {
        this.video = video;
    }

/*----------------------------------------------------------------------------*/

    /*
        Verifica se há um vídeo associado, caso positivo atualiza a data da
        postagem e retorna TRUE.
        Caso não haja vídeo, retorna um estado de erro
    */
    @Override
    public boolean posta() {
        if(this.video != null) {
            this.data_postagem = LocalDateTime.now();
            return true;
        }
        else throw new NullPointerException("A postagem não contém um vídeo");
    }

    /* Adicionei o parâmetro da string | Ver "Recurso.java" */
    @Override
    public boolean comenta(String texto) {
        if(texto == null) {
            System.out.println("\033[31mInsira texto no comentário.\033[m");
            return false;
        }
        else {
            this.lista_comentarios.add(new Comentario(texto));
            return true;
        }
    }
}
