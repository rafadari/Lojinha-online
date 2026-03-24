package lojinha.repositorio;

import lojinha.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio {
    private static List<Cliente> clientes = new ArrayList<>();

    static {
        clientes.add(new Cliente(1, "João", 1000));
        clientes.add(new Cliente(2, "Maria", 500));
    }

    public static Cliente buscarPorId(int id) {
        return clientes.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
