package homeworkweek7;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
            Scanner abc = new Scanner(System.in);
            System.out.print("Enter number of the city name from A to F(like A=1 and F=6) : ");
            int city = abc.nextInt();
        switch (city) {
            case 1:
                System.out.println("Ahmedabad");
                break;
            case 2:
                System.out.println("Bhavnagar");
                break;
            case 3:
                System.out.println("Chennai");
                break;
            case 4:
                System.out.println("Delhi");
                break;
            case 5:
                System.out.println("Ernakulam");
                break;
            case 6:
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
                abc.close();
        }
    }
}
