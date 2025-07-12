import java.util.Scanner;

public class program8 {
    public static void main(String[] s){
        int n;
        int fir =0 ;
        int sec =1;

        System.out.println("Enter the number of terms");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n<1)
        {
            System.out.println("Invalid number");
            return;
        }
        if(n==1)
        {
            System.out.println(fir + "");

        }
        else
        {
            System.out.println(fir + "");
            System.out.println(sec + "");
            for(int i =3 ; i<= n ; i++)
            {
                int temp = fir + sec;
                fir = sec;
                sec= temp ;
                System.out.println(temp + "");


            }
        }

    }
}
