package homeworkweek7;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter sales ID   ;");
        int a = abc.nextInt();
        System.out.println("Enter sellers's name : ");
        String b =abc.next();
        System.out.println("Enter sales amount :");
        int c = abc.nextInt();
        System.out.println("Enter basic salary :");
        int d = abc.nextInt();
        abc.close();
        if(c >= 50000){
            System.out.println("Commission is " + (c*0.35));
        }else if(c >= 30000 && c < 50000){
            System.out.println("Commission is " + (c*0.20));
        }else if(c >= 20000 && c < 30000){
            System.out.println("Commission is " + (c*0.10));
        }else if(c >=10000 && c < 20000 ){
            System.out.println("Commission is " + (c*0.05));
        }else if(c < 10000) {
            System.out.println("Commission is " + (c*0.02));
        }
    }
}
