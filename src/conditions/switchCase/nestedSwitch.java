package conditions.switchCase;

public class nestedSwitch {

    // Main driver method
    public static void main(String[] args)
    {
        String degree = "Computer Science";
        String Branch = "Math";
        int year = 2;

        // first Switch case
        switch (year) {


            case 1:
                System.out.println(
                        "elective courses : Advance english, Algebra");

                // Break statement to stop execution here

                break;


            case 2:

                // second switch inside a switch

                switch (Branch) {

                    // Nested case
                    case "cyber security":
                        System.out.println(
                        "elective courses : Computer Communication, Net Security");
                    case "Data Science ":
                        System.out.println(
                                "elective courses : Machine Learning, Big Data");
                        break;


                    case "Motion and Control":
                        System.out.println(
                                "elective courses : Antenna Engineering, Physics for Engineers ");
                        break;

                    // default case
                    // It will execute if above cases does not
                    // execute
                    default:

                        // Print statement
                        System.out.println(
                                "Elective courses : Optimization");
                }
        }
    }
}
