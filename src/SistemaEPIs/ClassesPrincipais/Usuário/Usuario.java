package SistemaEPIs.ClassesPrincipais.Usuário;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String cargo;

    public Usuario(String nome, String email, String cargo) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return nome + " - Email: " + email + " - Cargo: " + cargo;
    }

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUsuario(String nome, String email, String cargo) {
        usuarios.add(new Usuario(nome, email, cargo));
        System.out.println("Usuário cadastrado com sucesso.");
    }

    public static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Não a usuários cadastrados");
        }
        else {
            System.out.println("\n--- Lista de Usuários ---");
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println(i + " - " + usuarios.get(i));
            }
        }
    }

    public static void atualizarUsuario(int i, String novoNome, String novoEmail, String novoCargo){
        if (i >= 0 && i < usuarios.size()){
            Usuario usuario = usuarios.get(i);
            usuario.setNome(novoNome);
            usuario.setEmail(novoEmail);
            usuario.setCargo(novoCargo);
            System.out.println("Usuário atualizado com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }

    public static void removerUsuario(int i) {
        if (i >= 0 && i < usuarios.size()) {
            usuarios.remove(i);
            System.out.println("Usuário removido com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }
}
