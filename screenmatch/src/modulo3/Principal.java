package modulo3;

import modulo3.aula.modelos.Filme;
import modulo3.aula.modelos.Serie;
import modulo3.aula.util.CalculadoraDeTempo;

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

        Serie serie = new Serie();

        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar a serie: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        System.out.println(calculadora.getTempoTotal());

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
        filme2.setAnoDeLancamento(1970);
        filme2.setDuracaoEmMinutos(200);

        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());


    }

}
