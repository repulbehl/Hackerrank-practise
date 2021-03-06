/*
Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Ron's birth day
int m: Ron's birth month
Returns

int: the number of ways the bar can be divided
Input Format

The first line contains an integer n , the number of squares in the chocolate bar.
The second line contains n space-separated integers ,s[i] the numbers on the chocolate squares where 0<=i<=n.
The third line contains two space-separated integers, d and m , Ron's birth day and his birth month.



*/

package hackerankproblem;

import java.util.Scanner;

public class subarray {

    public static int subarraydivision(int[] ar, int d, int m) {
        int count = 0;

        if (ar.length == 1) {
            if (ar[0] == d) {
                count++;
            }
        } else {
            for (int i = 0; i < ar.length - 1; i++) {
                for (int j = i + 1; j <= (i + 1); j++) {
                    if ((ar[i] + ar[j]) == d) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(subarraydivision(ar, d, m));

    }
}
