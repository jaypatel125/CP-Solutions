import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if(w>0 && w<=100){
            if (w % 2 == 0 && w > 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}