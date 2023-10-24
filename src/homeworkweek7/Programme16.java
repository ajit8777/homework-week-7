package homeworkweek7;

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = abc.nextInt();
        abc.close();
        if(a > 0){
            System.out.println(a + " is POSITIVE number");
        }else if(a < 0){
            System.out.println(a + " is NEGATIVE number");
        }else if(a == 0){
            System.out.println(a + " is ZERO number");
        }
    }
}
