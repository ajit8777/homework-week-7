package homeworkweek7;

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) { // Main method declare
        Scanner abc = new Scanner(System.in);// Scanner declare
        System.out.println("Enter the Year :");
        int a = abc.nextInt();
        if(a % 4 == 0){ // if and else statement
            System.out.println(a + " is leap year");
        }else{
            System.out.println(a + " is not leap year");
        }
        abc.close(); // scanner close statement
    }
}
