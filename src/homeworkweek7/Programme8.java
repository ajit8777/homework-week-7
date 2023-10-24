package homeworkweek7;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter first character of the city name from A to F :");
        char c = abc.next().charAt(0);
        if(c == 'A'){
            System.out.println("Ahmedabad");
            }else if(c == 'B'){
            System.out.println("Bhavnagar");
        }else if(c == 'C'){
            System.out.println("Chennai");
        }else if(c == 'D'){
            System.out.println("Delhi");
        }else if(c == 'E'){
            System.out.println("Ernakulam");
        }else if(c == 'F'){
            System.out.println("Faridabad");
        }else{
            System.out.println("Invalid entry");
        }abc.close();
    }
}
