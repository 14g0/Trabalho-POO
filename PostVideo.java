import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostVideo implements Postavel {
    private Video video;
    private LocalDateTime data_postagem;
    private ArrayList<Comentario> lista_comentarios = new ArrayList<Comentario>();
    private int qtde_fixados = 0;

    public PostVideo() {}

/*----------------------------------------------------------------------------*/

    public boolean adicionaVideo(Video video) {
        if(video != null) {
            this.video = video;
            return true;
        }
        else return false;
    }

/*----------------------------------------------------------------------------*/

    @Override
    public boolean posta() {
        if(this.video != null) {
            this.data_postagem = LocalDateTime.now();
            return true;
        }
        else throw new NullPointerException("\033[31mA postagem não contém um vídeo\033[m");
    }

    /* Adicionei o parâmetro da string | Ver "Postavel.java" */
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

    @Override
    public void printPost() {
        if(this.data_postagem != null) System.out.println(this.data_postagem);

        for(int i=0 ; i<this.video.url_recurso.length()+4 ; i+=1) {
            System.out.printf("-");
        }
        System.out.printf("\n| %s |\n", this.video.url_recurso);
        for(int i=0 ; i<this.video.url_recurso.length()+4 ; i+=1) {
            System.out.printf("-");
        }
        System.out.println("\033[m");

        for(Comentario comment : this.lista_comentarios) {
            for(int i=0 ; i<comment.getTexto().length()+3 ; i+=1) {
                System.out.printf("\033[33m-");
            }
            System.out.printf("\n|\033[m %s \033[33m|\n", comment.getTexto());
            for(int i=0 ; i<comment.getTexto().length()+3 ; i+=1) {
                System.out.printf("-");
            }
            System.out.println("\033[m");
        }
    }
}
