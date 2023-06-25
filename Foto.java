public class Foto extends Recurso {
    private String resolucao;

    public void setResolucao(String resolucao) { this.resolucao = resolucao; }

/*----------------------------------------------------------------------------*/

    public Foto(String url) {
        if(validaUrlRecurso(url));
        throw new NullPointerException("\033[31mURL da foto é inválida.\033[m");
    }

/*----------------------------------------------------------------------------*/

    public boolean equals(Foto foto) {
        if(foto.resolucao.equals(this.resolucao)
        && foto.url_recurso.equals(this.url_recurso)) return true;

        else return false;
    }

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
