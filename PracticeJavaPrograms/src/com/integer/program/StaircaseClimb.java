package com.integer.program;
import java.util.Scanner;

public class StaircaseClimb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stairs: ");
        int n = scanner.nextInt();

        int ways = climbStairs(n);
        System.out.println("Number of ways to climb the staircase: " + ways);

        scanner.close();
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}