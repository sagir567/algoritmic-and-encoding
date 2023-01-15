package Strings;

import java.util.Scanner;

public class countFrecuency {

    /**
     * כתבו תכנית המקבלת מחרוזת מהמשתמש ותו ומדפיסה את כמות החזרות של התו במחרוזת
     */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = sc.next().charAt(0);
        int counter =0;
        for (int i =0;i<s.length();i++){
            if(s.charAt(i)==a)counter++;
        }
        System.out.println(counter);
    }
}
