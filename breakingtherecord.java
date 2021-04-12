/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game
Returns

int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.
Input Format

The first line contains an integer , the number of games.
The second line contains  space-separated integers describing the respective values of score0 ,score1,......score(n-1).


Sample Input 0

9
10 5 20 20 4 5 2 25 1


Sample Output 0
2 4
*/

package hackerankproblem;

import java.util.Scanner;

public class breakingtherecord {

    public static int[] breakingRecords(int[] scores) {
        int count = 0;
        int kerl = 0;
        int min = scores[0];
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            for (int j = i; j < scores.length; j++) {
                if (scores[j] <= min) {
                    if (scores[j] == min) {
                        continue;
                    } else {
                        min = scores[j];
                        count++;
                    }
                } else if (scores[j] >= max) {
                    if (scores[j] == max) {
                        continue;
                    } else {
                        max = scores[j];
                        kerl++;
                    }
                }
            }
        }
        int ar[] = new int[] { kerl, count };
        return ar;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int scores [] = {3,4,21,36,10,28,35,5,24,42};
        int size = sc.nextInt();
        int scores[] = new int[size];
        for (int i = 0; i < size; i++) {
            scores[i] = sc.nextInt();
        }
        // for (int i = 0; i < size; i++) {
        // // scores[i]= sc.nextInt();
        // System.out.println(scores[i]);
        // }
        int[] flt = breakingRecords(scores);
        for (int i = 0; i < flt.length; i++) {
            // scores[i]= sc.nextInt();
            System.out.print(flt[i] + " ");
        }

    }
}
