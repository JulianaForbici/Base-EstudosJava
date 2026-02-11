package screenmatching.modelos;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Isle of dogs", 2000);
        outroFilme.avalia(9.5);
        var filmeTimothee = new Filme("Marty Supreme", 2025);
        filmeTimothee.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        // var de referencia
        Filme f1 = filmeTimothee;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeTimothee);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for(Titulo item : lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}