package lojinha.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<Produto> produtos;
    private String status;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.status = "CRIADO";
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    public Cliente getCliente() { return cliente; }
    public List<Produto> getProdutos() { return produtos; }
    public int getId() { return id; }

    public void setStatus(String status) { this.status = status; }
    public String getStatus() { return status; }
}
