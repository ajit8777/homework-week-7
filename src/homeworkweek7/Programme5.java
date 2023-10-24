package homeworkweek7;

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        float basicSalary;
        Scanner abc = new Scanner(System.in);
        System.out.println("Employee ID    : ");
        int a = abc.nextInt();
        System.out.println("Employee Name  : ");
        String b = abc.next();
        System.out.println("Basic salary   : ");
        float c = abc.nextInt();
        abc.close();
        float hra = c*0.1f;
        float da = c*0.08f;
        float ta = c*0.09f;
        float pf = c*0.2f;
        float gs = c+hra+da+ta-pf;
        System.out.println("______________________________");
        System.out.println("|        Salary Slip         |");
        System.out.println("|____________________________|");
        System.out.println("| Emloyee ID     : " + a + "      |");
        System.out.println("| Employee Name  : " + b + "       |");
        System.out.println("|____________________________|");
        System.out.println("| Basic Salary   : " + c + "   |" );
        System.out.println("| HRA 10%        : " + hra + "    |");
        System.out.println("| TA 9%          : " + ta + "    |");
        System.out.println("| DA 8%          : " + da + "    |");
        System.out.println("| PF -20%        : " + pf + "    |");
        System.out.println("|____________________________|");
        System.out.println("| Gross Salary   : " + gs + "   |" );
        System.out.println("|============================|");

    }
}
