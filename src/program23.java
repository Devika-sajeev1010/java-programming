import java.util.Scanner;

class demo{
    Scanner sc = new Scanner(System.in);
    int a;
    void input(){
        System.out.println("Enter the number");
        a =sc.nextInt();
    }
    void output(){

        int fact =1;
        while(a>0)
        {
            fact=fact*a;
            a--;
        }
        System.out.println("Factorial of the number is:" +fact);
    }

}

public class program23 {

    public static void main(String[] args) {
        demo dd = new demo();
        dd.input();
        dd.output();

    }
}
