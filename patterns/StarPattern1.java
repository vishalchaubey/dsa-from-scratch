package patterns;

import java.util.Scanner;

public class StarPattern1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = scanner.nextInt();
        for(int row = 0; row<num; row++)
        {
            for(int col = 0; col<num; col++)
            {
                if(col <= row){
                    System.out.print("*"); 
                }   
            }
            System.out.println("");
            }
        }
    }

    // public class StarPattern1 {
    //     public static void main(String[] args) {
    //         int n = new Scanner(System.in).nextInt();
    //         for (int i = 1; i <= n; i++)
    //             System.out.println("*".repeat(i)); // Uses String.repeat() (Java 11+) to avoid inner loop.
    //     }
    // }
