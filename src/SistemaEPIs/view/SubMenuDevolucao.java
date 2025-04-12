package SistemaEPIs.view;

import SistemaEPIs.model.Devolucao;

import java.util.Scanner;

public class SubMenuDevolucao {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuDevolucao() {
        int opcao;

        do {
            System.out.println("\n========= Menu de Devoluções =========");
            System.out.println("1. Registrar Devolução");
            System.out.println("2. Listar Devoluções");
            System.out.println("3. Atualizar Devolução");
            System.out.println("4. Remover Devolução");
            System.out.println("0. Voltar");
            System.out.println("======================================");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Nome da EPI: ");
                    String epi = scanner.nextLine();
                    System.out.print("Data da devolução: ");
                    String data = scanner.nextLine();
                    Devolucao.cadastrarDevolucao(usuario, epi, data);
                }
                case 2 -> Devolucao.listarDevolucoes();
                case 3 -> {
                    if (Devolucao.getDevolucoes().isEmpty()){
                        System.out.println("Não há devoluções para atualizar.");
                    }
                    else {
                        Devolucao.listarDevolucoes();
                        System.out.print("Informe o índice da devolução que deseja atualizar: ");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Novo nome do usuário: ");
                        String usuario = scanner.nextLine();
                        System.out.print("Novo nome da EPI: ");
                        String epi = scanner.nextLine();
                        System.out.print("Nova data da devolução: ");
                        String data = scanner.nextLine();
                        Devolucao.atualizarDevolucao(i, usuario, epi, data);
                    }
                }
                case 4 -> {
                    if (Devolucao.getDevolucoes().isEmpty()){
                        System.out.println("Não há devoluções para remover.");
                    }
                    else {
                        Devolucao.listarDevolucoes();
                        System.out.print("Informe o índice da devolução que deseja remover: ");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        Devolucao.removerDevolucao(i);
                    }
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
