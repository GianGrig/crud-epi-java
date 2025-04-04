package SistemaEPIs.Menu;

import SistemaEPIs.ClassesPrincipais.Usuário.Usuario;

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
                case 1 -> menuUsuario(scanner);
                //case 2 -> menuEpi(scanner);
                //case 3 -> menuEmprestimos(scanner);
                //case 4 -> menuDevolucao(scanner);
                case 0 -> System.out.println("Saindo.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void menuUsuario(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n--- Menu de Usuários ---");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Remover Usuário");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();
                    Usuario.cadastrarUsuario(nome, email, cargo);
                }
                case 2 -> Usuario.listarUsuarios();
                case 3 -> {
                    Usuario.listarUsuarios();
                    System.out.print("Informe o índice do usuário a ser atualizado: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String novoEmail = scanner.nextLine();
                    System.out.print("Novo cargo: ");
                    String novoCargo = scanner.nextLine();

                    Usuario.atualizarUsuario(i, novoNome, novoEmail, novoCargo);
                }
                case 4 -> {
                    Usuario.listarUsuarios();
                    System.out.print("Informe o índice do usuário a ser removido: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    Usuario.removerUsuario(i);
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
