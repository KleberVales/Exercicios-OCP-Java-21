# Exercicios-OCP-Java-21

## Fundamentos do Java

### 1. Criando e Usando Objetos
Objetivo: Praticar a criação de objetos e o uso de variáveis.

### 2. Destruição de Objetos e Coleta de Lixo (Garbage Collector)
Objetivo: Compreender a destruição de objetos e como o garbage collector funciona.

### 3. Tipos e Escopo de Variáveis
Objetivo: Entender a diferença entre variáveis de instância, locais e estáticas, além dos tipos.

## Operadores
### 1. Crie um programa que receba dois números inteiros e exiba: 
A soma, A subtração, A multiplicação, A divisão e O resto da divisão (módulo)

### 2. Operadores Relacionais e Lógicos
Faça um programa que peça dois números e:\
Verifique se o primeiro número é maior que o segundo e positivo.\
Verifique se os dois números são diferentes ou iguais a zero.

### 3. Operador Ternário
Peça a idade do usuário e use operador ternário para exibir:\
"Maior de idade" se a idade for 18 ou mais\
"Menor de idade" caso contrário

## Estrutura de decisão

### 1. Verificar se um número é positivo, negativo ou zero
Escreva um programa que leia um número inteiro do usuário e informe se ele é positivo, negativo ou zero.

### 2. Verificar se uma pessoa pode votar
Faça um programa que leia a idade de uma pessoa e diga se ela não pode votar (menor de 16 anos), voto opcional (entre 16 e 17 ou maior de 65 anos) ou voto obrigatório (entre 18 e 65 anos inclusive).

### 3. Calculadora simples
Peça dois números ao usuário e depois peça a operação desejada (+, -, *, /). Use uma estrutura de decisão para calcular o resultado com base na operação escolhida.

## Core Apps
### 1. Herança
Crie uma classe chamada Pessoa com os atributos nome e idade, e um método apresentar() que imprime esses dados.
Em seguida, crie uma subclasse chamada Estudante que herda de Pessoa e adiciona o atributo curso e o método estudar(), que imprime que o estudante está estudando determinado curso.
Instancie um objeto da classe Estudante, chame o método herdado apresentar() e o método estudar().

### 2. Classe Abstrata
Crie uma classe abstrata chamada Animal com o atributo nome e um método abstrato emitirSom().
Depois, crie uma subclasse chamada Cachorro que implementa o método emitirSom() exibindo "Au Au!".
No método main, crie um objeto Cachorro usando o tipo abstrato Animal e chame o método emitirSom().

### 3. Objeto Imutável
Implemente uma classe Produto que represente um produto com os atributos nome e preco.
- A classe deve ser imutável, ou seja:
- Os atributos devem ser private final
- Não deve haver métodos set
- O construtor deve receber os valores e armazená-los nos atributos
- A classe deve ser final
- No método main, crie um objeto da classe Produto e imprima suas informações.

## Metodos

#### 1. Criar e chamar um método de saudação
Enunciado:\
Crie uma classe chamada Saudacao. Dentro dela, crie um método chamado mostrarSaudacao que exibe a mensagem "Olá, bem-vindo ao sistema!".
Depois, crie o método executar que chama o método mostrarSaudacao.
Por fim, na função main, crie um objeto da classe e invoque o método executar.

#### 2. Criar método para somar dois números
Enunciado:\

## Lambdas and Functional Interfaces

### Lambda

#### 1. Variável Efetivamente Final

Você deve criar uma expressão lambda que utilize uma variável externa chamada limite, que determina se um número é menor que esse valor. Após criar a lambda, tente modificar o valor da variável limite e observe o comportamento do compilador.

Objetivo:
Compreender o conceito de variáveis efetivamente finais no contexto de expressões lambda.

#### 2. Escopo em Loop com Lambda
Enunciado:
Dado uma lista de nomes, crie um loop que percorra essa lista e, para cada nome, crie uma nova Thread que imprime o nome e seu índice. Use uma expressão lambda na criação da Thread. Tente utilizar a variável de controle do loop diretamente dentro da lambda e observe o erro gerado.

Objetivo:
Entender como variáveis são capturadas dentro de lambdas e a necessidade de usar variáveis auxiliares (efetivamente finais) em estruturas de repetição.

#### 3. Variáveis Mutáveis e Lambda

Crie uma lista de números inteiros e utilize o método forEach com uma expressão lambda para calcular a soma de todos os elementos. Utilize uma variável acumuladora para armazenar o resultado. Tente usar uma variável primitiva comum (int soma = 0) e observe por que isso não funciona. Em seguida, modifique o código para usar uma estrutura que permita mutabilidade.

Objetivo:
Explorar as restrições do uso de variáveis mutáveis dentro de lambdas e como contorná-las utilizando estruturas como arrays ou objetos.

### Methods References

#### 4. Referência a método estático
Objetivo: Criar uma lista de inteiros e imprimir o dobro de cada número usando uma method reference.

### 5. Referência a método de instância de um objeto arbitrário
Objetivo: Criar uma lista de nomes e ordená-los ignorando maiúsculas e minúsculas.

### 6. Referência a construtor
Objetivo: Criar objetos a partir de uma lista de nomes, utilizando referência a construtor.

## Coleções e Genéricos

### 1. Lista de Nomes com Ordenação
Objetivo: Usar ArrayList para armazenar e ordenar dados.

Descrição:
* Crie uma aplicação que:
* Peça ao usuário para inserir 5 nomes.
* Armazene os nomes em uma ArrayList.
* Exiba a lista original e depois a lista ordenada em ordem alfabética.

### 2. Conjunto de Palavras Únicas
Objetivo: Usar HashSet para evitar duplicatas.

Descrição:
Crie uma aplicação que:
* Permita ao usuário digitar palavras até digitar "sair".
* Armazene as palavras em um HashSet.
* Ao final, exiba todas as palavras digitadas, sem repetições.

### 3. Agenda Telefônica com Map
Objetivo: Usar HashMap para associar chaves e valores.

Descrição:
* Crie uma agenda telefônica simples que:
* Permita adicionar nomes e números de telefone (chave = nome, valor = telefone).
* Permita buscar um telefone pelo nome.
* Exiba toda a agenda ao final.

## Concorrência

### 1. Contador Simples com Runnable
Objetivo: Criar uma classe que conte de 1 a 5, com intervalo de 1 segundo entre os números.

### 2. Simulando Acesso a um Recurso com Thread
Objetivo: Criar uma classe que estenda Thread e simule acesso a um recurso compartilhado (por exemplo, uma impressora).

### 3. Corrida de Threads
Objetivo: Criar uma corrida onde cada thread representa um corredor. Vence quem terminar primeiro.

## Java I/O

### 1. I/O Tradicional (java.io): Copiar o conteúdo de um arquivo
Objetivo: Ler um arquivo de texto e copiar seu conteúdo para outro arquivo usando FileReader e FileWriter.

### 2. NIO (java.nio): Ler bytes de um arquivo em bloco
Objetivo: Ler o conteúdo de um arquivo como blocos de bytes usando FileChannel e ByteBuffer.

### 3. NIO.2 (java.nio.file): Listar arquivos de um diretório
Objetivo: Listar todos os arquivos de um diretório usando Files e Path.
