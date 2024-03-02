import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        // Read the number of problems
        int tc = sc.nextInt();
         // Initializing a counter for the inner loop
        int k = 0; // Counter for problems where at least two friends are sure about the solution
 
        // Loop over each problem
        while(tc --> 0){
            int j = 3;
            int count = 0; // Counter for how many friends are sure about the solution for the current problem
 
            // Loop over the three friends' opinions
            while(j --> 0){
                int n = sc.nextInt(); // Read friend's opinion
                if(n == 1){ // If the friend is sure about the solution (1 indicates sure)
                    count++; // Increment the counter
                }
            }
 
            // If at least two friends are sure about the solution for the current problem, increment the total counter
            if (count >= 2){
                k++;
            }
        }
 
        // Print the total count of problems where at least two friends are sure about the solution
        System.out.println(k);
    }
}