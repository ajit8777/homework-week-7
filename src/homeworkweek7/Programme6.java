package homeworkweek7;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        int a;
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter Number   : ");
        a = abc.nextInt();
        abc.close();
        if(a % 2 == 0){
            System.out.println(" is even number");
        }else{
            System.out.println(" is odd number");
        }
    }
}
