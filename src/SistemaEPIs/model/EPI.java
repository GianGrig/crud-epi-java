package SistemaEPIs.model;
import java.util.ArrayList;

public class EPI {

    private String nome;
    private int quantidade;

    public EPI(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Estoque: " + quantidade;
    }

    private static ArrayList<EPI> epis = new ArrayList<>();

    public static ArrayList<EPI> getEpis() {
        return epis;
    }

    public static void cadastrarEpi(String nome, int quantidade) {
        epis.add(new EPI(nome, quantidade));
        System.out.println("EPI cadastrada com sucesso.");
    }

    public static void listarEpis() {
        if (epis.isEmpty()){
            System.out.println("Não há EPIs cadastradas.");
        }
        else {
            System.out.println("\n========= Lista de EPIs =========");
            for (int i = 0; i < epis.size(); i++) {
                System.out.println(i + " - " + epis.get(i));
            }
        }
    }

    public static void atualizarEpi(int i, String novoNome, int novaQuantidade) {
        if (i >= 0 && i < epis.size()){
            EPI epi = epis.get(i);
            epi.setNome(novoNome);
            epi.setQuantidade(novaQuantidade);
            System.out.println("EPI atualizada com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }

    public static void removerEpi(int i){
        if (i >= 0 && i < epis.size()){
            epis.remove(i);
            System.out.println("EPI removida com sucesso.");
        }
        else {
            System.out.println("Índece inválido.");
        }
    }

}
