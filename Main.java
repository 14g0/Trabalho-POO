import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner input = new Scanner(System.in);

        do {
            Menu.limparTerminal();
            Menu.trabalhoPratico();

            System.out.println("\nInsira o número do teste desejado:");
            System.out.printf("Digite 0 para finalizar o programa.\n> ");
            option = input.nextInt();
            input.nextLine();
            System.out.println("");

            switch(option) {
                case 0:
                    Menu.limparTerminal();
                    System.out.println("Até a próxima \033[1;34mT-T\033[m");
                    return;
                
                case 1:
                    Testes.teste1();
                    break;
                
                case 2:
                    Testes.teste2();
                    break;

                case 3:
                    Testes.teste3();
                    break;

                case 4:
                    Testes.teste4();
                    break;

                case 5:
                    Testes.teste5();
                    break;

                case 6:
                    Testes.teste6();
                    break;

                case 7:
                    Testes.teste7();
                    break;

                case 8:
                    Testes.teste8();
                    break;
                
                case 9:
                    Testes.teste9();
                    break;
                
                case 10:
                    Testes.teste10();
                    break;
                
                default:
                        Menu.limparTerminal();
                        System.out.println("\033[33mEntrada inválida.");
                    break;
            }

            System.out.println("\n[Aperte qualquer tecla para continuar]\033[m");
            input.nextLine();

        } while(option != 0);

        input.close();
    }
}
