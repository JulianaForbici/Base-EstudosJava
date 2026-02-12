package screenmatching.modelos;

import java.util.*;

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

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeTimothee);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
//        for(Titulo item : lista) {
//            System.out.println("Nome: " + item.getNome());
//            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
//                System.out.println("Classificação: " + filme.getClassificacao());
//            }
//        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Marty Supreme");
        buscaPorArtista.add("Grimes");
        buscaPorArtista.add("Tyler");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação a lista ficou assim");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}