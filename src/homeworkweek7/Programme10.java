package homeworkweek7;

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = abc.nextInt();
        System.out.println("Enter second number :");
        int b = abc.nextInt();
        System.out.println("Select the calculation symbol by entering +, - ,* ,/ :  ");
        char symbol = abc.next().charAt(0);
        abc.close();
        if(symbol == '+'){
            System.out.println(a + " + " + b + " = " + (a + b));
        }else if(symbol == '-'){
            System.out.println(a + " - " + b + " = " + (a - b));
        }else if(symbol == '*'){
            System.out.println(a + " * " + b + " = " + (a * b));
        }else if(symbol == '/'){
            System.out.println(a + " / " + b + " = " + (a / b));
        }
    }
}
