# desafio_web

# Instalação

- Clonar o repositório em sua máquina usando `https://github.com/fellipeconforto94/desafio_web.git`

- Instalar todas as dependencias no pom.xml(Selenium, Cucumber, Junit, ...)

- mvn install

# Como Rodar

> Navegador
- A escolha de qual navegador utilizar é no arquivo /desafio_web/src/test/resources/config.properties.
- As opções são: chrome e firefox.

> Execução dos CTs
- A execução pode ser feita na pasta "runner" em /desafio_web/src/test/java/runner/CucumberRunnerTest.java.

> Descrição dos Cts
- No primeiro cénario, é aberto o site da Unimed onde é feita uma busca rápida por médicos no Rio de Janeiro. Após a busca, é validado se o resultado corresponde realmente com o que foi buscado, em "especialidade" e "cidade".

- No segundo cénario, é aberto o site da Unimed onde é feita uma busca rápida por médicos no Rio de Janeiro. Porém após a busca, é validado a não exibição da cidade "São Paulo" no resultado.

> Observações
- Na tela de "busca rápida" o site automaticamente pegava a geolocalização da máquina, ou seja, quando chegava na parte de selecionar "Estado" e "Cidade", ele estava preenchendo automaticamente "Rio de Janeiro" em ambos, tendo problemas ao realizar meu cenário. Para resolver tive que implementar em "/desafio_web/src/test/java/utils/DriverLoading.java" uma solução que dá um "disable" em geolocalização.
