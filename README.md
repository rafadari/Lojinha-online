# Lojinha-online

## Descrição

Este projeto consiste na implementação de uma simulação de um sistema de lojinha online utilizando Java e o Draw.io para fazer os diagramas UML e DER. A aplicação atua de forma cliente-servidor e executa funcionalidades básicas como identificação de cliente, listagem de produtos, criação de pedidos e processamento de pagamento.

---

## Estrutura do Projeto

O projeto está organizado em pacotes para usar as boas práticas de organização do código, separar responsabilidades e facilitar a manutenção:

```
lojinha
│
├── model        → Classes (Cliente, Produto, Pedido)
├── repository   → Dados estáticos e acesso a dados simulados
├── service      → Processamento de pedido
├── singleton    → Implementação do padrão Singleton
└── main         → Execução da simulação
```

---

## Principais Decisões Arquiteturais

* **Arquitetura Monolítica**: Toda a aplicação roda em um único processo, simplificando o desenvolvimento e a execução.
* **Separação por camadas (layered architecture)**:

  * Model → Representação dos dados
  * Repository → Acesso aos dados
  * Service → Regras de negócio
* **Uso de listas em memória**: Não foram usados banco de dados nesse sistema por ele ser uma simulação, então apenas estruturas estáticas de memória que foram criadas.
* **Orientação a Objetos**: Cada entidade e responsabilidade foi modelada como uma classe para fazer um encapsulamento e facilitar a reutilização.

---

## Uso do Padrão Singleton

O padrão de projeto **Singleton** foi utilizado na classe responsável pelo processamento de pagamentos.

### Onde foi aplicado

* Classe: `singleton`
* Pacote: `lojinha.Singleton`

### Como foi aplicado

A classe Singleton garante que apenas uma instância da conexão com o sistema de pagamento exista durante toda a execução da aplicação.

```java
public static singleton getInstance() {
    if (instance == null) {
        instance = new singleton();
    }
    return instance;
}
```

## Funcionalidades Implementadas

* ✔️ Identificação de clientes (dados estáticos)
* ✔️ Listagem de produtos
* ✔️ Criação de pedidos
* ✔️ Adição de produtos ao pedido
* ✔️ Cálculo do valor total
* ✔️ Processamento de pagamento via Singleton

---

## Execução

A aplicação pode ser executada a partir da classe `Main`, localizada no pacote:

```
lojinha.main
```
