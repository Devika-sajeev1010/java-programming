import java.util.Scanner;

public class program15 {
    public static boolean prime(int num)
    {
        if(num <=1)
        {
            return false;
        }
        for(int i=0; i<num ;i++)
        {
            if(num%2==0)
            {
                return false;
            }

        }

        return true;
    }
    public static boolean emirp(int num)
    {
        if(prime(num) == false )
        {
            return false;
        }
        int reverse =0 ;
        while(num >0)
        {
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;

        }
        return prime(reverse);

    }
    public static void main(String[] s)
    {
        int num;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(emirp(num)== true )
        {
            System.out.println("It is an emirp number");
        }
        else {
            System.out.println("Not an emirp number");
        }

    }


}
