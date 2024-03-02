import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        int capitals = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitals++;
            }
        }
        
        int smalls = word.length() - capitals;
        System.out.println(capitals > smalls ? word.toUpperCase() : word.toLowerCase());
    }
}