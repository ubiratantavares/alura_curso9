# Plataforma Online: Alura

## Curso: Java: aplicando a Orientação a Objetos

### 1. Modelando o ScreenMatch

* Apresentação
* Um modelo para representar filmes
* Atribuindo valores ao nosso filme
* Manipulando objetos
* Definindo ações para o filme
* Para saber mais: classes e objetos
* Definição de métodos
* Faça como eu fiz: projeto com orientação a objetos
* Desafio: hora da prática
* O que aprendemos?

O que é uma classe, sua estrutura, como criar e por que isso é um conceito fundamental na orientação a objetos;
O que são atributos: as "características" de um objeto, e a definir e visualizar esses valores;
A instanciar objetos;
Sobre os métodos (ou comportamentos) de um objeto;
A pensar nas entidades do mundo real em forma de objetos, que possuem características (atributos) e comportamentos ou ações (métodos).

### 2. Controlando o acesso e a escrita nos dados da aplicação

* Projeto da aula anterior
* Configurando o que pode ser visto e modificado
* Visualizando características privadas
* Para saber mais: modificadores de acesso

Em Java, os modificadores de acesso são palavras-chave que definem o nível de visibilidade de classes, atributos e métodos, 
sendo que eles ajudam a garantir a segurança e encapsulamento do código.

Existem quatro tipos de modificadores de acesso em Java: public, protected, private e default 
(também conhecido como package-private).

Public

O modificador de acesso public é o mais permissivo de todos. Uma classe, atributo ou método declarado como public pode ser acessado por qualquer classe em qualquer pacote. Ou seja, ele possui visibilidade pública e pode ser utilizado livremente.

Default (Package-private)

O modificador de acesso default é aquele que não especifica nenhum modificador de acesso. Quando nenhum modificador de acesso é especificado, a classe, atributo ou método pode ser acessado apenas pelas classes que estão no mesmo pacote.

No código anterior, a classe Conta está em um pacote e a classe Principal em outro pacote distinto. A classe Conta pode ser instanciada dentro da classe Principal, pois ela possui o modificador de acesso public, entretanto, o atributo saldo e o método sacar tem o modificador default e, portanto, não podem ser acessados de dentro da classe Principal, o que vai causar um erro de compilação no código anterior.
Private

O modificador de acesso private é o mais restritivo de todos. Uma classe, atributo ou método declarado como private só pode ser acessado dentro da própria classe. Ou seja, ele possui visibilidade restrita e não pode ser utilizado por outras classes.

No código anterior, vai ocorrer erro de compilação na classe Principal, pois o atributo saldo e o método sacar foram declarados como private, não podendo com isso serem acessados de fora da própria classe Conta.

Existe ainda um último modificador de acesso, que é o protected, mas falaremos dele mais adiante no curso, após ser apresentado o conceito de herança de classes.

* Organizando o código
* Para saber mais: JavaDoc - A documentação do Java

A documentação do Java, conhecida como JavaDoc, é uma referência completa para todas as classes, interfaces e métodos disponíveis na plataforma Java. Ela está disponível online e pode ser acessada neste site da Oracle.

O JavaDoc é organizado em pacotes, que contêm diversas classes e interfaces relacionadas a alguma funcionalidade específica da linguagem. Cada classe e interface é documentada individualmente, com informações detalhadas sobre sua funcionalidade, uso e exemplos de código.

Essa documentação deve ser uma referência essencial para qualquer pessoa que queira programar na linguagem Java, pois fornece informações detalhadas sobre como usar as classes e interfaces fornecidas pela linguagem. Tendo acesso à documentação, podemos também descobrir novas classes e métodos que podem ser úteis em nossos projetos, para resolver problemas comuns e recorrentes do dia a dia.

Não deixe de entrar no site do JavaDoc e explorar os pacotes e classes que a linguagem nos disponibiliza, pois assim você já vai se familiarizar em como descobrir novos recursos da linguagem, além de entender melhor o funcionamento das principais classes do Java.

