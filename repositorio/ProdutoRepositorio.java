package lojinha.repositorio;

import lojinha.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio {
    private static List<Produto> produtos = new ArrayList<>();

    static {
        produtos.add(new Produto(1, "Mouse", 50));
        produtos.add(new Produto(2, "Teclado", 150));
        produtos.add(new Produto(3, "Monitor", 800));
    }

    public static List<Produto> listar() {
        return produtos;
    }

    public static Produto buscarPorId(int id) {
        return produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }
}