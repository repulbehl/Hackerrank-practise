
/*
Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example
arr=[1,1,2,3]

There are two each of types 1  and 2 , and one sighting of type 3 . Pick the lower of the two types seen twice: type 1.

Function Description

Complete the migratoryBirds function in the editor below.

migratoryBirds has the following parameter(s):

int arr[n]: the types of birds sighted
Returns

int: the lowest type id of the most frequently sighted birds
Input Format

The first line contains an integer,n , the size of arr .
The second line describes arr  as n  space-separated integers, each a type number of the bird sighted.
Sample Input 0

6
1 4 4 4 5 3
Sample Output 0

4
*/
package hackerankproblem;

import java.util.Scanner;

public class Migratory {

    public static int migratorybird(int[] arr, int size) {
        int min = 0;
        int max = arr[0];
        int repo = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            count = 0;
            for (int j = i; j < size; j++) {
                if (arr[i] == arr[j]) {
                    min = arr[i];
                    count++;
                }
            }
            // System.out.println("");
            // System.out.println(" " + i + ". min " + "=" + min + " count = " + count);
            if (max <= min && count >= repo) {
                if (max <= min && count == repo) {
                    // System.out.println("repo befor = " + repo);
                    repo = count;
                    // System.out.print(" repo after = " + repo);
                } else {
                    // System.out.println("repo before = " + repo + " max before = " + max);
                    repo = count;
                    max = min;
                    // System.out.print(" repo after = " + repo + " max after = " + max);
                }
            }
        }
        return max;
    }

    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(migratorybird(arr, size));
    }
}
