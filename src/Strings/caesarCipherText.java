package Strings;


import java.util.Scanner;

/*
בתחום הקריפטוגרפיה, צופן קיסר, הידוע גם כצופן היסט, הוא אחד הצפנים הפשוטים
בעולם ההצפנה. זהו סוג של צופן החלפה שבו כל אות בטקסט מוחלפת על ידי אות
הנמצאת בהיסט קבוע כלשהו ממנה באלף-בית. ההיסט הקבוע הוא מפתח ההצפנה.
למשל אם נקבע את ההיסט להיות 3 ,האות A תו חלף באות D ,האות B תוחלף באות
E ,וכך הלאה באופן מחזורי )ז"א האות X תוחלף באות A .)הכינוי קיסר נובע מכך
שיוליוס קיסר נהג להשתמש בצופן על מנת לתקשר עם מפקדיו. כמו כל צופן החלפה
אלף-ביתי, צופן קיסר מפוענח בקלות ולא מספק כמעט שום הגנה על אמצעי
התקשורת.
כתבו פונקציה בשם caesarCipherText שמקבלת מחרוזת ומפתח הצפנה, ומחזירה את
המחרוזת המוצפנת. ניתן להניח שהקלט המתקבל הוא של אותיות קטנות המהוות את
ה- abc או תו רווח, אותו לא נצפין. במידה והמפתח אינו חוקי יש להחזיר מחרוזת ריקה.
 ,1 מפתח עם" defend the east wall of the castle " המחרוזת את נצפין אם, לדוגמה
נקבל "dbtumf uif pg xbmm fbtu uif efefoe ."כדי לפענח את המחרוזת המוצפנת נוכל
פשוט להשתמש בפונקציית ההצפנה עם מפתח שלילי.
 */
public class caesarCipherText {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int key = sc.nextInt();
        // נסו להחליף בין שתי השורות האחרונות וראו מה קורה?


        System.out.println("ciphering... ");
        if(key>26 || key <-26)	// illegal key
            System.out.println("invalid key");;
        String ret = "";
        int reminder;
        for(int i=0; i < s.length() ;++i)
        {
            if(s.charAt(i) != ' ')
            {
                reminder = (s.charAt(i)-'a'+key)%26;
                if(reminder < 0)
                    reminder += 26;

                ret += (char)('a'+reminder);
            }
            else
                ret += ' ';
        }

        System.out.println("cipher txt:"+ret);
    }

}
