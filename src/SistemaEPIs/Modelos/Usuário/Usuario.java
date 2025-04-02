package SistemaEPIs.Modelos.Usuário;

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

    public static void cadastrarUsuario() {

    }

    public static void listarUsuarios() {

    }

    public static void atualizarUsuario(){

    }

    public static void removerUsuario() {

    }
}
