package exemplos;

public class ExemploStrings {
    public static void main(String[] args) {
        String mensagem;
        String texto;
        mensagem = "Oie";
        texto = "Estudando aqui";

        System.out.println("Texto: " + texto.toUpperCase());
        System.out.println("Mensagem: " + mensagem.toLowerCase());
        int tamanho = texto.length();
        System.out.println("Tamanho: " + tamanho);
        String textoAlterado = texto.replace(" ", "-");
        System.out.println("Texto: " + textoAlterado);

        if(textoAlterado.contains("-"))
        {
            System.out.println("Tem hífen no texto");
        }
        else
        {
            System.out.println("Não tem hífen");
        }
    }
}
