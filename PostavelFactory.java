public class PostavelFactory {

    public static Postavel createPostavel(String type) {
        Postavel  post;

        switch(type) {
            case "POSTFOTO":
                return new PostFoto();

            case "POSTVIDEO":
                return new PostVideo();

            default:                
                throw new IllegalArgumentException("\033[31mArgumento '"+ type + "' desconhecido.\033[m");
        }

    }
}
