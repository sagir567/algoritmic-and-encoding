package conditions.switchCase;

import java.util.Scanner;

public class daysOfTheWeek {

    public static void main(String[] args)  {

   /* What will be the output of the following program?, explain your answer.

    */
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

        int day = 4;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            default:
                System.out.println("Weekend");
                break;
        }
    }
}
