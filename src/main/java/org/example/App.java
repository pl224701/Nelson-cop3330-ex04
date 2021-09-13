/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */


package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        System.out.print("Enter a noun: ");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.print("Enter a verb: ");
        String str2=sc.nextLine();
        System.out.print("Enter an adjective: ");
        String str3=sc.nextLine();
        System.out.print("Enter an adverb: ");
        String str4=sc.nextLine();
        String str5=String.format("Do you %s your %s %s %s? That's hilarious!",str2,str3,str1,str4);
        System.out.print(str5);
    }
}