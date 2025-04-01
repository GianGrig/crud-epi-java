import java.util.ArrayList;
import java.util.Scanner;

public class EPI {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private String tipo;
    private int quantidade;
    private ArrayList<EPI> EPIs;

    public EPI(String nome, String tipo, int quantidade, ArrayList<EPI> EPIs) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.EPIs = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<EPI> getEPIs() {
        return EPIs;
    }

}
