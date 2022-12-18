package conditions;

public class SwitchCase {


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
