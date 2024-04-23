package modulo5.aula.util;

import modulo5.aula.modelos.Audio;

public class Preferencia {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é sucesso absoluto e com grande preferência.");
        } else {
            System.out.println(audio.getTitulo() + " também é um áudio de boa preferência. ");
        }
    }
}
