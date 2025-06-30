import java.util.Scanner;

public class program2 {
    public static void main(String[] s)
    {
        int amt;
        System.out.println("Enter Amount : ");
        Scanner sc = new Scanner(System.in);
        amt=sc.nextInt();
        System.out.println("no of 2000 rs notes :"+(amt/2000));
        amt%=2000;
        System.out.println("no of 500 rs notes :"+(amt/500));
        amt%=500;
        System.out.println("no of 100 rs notes :"+(amt/100));
        amt%=100;
        System.out.println("no of 50 rs notes :"+(amt/50));
        amt%=50;
        System.out.println("no of 20 rs notes :"+(amt/20));
        amt%=20;
        System.out.println("no of 10 rs notes :"+(amt/10));
        amt%=10;
        System.out.println("no of 5 rs notes :"+(amt/5));
        amt%=5;
        System.out.println("no of 2 rs notes :"+(amt/2));
        amt%=2;
        System.out.println("no of 1 rs notes :"+amt);
    }
}
