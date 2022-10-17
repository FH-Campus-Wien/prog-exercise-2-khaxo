package at.ac.fhcampuswien;

import java.util.Locale;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        double input;
        double largest = 0;
        int counter = 1;

        do {
            System.out.print("Number " + counter + ": ");
            input = scan.nextDouble();
            if(input > largest){
                largest = input;
            }
            counter++;
        } while (input > 0);

        if(largest <= 0){
            System.out.println("No number entered.");
        } else {
            System.out.println("The largest number is " + String.format(Locale.US,"%.2f", largest));
        }
    }


    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int rows;
        int number = 1;
        System.out.print("n: ");
        rows = scan.nextInt();

        if(rows > 0) {
            for (int row = 0; row < rows; row++){
                for (int column = 0; column <= row; column++) {
                    System.out.print((number++) + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        final int rows = 6;
        for (int row = 1; row <= rows; row++){
            for (int space = rows; space > row; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star < row*2-1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("h: ");
        int h = scan.nextInt();
        System.out.print("c: ");
        char c = scan.next().charAt(0);

        if(h % 2 == 1){
            for(int i = 0; i <= h / 2; i++){
                for(int j = i; j < h / 2; j++){
                    System.out.print(" ");
                }
                for(int k = - i; k <= i; k++){
                    System.out.print((char)(c - Math.abs(k)));
                }
                System.out.println();
            }

            for(int i = h / 2; i > 0; i--){
                for(int j = i; j <= h / 2; j++){
                    System.out.print(" ");
                }
                for(int k = - i + 1; k < i; k++){
                    System.out.print((char)(c - Math.abs(k)));
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid number!");
        }
    }


    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int mark;
        int counter = 1;
        int sum = 0;
        float average;
        int negative = 0;

        do {
            System.out.print("Mark " + counter +": ");
            mark = scan.nextInt();
            if (mark > 5 || (mark < 1 && mark != 0)){
                System.out.println("Invalid mark!");

            }
            else if (mark == 5){
                negative++;
                counter++;
                sum += mark;
            }

            else if (mark <5 && mark >0){
                counter++;
                sum += mark;
            }
            else {
                counter--;
            }


        } while (mark != 0);
if (counter>0){
        average = sum / (float)counter;}
else {
    average = 0;
}

        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Negative marks: " + negative);

    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.print("n: ");
        number = scan.nextInt();

        while(number != 1 && number != 4) {
            while (number != 0) {
                sum += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = sum;
            sum = 0;
        }
        if(number == 1) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}