* Para saber mais: padrão de nomes de pacotes

Em Java, pacotes são usados para agrupar classes que estão relacionadas a alguma funcionalidade. Eles ajudam a organizar o código, facilitando o seu gerenciamento e evitando que centenas de classes distintas fiquem todas misturadas num único diretório.

A organização de classes dentro de um pacote também pode ser feita usando subpacotes ou colocando as classes diretamente dentro do pacote, dependendo da complexidade do projeto. Além disso, é importante seguir a convenção de nomeação de pacotes para garantir que os pacotes sejam facilmente identificados.

Em relação à nomenclatura de pacotes, outro aspecto importante é o uso do nome de domínio reverso da empresa ou organização como parte do nome do pacote. Por exemplo, se o nome de domínio da empresa fosse "minhaempresa.com.br" e o projeto Java fosse chamado de "meuprojeto", o nome do pacote de domínio reverso seria br.com.minhaempresa.meuprojeto, sendo que dentro desse pacote principal podemos ter diversos subpacotes, para melhor organização do código do projeto.

Isso ajuda a garantir que o nome do pacote seja exclusivo e evita conflitos de nome com outros pacotes em outros projetos. Além disso, o uso do nome de domínio reverso como parte do nome do pacote também ajuda a identificar facilmente o proprietário do projeto Java.

* Criando métodos que modificam valores

* Para saber mais: a palavra chave this

“This”, traduzindo para o português (Isto/este/esta), é usado para fazer referência aos atributos da classe, especialmente em métodos que têm parâmetros com o mesmo nome do atributo da classe em que estamos trabalhando.

Para compreendermos essa ideia na prática, vamos ver um exemplo:

public class Conta { 
    private double saldo;
    private int numero;

    public void deposita(double valor) {
        saldo = saldo + valor;
    }
}

Repare que nesse primeiro exemplo, dentro da classe conta, nós temos os atributos saldo e numero, e em seguida o método deposita, que recebe como parâmetro um double valor. Nesse caso, não temos nenhum atributo com o mesmo nome do parâmetro e estamos dentro da classe, o que nos permite utilizar o atributo saldo a vontade, sem a necessidade do “this”.

Algo diferente ocorre quando temos um atributo da classe com o mesmo nome de um parâmetro de algum método dessa mesma classe:

public class Lampada {
    private boolean ligada;
    private String modelo;

    public void acendeLampada(boolean ligada) {
       ligada = ligada;
    }
}

Perceba que nesse exemplo, temos um atributo da classe chamado ligada, e o método acendeLampada que define um novo valor para esse atributo.

O método recebe como parâmetro um boolean que tem o mesmo nome do atributo da classe. É aí que está o problema! O que faríamos para saber quem é o atributo da classe e quem é o parâmetro do método?

Nessa situação vamos fazer o uso da palavra chave “this”:

public class Lampada {
    private boolean ligada;
    private String modelo;

    public void acendeLampada(boolean ligada) {
       this.ligada = ligada;
    }
}

Podemos concluir então que “this” se refere ao objeto atual e não ao parâmetro do método. É comum usarmos o this para eliminar essa confusão entre os atributos e parâmetros, sendo que ele não é uma exclusividade do Java, pois outras linguagens de programação orientadas a objetos também possuem esse recurso.

* Código encapsulado

Imagine que você esteja analisando o código de uma aplicação Java e encontra a seguinte classe:

public class Conta {
    private int numero;
    private int agencia;
    private double saldo;

    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}

Em relação ao conceito de encapsulamento, escolha a alternativa que indica o problema do código anterior: A classe não deveria ter o método setSaldo.

* Faça como eu fiz: encapsulando o projeto

* Desafio: hora da prática

Vamos aplicar na prática os conceitos de modificadores de acesso public e private, import, this, getters e setters. Para reforçar essas habilidades, propomos uma lista de atividades práticas (não obrigatórias), enriquecendo ainda mais sua experiência de aprendizado.

