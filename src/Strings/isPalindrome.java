package Strings;

import java.util.Scanner;

public class isPalindrome {


    /**
     * 1 ( פלינדרום )palindrome )הוא מילה, ביטוי, מספר או רצף אחרים של
     * תווים שהקריאה שלו זהה מהסוף להתחלה או מהתחלה לסוף , כמו "madam "או
     * "racecar"
     * כתבו תכנית שמקבלת מחרוזת תווים ומדפיסה true אם המחרוזת מהווה
     * פלינדרום, אחרת היא מדפיסה false.
     *
     * ב( )1 נק'( מהו הפלט של הביטוי הבא, נמקו היטב.
     * public static void main(String[] args) {
     * String s1 = new String("pankaj");
     * String s2 = new String("PANKAJ");
     * System.out.println(s1 = s2);
     */

/*-------------------------------------------Q1------------------------------------------*/
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean status = true;

        for (int i=0;i<s.length()/2 && status;i++){
            status = (s.charAt(i) == s.charAt(s.length()-i-1));
        }
        System.out.println(status);

    }

    /*-------------------------------------------Q2------------------------------------------*/
/*
  1)   String s1 = new String("pankaj");
  2)   * String s2 = new String("PANKAJ");
  3)   (s1 = s2)
  4)   * System.out.println(s1 = s2);

    נשים לב לסדר הפעולות של java ונעבור פעולה פעולה:
    1) השמה לs1
    2) השמה לs2
    3) השמה של s2 לתוך s1
    4) הדפסת התוצאה(S2)

 */


}
