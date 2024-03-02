import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] arr = sc.next().toCharArray();
 
        char[] result = arr.clone(); 
 
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == 'B' && arr[j + 1] == 'G') {
                    result[j] = 'G'; 
                    result[j + 1] = 'B';
                }
            }
            arr = result.clone(); 
        }
 
        System.out.println(result);
        sc.close();
    }
}