import java.util.Scanner;
import static java.lang.Character.isUpperCase;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] wordArray = word.toCharArray();
        int capitals = 0;
        for (char c : wordArray) {
            if (isUpperCase(c)) {
                capitals++;
            }
        }
        int smalls = word.length()-capitals;
        System.out.println(capitals > smalls ? word.toUpperCase() : word.toLowerCase());
    }
}