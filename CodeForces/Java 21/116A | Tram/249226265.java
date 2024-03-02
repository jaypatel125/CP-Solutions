import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int peopleIn = 0;
        int maxCapacity = 0;
 
        for (int i = 0; i < n; i++) {
            int entering = sc.nextInt();
            int leaving = sc.nextInt();
 
            peopleIn -= entering; 
            peopleIn += leaving;  
 
            if (peopleIn > maxCapacity) {
                maxCapacity = peopleIn;
            }
        }
 
        System.out.println(maxCapacity);
        sc.close();
    }
}