Vamos colocar esses conceitos em ação?

Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

* O que aprendemos?

Encapsulamento: controlar o acesso aos atributos e métodos de uma classe;
O que são os modificadores de acesso public e private;
Métodos de leitura dos atributos, que são os métodos getters;
Métodos de modificação dos atributos, que são os métodos setters;
O uso da palavra chave import, para importar classes de outros pacotes;
O uso da palavra chave this;
Boas práticas de dividir o código em pacotes, bem como a convenção usada: domínio da empresa ao contrário, onde aqui vamos colocar por exemplo br.com.alura.screenmatch.

### 3. Reaproveitando características e comportamentos

* Projeto da aula anterior
* Aproveitando o modelo para séries
* Mesmo nome, comportamentos diferentes
* Para saber mais: entendendo melhor a herança

A herança é um conceito fundamental da orientação a objetos, sendo implementada em Java através da relação é um entre classes. Isso significa que uma classe pode herdar atributos e métodos de outra classe, tornando com isso o código mais reutilizável.

No Java, a herança é realizada através da palavra-chave extends. A classe que herda é chamada de subclasse, e a classe que é herdada é chamada de superclasse. A subclasse pode acessar todos os atributos e métodos públicos e protegidos da superclasse, além de poder sobrescrever os métodos da superclasse para criar comportamentos específicos.

Por exemplo:

public class Conta {

  private String titular;
  private double saldo;

  public void sacar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor deve ser maior do que zero!");
    } else if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Saque realizado com sucesso. Saldo atual: " +saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito realizado com sucesso. Saldo atual: " +saldo);
    } else {
      System.out.println("Valor deve ser maior do que zero!");
    }
  }

  //getters e setters
}COPIAR CÓDIGO
public class ContaPoupanca extends Conta {

  private double taxaDeJuros;

  public void calcularJuros() {
    double juros = this.getSaldo() * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
  }

  public void sacar(double valor) {
    double taxaSaque = 0.01;
    super.sacar(valor + taxaSaque);
  }

  //getters e setters
}

No código anterior, a classe Conta é a superclasse e a classe ContaPoupanca é a subclasse. A classe ContaPoupanca herda os atributos e métodos da classe Conta, e adiciona um novo atributo taxaDeJuros e um novo método calcularJuros. Embora os atributos sejam herdados, como eles foram declarados como private na superclasse, não poderão ser acessados diretamente na subclasse, devendo então serem utlizados os métodos getters/setter, que são públicos.

Repare também no código anterior que a subclasse sobrescreveu o método sacar, para que seja descontada a taxa de saque, além de utilizar a palavra chave super para chamar o método da superclasse, evitando com isso duplicar um código já existente. Essa é a grande vantagem da herança: reaproveitamento de código com flexibilidade para sobrescrever comportamentos.

Herança múltipla
Em Java, é importante notar que a herança múltipla não é permitida. A herança múltipla ocorre quando uma subclasse herda de duas ou mais superclasses. Por exemplo:

public class ContaPoupanca extends Conta, Pagamento {
  //codigo da classe omitido
}

O código anterior não compila, pois o extends aceita apenas uma única classe, ou seja, uma classe pode ter apenas uma superclasse.

Entretanto, é possível criar uma hierarquia de classes utilizando herança, simulando com isso uma herança múltipla. Por exemplo:

public class Conta {
  //codigo da classe omitido
}

public class ContaCorrente extends Conta {
  //codigo da classe omitido
}

public class ContaCorrentePessoaFisica extends ContaCorrente {
  //codigo da classe omitido
}

No código anterior, a classe ContaCorrentePessoaFisica está herdando de ContaCorrente, que por sua vez herda da classe Conta, ou seja, indiretamente a classe ContaCorrentePessoaFisica vai herdar de Conta, pois sua superclasse herda dela.

* Para saber mais: anotações no Java

