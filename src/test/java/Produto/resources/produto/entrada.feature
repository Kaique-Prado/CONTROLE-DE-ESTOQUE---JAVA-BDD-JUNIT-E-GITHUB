# language: pt

Funcionalidade: Controle de estoque

  Contexto: Como funcionário da loja
  Quero controlar a entrada e saída de produtos
  Para manter o estoque atualizado

  Cenário: Entrada de produtos
    Dado que existe o produto "Teclado" com 10 unidades em estoque
    Quando adiciono 5 unidades ao estoque
    Então o saldo deve ser 15 unidades

  Cenário: Saída com saldo suficiente
    Dado que existe o produto "Mouse" com 10 unidades em estoque
    Quando retiro 4 unidades do estoque
    Então a retirada deve ser realizada com sucesso
    E o saldo deve ser 6 unidades

  Cenário: Saída com saldo insuficiente
    Dado que existe o produto "Monitor" com 10 unidades em estoque
    Quando retiro 15 unidades do estoque
    Então a retirada deve ser recusada
    E o saldo deve continuar sendo 10 unidades