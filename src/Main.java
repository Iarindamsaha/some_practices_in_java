import java.util.Scanner;

public class Main {

    public static void multiplicationTable(long a) {
        for (int i = 1; i <= 10; i++) {
            long multi = a * i;
            System.out.println(a + "*" + i + "=" + multi);
        }
    }

    public static void printOdds(int a) {
        System.out.println("The Odds are:");
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void pattern_Right_Triangle(int a) {
        int i, j;
        for (i = 0; i < a; i++) {  //outer loop for rows
            for (j = 0; j <= i; j++) { //inner loop for data
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void perfect_number(long a){
        long Sum=0;
        int i=1;
        while(i <= a/2){
            if(a % i == 0) {
                Sum = Sum + i;
            }
            i++;
        }
        if(Sum==a){
            System.out.println("The Number "+a+" is a Perfect Number");
        }
        else{
            System.out.println("The Number "+a+" is not a Perfect Number");
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Press 1 For Multiplication Table\nPress 2 to Print odd Numbers\nPress 3 to Print a pattern\nPress 4 To Detect Perfect Number\nPress 5 To Close");
            input = sc.nextInt();
            switch (input) {
                case 1: {
                    System.out.println("Enter The Number You want to generate multiplication table");
                    int input1 = sc.nextInt();
                    multiplicationTable(input1);
                    break;
                }
                case 2: {
                    System.out.println("Enter a Ending Point Number To Generate Odd Numbers");
                    int input1 = sc.nextInt();
                    printOdds(input1);
                    break;
                }
                case 3: {
                    System.out.println("Enter a Number To Generate Pattern");
                    int input1 = sc.nextInt();
                    pattern_Right_Triangle(input1);
                    break;
                }
                case 4:{
                    System.out.println("Enter The Number");
                    long input1= sc.nextLong();
                    perfect_number(input1);
                    break;
                }
                case 5:
                    System.out.println("Application Closed");
                    break;
                default:
                    System.out.println("Enter Correct Input");
                    break;

            }
        } while (input != 5);
    }
}