package lojinha.model;

public class Cliente {
    private int id;
    private String nome;
    private double limiteCredito;

    public Cliente(int id, String nome, double limiteCredito) {
        this.id = id;
        this.nome = nome;
        this.limiteCredito = limiteCredito;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getLimiteCredito() { return limiteCredito; }
}
