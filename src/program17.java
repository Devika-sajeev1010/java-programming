import java.sql.SQLOutput;
import java.util.Scanner;

public class program17 {
    int num1 , num2 , num3, max , min , mid , sum; ;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        program17 p2 = new program17();
        p2.input();
        System.out.println("The minimum number is" +p2.minimum());
        System.out.println("The maximum number is" +p2.maximum());
        System.out.println("The mid number is" +(p2.sum()-(p2.maximum()+p2.minimum())));
    }
    int minimum(){
        return num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3);
    }
    int maximum(){
        return num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
    }
    int sum(){
        return num1+num2+num3;
    }
    void input(){
        System.out.println("Enter 3 numbers");
        num1= sc.nextInt();
        num2= sc.nextInt();
        num3 = sc.nextInt();
    }

}
