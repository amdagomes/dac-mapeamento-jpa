# dac-mapeamento-jpa

Exercício referente a disciplina de Desenvolvimento de Aplicações Corporativas (DAC) do IFPB-Campus Cajazeiras. Este exercício consiste em desenvolver uma resolução de três cenários de mapeamento de entidades utilizando JPA.

### Cenário 1 - Funcionário

Para cada Funcionário devemos saber o nome, CPF, RG, salário e em quais projetos está vinculado. Dos Projetos, a descrição, uma área, data de início e data prevista para conclusão. Podemos alocar diversos Funcionários nos Projetos existentes. É importante saber a quantidade de horas trabalhadas e data de ingresso do Funcionário no Projeto.

### Cenário 2 - Oficina

Cada oficina deve informar sua localização: rua, bairro, cidade, e também devemos armazenar o saldo que cada oficina possui. Uma oficina possui vários funcionários. De cada funcionário devemos saber o nome, CPF, RG, salário, e qual função desempenha (Empregado ou Gerente). Em uma oficina pode-se realizar vários consertos, sendo importante saber o valor, quando foi realizado e qual funcionário realizou o conserto.

**Requisitos**

Para descrição da oficina desenvolva: as classes, seus respectivos mapeamentos e um diagrama de classe que represente o domínio modelado. Utilizando a classe DAO criada, salve e remova a entidade “Conserto”.

### Cenário 3 - Material Didático

Construa a entidade “MaterialDidatico” descrita na figura abaixo. O resultado deve corresponder ao que pode ser visto na figura que representa o modelo relacional. Atente para os seguintes detalhes: os Atributos “título”, “dataCadastro” e tipo são obrigatórios; os tamanhos e precisão dos atributos devem seguir a figura do modelo relacional.

![](https://i.pinimg.com/564x/06/48/e8/0648e8eb04e0199014856834f74c3574.jpg)

**Requisitos**

Para descrição do Material Didático desenvolva: uma classe (DAO), para manipular e gerenciar o acesso aos dados, fazendo uso dos objetos provenientes da JPA. Utilizando a classe criada (DAO): salve, atualize e remova a entidade Material Didático.

Alunas:
<br/>
Amanda Gomes - [Github](https://github.com/amdagomes)
<br/>
Rafaela Ramos - [Github](https://github.com/RafaelaRamos)
