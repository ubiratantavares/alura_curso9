package modulo1.aula;

import modulo1.aula.Filme;

public class Principal {

    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.nome = "Poderoso Chefão";
        filme.anoDeLancamento = 1970;
        filme.duracaoEmMinutos = 180;

        System.out.println(filme.nome);
        System.out.println(filme.anoDeLancamento);

        filme.exibeFichaTecnica();

        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalDeAvaliacoes);
        System.out.println(filme.calculaMediaDasAvaliacoes());

    }
}
