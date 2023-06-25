public class PostavelFactory {

    public static Postavel createPostavel(String type) {
        Postavel  post;

        switch(type) {
            case "POSTFOTO":
                System.out.println("criei uma foto");
                return new PostFoto();

            case "POSTVIDEO":
                System.out.println("criei um video");
                return new PostVideo();

            default:                
                throw new IllegalArgumentException("\033[mArgumento desconhecido\033[m");
        }

    }
}
