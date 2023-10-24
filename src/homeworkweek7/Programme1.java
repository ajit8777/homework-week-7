package homeworkweek7;

import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) { //Declaring main method
        Scanner abc = new Scanner(System.in); // Declaring Scanner
        System.out.println("Enter the input number:");
        int a = abc.nextInt();
        String x =(a % 2 == 0) ? "even" : "odd"; // used ternary operator
        System.out.println(a + " is " + x);
        abc.close(); // Scanner close
    }
}
