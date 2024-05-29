<div align="center">
  <h1>- Desafio: Criando um Banco Digital com Java e Orientação a Objetos -</h1>
</div>

Este repositório, concebido com propósitos didáticos, criado em colaboração entre a [Digital Innovation One](https://www.dio.me/) e o Santander, como parte do Bootcamp Santander 2024 - Backend com Java. Com o seguinte cenário:

> ##### “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

## Objetivo

Implementar de um sistema bancário simplificado aplicando os quatros pilares de Programação Orientada a Objetos (POO), os quais são:

- Abstração;
- Encapsulamento;
- Herança;
- Polimorfismo.

## Ferramentas e tecnologias
![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)
![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)
![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=openjdk&logoColor=ED8B00) 

## Funcionamento
O sistema gerencia dois tipos de contas bancárias: conta corrente e conta poupança, com as seguintes características:

- Conta Corrente: Possui um limite de crédito inicial de R$ 500,00.
- Conta Poupança: Oferece um rendimento de 10% sobre o valor depositado.

O sistema oferece funcionalidades básicas, como depósito, saque e transferência entre contas da mesma instituição. Os valores das transações não são solicitados via terminal; em vez disso, são diretamente manipulados dentro da classe *Banco*. Para fins de demonstração, foram incluídas exibições prontas para uma conta corrente e uma conta poupança. Abaixo, segue um exemplo de uma conta poupança e o resultado obtido:

- Dados inseridos:
    ```java
    public class Banco {
        public static void main(String[] args) {
            
            Cliente cliente = new Cliente();
            cliente.setNome("Verônica");

            Conta contaPoupanca = new ContaPoupanca(cliente);

            contaPoupanca.imprimirExtrato();
            contaPoupanca.imprimirNomeCliente();
            contaPoupanca.imprimirAgenciaENumero();
            contaPoupanca.depositar(1000);
            contaPoupanca.calcularRendimento();
            contaPoupanca.sacar(200);
            contaPoupanca.imprimirSaldo();
        }
    }
    ```

- Resultado:
    ```java
    === Extrato Conta Poupança ===
    Nome do Cliente: Verônica
    Agência: 0109-0
    Número da Conta: 000170-0
    Rendimento aplicado: 100.0
    Novo saldo após rendimento: 1100.0
    Saldo atual: 900.0
    ```

> [!NOTE]   
> Achou algum erro ou tem alguma dúvida? Me envie uma mensagem no [linkedin](https://www.linkedin.com/in/veronica-vilas/)