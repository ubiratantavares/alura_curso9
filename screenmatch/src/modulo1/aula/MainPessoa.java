package modulo1.aula;

public class MainPessoa {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ana";
        pessoa1.idade = 20;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

        pessoa1.fazAniversario();

        System.out.println("A idade agora é: " + pessoa1.idade);

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Carlos";
        pessoa2.idade = 40;

        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");

        pessoa2.fazAniversario();

        System.out.println("A idade agora é: " +pessoa2.idade);

    }
}