As anotações, também conhecidas como annotations, são uma forma de adicionar configurações ao código Java de uma maneira bem simples. Elas são usadas para fornecer informações adicionais sobre o código, como o significado de uma classe, um método ou um atributo.

No Java, as anotações são definidas com o uso do símbolo "@" seguido do nome da anotação. Por exemplo, a anotação @Deprecated é usada para indicar que um método ou classe está obsoleto e não deve ser mais utilizado. Outra anotação muito útil é a @Override, conforme foi demonstrado no último vídeo, que indica que um método está sobrescrevendo o mesmo método definido na sua classe mãe.

Diversas especificações e frameworks Java, como Hibernate, Bean Validation e Spring, utilizam anotações. Por exemplo, no Bean Validation a anotação @NotNull é usada para validar que um atributo não seja nulo.

As anotações são muito úteis e comuns em aplicações Java, sendo importante que você esteja familiarizado com esse recurso, pois certamente o utilizará bastante em seus projetos.

* Evitando código duplicado

* Para saber mais: o modificador protected

Ao usar herança no Java, temos a possibilidade de utilizar o modificador de acesso protected, que permite que os atributos de uma classe sejam acessados por outras classes do mesmo pacote e também por suas subclasses, independentemente do pacote em que se encontram.

O modificador protected é útil em situações em que uma classe precisa permitir que suas subclasses acessem diretamente seus atributos, sem a necessidade de restringir o acesso apenas pelos métodos getters e setters. Por exemplo, suponha que temos as seguintes classes em um projeto:

public class Conta {

  private String titular;
  private double saldo;

  public void sacar(double valor) {
    //implementacao do metodo omitida
  }

  public void depositar(double valor) {
    //implementacao do metodo omitida
  }

  //getters e setters
}

public class ContaPoupanca extends Conta {

  private double taxaDeJuros;

  public void calcularJuros() {
    double juros = this.getSaldo() * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
  }

  //getters e setters
}

No código anterior, repare que no método calcularJuros, da classe ContaPoupanca, o atributo saldo não é acessado diretamente, pois ele foi declarado como private na classe Conta, devendo então seu acesso ser feito pelo método getSaldo().

Podemos declarar o atributo saldo como protected, para evitar essa situação e liberar o acesso direto a ele pelas classes que herdam da classe Conta:

public class Conta {

  private String titular;
  protected double saldo;

  public void sacar(double valor) {
    //implementacao do metodo omitida
  }

  public void depositar(double valor) {
    //implementacao do metodo omitida
  }

  //getters e setters
}

public class ContaPoupanca extends Conta {

  private double taxaDeJuros;

  public void calcularJuros() {
    double juros = this.saldo * taxaDeJuros;
    System.out.println("Juros atual: " +juros);
  }

  //getters e setters
}

Repare que agora o atributo saldo foi acessado diretamente pela classe ContaPoupanca.

* Herdando classes
* Faça como eu fiz: aplicando polimorfismo com herança
* Desafio: hora da prática

Vamos explorar na prática conceitos cruciais da herança em programação orientada a objetos: extends, a palavra-chave indicando que uma classe herda de outra; a habilidade de sobrescrever métodos herdados, utilizando a anotação @Override.

Além disso, vamos aplicar o conceito de polimorfismo para evitar duplicação de métodos, proporcionando uma estrutura de código mais eficiente e coesa.

Para consolidar essas ideias, propomos atividades práticas (não obrigatórias) que enriquecerão ainda mais sua compreensão desses princípios fundamentais. Pronto para colocar esses conceitos em prática?

1. Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

2. Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

3. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

4. Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo

* O que aprendemos?

1. O problema de ter códigos duplicados em várias classes, utilizando a herança como solução;
2. A palavra-chave extends, utilizada para indicar que uma classe herda de outra;
3. Como sobrescrever um método sendo herdado, com o uso opcional da anotação @Override;
4. Como aplicar o conceito de polimorfismo no código, evitando métodos duplicados.

