# Exercício TDD - Verificação & Validação de Software

Esse repositório foi criado para a atividade de TDD (Test-Driven-Development) na disciplina de Validação e Verificação de Software. CCC@UFCG

## Alunos

- 119110413 - Raphael Henrique De Lucena Agra - Processador de Boletos
- 119110403 - Fernando Lisboa Costa - Calculadora de Salário

# Avaliação dos resultados

Verificamos que implementar as classes somente após os testes nos obrigou a pensar de forma atomizada e iterativa sobre cada funcionalidade, assim tivemos que imaginar tanto os casos mais básicos quanto os de borda e escrever seus respectivos testes pra só depois seguirmos com a implementação.

Dentre os pontos positivos, podemos destacar a clareza objetiva do que deve ser feito _(passar nos testes!)_ e o prazer de dever cumprido assim que uma barra se torna verde. Além disso, pensando em projetos maiores, se torna mais fácil a possibilidade de entregar as tasks já com testes, visto que testar após o desenvolvimento acaba sendo uma tarefa muitas vezes negligenciada.

Ficou claro, no que diz respeito aos pontos negativos, que alguns testes não estavam em sua forma ideal assim que foram criados. Isso pode ter acontedico por conta da nossa falta de experiência com esse tipo de desenvolvimento, porém com certeza com mais treinamento essa habilidade seria apurada e os testes já seriam construídos de uma forma mais natural.

No geral, acreditamos que TDD é uma técnica muito interessante para criar aplicações com qualidade.

## Como proceder

O exercício deve ser executado em dupla.
Das especificações listadas abaixo a dupla deve escolher duas e, usando TDD, implementar seus programas correspondentes em Java.
A dupla deve criar um único repositório Github para as duas implementações.
Cada membro deve ser responsável por um programa.
Finalizada a fase de implementação, cada membro deve inspecionar o código do colega. Possíveis faltas e sugestões de melhorias devem ser reportadas ao dono do código que deve corrigi-las antes da entrega.
Importante: Sistematicamente, façam commits no projeto Github para que eu possa acompanhar a aplicação dos passos de TDD.

## O que entregar?

O link do projeto Github com as implementações e testes (separar cada implementação em um folder específico).
No readme do projeto, incluir um parágrafo no qual a dupla avalia a experiência do uso de TDD na prática. O que foi bom? O que foi ruim? O que foi difícil?
**Deadline: 13/04**

## Foco

Aplicar todos os passos de TDD
Criar projetos de classes elegantes.
Imagine que seu código poderá sofrer manutenções futuras feitas por você ou por uma equipe. Escreva um código flexível o suficiente para que novas mudanças sejam fáceis de serem implementadas.

# Implementações

## Processador de Boletos - escolhido por [@raphaelhla](https://github.com/raphaelhla)

Deve-se implementar um processador de boletos. O objetivo desse processador é verificar todos os boletos e, caso o valor da soma de todos os boletos seja maior que o valor da fatura, então essa fatura deverá ser considerada como paga.

Uma fatura contém data, valor total e nome do cliente. Um boleto contém o código do boleto, data, e valor pago.

O processador de boletos, ao receber uma lista de boletos, deve então, para cada boleto, criar um "pagamento" associado a essa fatura. Esse pagamento contém o valor pago, a data, e o tipo do pagamento efetuado (que nesse caso é "BOLETO").

Como dito anteriormente, caso a soma de todos os boletos ultrapasse o valor da fatura, a mesma deve ser marcada como "PAGA".

Exemplo: Fatura de 1.500,00 com 3 boletos no valor de 500,00, 400,00 e 600,00: fatura marcada como PAGA, e três pagamentos do tipo BOLETO criados.

## Calculadora de Salário - escolhido por [@fernandollisboa](github.com/fernandollisboa)

Deve-se implementar uma calculadora de salário de funcionários. Um funcionário contém nome, e-mail, salário-base e cargo. De acordo com seu cargo, a regra para cálculo do salário líquido é diferente:

Caso o cargo seja DESENVOLVEDOR, o funcionário terá desconto de 20% caso o salário seja maior ou igual que 3.000,00, ou apenas 10% caso o salário seja menor que isso.
Caso o cargo seja DBA, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.
Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.
Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso o salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário seja menor que isso.
