package Loops;

import java.util.Scanner;

public class isPrime {

    /**
     * write a program who get int n as input and check if n is a prime number.
     * @param args
     */

    public static void main(String[] args ){

        boolean status = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1) {
            System.out.println("input is not valid");
            System.exit(-1);
        }
        else{
            for(int i =2;i<Math.sqrt(n);i++){
                if (n%i==0){
                    status = false;
                    System.out.println("not Prime!!!");
                }
            }
        }
        if(status = true) System.out.println("n is not prime!!!");
    }
}
