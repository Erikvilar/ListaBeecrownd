import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String textoCifrado = sc.nextLine();
            int deslocamento = sc.nextInt();
            sc.nextLine();

            StringBuilder textoDecodificado = new StringBuilder();

            for (int j = 0; j < textoCifrado.length(); j++) {
                char c = textoCifrado.charAt(j);
                char d = (char) (c - deslocamento);

                if (d < 'A') {
                    d += 26;
                }

                textoDecodificado.append(d);
            }

            System.out.println(textoDecodificado.toString());
        }

        sc.close();
    }
}