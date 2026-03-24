package lojinha.main;

import lojinha.model.Cliente;
import lojinha.model.Pedido;
import lojinha.repositorio.ClienteRepositorio;
import lojinha.repositorio.ProdutoRepositorio;
import lojinha.service.PedidoService;


public class Main {
    public static void main(String[] args) {

            // Identificar cliente
        Cliente cliente = ClienteRepositorio.buscarPorId(1);

            // Listar produtos
        System.out.println("Produtos disponíveis:");
        ProdutoRepositorio.listar().forEach(p ->
                System.out.println(p.getId() + " - " + p.getNome() + " - R$" + p.getPreco())
        );

            // Criar pedido
        Pedido pedido = new Pedido(1, cliente);
        pedido.adicionarProduto(ProdutoRepositorio.buscarPorId(1));
        pedido.adicionarProduto(ProdutoRepositorio.buscarPorId(3));

            // Processar pagamento
        PedidoService service = new PedidoService();
        service.processarPedido(pedido);

            // Resultado final
        System.out.println("Status do pedido: " + pedido.getStatus());
    }
}

