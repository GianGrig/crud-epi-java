package SistemaEPIs.model;

import java.util.ArrayList;

public class Emprestimo {
    private String nomeUsuario;
    private String nomeEpi;
    private String dataEmprestimo;
    private String dataPrevistaDevolucao;

    public Emprestimo(String nomeUsuario, String nomeEpi, String dataEmprestimo, String dataPrevistaDevolucao) {
        this.nomeUsuario = nomeUsuario;
        this.nomeEpi = nomeEpi;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeEpi() {
        return nomeEpi;
    }

    public void setNomeEpi(String nomeEpi) {
        this.nomeEpi = nomeEpi;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(String dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    @Override
    public String toString() {
        return "Usuario: " + nomeUsuario + " - EPI: " + nomeEpi + " - Data do Empréstimo: " + dataEmprestimo + " - Data Prevista para Devolução: " + dataPrevistaDevolucao;
    }

    private static ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public static ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public static void cadastrarEmprestimo(String nomeUsuario, String nomeEpi, String dataEmprestimo, String dataPrevistaDevolucao) {
        emprestimos.add(new Emprestimo(nomeUsuario, nomeEpi, dataEmprestimo, dataPrevistaDevolucao));
        System.out.println("Empréstimo registrado com sucesso.");
    }

    public static void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo foi registrado até o momento.");
        }
        else {
            System.out.println("\n========= Lista de Empréstimos =========");
            for (int i = 0; i < emprestimos.size(); i++) {
                System.out.println(i + " - " + emprestimos.get(i));
            }
        }
    }

    public static void atualizarEmprestimo(int i, String novoNomeUsuario, String novoNomeEpi, String novaDataEmprestimo, String novaDataPrevistaDevolucao) {
        if (i >= 0 && i < emprestimos.size()) {
            Emprestimo emprestimo = emprestimos.get(i);
            emprestimo.setNomeUsuario(novoNomeUsuario);
            emprestimo.setNomeEpi(novoNomeEpi);
            emprestimo.setDataEmprestimo(novaDataEmprestimo);
            emprestimo.setDataPrevistaDevolucao(novaDataPrevistaDevolucao);
            System.out.println("Empréstimo atualizado com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }

    public static void removerEmprestimo(int i) {
        if (i >= 0 && i < emprestimos.size()) {
            emprestimos.remove(i);
            System.out.println("Empréstimo removido com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }
}
