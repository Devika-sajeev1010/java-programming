import java.sql.SQLOutput;
import java.util.Scanner;

public class program22 {
    int a, b ;
    Scanner sc = new Scanner(System.in);
    void input()
    {
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }

    void output(){
        System.out.println("a = "+a +"b = " +b );
    }

    public static void main(String[] args) {
        program22 dd = new program22();
        dd.input();
        dd.output();

    }
}
