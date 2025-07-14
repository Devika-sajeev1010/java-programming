import java.util.Scanner;

public class program11 {
    public static void main(String[] s)
    {
        int num;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int num2 = num +1;
        double sq_root = Math.sqrt(num2);
        if(sq_root - Math.floor(sq_root) == 0)
        {
            System.out.println("it is a sunny number");
        }
        else {
            System.out.println("Not a sunny number");
        }



    }
}
