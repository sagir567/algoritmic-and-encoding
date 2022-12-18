package conditions;

import java.util.Scanner;

public class numFormation {


    public class PolynomialRoots {


        /**
         * כתבו תכנית המקבלת קלט של מספר לא שלם ומדפיסה "zero" אם הקלט הוא 0.
         * אם המספר שונה מ9 תדפיס התוכנית את "positive "/"negative".
         * הוסיפו את ההדפסה "small " אם הקלט בערך מוחלט קטן מ1 או את ההדפסה "large" אם הוא גדול ממש מ1,000,000
         */

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input value: ");
            double input = in.nextDouble();

            if (input > 0) {
                if (input < 1) {
                    System.out.println("Positive small number");
                } else if (input > 1000000) {
                    System.out.println("Positive large number");
                } else {
                    System.out.println("Positive number");
                }
            } else if (input < 0) {
                if (Math.abs(input) < 1) {
                    System.out.println("Negative small number");
                } else if (Math.abs(input) > 1000000) {
                    System.out.println("Negative large number");
                } else {
                    System.out.println("Negative number");
                }
            } else {
                System.out.println("Zero");
            }
        }


    }
}
