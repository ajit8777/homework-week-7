package homeworkweek7;

public class Programme3 {
    public static void main(String[] args) {
        System.out.println(" ____________________________ ");
        System.out.println("|                            |");
        System.out.println("|        Mark Sheet          |");
        System.out.println("|____________________________|");
        System.out.println("|      Name     :  Jay       |");
        System.out.println("|      Roll No  :  08        |");
        System.out.println("|____________________________|");
        System.out.println("|      Subject  :  Marks     |");
        System.out.println("|____________________________|");
// Local variable declare
        int math = 98;
        int science = 90;
        int english = 85;
        int total = math + science + english;
        System.out.println("|     Math      :  " + math + "        |");
        System.out.println("|     Science   :  " + science + "        |");
        System.out.println("|     English   :  " + english + "        |");
        System.out.println("|____________________________|");
        System.out.println("|     Total     :  " + total + "       |");
        System.out.println("|____________________________|");
        double percentage = total / 3;
        System.out.println("|     Percentage: " + percentage + "       |");
        if (percentage >= 35) {
            System.out.println("|     Result    :  Pass      |");
        } else {
            System.out.println("|     Result   :  Fail       | ");
        }
        // Nested if and else
        if (percentage >= 80 && percentage < 100) {
            System.out.println("|     Grade     :  A+        |");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("|     Grade     :  A         |");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("|     Grade     :  B         |");
        } else if (percentage >= 35 && percentage < 50) {
            System.out.println("|     Grade     :  C         |");
        } else if (percentage > 100 || percentage < 0) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }
        System.out.println("|____________________________|");
    }
}

