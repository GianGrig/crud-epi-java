package SistemaEPIs.view;

import SistemaEPIs.model.EPI;

import java.util.Scanner;

public class SubMenuEPI {
    private static Scanner scanner = new Scanner(System.in);

    public static void subMenuEpi() {
        int opcao;

        do {
            System.out.println("\n========= Menu de EPIs =========");
            System.out.println("1. Cadastrar EPI");
            System.out.println("2. Listar EPIs");
            System.out.println("3. Atualizar EPI");
            System.out.println("4. Remover EPI");
            System.out.println("0. Voltar");
            System.out.println("================================");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do EPI: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    EPI.cadastrarEpi(nome, quantidade);
                }
                case 2 ->   EPI.listarEpis();
                case 3 -> {
                    if (EPI.getEpis().isEmpty()) {
                        System.out.println("Não há EPIs para atualizar.");
                    }
                    else {
                        EPI.listarEpis();
                        System.out.print("Índice do EPI a ser atualizado: ");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Novo nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Nova quantidade: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();
                        EPI.atualizarEpi(i, nome, quantidade);
                    }
                }
                case 4 -> {
                    if (EPI.getEpis().isEmpty()) {
                        System.out.println("Não há EPIs para remover.");
                    }
                    else {
                        EPI.listarEpis();
                        System.out.print("Índice do EPI a ser removido: ");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        EPI.removerEpi(i);
                    }
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
