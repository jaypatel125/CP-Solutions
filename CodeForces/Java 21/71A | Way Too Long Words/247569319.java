import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int tc = sc.nextInt();
        while(tc-->0){
            String s = sc.next();
            int n = s.length();
            if(n > 10){
                System.out.println(s.charAt(0)+ "" +(n-2)+""+s.charAt(n-1));
            } else{
                System.out.println(s);
            }
 
        }
    }
}