package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 3 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = input.nextLine();

        System.out.println("Who said it?");
        String person = input.nextLine();

        System.out.println(person + " says, \"" + quote + "\"");

    }
}
