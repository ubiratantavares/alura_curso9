package modulo5.aula.principal;

import modulo5.aula.modelos.Musica;
import modulo5.aula.modelos.Podcast;
import modulo5.aula.util.Preferencia;

public class Principal {

    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("Forever");
        musica1.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }

        Podcast podcast1 = new Podcast();

        podcast1.setTitulo("BolhaDev");
        podcast1.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curtir();
        }

        Preferencia preferencia = new Preferencia();

        preferencia.inclui(musica1);

        preferencia.inclui(podcast1);

    }
}
