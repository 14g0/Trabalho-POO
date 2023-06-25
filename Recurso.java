public abstract class Recurso {
    protected String url_recurso;
    protected static int prox_ID = 0;

    //Foi definido como final porque teoricamente não muda.
    protected final int ID = prox_ID;

    abstract public boolean validaUrlRecurso(String url);
}
