package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * השכנים של כל איבר במטריצה הם כל האיברים הסמוכים לאיבר זה: מעל, מתחת,
 * בצדדים ובאלכסון. לכן, לכל איבר ייתכנו לכל היותר 8 שכנים, ולאיברים שבפינות יש
 * רק 3 שכנים. כתבו פונקציה אשר תקבל כפרמטר מטריצה של int , ותחזיר מטריצה של
 * int בה כל איבר יכיל את הסכום של כל השכנים שהיו לו במטריצה שניתנה כפרמטר.
 * ניתן להניח שמטריצת הקלט היא לפחות 2X2 .
 * לדוגמה, אם נתונה המטריצה:
 * 3 5 7 5
 * -4 2 10 11
 * 9 -50 3 60
 * המטריצה שתוחזר תהיה:
 * 3 18 33 28
 * -31 -17 43 85
 * -52 20 33 24
 * חתימת הפונקציה:
 */

public class sumOfNeighbours {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int[][] mat = new int[9][9];
        // init mat
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                temp = (int) (Math.random() * 10);
                mat[i][j] = temp;
            }
        }
        System.out.println("Mat=:\n");
        for (int i = 0; i < mat[0].length; i++) {
            System.out.println( Arrays.toString(mat[i]));
        }

        int[][] newMat = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[0].length; ++j) {
                int sum = 0;
                // count the upper
                if (i != 0) {
                    if (j != 0)
                        sum += mat[i - 1][j - 1];
                    sum += mat[i - 1][j];

                    if (j != mat[0].length - 1)
                        sum += mat[i - 1][j + 1];
                }
                // count the middle
                if (j != 0)
                    sum += mat[i][j - 1];
                if (j != mat[0].length - 1)
                    sum += mat[i][j + 1];
                // count the lower
                if (i != mat.length - 1) {
                    if (j != 0)
                        sum += mat[i + 1][j - 1];
                    sum += mat[i + 1][j];
                    if (j != mat[0].length - 1)
                        sum += mat[i + 1][j + 1];
                }

                newMat[i][j] = sum;
            }
        }
        System.out.println("resultMat=:\n");
        for (int i = 0; i < newMat[0].length; i++) {
            System.out.println( Arrays.toString(newMat[i]));
        }
    }
}
