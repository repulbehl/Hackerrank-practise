/*
Given an array of integers and a positive integer k , determine the number of (i,j) pairs where i<j  and arr[i] + arr[j]  is divisible by k.

Example
ar=[1,2,3,4,5,6]
k=5

Three pairs meet the criteria:[1,4][2,3]  and[4,6] .

Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

int n: the length of array 
int ar[n]: an array of integers
int k: the integer divisor
Returns
- int: the number of pairs

Input Format
The first line contains 2 space-separated integers,n  and k.
The second line contains  space-separated integers, each a value of arr[i].

Sample Input

STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]
Sample Output

 5

 */
package hackerankproblem;

import java.util.Scanner;

public class divisiblesumpair {

    public static int divisiblesumpairs(int n, int k, int ar[]) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j) {
                    int r = ar[i] + ar[j];
                    if (r % k == 0) {
                        System.out.println("ar[" + i + "] + ar[" + j + "] = " + r + " " + " r/k = " + (r / k));
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(divisiblesumpairs(n, k, ar));

    }
}
