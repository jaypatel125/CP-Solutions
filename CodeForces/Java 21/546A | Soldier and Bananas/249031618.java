import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int amount = sc.nextInt();
        int n = sc.nextInt();
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += cost * (i + 1);
        }
        if(total > amount) {
            System.out.println(total - amount);
        } else {
            System.out.println(0);
        }
    }
}