
import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostFoto implements Postavel{

    private int qtde_fotos = 0, qtde_fixados = 0;
    private ArrayList<Foto> fotos = new ArrayList<Foto>();
    private String localizacao;
    private LocalDateTime data_postagem;
    // Teve quer ser colocado como ArrayList supondo
    private ArrayList<Comentario> listaComentarios = new ArrayList<Comentario>();

/*----------------------------------------------------------------------------*/

    public void PostFoto() {}

    public boolean adicionaFoto() {
        return true;
    }

    public boolean removeFoto(Foto foto) {

        return true;
    }

/*----------------------------------------------------------------------------*/

    @Override
    public boolean posta() {
        return true;
    }

    @Override
    public boolean comenta(String texto) {
        return true;
    }
}
