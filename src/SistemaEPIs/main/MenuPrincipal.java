package SistemaEPIs.main;

import SistemaEPIs.view.SubMenuDevolucao;
import SistemaEPIs.view.SubMenuEPI;
import SistemaEPIs.view.SubMenuEmprestimo;
import SistemaEPIs.view.SubMenuUsuario;

import java.util.Scanner;

public class MenuPrincipal {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========= Menu Principal =========");
            System.out.println("1. Gerenciar Usuários");
            System.out.println("2. Gerenciar EPIs");
            System.out.println("3. Gerenciar Empréstimos");
            System.out.println("4. Gerenciar Devoluções");
            System.out.println("0. Sair");
            System.out.println("==================================");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> SubMenuUsuario.exibirMenuUsuario();
                case 2 -> SubMenuEPI.subMenuEpi();
                case 3 -> SubMenuEmprestimo.subMenuEmprestimo();
                case 4 -> SubMenuDevolucao.menuDevolucao();
                case 0 -> System.out.println("Saindo.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}