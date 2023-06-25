
public class Video extends Recurso {
    private int frame_rate, duracao;

    public void setDuracao(int duracao) { this.duracao = duracao; }

    public void setFram_rate(int frame_rate) { this.frame_rate = frame_rate; }

/*----------------------------------------------------------------------------*/

    public Video(String url) {
        if(validaUrlRecurso(url));
        throw new NullPointerException("\033[31mURL do video é inválida.\033[m");
    }

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
