import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		int n = Integer.parseInt(sc.nextLine());
		for (int i=0; i<n; i++){
			String entrada = sc.nextLine();
			if (entrada.equals("one")) System.out.println("1");
			else if (entrada.equals("two")) System.out.println("2");
			else if (entrada.equals("Three")) System.out.println("3");
			else {
				char[] x = entrada.toCharArray();
					 if (x[0]=='o' && x[1]=='n') System.out.println("1");
				else if (x[0]=='o' && x[2]=='e') System.out.println("1");
				else if (x[1]=='n' && x[2]=='e') System.out.println("1");
				else if (x[0]=='t' && x[1]=='w') System.out.println("2");	
				else if (x[0]=='t' && x[2]=='o') System.out.println("2");
				else if (x[1]=='w' && x[2]=='o') System.out.println("2");
				else if (x[0]=='t' && x[1]=='h' && x[2]=='r' && x[3]=='e') System.out.println("3");
				else if (x[0]=='t' && x[1]=='h' && x[2]=='r' && x[4]=='e') System.out.println("3");
				else if (x[0]=='t' && x[1]=='h' && x[3]=='e' && x[4]=='e') System.out.println("3");
				else if (x[0]=='t' && x[2]=='r' && x[3]=='e' && x[4]=='e') System.out.println("3");
				else if (x[1]=='h' && x[2]=='r' && x[3]=='e' && x[4]=='e') System.out.println("3");
			}
		}
		sc.close();
	}
}