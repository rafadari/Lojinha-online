package lojinha.Singleton;

import java.util.Random;

public class singleton {
    private static singleton instance;
    private int valor;

    private singleton() {
        Random rn = new Random(System.currentTimeMillis());
        valor = rn.nextInt(1000);
    }

    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

    public boolean processarPagamento(double valorPedido) {
        System.out.println("Processando pagamento de: " + valorPedido);
        return true; // simulação
    }

    public void showMessage() {
        System.out.println("Singleton ativo: " + valor);
    }
}
