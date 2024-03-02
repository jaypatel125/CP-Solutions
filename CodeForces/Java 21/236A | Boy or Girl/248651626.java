import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String word = sc.nextLine();
        HashSet<String> letter = new HashSet<String>();
 
        for(int i = 0; i < word.length(); i++) {
            letter.add(word.substring(i, i + 1));
        }
 
        if(letter.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
 
    }
}