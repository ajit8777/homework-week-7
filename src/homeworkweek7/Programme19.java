package homeworkweek7;

public class Programme19 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 35, 45, 50};
        int total = 0;
        for(int i = 0; i < a.length; i++)
            total = total +a[i];
        double average = total / a.length;
        System.out.println("The average of value of array element is : " + average);
    }
}
