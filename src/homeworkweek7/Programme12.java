package homeworkweek7;

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter value as a number or alphabet or symbol :");
        char ch = abc.next().charAt(0);
        abc.close();
        if((ch >='a' && ch <= 'z') || (ch >= 'A' && ch<= 'B'  )){
            System.out.println(ch + " is a alphabet");
        }else if (ch >= 0 && ch <=9){
            System.out.println(ch + " is a number");
        }else{
            System.out.println(ch + " is a symbol");
        }
    }
}
