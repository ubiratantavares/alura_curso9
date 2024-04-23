package modulo5.aula.modelos;

public class Audio {

    private String titulo;
    private int duracaoEmMinutos;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir() {
        this.totalCurtidas++;

        }

    public void reproduzir() {
        this.totalReproducoes++;
    }

}
