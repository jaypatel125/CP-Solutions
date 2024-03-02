import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int heightOfFence = sc.nextInt();
        int width= 0;
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            if(heightOfFence<height) {
                width += 2;
            } else {
                width += 1;
            }
        }
        System.out.println(width);
        sc.close();
    }
}