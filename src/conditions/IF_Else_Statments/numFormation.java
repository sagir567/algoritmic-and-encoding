package conditions.IF_Else_Statments;

import java.util.Scanner;

public class numFormation {


    public class PolynomialRoots {


        /**
         *  כתבו תכנית המקבלת קלט של מספר לא שלם ומדפיסה "zero"   
         *"positive "/"negative" אם המספר שונה מ0 תדפיס התוכנית 
         * "אם המספר גדול ממש 1,000,000 תדפיס התוכנית "מספר גדול" ואם הקלט קטן ממש מ1 בערך מוחלט תדפיס התוכנית "מספר קטן   
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
