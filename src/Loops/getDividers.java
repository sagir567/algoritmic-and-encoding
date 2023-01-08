package Loops;

import java.util.Scanner;

public class getDividers {


    /**
     * write a program who gets int n as input and print all the prime number thats dividing n
     */

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean status = true;
        for (int i=2;i<=n;i++){

            if(n%i==0){
                status = true;
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        status = false;
                        break;
                    }
                }
                if(status){
                    System.out.println(n+ "is divided by the prime number:"+i);
                }


            }
        }

    }
}
