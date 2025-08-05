class Demo{
    private int a;
    void input(){
        a=10;

    }
    int getA(){
        return a;
    }
}

public class program24 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.input();
        System.out.println(d1.getA());

    }
}
