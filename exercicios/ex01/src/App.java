import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();

            StringBuilder sb = new StringBuilder(); //String builder gera um objeto que faz a manipulação da string
            for (int j = 0; j < linha.length(); j++) {
                char c = linha.charAt(j);
                if (Character.isLetter(c)) { //is letter retorna valor true ou false
                    c += 3;
                }
                sb.append(c); //appende faz o acrescimento da string
            }

            String primeiraPassada = sb.toString(); //to string retorna as strings concatenadas

            sb.setLength(0); //define o tamanho  ou seja aqui esta começando em 0
            for (int j = primeiraPassada.length() - 1; j >= 0; j--) { 
                sb.append(primeiraPassada.charAt(j)); //e nessa linha sera aumentada
            }

            String segundaPassada = sb.toString();

            sb.setLength(0);
            int metade = segundaPassada.length() / 2;
            for (int j = 0; j < segundaPassada.length(); j++) {
                char c = segundaPassada.charAt(j);
                if (j >= metade) {
                    c--;
                }
                sb.append(c);
            }

            System.out.println(sb.toString());
        }

        scanner.close();
    }
}