### 4. Aplicando comportamentos em comum

* Projeto da aula anterior
* Incluindo comportamentos adicionais
* Classificando episódios e filmes
* Para saber mais: entendendo melhor interfaces
* Herança e interface
* Faça como eu fiz: utilizando interfaces

Em Java, interfaces são uma forma de definir um contrato que as classes devem seguir, sendo que ele define quais métodos devem ser implementados pelas classes que o implementarem. Interfaces permitem que diferentes classes possam ser tratadas de maneira padronizada, via polimorfismo, tornando assim o código fácil de estender com novos comportamentos.

No Java, uma interface é definida usando a palavra-chave interface. Por exemplo:

public interface Tributavel {

    double getValorImposto();

}

No exemplo de código anterior, estamos definindo uma interface chamada Tributavel, sendo que ela possui apenas um método chamado getValorImposto() que retorna um valor do tipo double. Essa interface pode ser implementada por qualquer classe que queira ser tributável no projeto.

Para implementar uma interface, usamos a palavra-chave implements após a definição da classe. A classe que implementa a interface deve implementar todos os métodos definidos na interface. Por exemplo:

public class Produto implements Tributavel {

    private String nome;
    private double valor;

    @Override
    public double getValorImposto() {
        return this.valor * 0.1;
    }

    //getters e setters
}

No exemplo anterior, estamos criando uma classe chamada Produto que implementa a interface Tributavel. Essa classe implementa o método getValorImposto(), que está definido na interface Tributavel, com uma lógica de que o imposto do produto é igual a 10% do seu valor.

Também poderíamos ter uma classe de serviços, conforme abaixo:

public class Servico implements Tributavel {

    private String descricao;
    private double valor;
    private double aliquotaISS;

    @Override
    public double getValorImposto() {
        return this.valor * this.aliquotaISS / 100;
    }

    //getters e setters
}

No exemplo acima, estamos criando uma classe chamada Servico que implementa a interface Tributavel. Essa classe implementa o método getValorImposto(), que está definido na interface Tributavel, com uma lógica de que o imposto do serviço é igual ao seu valor vezes a alíquota de ISS definida e dividido por 100. Então para um serviço de R$ 1.200,00 e alíquota de 5%, o método retornará: 1200 * 5 / 100, cujo valor do imposto fica R$ 60,00.

Utilização de interfaces

Interfaces podem ser utilizadas para definir comportamentos que podem ser aplicados a várias classes diferentes, tornando assim o código mais modular e fácil de manter.

Por exemplo, suponha que temos um sistema de vendas que precisa calcular o imposto de diferentes tipos de produtos. Podemos criar a interface Tributavel, para definir o comportamento de calcular imposto, e criar várias classes diferentes que implementam essa interface para calcular o imposto de diferentes produtos. Por exemplo:

public class CalculadoraImposto {

    private double totalImposto = 0;

    public void calcularImposto(Tributavel item) {
        this.totalImposto += item.getValorImposto();
    }

    public double getTotalImposto() {
      return this.totalImposto;
    }
}

Nesse exemplo, estamos criando uma classe chamada CalculadoraImposto, que tem um atributo privado chamado totalImposto, que armazena o 
valor total dos impostos.

Repare que o método calcularImposto recebe um parâmetro do tipo Tributavel. Ao declarar uma variável com o tipo de uma interface, como é feito nesse método, podemos atribuir a essa variável qualquer objeto que implemente essa interface, ou seja, tanto um objeto do tipo Servico quanto Produto. Para ambos os casos, a CalculadoraImposto irá chamar o método implementado na classe específica. Ou seja, para um produto, irá chamar o método getTotalImposto implementado na classe Produto. E para um serviço, irá chamar o método getTotalImposto implementado na classe Servico.

Isso é muito útil quando queremos tratar vários objetos de classes diferentes de forma semelhante, permitindo que diferentes classes possam ser tratadas de maneira padronizada, facilitando a manutenção e extensão do código. Esse é mais um exemplo de aplicação do polimorfismo em Java, mas agora com a utilização de interfaces.

