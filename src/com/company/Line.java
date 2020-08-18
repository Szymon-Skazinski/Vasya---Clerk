package com.company;

import java.util.Arrays;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        System.out.println(Arrays.toString(peopleInLine));

        int[][] billSorted = new int[3][2];
        billSorted[0][0] = 25;
        billSorted[1][0] = 50;
        billSorted[2][0] = 100;
        billSorted[0][1] = 0;
        billSorted[1][1] = 0;
        billSorted[2][1] = 0;
//

        String answer = "NO";

        int bill25 = 0;
        int bill50 = 0;
        int bill100 = 0;

        for (int bill : peopleInLine) {

            if (bill == 25) {
                bill25++;
                billSorted[0][1] += 1;
            } else if (bill == 50) {
                bill50++;
                billSorted[1][1] += 1;
            } else {
                bill100++;
                billSorted[2][1] += 1;
            }


//
//
            System.out.println("\nFIRST TABLE\n");

            System.out.println("25 " + bill25);
            System.out.println("50 " + bill50);
            System.out.println("100 " + bill100 + "\n");
            System.out.println("\n" + answer);//
//

            if (bill100 > 0 && bill25 > 0 && bill50 > 0 && bill25 > bill50) {
                if (bill50 > bill100) {
                    bill50 = bill50 - bill100;
                } else {
                    bill100 = bill100 - bill50;
                    bill50 = 0;
                }

                if (bill25 >= bill50) {
                    bill25 --;
                }

            }


            if (bill25 > 0 && bill50 > 0 && bill100 == 0) {
                bill25--;
            } else if (bill25 == 0 && (bill50 != 0 || bill100 != 0)) {
                return answer = "NO";
            } else if (bill50 == 0 && bill25 >= 3 * bill100 && bill100 > 0) {
                bill25 = bill25 - 3;
                answer = "YES";
            } else if (bill50 == 0 && bill25 < 3*bill100 && bill100 >0 ){
                return answer = "NO";
            }
            System.out.println("\nSECOND TABLE\n");

            System.out.println("25 " + bill25);
            System.out.println("50 " + bill50);
            System.out.println("100 " + bill100 + "\n");
            System.out.println("\n" + answer);

            if (bill25 >= 0 && bill50 >= 0 && bill100 >= 0) {
                answer = "YES";
            } else {
                return answer = "NO";
            }
        }


        return answer;
    }


}
