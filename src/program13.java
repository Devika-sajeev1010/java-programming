import java.util.Scanner;

public class program13 {
    public static void main(String[] s)
    {
        int num , n2 ,n3 ,flag =0;
        int a[] = new int[10];
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        n2 = num *2;
        n3 = num *3;
        String ans = num + "" + n2 +n3;
        for(int i= 0; i<ans.length() ; i++)
        {
            a[ans.charAt(i)-48]++;
        }
        for(int i =1 ; i< 10 ; i++)
        {
            if(a[i]!=1)
            {
                flag =1;
            }
        }
        if(flag ==1)
        {
            System.out.println("Not a fascinating number");
        }
        else {
            System.out.println("fascinating number");
        }



    }
}
