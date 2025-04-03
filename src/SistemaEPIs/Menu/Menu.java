package SistemaEPIs.Menu;

import java.util.Scanner;

public class Menu {

    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Gerenciar Usuários");
            System.out.println("2. Gerenciar EPIs");
            System.out.println("3. Gerenciar Empréstimos");
            System.out.println("4. Gerenciar Devoluções");
            System.out.println("0. Sair");
            System.out.println("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> menuUsuario();
                case 2 -> menuEpi();
                case 3 -> menuEmprestimos();
                case 4 -> menuDevolucao();
                case 0 -> System.out.println("Saindo.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
