/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *
 * *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;
import java.text.DecimalFormat;
public class Ex13 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int p;
        double rate, updrate;
        int yrs, interest;
        System.out.println("Enter the principal: ");
        p = kb.nextInt();
        System.out.println("Enter the rate of interest:");
        rate = kb.nextDouble();
        updrate = rate/ 100;
        System.out.println("Enter the number of years: ");
        yrs = kb.nextInt();
        System.out.println("What is the number of times the interest is compounded per year?");
        interest = kb.nextInt();
        System.out.println("$ " + p + " invested at " + rate + "% for " + yrs + " years compounded " + interest + " times a year is $" + df.format( p * Math.pow( 1+(updrate/interest),interest*yrs) * 100 / 100) );


    }

}