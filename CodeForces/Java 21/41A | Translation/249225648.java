import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] f = sc.next().toCharArray();
        char[] s = sc.next().toCharArray();
        boolean flag = true;
        int j = s.length - 1;
 
        for(int i = 0; i < f.length; i++) {
            if(f[i]!=s[j]){
                flag = false;
                break;
            }
            j--;
        }
        System.out.println(flag ? "YES" : "NO");
    }
 
}