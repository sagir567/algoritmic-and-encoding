package conditions.switchCase;

public class SwitchCase {
    /*
    Some Important Rules for Switch Statements
    1) There can be any number of cases just imposing condition check but remember duplicate case/s values are not allowed.
    2) The value for a case must be of the same data type as the variable in the switch.
    3) The value for a case must be constant or literal. Variables are not allowed.
    4) The break statement is used inside the switch to terminate a statement sequence.
    5) The break statement is optional. If omitted, execution will continue on into the next case.
    6) The default statement is optional and can appear anywhere inside the switch block. In case, if it is not at the end, then a break statement must be kept after the default statement to omit the execution of the next case statemen
*/

    public static void main(String[] args) {

        int num = 6;

        /**
         * חובה לסיים את הcase עם break.
         */
        switch (num) {

            case 1:
                System.out.println("I am 1");
                break;
            case 2:
                System.out.println("I am 2");
                break;
            default:
                System.out.println("not 1 or 2");
                break;
        }

        /**
         * אם אין תוכן בתוך הcase, מותר לצרף כמה אופציות אחד אחרי השני,
         * כאשר בכל case לא ריק נוסיף break אחרת נכנס גם למקרים הבאים.
         */

        switch (num) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("not Sunday or Monday");
                break;
        }
        //-----------------Example------------------------

        // 90 - 100 --> "Perfect"
        // 80 - 90 --> "Very good"
        // 60 - 80 --> "Good"
        // 0 - 60 --> "Try to improve"


        int[] grades = new int[]{100, 90, 83, 64, 53, 20};

        for (int grade : grades) {

            System.out.println("\n----------grade : "+grade+"-------------------");
            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println("Perfect");
                    break;
                case 8:
                    System.out.println("Very good");
                    break;
                case 7:
                case 6:
                    System.out.println("Good");
                    break;

                default:
                    System.out.println("Try to improve");
                    break;
            }
        }
    }
}
