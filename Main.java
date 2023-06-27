public class Main {
    public static void main(String[] args) {
        String fileNames[] = {"abacate.jpg", "morango.mp5", "maracuja.bmp",
                              "caqui.bme", "uva.png", "maca.mov", "abacaxi.mp4",
                              "banana.wmv", "pera.svg", "laranja.987"};
        
        PostFoto postFoto = (PostFoto)PostavelFactory.createPostavel("POSTFOTO");
        PostVideo postVideo = (PostVideo)PostavelFactory.createPostavel("POSTVIDEO");


        // Teste 1 - Tentativa de Postagem com texto;
        if(postFoto.comenta("Tá lindo amiga")) {
            System.out.println("Teste 1: \033[32mOK\033[m");
            postFoto.printPost();
        }
        else System.out.println("Teste 1: \033[31mfailed\033[m");

    }
}
