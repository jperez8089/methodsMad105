package com.example.java;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in); //importing a new scanner for user inpit

        //This is where we are printing options so our user can pick from
        System.out.println("Hello, Today we are going to calculate shapes.");
        System.out.println("Please pick a shape\n");
        System.out.println("Press 1 for the area of a Square");
        System.out.println("Press 2 for the area of a Rectangle");
        System.out.println("Press 3 for the area of a Parallelogram");
        System.out.println("Press 4 for the area of a Triangle");

        System.out.println("Please enter your choice below: ");



        // We have the option here so the user can pick a choice. The switch statement is called
        int option = aa.nextInt();
        findWhichOne(option);



    }
    // This is the switch statement which gives us the options of method 1-4
    private static void findWhichOne(int option){
        switch(option) {
            case 1:
                square();
                break;
            case 2:
                rectangle();
                break;
            case 3:
                parallelogram();
                break;
            case 4:
                triangle();
                break;
            default:
                System.out.println("Invalid. Please select a number between 1 and 4");//Default for invalid input

        }

    }
    // This is the square method where we will calculate the area of a square
    private static void square() {
        Scanner aa = new Scanner(System.in);
        System.out.println("Please enter the length of side 1: ");
        int a = aa.nextInt();
        System.out.println("Please enter the length of side 2: ");
        int b = aa.nextInt();

        int areaOfSquare = a * b;

        System.out.println(areaOfSquare);

    }
    // The area of a rectangle
    private static void rectangle(){
        Scanner aa = new Scanner(System.in);
        System.out.println("Please enter the width");
        int a = aa.nextInt();
        System.out.println("Please enter the length");
        int b = aa.nextInt();

        int areaOfRectangle = a * b;
        System.out.println("The area of a rectangle is" + areaOfRectangle);


    }
    // The area of a parallelogram
    private static void parallelogram(){
        Scanner aa = new Scanner(System.in);
        System.out.println("Please enter the base");
        int a = aa.nextInt();
        System.out.println("Please enter the height");
        int b = aa.nextInt();

        int areaOfParallelogram = a * b;
        System.out.println("The area of a parallelogram is " + areaOfParallelogram);
    }
    // The area of a Triangle
    private static void triangle(){
        Scanner aa = new Scanner(System.in);
        System.out.println("Please enter the base");
        int a = aa.nextInt();
        System.out.println("Please enter the height");
        int b = aa.nextInt();

        double areaOfTriangle = (a * b) * .5 ;
        System.out.println("The area of a triangle is " + areaOfTriangle);
    }
}



