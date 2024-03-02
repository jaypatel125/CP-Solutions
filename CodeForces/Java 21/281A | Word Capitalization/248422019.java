import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String word = sc.nextLine();
 
        char[] arr = word.toCharArray();
 
        for (int j = 0; j < arr.length; j++) {
            if (j == 0) {
                System.out.print(Character.toUpperCase(arr[j]));
            } else {
                System.out.print(arr[j]);
            }
        }
 
    }
}