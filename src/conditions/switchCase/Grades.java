package conditions.switchCase;

import java.util.Scanner;

public class Grades {

    /*
    write a program that receive final grade as an int and print a verbal indication using switch
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        switch (grade / 10) {
            case 10:
                System.out.println("Excellent you're a delight student ");
                break;

            case 9:
                System.out.println("impressive keep going ");
                break;

            case 8:
                System.out.println("very good ");
                break;


            case 7:
                System.out.println("good ");
                break;

            case 6:
                System.out.println("good enough   ");
                break;


            case 5:
                System.out.println("not enough ");
                break;

            default:
                System.out.println("F you should try better!");
        }


    }
}
