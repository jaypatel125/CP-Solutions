import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int peopleIn = 0;
        int maxCapacity = 0;
        int[] arr = new int[n*2];
        for (int i = 0; i < n*2; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n*2; i++){
            if(i%2 == 0){
                peopleIn -= arr[i];
            } else {
                peopleIn += arr[i];
            }
            if(peopleIn > maxCapacity){
                maxCapacity = peopleIn;
            }
        }
 
        System.out.println(maxCapacity);
    }
 
}