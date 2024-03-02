import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Read input and convert to lowercase
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();
 
        // Compare the strings character by character
        int result = 0;
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                result = a.charAt(i) < b.charAt(i) ? -1 : 1;
                break;
            }
        }
 
        // If the strings are equal up to the shorter string's length, compare their lengths
        if (result == 0) {
            result = Integer.compare(a.length(), b.length());
        }
 
        // Output the result
        System.out.println(result);
    }
}