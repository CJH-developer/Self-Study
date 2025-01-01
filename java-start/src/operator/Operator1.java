package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        b = a++;
        System.out.println("b의 값 : " + b);

        for(int i = 0; i<10; i++){
            b = b+i;
            System.out.println("b+i의 값 : " + b);
            System.out.println("a의 값 : " + a);
            System.out.println(a+b);
        }
    }
}
