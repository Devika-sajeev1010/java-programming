import java.util.Scanner;

import static java.lang.System.exit;

public class program20 {
    public static void main(String[] s)
    {
        int [][]arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<3;i++)
        {
            for(int j = 0; j<3 ; j++)
            {
                System.out.println("enter the numbers");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i< 3; i++)
        {
            for(int j =0 ;j< 3; j++)
            {
                if(arr[i][j] != arr[j][i] && i!=j)
                {
                    System.out.println("not symmetric");
                    exit(0);
                }
            }
        }
        System.out.println("Matrix is symmetric");
    }
}
