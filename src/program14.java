import java.util.Scanner;

public class program14 {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int originalNum = num;
        int[] digits = new int[10];
        int[] freq = new int[10];
        int count = 0;


        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            digits[count] = digit;
            count++;
            num /= 10;
        }


        int[] number = new int[count];
        for (int i = 0; i < count; i++) {
            number[i] = digits[count - i - 1];
        }


        boolean isAutobiographical = true;
        for (int i = 0; i < count; i++) {
            if (number[i] != freq[i]) {
                isAutobiographical = false;
                break;
            }
        }


        if (isAutobiographical) {
            System.out.println(originalNum + " is an Autobiographic number");
        } else {
            System.out.println(originalNum + " is NOT an Autobiographic number");
        }
    }
}
