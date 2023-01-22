package Arrays;

public class intrudationArrays {

    public static void main(String[] args) {
        //****************val type********************

        //דרך ראשונה ליצירת מערך - באמצעות ציון מספר התאים שיהיו לאותו מערך
        //ללא צורך לתת את ערכי התאים בשורת האיתחול
        int[] arr1 = new int[3];
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = 8;


        //דרך שניה ליצירת מערך - השמת ערכי התאים בשורת האתחול
        int[] arr2 = {2, 4, 8, 7, 7};

        //דרך שלישית ליצירת מערך - באמצעות השמת ערכי התאים בשורת האיתחול
        //ללא צורך בציון מספר התאים שיהיו לאותו מערך
        //מספר התאים יקבע לפי מספר הערכים שניתנו באיתחול
        int[] arr3 = new int[]{2, 4, 8};

        System.out.println("---------------arr1------------------");
        for (int i = 0, size=arr1.length; i <size ; i++) {
            System.out.print(arr1[i] + " ");
        }
        //דרך ראשונה ליצירת מערך - באמצעות ציון מספר התאים שיהיו לאותו מערך
        //ללא צורך לתת את ערכי התאים בשורת האיתחול
        String[] str1 = new String[3];
        str1[0] = "welcome";
        str1[1] = "to";
        str1[2] = "Arrays";

        //דרך שניה ליצירת מערך - השמת ערכי התאים בשורת האתחול
        String[] str2 = {"welcome", "to", "Arrays"};

        //דרך שלישית ליצירת מערך - באמצעות השמת ערכי התאים בשורת האיתחול
        //ללא צורך בציון מספר התאים שיהיו לאותו מערך
        //מספר התאים יקבע לפי מספר הערכים שניתנו באיתחול
        String[] str3 = new String[]{"welcome", "to", "Arrays"};

        System.out.println("\n---------------str------------------");
        for (int i = 0; i < str1.length; i++) {
            System.out.print(str1[i] + " ");

        }

        for (int i = 0; i < str1.length; i++) {
            System.out.printf("\n" + str1[i].length() + " index- %d\n", i);
        }

        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str1[i].length(); j++)
                if (j % 2 == 0)
                    System.out.print(str1[i].charAt(j));
                else
                    System.out.printf("%d", j);
            System.out.println();

        }

    }


}
