package modulo1.aula;

public class Produto {

    String nome;
    double preco;
    double descontoParaPix;

    double pegaPrecoFinal(boolean pagamentoViaPix) {
        double precoFinal = 0.0;
        if (pagamentoViaPix == true) {
            precoFinal = preco - descontoParaPix;
        } else {
            precoFinal = preco;
        }
        return precoFinal;
    }
}