* Herança e interface

Seu amigo Caio está trabalhando numa aplicação Java de uma loja e precisa implementar uma nova funcionalidade de tributação de impostos. Até então, a aplicação possuia as seguintes classes:

public class Item {

    private String nome;
    private double preco;

    // métodos getters e setters omitidos

}

public class Produto extends Item {

    private double peso;

    // métodos getters e setters omitidos

}

public class Servico extends Item {

    private int quantidadeHoras;

    // outros métodos da classe Servico

}

public class Brinde extends Item {

    private String justificativa;

    // métodos getters e setters omitidos

}

E para implementar a nova funcionalidade, Caio criou uma interface chamada Tributavel com o seguinte código:

public interface Tributavel {

    double calculaImposto();

}

E também criou uma classe para calcular o total de impostos:

public class CalculadoraImposto {

    private double totalImposto = 0;

    public void calculaImposto(Tributavel tributavel) {
        totalImposto += tributavel.calculaImposto();
    }

}

E para que os Produtos e Serviços da loja sejam tributados, ele alterou o código dessas respectivas classes para que implementem a interface Tributavel:

public class Produto extends Item implements Tributavel {

    private double peso;

    public double calculaImposto() {
        //produto tem 10% de imposto:
        return getPreco() * 0.1;
    }

    // métodos getters e setters omitidos

}

public class Servico extends Item implements Tributavel {

    private int quantidadeHoras;

    public double calculaImposto() {
        //serviço tem 12% de imposto:
        return getPreco() * 0.12;
    }

    // outros métodos da classe Servico

}

Levando em consideração os conceitos de interface e polimorfismo, escolha TODAS as alternativas corretas em relação à implementação da funcionalidade pelo seu amigo Caio:

O uso da interface Tributavel permite que a classe CalculadoraImposto possa calcular os impostos de qualquer classe que a implemente, sem precisar conhecer a implementação específica de cada uma delas.

Nem todas as classes filhas de Item precisam implementar a interface Tributavel. A interface Tributavel deve ser implementada apenas
pelas classes que forem tributáveis, independente do uso da herança.

* Faça como eu fiz: utilizando interfaces

* Projeto final do curso

* Desafio: hora da prática

Vamos explorar os fundamentos das interfaces no Java. Em uma interface, todos os métodos são automaticamente públicos,
eliminando a necessidade da palavra reservada public em suas declarações. Além disso, assim como na herança,
é possível aplicar o polimorfismo por meio de interfaces, proporcionando flexibilidade e coesão no código.

Para fixar melhor seu aprendizado, propomos uma lista de atividades práticas (não obrigatórias). Prontos para colocar
esse conhecimento em prática?

1. Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal()
para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

2. Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

3. Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

4. Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

5. Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

6. Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua própria lógica de cálculo de preço.

* O que aprendemos?

1. Que no Java uma classe pode herdar de somente uma única classe;

2. O conceito de interfaces no Java;

3. Que numa interface todos os métodos são públicos, não sendo então necessário utilizar a palavra reservada public na declaração deles;

4. Que também é possível aplicar o polimorfismo com o uso de interfaces, similar ao que foi demonstrado com a utilização da herança em aulas anteriores.

### 5. Consolidando conhecimentos

* Construindo uma nova aplicação

Nesta aula eu gostaria de propor um novo desafio, para que você possa consolidar os conhecimentos e utilizar grande parte
dos conceitos e recursos vistos ao longo do curso. Entender com profundidade a orientação a objetos faz com que você
consiga construir aplicações mais robustas, que sejam também mais fáceis de manter e modificar ao longo do tempo.

A proposta é criarmos uma nova aplicação, diferente do ScreenMatch, para que você tenha a oportunidade de praticar
e aprofundar suas compreensões dos conceitos de abstração, herança, encapsulamento e polimorfismo.

