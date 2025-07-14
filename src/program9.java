import java.util.Scanner;

public class program9 {
    public static void main(String[] s)
    {
        int num ;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num =  sc.nextInt();
        int sq = num*num ;
        int count =0;
        int temp =num ;
        if(temp > 0)
        {
            count++;
            temp = temp/10;

        }
        int ld = (int)(sq%(Math.pow(10, count)));
        if(num == ld)
        {
            System.out.println(" not an Automorphic number");
        }
        else

        {
            System.out.println(" automorphic number");
        }
    }
}
