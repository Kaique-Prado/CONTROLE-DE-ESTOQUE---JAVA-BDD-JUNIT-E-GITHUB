# Atividade avaliativa da UC Gestão e Qualidade de Software.

# Controle de estoque

Projeto de exemplo para controle de entrada e saída de produtos, com testes unitários JUnit 5 e cenários BDD em Cucumber.
Foram feitos 3 cenários
1-Entrada de produto
2-Saida de produto
3-saida com saldo insuficiente

Foram feitas validações no código para inserção saldo negativo e produto em branco, retirar saldo maior do que o disponível.

## Demonstração do código 
```bash
  Produto: Teclado
  Estoque inicial: 10
  5 unidades adicionadas ao estoque.
  Estoque atual: 15
  3 unidades retiradas do estoque.
  Estoque atual: 12
  Quantidade inválida ou estoque insuficiente.
  Estoque final: 12
```

## lOGS DOS TESTES
```bash
Test set: Produto.EstoqueCucumberTest
-------------------------------------------------------------------------------
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.153 s -- in Produto.EstoqueCucumberTest
```
```bash
Test set: Produto.EstoqueTest
-------------------------------------------------------------------------------
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 s -- in Produto.EstoqueTest
```
Integrantes: Luis Filipe, Kaique Prado e Mariana Silva.

## Requisitos

- Java 25 ou superior
- Maven

