import java.util.Scanner;

public class program4 {
    public static void main(String[] s)
    {
        int first_num ;
        int second_num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        first_num = sc.nextInt();
        System.out.println("Enter second number");
        second_num = sc.nextInt();
        int result =  first_num/second_num ;
        if(result != 0)
            System.out.println(first_num+ " is the greater number");
        else
            System.out.println(second_num+ " is the greater number");


    }
}
