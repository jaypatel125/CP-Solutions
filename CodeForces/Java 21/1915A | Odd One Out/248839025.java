 
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int arr[] = new int[3];
        int n = sc.nextInt();
        while (n-- > 0) {
            for(int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            int result=0;
            for(int num:arr){
                result^=num;
            }
            System.out.println(result);
        }
        sc.close();
    }
}