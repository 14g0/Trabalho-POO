public class Menu {
    
    public static void limpaTerminal() {
        // Código ANSI(?) para limpar o terminal.
        System.out.println("\033\143");
    }

/*----------------------------------------------------------------------------*/
    
    public static void trabalhoPratico() {
        System.out.printf(
            "\033[1;36m  ______           __          ____         \n"+
            " /_  __/________ _/ /_  ____ _/ / /_  ____  \n"+
            "  / / / ___/ __ `/ __ \\/ __ `/ / __ \\/ __ \\ \n"+
            " / / / /  / /_/ / /_/ / /_/ / / / / / /_/ / \n"+
            "/_/ /_/   \\__,_/_.___/\\__,_/_/_/ /_/\\____/  \n"+

            "    ____             __  _                  \n"+
            "   / __ \\_________ _/ /_(_)________         \n"+
            "  / /_/ / ___/ __ `/ __/ / ___/ __ \\        \n"+
            " / ____/ /  / /_/ / /_/ / /__/ /_/ /        \n"+
            "/_/   /_/   \\__,_/\\__/_/\\___/\\____/         \n\033[m"
        );
    }    
}
