import java.util.Scanner;

public class leapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a year");
        int year = sc.nextInt();

        if (year % 400 == 0){
            System.out.println("The Year is a Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("The Year is Not a Leap Year");

        } else if (year % 4 == 0) {
            System.out.println("The Year is a Leap Year");

        }else{
            System.out.println("The Year is Not a Leap Year");
        }
    }
}
