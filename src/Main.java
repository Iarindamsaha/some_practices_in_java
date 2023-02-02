import java.util.Scanner;

public class Main {

    public static void odd_even_Check(int a){
        if (a % 2 == 0){
            System.out.println("The Number is an Even Number");
        }
        else{
            System.out.println("The Number is not an Even Number");
        }
    }
    public static void is_Divisible(int a, int b){
        if (a % b == 0){
            System.out.println(a+" is divisible by "+b);
        }
        else{
            System.out.println(a+" is not divisible by "+b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do{
        System.out.println("Enter 1 to check even or odd\nEnter 2 to check num1 is divisible by num2 or not\nPress 5 to exit");
        input = sc.nextInt();
        switch (input){
            case 1:{
                System.out.println("Enter Your Number");
                int a = sc.nextInt();
                odd_even_Check(a);
                break;
            }
            case 2:{
                System.out.println("Enter Divisor:");
                int a = sc.nextInt();
                System.out.println("Enter Dividend");
                int b= sc.nextInt();
                is_Divisible(a,b);
                break;
            }
            case 5:
                System.out.println("Application Closed");
                break;
            default:{
                System.out.println("Enter Correct Input");
                break;
            }

            }

        }while(input!=5);
    }
}