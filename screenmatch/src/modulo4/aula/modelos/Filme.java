package modulo4.aula.modelos;

import modulo4.aula.util.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (calculaMediaDasAvaliacoes() / 2);
    }
}
