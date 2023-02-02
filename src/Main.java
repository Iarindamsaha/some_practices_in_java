import org.w3c.dom.ls.LSOutput;

public class Main {
    int a = 10; // instance variable
    int b; //instance variable with default data int=0

    static byte num0 = 127; //bye type data size =1 byte (Can Store data From -128 to 127)
    static short num1 = 23; // short data type size = 2 byte
    static int num2 =3000; // integer type data size= 4 byte
    static float num3=3.9f; //floating type data size = 4 byte
    static long num4 = 4557998554565544549L; // long type data size = 8 byte
    static double num5 =1267.3990; // Double type data size = 8 byte
    static boolean check = true; // Boolean Type Data Size =1 byte
    static char point = 'A'; // Character Type Data Can Only Store one character size = 2 byte

    //constant value
    final static int operate =5; //the value cannot be changed

    public static void setCheck(){

        System.out.println("byte data="+num0);
        System.out.println("short data="+num1);
        System.out.println("int data="+num2);
        System.out.println("float data="+num3);
        System.out.println("long data="+num4);
        System.out.println("double data="+num5);
        System.out.println("boolean type="+check);
        System.out.println("character type="+point);
        System.out.println("Constant int var="+operate);
        // operate = 8; // cannot add a value to the variable

    }
    public static void setChange(){
        Main obj = new Main();
        System.out.println(obj.a);
        obj.a =105;
        obj.b = 5;
        System.out.println(obj.a);
        System.out.println(obj.b);
        //System.out.println(num2);
        //num2 = 4000;
        //System.out.println(num2);

    }
    public void checkSum(){
        a =50;
        System.out.println(a);
    }
    public static void addition(){
        int x= 7;
        int y=8;
        System.out.println(x+y);
    }

    public static void nonPrimitive(){
        int[] arr = {1,2,3,4,5,6};
        String name = "Arindam Saha";
        System.out.println(name);
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Main obj = new Main();

        //setCheck();
        setChange();
        obj.checkSum();
        System.out.println("Main="+obj.a);
        System.out.println("Main="+obj.b);
        addition();
        nonPrimitive();
        // we cannot access the variable x because

    }
}