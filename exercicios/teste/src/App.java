import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();


        for(int i = 0; i < n ; i++){
            String line = s.nextLine();

            StringBuilder sb = new StringBuilder();
            for(int j =0; j < line.length(); j++){
                char c = line.charAt(j);
                if(Character.isLetter(c)){
                    c+=3;
                }
                sb.append(c);
                System.out.print(c+"");
            }
        }
        }
}