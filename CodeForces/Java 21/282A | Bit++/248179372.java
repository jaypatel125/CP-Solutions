import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int x = 0;
        while(n-->0){
            String s = sc.next();
            if(s.charAt(1) == '+' || s.charAt(2) == '+') x++;
            else x--;
        }
        System.out.println(x);
    }
}