public class Main {
    public static void main(String[] args) {
        //Arithmetic Operators
        //binary
        int a= 10;
        int b= 20;
        int add= a+b; //addition
        int subtract = b-a; //subtract
        int multi = a*b; //multiplication
        int division = b/a; //division
        int modulo = a%b; //modulo
        System.out.println("Addition="+add);
        System.out.println("Subtract="+subtract);
        System.out.println("Multiplication="+multi);
        System.out.println("Division="+division);
        System.out.println("Reminder="+modulo);
        System.out.println("...........................................................");
        //unary(only used to
        int a1 = 20;
        int b1=a1++; //post increment
        int c1 = 30;
        int d1 = ++c1; //pre increment
        System.out.println("increment operator="+a1);
        System.out.println(b1);
        System.out.println(c1+" pre increment "+d1);
        a1--;
        System.out.println("decrement operator="+a1);
        System.out.println("...........................................................");
        //Relational Operators
        int m1 =20;
        int m2 =30;
        System.out.println(m1==m2); //m1=m2
        System.out.println(m1!=m2); //m1 not equal m2
        System.out.println(m1>m2); // m1 greater than m2
        System.out.println(m1<m2); // m1 less than m2
        System.out.println(m1>=m2); // m1 greater than equal to m2
        System.out.println(m1<=m2); // m1 less than equal to m2
        System.out.println("...........................................................");
        //Logical Operator
        int check = 29;
        int check2 =35;
        boolean inout = (check2>check && check < check2);
        boolean inout2 = (check2>check || check < check2);
        boolean b2 = !(check < check2);
        System.out.println(inout);
        System.out.println(inout2);
        System.out.println(b2);
    }
}