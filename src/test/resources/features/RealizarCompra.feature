# language: pt
# Author: Danilo Silva Tempos
# encoding UTF-8
Funcionalidade: Realizar compras no site Automation Exercise

  @CT01
  Cenário: CT01 - Realizar uma compra com um login cadastrado no site Automation Exercise
    Dado que acesso a tela inicial do site Automation Exercise
    Quando acessar tela de login
    E realizar login com email "teste1@renner.com.br" e senha "123456"
    E acessar tela de produtos
    E pesquisar e visualizar o produto "Stylish Dress"
    E selecionar quantidade "3" do produto "Stylish Dress" e adicionar produto ao carrinho
    E acessar tela de produtos
    E pesquisar e visualizar o produto "Beautiful Peacock Blue Cotton Linen Saree"
    E selecionar quantidade "2" do produto "Beautiful Peacock Blue Cotton Linen Saree" e adicionar produto ao carrinho
    E acessar tela de produtos
    E pesquisar e visualizar o produto "Men Tshirt"
    E selecionar quantidade "1" do produto "Men Tshirt" e adicionar produto ao carrinho
    E acessar tela de carrinho
    E validar que o produto "Stylish Dress" está no carrinho
    E validar que o produto "Beautiful Peacock Blue Cotton Linen Saree" está no carrinho
    E validar que o produto "Men Tshirt" está no carrinho
    E seguir com a compra na tela de carrinho
    E realizar a compra na tela de Checkout
    E informar os dados de pagamento e confirmar a compra na tela de Pagamento
    Entao validar mensagem "Congratulations! Your order has been confirmed!" confirmando pedido com sucesso
