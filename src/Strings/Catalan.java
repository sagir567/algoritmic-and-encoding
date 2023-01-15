package Strings;

import java.util.Scanner;

public class Catalan {

    /*
    כתבו תכנית המקבלת מחרוזת המייצגת תרגיל מתמטי ובודקת את תקינות קלטי הסוגריים
    באף זמן בתוכנית לא יהיו יותר סוגריים סוגרות מאשר פותחות
    כמות הפתח סוגריים צריכה להיות שווה לכמות הסגור סוגריים.

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        Boolean status=true;
        int counter =0;
        for(int i=0;i<s.length()&&status;i++){
            if(s.charAt(i)=='(') counter++;
            if(s.charAt(i)==')') counter--;
            if(counter<0) status = false;
        }
        System.out.println(status);

    }

}

