package screenmatching;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: The perks of being a Wallflower");

        int anoDeLancamento = 2012;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.print(media);
        String sinopse;
        sinopse = " " +
                  "Filme The perks of being a Wallflower\n" +
                  "Filme de drama\n" +
                  "Muito bom!\n" +
                  "Ano de lançamento " + anoDeLancamento;
        System.out.println(sinopse);

        int classficacao;
        classficacao = (int) (media / 2);
        System.out.println(classficacao);
    }
}
