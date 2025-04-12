package SistemaEPIs.view;

import SistemaEPIs.model.Usuario;

import java.util.Scanner;

public class SubMenuUsuario {
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenuUsuario() {
        int opcao;

        do {
            System.out.println("\n========= Menu de Usuários =========");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Listar Usuários");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Remover Usuário");
            System.out.println("0. Voltar");
            System.out.println("====================================");
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
                    if (Usuario.getUsuarios().isEmpty()) {
                        System.out.println("Não há usuários para atualizar.");
                    }
                    else {
                        Usuario.listarUsuarios();
                        System.out.print("Informe o índice do usuário que deseja atualizar: ");
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
                }
                case 4 -> {
                    if (Usuario.getUsuarios().isEmpty()) {
                        System.out.println("Não há usuários para remover.");
                    }
                    else {
                        Usuario.listarUsuarios();
                        System.out.print("Informe o índice do usuário que deseja remover: ");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        Usuario.removerUsuario(i);
                    }
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
