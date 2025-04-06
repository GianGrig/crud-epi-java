package SistemaEPIs.Menu;

import SistemaEPIs.ClassesPrincipais.Usuario.Usuario;
import SistemaEPIs.ClassesPrincipais.EPI.EPI;
import SistemaEPIs.ClassesPrincipais.Emprestimo.Emprestimo;
import SistemaEPIs.ClassesPrincipais.Devolucao.Devolucao;

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
                case 2 -> menuEpi(scanner);
                case 3 -> menuEmprestimos(scanner);
                case 4 -> menuDevolucao(scanner);
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

    private static void menuEpi(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n--- Menu de EPIs ---");
            System.out.println("1. Cadastrar EPI");
            System.out.println("2. Listar EPIs");
            System.out.println("3. Atualizar EPI");
            System.out.println("4. Remover EPI");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do EPI: ");
                    String nome = scanner.nextLine();
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();
                    EPI.cadastrarEpi(nome, quantidade);
                }
                case 2 ->   EPI.listarEpis();
                case 3 -> {
                    EPI.listarEpis();
                    System.out.print("Índice do EPI a ser atualizado: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Nova validade (meses): ");
                    int validade = scanner.nextInt();
                    scanner.nextLine();
                    EPI.atualizarEpi(i, nome, validade);
                }
                case 4 -> {
                    EPI.listarEpis();
                    System.out.print("Índice do EPI a ser removido: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    EPI.removerEpi(i);
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void menuEmprestimos(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n--- Menu de Empréstimos ---");
            System.out.println("1. Registrar Empréstimo");
            System.out.println("2. Listar Empréstimos");
            System.out.println("3. Atualizar Empréstimo");
            System.out.println("4. Remover Empréstimo");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("EPI emprestado: ");
                    String epi = scanner.nextLine();
                    System.out.print("Data do empréstimo: ");
                    String data = scanner.nextLine();
                    System.out.print("Data prevista do empréstimo: ");
                    String dataPrevistaEmp = scanner.nextLine();
                    Emprestimo.cadastrarEmprestimo(usuario, epi, data, dataPrevistaEmp);
                }
                case 2 -> Emprestimo.listarEmprestimos();
                case 3 -> {
                    Emprestimo.listarEmprestimos();
                    System.out.print("Índice do empréstimo a ser atualizado: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome do usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Novo EPI: ");
                    String epi = scanner.nextLine();
                    System.out.print("Nova data: ");
                    String data = scanner.nextLine();
                    System.out.print("Data prevista do empréstimo: ");
                    String dataPrevistaEmp = scanner.nextLine();
                    Emprestimo.atualizarEmprestimo(i, usuario, epi, data, dataPrevistaEmp);
                }
                case 4 -> {
                    Emprestimo.listarEmprestimos();
                    System.out.print("Índice do empréstimo a ser removido: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    Emprestimo.removerEmprestimo(i);
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void menuDevolucao(Scanner scanner) {
        int opcao;

        do {
            System.out.println("\n--- Menu de Devoluções ---");
            System.out.println("1. Registrar Devolução");
            System.out.println("2. Listar Devoluções");
            System.out.println("3. Atualizar Devolução");
            System.out.println("4. Remover Devolução");
            System.out.println("0. Voltar");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do Usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("EPI devolvido: ");
                    String epi = scanner.nextLine();
                    System.out.print("Data da devolução: ");
                    String data = scanner.nextLine();
                    Devolucao.cadastrarDevolucao(usuario, epi, data);
                }
                case 2 -> Devolucao.listarDevolucoes();
                case 3 -> {
                    Devolucao.listarDevolucoes();
                    System.out.print("Índice da devolução a ser atualizada: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome do usuário: ");
                    String usuario = scanner.nextLine();
                    System.out.print("Novo EPI: ");
                    String epi = scanner.nextLine();
                    System.out.print("Nova data: ");
                    String data = scanner.nextLine();
                    Devolucao.atualizarDevolucao(i, usuario, epi, data);
                }
                case 4 -> {
                    Devolucao.listarDevolucoes();
                    System.out.print("Índice da devolução a ser removida: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    Devolucao.removerDevolucao(i);
                }
                case 0 -> System.out.println("Voltando ao Menu Principal.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}