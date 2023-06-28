public class Foto extends Recurso {
    private String resolucao;

    public Foto(String url) {
        if(validaUrlRecurso(url)) {
            this.url_recurso = url;
            Recurso.prox_ID += 1;
        }
        else throw new IllegalArgumentException("\033[31mURL("+ url +") é inválida para um vídeo.\033[m");
    }
    
/*----------------------------------------------------------------------------*/
    
    public void setResolucao(String resolucao) { this.resolucao = resolucao; }

/*----------------------------------------------------------------------------*/

    @Override
    public boolean validaUrlRecurso(String url) {
        url = url.substring(url.length()-4, url.length());

        if(url.equals(".jpg") ||
           url.equals(".png") ||
           url.equals(".bmp")) {
            return true;
        }
        else return false;
    }
}