import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int anton = 0;
        for(char c : s){
            if (c == 'A'){
                anton++;
            }
        }
        int danik = n-anton;
        if(anton>danik) System.out.println("Anton");
        else if (anton<danik) System.out.println("Danik");
        else System.out.println("Friendship");
 
    }
 
}