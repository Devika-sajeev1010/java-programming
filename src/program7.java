import java.util.*;
public class program7 {
    public static void main(String[] s) {
        int n;
        String[] first={"","One Hundred","Two hundred","Three Hundred","Four Hundred","Five Hundered","Six hundred","Seven Hundred","Eight hunderd","Nine Hundred"};

        String[] second={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty","Twenty"};

        String[] second2={"Ten","Eleven","Tweleve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};

        String[] third={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Any Number : ");
        n=sc.nextInt();

        if(n%100>=10 && n%100<20)
            System.out.print(first[n/100]+" "+second2[n%10]);
        else
            System.out.print(first[n/100]+" "+second[(n/10)%10]+" "+third[n%10]);


    }
}