No primeiro vídeo, eu apresentarei o desafio proposto, detalhando e sugerindo a implementação dessa nova aplicação.
Nos vídeos subsequentes, irei resolvendo aos poucos, para que, caso você tenha alguma dúvida ao longo do processo,
possa ir fazendo passo a passo e tentando concluir o desafio sozinho.

* Apresentação do desafio

* Modelando nossa aplicação de áudio

* Instanciando músicas e podcasts

* Criando métodos reutilizáveis

* Projeto final do desafio

* O que aprendemos?

A aplicar seus conhecimentos em uma aplicação de um sistema de músicas, utilizando conceitos de orientação a objetos, encapsulamento, herança e polimorfismo.

* Conclusão

* Referências

1. TechGuide: Orientação a Objetos – Hipsters Ponto Tech #350 (gratuito, português, podcast)
<https://www.hipsters.tech/praticas-de-orientacao-a-objetos-hipsters-129/>

Podcast que discute a orientação a objetos, paradigma essencial em muitas linguagens de programação. O episódio abrange tópicos como encapsulamento, abstração, polimorfismo e muito mais.

2. Orientação a Objetos: aprenda seus conceitos e suas aplicabilidades de forma efetiva (pago, português, livro)
<https://www.casadocodigo.com.br/products/livro-oo-conceitos>

O livro apresenta conceitos de orientação a objetos para utilizar da forma mais eficiente. Por meio de exemplos, visa as boas práticas do uso para tornar o processo de desenvolvimento mais produtivo.

3. Orientação a objetos com Roberta Arcoverde (gratuito, português, vídeo)
<https://www.youtube.com/watch?v=jpuJ1qrluoU>

Vídeo que apresenta os conceitos fundamentais sobre sobre a utilização de orientação a objeto e suas aplicações.

4. Java e orientação a objetos (gratuito, português, apostila)
<https://www.alura.com.br/apostila-java-orientacao-objetos?_gl=1*1fo5pxd*_ga*MTgwNjY3Mzg3MS4xNzA3MDM5NTk5*_ga_1EPWSW3PCS*MTcxMzg1OTY4NS4xOC4xLjE3MTM4Njc0MDEuMC4wLjA.*_fplc*MTRLdXhBTjVTTm5zd1Q2MkE1VG8wSU5JJTJGdDUlMkI5SHlOVThJNlVURmlyd3dURDR0UCUyQmh4SFglMkZxUUJDY1JSeE1OaUZ0dlRuMUl4QkE1Y242NEplR3IwYWI3OFVGUEQ5JTJCMzFnOXdBVGhpV3NPcTZjc0RFbVdKQXU2VXd0VzlCZyUzRCUzRA..>

A apostila oferece uma exploração detalhada dos conceitos de orientação a objetos em Java, começando desde os primeiros passos e incluindo diversos exercícios práticos para reforçar o aprendizado.

5. POO: O que é programação orientada a objetos? (gratuito, português, artigo)
<https://www.alura.com.br/artigos/poo-programacao-orientada-a-objetos?_gl=1*19cosxk*_ga*MTgwNjY3Mzg3MS4xNzA3MDM5NTk5*_ga_1EPWSW3PCS*MTcxMzg1OTY4NS4xOC4xLjE3MTM4Njc1NzIuMC4wLjA.*_fplc*MTRLdXhBTjVTTm5zd1Q2MkE1VG8wSU5JJTJGdDUlMkI5SHlOVThJNlVURmlyd3dURDR0UCUyQmh4SFglMkZxUUJDY1JSeE1OaUZ0dlRuMUl4QkE1Y242NEplR3IwYWI3OFVGUEQ5JTJCMzFnOXdBVGhpV3NPcTZjc0RFbVdKQXU2VXd0VzlCZyUzRCUzRA..>

Este artigo faz uma introdução à Programação Orientada a Objetos (POO) e a compara com a programação estruturada, utilizando exemplos de código em linguagens como Python e Java.
