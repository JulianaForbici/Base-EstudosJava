package minhasmusicas;

import minhasmusicas.modelos.MinhasPreferidas;
import minhasmusicas.modelos.Musica;
import minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Realiti");
        minhamusica.setCantor("Grimes");

        for (int i = 0; i < 1000; i++) {
            minhamusica.reproduz();

        }

        for (int i = 0; i < 50; i++) {
            minhamusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podcast");
        meuPodcast.setApresentador("Eu");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferida = new MinhasPreferidas();
        preferida.inclui(meuPodcast);
        preferida.inclui(minhamusica);
    }
}
