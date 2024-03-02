import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = m * n;
        if (x % 2 == 0){
            System.out.println(x / 2);
        } else {
            System.out.println((int)Math.ceil(x / 2.0) - 1);
        }
 
    }
}