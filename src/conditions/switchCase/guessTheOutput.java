package conditions.switchCase;

public class guessTheOutput {

    public static void main(String args[]) {


        /*What will be the output of the following program? explain your answer.

         */
        int x = 111, y = 101;
        switch (x & y) {
            case 1 :
                System.out.println("-1-");
            case 101 :
                System.out.println("-101-");
            case 111 :
                System.out.println("-111-");
            case 010 :
                System.out.println("-010-");
            default :
                System.out.println("-" + (x & y )+ "-");
        }
    }
}
