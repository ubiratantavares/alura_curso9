package modulo3.aula.util;

import modulo3.aula.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
