package homeworkweek7;

import java.util.Scanner;

public class Programme20 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60};
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value :");
        int toFind = scan.nextInt();
        scan.close();
        boolean found = false;

        for(int n : a){
            if(n == toFind){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(toFind + " is sorted in array");
        }else{
            System.out.println(toFind + " is not sorted in array");
        }
    }
}
