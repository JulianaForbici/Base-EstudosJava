package screenmatching;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5){
            System.out.println("Digite um núimero entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Você acertou");
                break;
            } else if (numeroDigitado < numeroGerado){
                System.out.println("O número digitado é menor que o número random");
            } else {
                System.out.println("O número digitado é maior que o número random");
            }

            if (tentativas == 5 && numeroDigitado != numeroGerado){
                System.out.println("Você não conseguiu acertar o número em 5 tentativas, tchau");
            }
        }
    }
}
