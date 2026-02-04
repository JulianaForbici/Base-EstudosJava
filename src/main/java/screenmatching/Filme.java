package screenmatching;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluindoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}