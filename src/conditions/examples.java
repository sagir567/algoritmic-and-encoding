package conditions;

import java.util.Scanner;

public class examples {

    /*
    תנועת הנוער יכולים להירשם 3 קבוצות של גילאים המחולקים באופן הבא:
גילאי 7-11 קבוצה A
גילאי 12-15 קבוצה B
גילאי 16-18 קבוצה C
גילאים קטנים או גדולים אינם נכללים לאף אחת מהקבוצות
כתבו תוכנית המקבלת גיל של ילד הרוצה להירשם לתנועה. התוכנית תדפיס עבורו לאיזו קבוצה הוא משתייך.
 במידה והוא לא משתייך לאחת הקבוצות יש להדפיס האם הוא קטן מדיי או גדול מדיי. במידה והגיל אינו תקין (אינו בטווח שבין 0-120) יש להדפיס הודעה שהגיל אינו תקין.
     */

    public static void main(String[] args){
            Scanner sc = new  Scanner(System.in);
            System.out.println("enter your age");

            int age = sc.nextInt();

            if(age>=7 && age<=11){
                System.out.println(" you are belongs to A");
            }
            else if(age>=12 && age<=15){
                System.out.println(" you are belongs to B");
            }
            else if(age>=16 && age<=18){
                System.out.println(" you are belongs to C");
            }
            //-----------------אופציה 1: היא להכנס ליצור מקרה של ברירת מחדל במידה ולא נכנסנו לאף אחד מהתנאים הקודמים-----------------------------
            else{
                System.out.println("you are outage");
            }
            // -----------------------אופציה 2:  לבדוק בתנאי אחד את שני הטווחים---------------------------------

            // if(age>18 || age<7){
            //   System.out.println("you are to old for this game");
            // }
        //-------------------אופציה 3: היא לבדוק כל תנאי בנפרד ולהדפיס הודעה שונה בהתאם לתנאי אליו נכנסנו------------------------
            // if(age<18){
            //   System.out.println("you are to young for this game");
            // }



    }
}
