package conditions.switchCase;

public class daysOfTheWeek {

    public static void main(String s[])

   /* What will be the output of the following program?, explain your answer.

    */
    {
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
