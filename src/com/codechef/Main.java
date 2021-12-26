package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	leetcode problem to find the power of a a decimal number:
	 */
        double power = pow(2.00000,10);
        System.out.println(power);
    }
    public static double pow(double x, int n){
        double pow1= Math.pow(x,n);
        return pow1;
    }
}
