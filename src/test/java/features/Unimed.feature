#language: pt
Funcionalidade: Pesquisa por médicos
  Eu como usuário do site https://www.unimed.coop.br/
  Quero testar as funcionalidades de pesquisa
  Para validar se as especialidades estão de acordo com as escolhas

  Cenário: Validar especialidade e cidade - busca rápida
    Dado que o usuário acesse o "Guia Médico" na página inicial
    Quando realizar uma pesquisa por "Cardiologia" do estado "Rio de Janeiro" e cidade "Rio de Janeiro"
    Então pesquisa realizada com sucesso para especialidade "Cardiologia" e cidade "Rio de Janeiro"
    
    Cenário: Validar a não apresentação da cidade São Paulo no resultado - busca rápida
    Dado que o usuário acesse o "Guia Médico" na página inicial
    Quando realizar uma pesquisa por "Cardiologia" do estado "Rio de Janeiro" e cidade "Rio de Janeiro"
    Então valida a pesquisa com sucesso para cidade "Rio de Janeiro" e não apresentação da cidadeSP "São Paulo"