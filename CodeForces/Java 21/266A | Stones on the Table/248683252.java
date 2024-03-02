//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        String s = sc.next();
//        char[] stones = s.toCharArray();
//        int count = 0;
//        int i = 0;
//        int j = i +1;
//
//        while ( i < n - 1) {
//                if (stones[i] == stones[i+1]){
//                    j = i+1;
//                    while (j < n) {
//                        if (stones[i] != stones[j]){
//                            break;
//                        } else {
//                            count++;
//
//                        }
//                        j++;
//                    }
//                }
//                i++;
//                if (j==n){
//                    break;
//                }
//        }
//        System.out.println(count);
//    }
//}
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        String s = sc.next();
 
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
 
        System.out.println(count);
 
        sc.close();
    }
}