package modulo2.aula;

import modulo2.aula.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme filme = new Filme();

        filme.setNome("Poderoso Chefão");
        filme.setAnoDeLancamento(1970);
        filme.setDuracaoEmMinutos(180);

        System.out.println(filme.getNome());
        System.out.println(filme.getAnoDeLancamento());

        filme.exibeFichaTecnica();

        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);

        System.out.println(filme.getSomaDasAvaliacoes());
        System.out.println(filme.getTotalDeAvaliacoes());
        System.out.println(filme.calculaMediaDasAvaliacoes());

    }
}
