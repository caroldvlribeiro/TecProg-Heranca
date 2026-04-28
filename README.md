# Atividade de Herança e Interfaces em Java

Este repositório contém a resolução de três exercícios propostos para a disciplina de Técnicas de Programação, focando nos conceitos de Herança e Interfaces em Java. Cada exercício aborda um aspecto fundamental da Programação Orientada a Objetos (POO), visando a prática e o entendimento desses pilares.

## Estrutura do Repositório

O repositório está organizado em três módulos principais, cada um correspondendo a um exercício:

*   `TecProg_Heranca_Funcionario`: Implementa a hierarquia de classes de funcionários.
*   `TecProg_Heranca_Pagamento`: Implementa a interface de pagamentos.
*   `TecProg_Heranca_Autenticavel`: Implementa a interface de autenticação.

Cada módulo segue a estrutura de pacotes padrão do Java (`br.edu.fatecpg.tecprog.heranca.<nome_do_modulo>.model` para as classes de modelo e `br.edu.fatecpg.tecprog.heranca.<nome_do_modulo>.view` para as classes de teste/execução).

## Exercício 1: Herança de Funcionários

### Descrição

Este exercício foca na criação de uma hierarquia de classes utilizando o conceito de herança em Java. O objetivo é modelar diferentes tipos de funcionários de uma empresa, compartilhando características comuns e implementando comportamentos específicos para cada tipo.

### Requisitos

1.  **Interface `Funcionario`**: Define os métodos genéricos que todos os funcionários devem possuir.
2.  **Classes Concretas**: Implementar as classes `Gerente`, `Vendedor` e `Faxineiro`, que herdam da interface `Funcionario` (ou de uma classe base `Funcionario` se for o caso de uma classe abstrata).
3.  **Métodos Genéricos**: Incluir métodos comuns a todos os funcionários, como `baterPonto()`.
4.  **Métodos Específicos**: Implementar métodos exclusivos para cada tipo de funcionário, como `fecharCaixa()` para `Vendedor` e `solicitarMaterial()` para `Faxineiro`.

### Implementação

As classes relacionadas a este exercício podem ser encontradas no módulo `TecProg_Heranca_Funcionario`.

## Exercício 2: Interface de Pagamentos

### Descrição

Este exercício explora o uso de interfaces para definir um contrato de comportamento para diferentes formas de pagamento. O objetivo é criar um sistema flexível que possa processar pagamentos via cartão e dinheiro, aplicando regras específicas para cada modalidade.

### Requisitos

1.  **Interface `Pagamento`**: Deve conter os métodos `calcularPagamento()` (sem parâmetros, retorna o valor final) e `emitirRecibo()` (retorna uma `String` com o recibo detalhado).
2.  **Classes de Implementação**: Criar as classes `PagamentoCartao` e `PagamentoDinheiro` que implementam a interface `Pagamento`.
    *   `PagamentoCartao`: Aplica uma taxa de 5% sobre o valor original.
    *   `PagamentoDinheiro`: Aplica um desconto de 10% sobre o valor original.
3.  **Classe de Teste**: Simular um pagamento de R$100,00 utilizando ambas as formas de pagamento, exibindo o valor final e o recibo gerado.

### Implementação

As classes relacionadas a este exercício podem ser encontradas no módulo `TecProg_Heranca_Pagamento`.

## Exercício 3: Interface Autenticável

### Descrição

Este exercício aborda a criação de uma interface para gerenciar a autenticação de usuários em um sistema. O foco é na segurança e no controle de acesso, permitindo que diferentes partes do sistema possam implementar a lógica de autenticação de forma padronizada.

### Requisitos

1.  **Interface `Autenticavel`**: Deve definir os métodos `login(String usuario, String senha)` (retorna `boolean`) e `logout()` (sem retorno).
2.  **Classe de Implementação**: Criar a classe `SistemaDeSeguranca` que implementa a interface `Autenticavel`.
    *   Definir um login e senha corretos (ex: "admin" e "1234").
    *   O método `login()` deve verificar as credenciais e atualizar um estado booleano interno (`autenticado`).
3.  **Classe de Teste**: Solicitar ao usuário o nome de usuário e senha. Em caso de sucesso, exibir uma mensagem de boas-vindas. Em caso de falha, solicitar novas tentativas até o acerto. O sistema também deve permitir o `logout`.

### Implementação

As classes relacionadas a este exercício podem ser encontradas no módulo `TecProg_Heranca_Autenticavel`.

## Como Executar

Para executar os projetos, siga os passos:

1.  Clone o repositório:
    ```bash
    git clone https://github.com/caroldvlribeiro/TecProg-Heranca.git
    ```
2.  Importe os projetos para sua IDE Java (Eclipse, IntelliJ IDEA, etc.).
3.  Navegue até a pasta `src/br/edu/fatecpg/tecprog/heranca/<nome_do_modulo>/view` de cada módulo.
4.  Execute a classe principal (`Main`) para ver os resultados de cada exercício.

---

