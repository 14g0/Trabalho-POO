
import java.time.LocalDateTime;

public class Comentario {
    private LocalDateTime data;
    private boolean fixado;
    private int tamanho;
    private String texto;

    public void setFixado(boolean fixado) { this.fixado = fixado; }

    public Comentario(String texto) {
        this.tamanho = texto.length();
        this.texto = texto;
        this.data = LocalDateTime.now();
    }
}
