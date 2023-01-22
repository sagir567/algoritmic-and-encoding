package Strings;

import java.util.Scanner;

public class vigenereCipher {


/*
צופן ויז'נר הוא צופן החלפה מתוחכם יותר, מכיוון שהוא מחליף כל אות במסר באות
אחרת מתוך אלפבית שונה. ז"א המפתח הינו מילה קוד )או משפט( ומשתמשים בו
באופן מחזורי. כל אות במפתח קובעת באיזה היסט יש להצפין כל אות במסר: האות a
קובעת שיש להסיט 0 מקומות, האות b קובעת שיש להסיט מקום אחד, האות c קובעת
שיש להסיט 2 מקומות, וכן הלאה. לכן, בצופן ויז'נר יכול להיות שנצפין אותה אות של
המסר בכל פעם באמצעות אות אחרת.
לדוגמה, אם נצפין את המחרוזת "university ariel from student impressive "עם המפתח
 ?למה". pacfvzgvjv ggiulbg wycz rywrz bbvjvygvhp " נקבל", honor"
את האות הראשונה במסר, i ,נצפין באמצעות האות h במפתח, ז"א יש להסיט את i 7
מקומות קדימה. לכן, האות בצופן תהיה p .את האות השניה במסר, m ,נצפין באמצעות
האות o במפתח, ז"א יש להסיט את m 14 מקומות קדימה. לכן האות בצופן תהיה a ,
וכן הלאה. שימו לב שהאות s הראשונה במילה impressive הוצפנה באמצעות האות h
של המפתח והאות s השניה במילה הוצפנה באמצעות האות o של המפתח. לכן ה- s
הראשונה הוצפנה לאות z וה- s השניה הוצפנה לאות g .בנוסף, שימו לב שלמרות
שאנחנו לא מצפינים רווחים אנחנו כן מחשיבים אותם כאשר אנחנו חוזרים על המפתח,
ולכן האות s במילה student הוצפנה באמצעות האות o של המפתח )ולא באמצעות
האות h .)
צופן ויז'נר מיוחס לדיפלומט הצרפתי בלז דה ויז'נר )1586 ,)אולם למעשה הומצא מספר
שנים לפניו על יד הקריפטוגרף האיטלקי ג'ובני בטיסטה בלאסו )בשנת 1553 .)למרות
שהצופן לא משמר את תדירות האותיות במסר המקורי הוא עדיין נחשב לא בטוח
לשימוש מכיוון שהוא חשוף לניתוח סטטיסטי.
 */

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
