import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String word = sc.nextLine();
 
        if (!word.isEmpty()) {
            System.out.print(Character.toUpperCase(word.charAt(0)));
            System.out.print(word.substring(1));
        }
 
    }
}