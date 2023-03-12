#Author: Wesley de França Amorim Gomes

@Testes
Feature: dado que eu esteja logado
  eu quero selecionar um produto dentro do site

  @teste
  Scenario: seleciona produto dentro do site
    Given que eu esteja no site
    And clique em receba em casa
    When digito o cep
    Then sou redirecionado para entra na conta
    

 
