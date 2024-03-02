import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int distance = (int) Math.ceil((double) a / 5);
        System.out.println(distance);
    }
}