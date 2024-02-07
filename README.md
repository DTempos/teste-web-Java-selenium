# Automação Web

# Introdução

    - Projeto de automação de testes web criado para um teste técnico

### Tecnologias utilizadas

* Java - Linguagem utilizada para o desenvolvimento dos scripts
* Maven - Gerenciador de dependências
* Cucumber - Framework utilizado para a escrita dos cenários em BDD
* Selenium - Biblioteca (lib) utilizada para fazer as ações automatizadas
* JUnit - Testes unitários

### Execução dos Testes
Configurar a execução do JUnit na IDE. 

1-Se estiver utilizando IntelliJ, acessar opção Run no menu superior > Edit Configurations.

2-Após acessar, clicar em "Add New Configuration" e selecionar JUnit.

3-Feito isso, configurar para a versão do Java instalada em sua máquina (nesse projeto foi utilizado Java 8)
e apontar para a classe runners.Runner na opção Class.

4-Executar pela classe Runner do Cucumber inserindo a tag desejada

### Evidências
As evidências de cada execução são geradas na pasta target/evidencias

### Observação
Se atentar a versão do navegador Google Chrome. Ela deve estar na mesma versão do chromedriver.
