import java.io.FilenameFilter;

public class Testes {

    static PostFoto postFoto = null;
    static PostVideo postVideo = null;

    static String fileNames[] = {"abacate.jpg", "morango.png", "maracuja.bmp",
                            "caqui.bmp", "uva.png", "pera.jpg", "laranja.png",
                            "caju.png", "mamao.bmp", "kiwi.jpg", "tangerina.jpg",
                            "maca.mov", "abacaxi.mp4", "banana.wmv"};
    static String postTypes[] = {"POSTFOTO", "POSTVIDEO", "POSTTEXTO", "POSTIAGO"};

/*----------------------------------------------------------------------------*/

    // Teste 1 - Tentativa de Postagem com texto;
    public static void teste1(){
        for(String type : postTypes) {
            try {
                PostavelFactory.createPostavel(type);
                System.out.println("Teste 1: \033[32mOK\033[m");
            }
            catch(IllegalArgumentException erro) {
                System.out.printf("Teste 1: %s\n", erro.getMessage());
            }
        }
    }

/*----------------------------------------------------------------------------*/
    
    // Teste 2 - Tentativa de postagem com um vídeo atribuído;
    public static void teste2() {
        postVideo = (PostVideo)PostavelFactory.createPostavel("POSTVIDEO");

        for(String url : fileNames) {
            try {
                postVideo.adicionaVideo(new Video(url));
                System.out.println("Teste 2: \033[32mOK\033[m");
            }
            catch(IllegalArgumentException | NullPointerException erro) {
                System.out.printf("Teste 2: %s\n", erro.getMessage());
            }
        }
        if(postVideo.posta()) postVideo.printPost();
    }

/*----------------------------------------------------------------------------*/

    // Teste 3 - Tentativa de postagem sem vídeo;
    public static void teste3() {
        postVideo = (PostVideo)PostavelFactory.createPostavel("POSTVIDEO");

        try {
            if(postVideo.posta()) System.out.println("Teste 3: \033[31mFAIL\033[m");
        }
        catch(NullPointerException erro) {
            System.out.printf("Teste 3: \033[32mOK %s\n", erro.getMessage());
        }
    }

/*----------------------------------------------------------------------------*/

    // Teste 4 - Tentativa de postagem sem foto;
    public static void teste4() {
        postFoto = (PostFoto)PostavelFactory.createPostavel("POSTFOTO");

        try {
            postFoto.posta();
            System.out.println("Teste 4: \033[31mFAIL\033[m");
        }
        catch(IndexOutOfBoundsException erro) {
            System.out.printf("Teste 4: \033[32mOK %s\033[m\n", erro.getMessage());
        }
    }
 
/*----------------------------------------------------------------------------*/

    // Teste 5 - Tentativa de postagem com 5 fotos atribuídas;
    public static void teste5() {
        postFoto = (PostFoto)PostavelFactory.createPostavel("POSTFOTO");

        try {
            for(String url : fileNames) {
                postFoto.adicionaFoto(new Foto(url));
                if(postFoto.getQtde_fotos() == 5) break;
            }
            if(postFoto.posta()) System.out.println("Teste 5: \033[32mOK\033[m");

            postFoto.printPost();
        }
        catch(IllegalArgumentException erro) {
            System.out.printf("Teste 5: %s\n", erro.getMessage());
        }
    }

/*----------------------------------------------------------------------------*/

    // Teste 6 - Tentativa de postagem com 11 fotos atribuídas;
    public static void teste6() {
        postFoto = (PostFoto)PostavelFactory.createPostavel("POSTFOTO");
        try {
            for(String url : fileNames) {
                postFoto.adicionaFoto(new Foto(url));
                if(postFoto.getQtde_fotos() == 11) break;  
            }
            postFoto.posta();
        }
        catch(IndexOutOfBoundsException erro) {
            System.out.printf("Teste 6: \033[32mOK\033[m %s\n", erro.getMessage());            
        }
    }

/*----------------------------------------------------------------------------*/

    // Teste 7 - Tentativa de criação de comentário em uma postagem com foto;
    public static void teste7() {
        postFoto = (PostFoto)PostavelFactory.createPostavel("POSTFOTO");
        postFoto.adicionaFoto(new Foto(fileNames[3]));

        if(postFoto.comenta("Ta lindo amiga")) {
            System.out.println("Teste 7: \033[32mOK\033[m");
            postFoto.printPost();
        }
        else System.out.println("Teste 7: \033[31mFAIL\033[m");
    }

/*----------------------------------------------------------------------------*/

    // Teste 8 - Tentativa de criação de comentário em uma postagem com vídeo;
    public static void teste8() {
        postVideo = (PostVideo)PostavelFactory.createPostavel("POSTVIDEO");
        postVideo.adicionaVideo(new Video(fileNames[12]));

        if(postVideo.comenta("Nunca vi um vídeo tão lindo na vida !!!")) {
            System.out.println("Teste 8: \033[32mOK\033[m");
            postVideo.printPost();
        }
        else System.out.println("Teste 8: \033[31mFAIL\033[m");
    }

/*----------------------------------------------------------------------------*/

    // Teste 9 - Tentativa de criação de vídeo inválido;
    public static void teste9() {
        try {
            postVideo = (PostVideo)PostavelFactory.createPostavel("POSTVIDEO");

            if(postVideo.adicionaVideo(new Video(fileNames[1]))) {
                System.out.println("Teste 9: \033[31mFAIL\033[m");
            }
        }
        catch(IllegalArgumentException erro) {
            System.out.printf("Teste 9: \033[32mOK\033[m %s\n", erro.getMessage());
        }
    }

/*----------------------------------------------------------------------------*/

    // Teste 10 - Tentativa de criação de foto inválida;
    public static void teste10() {
        postFoto = (PostFoto)PostavelFactory.createPostavel("POSTFOTO");

        try {
            if(postFoto.adicionaFoto(new Foto(fileNames[13]))) {
                System.out.println("Teste 10: \033[31mFAIL\033[m");
            }
        }
        catch(IllegalArgumentException erro) {
            System.out.printf("Teste 10: \033[32mOK\033[m %s\n", erro.getMessage());
        }
    }
}