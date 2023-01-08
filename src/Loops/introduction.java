package Loops;

public class introduction {

    public static void main(String[] args) {
        /**
         * we use while loop when we dont know how long we need to repeat the same action
         * in while loop we will enter inside the loop only if the condition is true
         */
        int limit = 4;
        System.out.println("-------------while------------------");
        int whileCounter = 0;
        while (whileCounter < limit) {
            System.out.println(whileCounter);
            whileCounter++;
        }

        /**
         * we use do while loop when we don't know how many iterations we need to make but we need at least one iteration.
         *     in do while we first enter the loop and only then we check do condition
          */

        System.out.println("------------do-while------------------");
        int doCounter = 0;
        do {
            System.out.println(doCounter);
            doCounter++;
        } while (doCounter < limit);

        /**
         * we use for loops when we know how many iteration we need to make to get the answer, a good example
         * is when we want the check for an input number if it is a prime, we need to cheack all the numbers between 2 ->n-1.
         */
        System.out.println("-------------for------------------");
        for (int forCounter = 0; forCounter < limit; forCounter++) {
            System.out.println(forCounter);
        }
    }
}
