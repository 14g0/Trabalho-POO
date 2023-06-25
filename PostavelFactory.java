public class PostavelFactory {

    public Postavel createPostavel(String type) {

        if(type.equals("POSTFOTO")) {
            return new PostFoto();
        }
        else if (type.equals("POSTVIDEO")) {
            return new PostVideo();
        }
        else return null;
    }
}
