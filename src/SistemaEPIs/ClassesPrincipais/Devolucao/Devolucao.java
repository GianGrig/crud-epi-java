package SistemaEPIs.ClassesPrincipais.Devolucao;

import java.util.ArrayList;

public class Devolucao {
    private String nomeUsuario;
    private String nomeEpi;
    private String dataDevolucao;

    public Devolucao(String nomeUsuario, String nomeEpi, String dataDevolucao) {
        this.nomeUsuario = nomeUsuario;
        this.nomeEpi = nomeEpi;
        this.dataDevolucao = dataDevolucao;
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

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Usuario: " + nomeUsuario + " - Epi: " + nomeEpi + " - Data de Devolução: " + dataDevolucao;
    }

    private static ArrayList<Devolucao> devolucoes = new ArrayList<>();

    public static void cadastrarDevolucao(String nomeUsuario, String nomeEpi, String dataDevolucao) {
        devolucoes.add(new Devolucao(nomeUsuario, nomeEpi, dataDevolucao));
        System.out.println("Devolução cadastrada com sucesso.");
    }

    public static void listarDevolucoes() {
        if (devolucoes.isEmpty()){
            System.out.println("Não a devoluções cadastradas.");
        }
        else {
            System.out.println("\n--- Lista Devoluções ---");
            for (int i = 0; i < devolucoes.size(); i++) {
                System.out.println(i + " - " + devolucoes.get(i));
            }
        }
    }

    public static void atualizarDevolucao(int i, String novoNomeUsuario, String novoNomeEpi, String novaDataDevolucao) {
        if (i >= 0 && i < devolucoes.size()) {
            Devolucao devolucao = devolucoes.get(i);
            devolucao.setNomeUsuario(novoNomeUsuario);
            devolucao.setNomeEpi(novoNomeEpi);
            devolucao.setDataDevolucao(novaDataDevolucao);
            System.out.println("Devolução atualizada com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }

    public static void removerDevolucao(int i) {
        if (i >= 0 && i < devolucoes.size()) {
            devolucoes.remove(i);
            System.out.println("Devolução removida com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }
}
