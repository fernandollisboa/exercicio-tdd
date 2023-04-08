# exercicio-tdd  



# Exercício - TDD
Exercício 2 - Aplicando TDD


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
Os dados da entrega devem ser preenchidos nesta planilha.
Deadline: 13/04

## Foco

Aplicar todos os passos de TDD
Criar projetos de classes  elegantes.
Imagine que seu código poderá sofrer manutenções futuras feitas por você ou por uma equipe. Escreva um código flexível o suficiente para que novas mudanças sejam fáceis de serem implementadas.

Link das especificações: https://docs.google.com/document/d/1Xc04sNt2q1HWb9h4LCdvHe8JkUy6PtGsOmNMoR3UoMk/edit?usp=drivesdk

## Processador de Boletos

Deve-se implementar um processador de boletos. O objetivo desse processador é verificar todos os boletos e, caso o valor da soma de todos os boletos seja maior que o valor da fatura, então essa fatura deverá ser considerada como paga.


Uma fatura contém data, valor total e nome do cliente. Um boleto contém o código do boleto, data, e valor pago.


O processador de boletos, ao receber uma lista de boletos, deve então, para cada boleto, criar um "pagamento" associado a essa fatura. Esse pagamento contém o valor pago, a data, e o tipo do pagamento efetuado (que nesse caso é "BOLETO").


Como dito anteriormente, caso a soma de todos os boletos ultrapasse o valor da fatura, a mesma deve ser marcada como "PAGA".


Exemplo: Fatura de 1.500,00 com 3 boletos no valor de 500,00, 400,00 e 600,00: fatura marcada como PAGA, e três pagamentos do tipo BOLETO criados.

## Calculadora de Salário - escolhido por @fernandollisboa

Deve-se implementar uma calculadora de salário de funcionários. Um funcionário contém nome, e-mail, salário-base e cargo. De acordo com seu cargo, a regra para cálculo do salário líquido é diferente:


Caso o cargo seja DESENVOLVEDOR, o funcionário terá desconto de 20% caso o salário seja maior ou igual que 3.000,00, ou apenas 10% caso o salário seja menor que isso.
Caso o cargo seja DBA, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.
Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso.
Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso o salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário seja menor que isso.

## Gerador de Nota Fiscal

## Filtro de Faturas
