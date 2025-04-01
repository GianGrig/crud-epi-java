import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuario {
    static ArrayList<String> usuario = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de EPIs ---");
            System.out.println("1. Cadastrar Usuario");
            System.out.println("2. Listar Usuarios");
            System.out.println("3. Atualizar Usuario");
            System.out.println("4. Remover Usuario");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> listarUsuarios();
                case 3 -> atualizarUsuario();
                case 4 -> removerUsuario();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
    static void cadastrarUsuario() {
        System.out.print("Digite o nome do Usuario: ");
        String nome = input.nextLine();
        usuario.add(nome);
        System.out.println("Usuario cadastrado com sucesso!");
    }
    static void listarUsuarios() {
        System.out.println("\n--- Lista de Usuarios ---");
        for (int i = 0; i < usuario.size(); i++) {
            System.out.println(i + " - " + usuario.get(i));
        }
    }
    static void atualizarUsuario() {
        listarUsuarios();
        System.out.print("Digite o índice do Usuario: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < usuario.size()) {
            System.out.print("Digite o novo nome: ");
            String novoNome = input.nextLine();
            usuario.set(index, novoNome);
            System.out.println("EPI atualizado.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
    static void removerUsuario() {
        listarUsuarios();
        System.out.print("Digite o índice do Usuario: ");
        int index = input.nextInt();
        input.nextLine();
        if (index >= 0 && index < usuario.size()) {
            usuario.remove(index);
            System.out.println("Usuario removido.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
