

public interface Postavel {
    public boolean posta();

    /*
        Adicionei a string texto pra criar o Comentário já com o texto porque
        todos os outros dados do comentário são pegos a partir do texto
        que é adicionado assim que se cria, no meu construtor.
    */
    public boolean comenta(String texto);
    
    public void printPost();
}
