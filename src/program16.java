import java.util.Scanner;

public class program16 {
    int a , b , sum;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        program16 d2 = new program16();
        d2.input();
        d2.display();

    }
    void input() {
        System.out.println("Enter number1");
        a= sc.nextInt();
        System.out.println("Enter sec number:");
        b= sc.nextInt();

    }


    void display(){
        System.out.println("Number a="+a);
        System.out.println("Number b="+b);

    }
}
