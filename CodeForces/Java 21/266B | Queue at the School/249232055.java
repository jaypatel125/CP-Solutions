import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        char[] arr = sc.next().toCharArray();
 
        for(int i = 0; i < t; i++){
            for (int j = 0; j < n-1; j++) {
                if(arr[j] == 'B' && arr[j+1] == 'G'){
                    arr = swap(arr, j, j+1);
                    j++;
                }
            }
        }
 
        System.out.println(arr);
        sc.close();
    }
 
    public static char[] swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}