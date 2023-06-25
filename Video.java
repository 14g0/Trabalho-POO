
public class Video extends Recurso {
    private int frame_rate, duracao;

    public Video(String url) {
        if(this.validaUrlRecurso(url)) {
            this.url_recurso = url;
            Recurso.prox_ID += 1;
        }
        else throw new IllegalArgumentException("\033[31mURL do VIDEO é inválida.\033[m");
    }

/*----------------------------------------------------------------------------*/

    public void setDuracao(int duracao) { this.duracao = duracao; }

    public void setFram_rate(int frame_rate) { this.frame_rate = frame_rate; }

/*----------------------------------------------------------------------------*/

    @Override
    public boolean validaUrlRecurso(String url) {
        url = url.substring(url.length()-4, url.length());

        if(url.equals(".mp4") ||
           url.equals(".mov") ||
           url.equals(".wmv")) {
            return true;
        }
        else return false;
    }
}
