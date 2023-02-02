import java.util.Scanner;

public class newMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int val;
        do{
            System.out.println("Enter The Value, Enter 10 To Exit");
            val = sc.nextInt();
            switch(val){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                case 10:
                    System.out.println("Application Closed");
                    break;
                default:
                    System.out.println("Please Enter a Value Between 1 to 7");
                    break;
            }
        }while(val!=10);
    }
}
