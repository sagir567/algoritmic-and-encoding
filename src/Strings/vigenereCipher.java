package Strings;

import java.util.Scanner;

public class vigenereCipher {




    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text you want to cipher");
        String txt = sc.nextLine();
        System.out.println("enter the ciphering key");
        String key =sc.nextLine();


        String answer = "";
        int i, j = 0;
        int keyLen = key.length();
        for(i=0; i < txt.length() ;++i)
        {
            if(txt.charAt(i) != ' ')
                answer += (char)('a'+((txt.charAt(i)-'a'+key.charAt(j)-'a')%26));
            else
                answer += ' ';
            j = (j+1) % keyLen;
        }
        System.out.println("cipher txt:"+answer);;

    }
}
