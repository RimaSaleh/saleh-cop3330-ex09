/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){

    //scanner used to read data inputted
    Scanner scanner = new Scanner(System.in);

    //initializing total square feet and gallons
    int total_sf;
    int gallons;

        //print statement asking for length of ceiling be inputted
        System.out.format( "Enter the length of the ceiling in square feet: " );
        //number will be inputted and stored as "length"
        int length = scanner.nextInt();

        //print statement asking for width of ceiling be inputted
        System.out.format( "Enter the width of the ceiling in square feet: " );
        //number will be inputted and stored as "width"
        int width = scanner.nextInt();

        //value of total square feet and gallons
        total_sf = length * width;
        gallons = (total_sf / 350)+1;

        //output the gallons and total square feet
        System.out.format( "You will need to purchase %d gallons of paint to cover %d square feet.",gallons, total_sf );
    }
}
