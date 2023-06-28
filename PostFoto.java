

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PostFoto implements Postavel{

    private int qtde_fotos = 0, qtde_fixados = 0;
    private ArrayList<Foto> fotos = new ArrayList<Foto>();
    private String localizacao;
    private LocalDateTime data_postagem = null;
    private ArrayList<Comentario> lista_comentarios = new ArrayList<Comentario>();

    public PostFoto() {}

/*----------------------------------------------------------------------------*/

    public int getQtde_fotos() { return qtde_fotos; }

    public void setLocalizacao(String localizacao) { this.localizacao = localizacao; }

/*----------------------------------------------------------------------------*/

    public boolean adicionaFoto(Foto foto) {
        if(foto != null) {
            this.fotos.add(foto);
            this.qtde_fotos += 1;
            return true;
        }
        else return false;
    }

    public boolean removeFoto(int posicao) {
        if((this.fotos.remove(posicao) != null)) {
            this.qtde_fotos -= 1;
            return true;
        }
        else return false;
    }

/*----------------------------------------------------------------------------*/

    @Override
    public boolean posta() {
        if((0 < this.qtde_fotos) && (this.qtde_fotos < 11)) {
            this.data_postagem = LocalDateTime.now();
            return true;
        }
        else throw new IndexOutOfBoundsException("\033[31mQuantidade de fotos inválida.\033[m");
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

    @Override
    public void printPost() {
        if(this.data_postagem != null) System.out.println(this.data_postagem);

        for(Foto pic : this.fotos) {
            for(int i=0 ; i<pic.url_recurso.length()+4 ; i+=1) {
                System.out.printf("-");
            }
            System.out.printf("\n| %s |\n", pic.url_recurso);
            for(int i=0 ; i<pic.url_recurso.length()+4 ; i+=1) {
                System.out.printf("-");
            }
            System.out.println("");
        }
        
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
