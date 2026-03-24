package lojinha.service;

import lojinha.model.*;
import lojinha.Singleton.singleton;

public class PedidoService {

    public void processarPedido(Pedido pedido) {
        double total = pedido.calcularTotal();

        if (pedido.getCliente().getLimiteCredito() < total) {
            pedido.setStatus("RECUSADO");
            System.out.println("Crédito insuficiente!");
            return;
        }

        singleton pagamento = singleton.getInstance();

        if (pagamento.processarPagamento(total)) {
            pedido.setStatus("PAGO");
            System.out.println("Pagamento aprovado!");
        }
    }
}
