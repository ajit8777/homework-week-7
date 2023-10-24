package homeworkweek7;

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {
int x[] = {30, 50, 20, 60, 40};
String name[] = {"Prime", "Testing", "Java", "Cucumber", "Postman"};
        System.out.println("Original numeric array : " + Arrays.toString(x));
        Arrays.sort(x);
        System.out.println("Sorted numeric array : " + Arrays.toString(x));
        System.out.println("Original String array :" + Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted String array ;" + Arrays.toString(name));
    }
}
