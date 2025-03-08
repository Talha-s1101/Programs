package com.DSprograms.in;

import java.util.Scanner;

public class ArmstrongRange {
    public static boolean printArmstrong(int num){
        int temp = num ;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while(num !=0){
            int digit = num%10;
            sum = (int) (sum+Math.pow(digit,digits));
            num /=10;
        }
        return sum==temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Armstrong numbers between 1 to "+" is : ");
        for (int i= 0;i<=n;i++){
            if (printArmstrong(i)){
                System.out.println(i+" ");
            }
        }
    }
}
