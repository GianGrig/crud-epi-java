package SistemaEPIs.view;

import SistemaEPIs.model.Emprestimo;

import java.util.Scanner;

public class SubMenuEmprestimo {
    private static Scanner scanner = new Scanner(System.in);

    public static void subMenuEmprestimo () {
        int opcao;

        do {
            System.out.println("\n========= Menu de Empréstimos =========");
            System.out.println("1. Registrar Empréstimo");
            System.out.println("2. Listar Empréstimos");
            System.out.println("3. Atualizar Empréstimo");
            System.out.println("4. Remover Empréstimo");
            System.out.println("0. Voltar");
            System.out.println("=======================================");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Nome da EPI: ");
                    String epi = scanner.nextLine();
                    System.out.print("Data do empréstimo: ");
                    String data = scanner.nextLine();
                    System.out.print("Data prevista do empréstimo: ");
                    String dataPrevistaEmp = scanner.nextLine();
                    Emprestimo.cadastrarEmprestimo(usuario, epi, data, dataPrevistaEmp);
                }
                case 2 -> Emprestimo.listarEmprestimos();
                case 3 -> {
                    if (Emprestimo.getEmprestimos().isEmpty()){
                        System.out.println("Não há empréstimos para atualizar.");
                    }
                    else {
                        Emprestimo.listarEmprestimos();
                        System.out.print("Informe o índice do empréstimo que deseja atualizar: ");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Novo nome do usuário: ");
                        String usuario = scanner.nextLine();
                        System.out.print("Novo nome da EPI: ");
                        String epi = scanner.nextLine();
                        System.out.print("Nova data de empréstimo: ");
                        String data = scanner.nextLine();
                        System.out.print("Nova data prevista do empréstimo: ");
                        String dataPrevistaEmp = scanner.nextLine();
                        Emprestimo.atualizarEmprestimo(i, usuario, epi, data, dataPrevistaEmp);
                    }
                }
                case 4 -> {
                    if (Emprestimo.getEmprestimos().isEmpty()){
                        System.out.println("Não há empréstimos para remover.");
                    }
                    else {
                        Emprestimo.listarEmprestimos();
                        System.out.print("Informe o índice do empréstimo que deseja remover: ");
                        int i = scanner.nextInt();
                        scanner.nextLine();
                        Emprestimo.removerEmprestimo(i);
                    }
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
