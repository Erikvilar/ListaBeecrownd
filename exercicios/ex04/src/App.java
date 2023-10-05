import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNextLine()) {
			boolean upper = true;
			StringBuilder frase = new StringBuilder(leitor.nextLine());
			for (int i = 0; i < frase.length(); i++) {
				char c = frase.charAt(i);
				if (Character.isAlphabetic(c)) {
					if (upper) 	frase.setCharAt(i, Character.toUpperCase(c));
					else 		frase.setCharAt(i, Character.toLowerCase(c));
					upper =! upper;
				}
			}
			System.out.println(frase);
		}
	}
	
}