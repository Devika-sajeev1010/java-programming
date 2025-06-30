import java.util.Scanner;

public class program1 {
    public static void main(String[] s)
    {
        System.out.println("Hello World");
        byte a = 127; //1 byte datatype limit -127 to 127
        short b = 32767; // a 2 byte datatype -32767 to 32767
        int c =7874844 ; // a 4 byte datatype
        long d = 67384378 ; //  8 byte datatype
        float e = 12.475f; // a by default decimal value considered as double so add f
        char ch = 'a';
        int x ,y;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter a number : ");
        x = sc.nextInt();
        System.out.println("Enter sec number");
        y = sc.nextInt();
        System.out.println("Sum is" + (x+y));
        System.out.println("Difference is" + (x-y));
        System.out.println(("Product is" + (x*y)));
        System.out.println(("Division is" + ((float)x/y)));
        System.out.println("mode is" + (x%y));
        float z ;
        System.out.println("Enter the radius");
        z =sc.nextFloat();
        System.out.println("The area of the circle " + (3.14 * z * z));



    }
}

