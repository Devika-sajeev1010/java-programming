import java.util.Scanner;

public class program12 {
    public static void main(String[] s)
    {
        int num , n1 , n2;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int temp =num ;
        int count =0;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        int pr = count/2;
        if(count%2==0)
        {
            n1 = (int)(num%(Math.pow(10, pr)));
            n2 = (int)(num/(Math.pow(10,pr)));
            int sum = n1+n2;
            if(num == Math.pow(sum ,2))
            {
                System.out.println("tech number");

            }
            else {
                System.out.println("Not a tech number");
            }

        }
    }

}
