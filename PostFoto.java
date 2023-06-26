
import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostFoto implements Postavel{

    private int qtde_fotos = 0, qtde_fixados = 0;
    private ArrayList<Foto> fotos = new ArrayList<Foto>();
    private String localizacao;
    private LocalDateTime data_postagem;
    private ArrayList<Comentario> lista_comentarios = new ArrayList<Comentario>();

    public PostFoto() {}

/*----------------------------------------------------------------------------*/

    public boolean adicionaFoto(Foto foto) {
        if(foto != null) {
            fotos.add(foto);
            qtde_fotos += 1;
            return true;
        }
        else return false;
    }

    public boolean removeFoto(int posicao) {
        if(fotos.remove(posicao) != null) {
            qtde_fotos -= 1;
            return true;
        }
        else return false;
    }

/*----------------------------------------------------------------------------*/

    @Override
    public boolean posta() {
        if((1 <= qtde_fotos) && (qtde_fotos <= 10)) {
            this.data_postagem = LocalDateTime.now();
            return true;
        }
        else return false;
    }

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
