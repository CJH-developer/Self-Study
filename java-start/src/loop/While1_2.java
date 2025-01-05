package loop;

public class While1_2 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        while(sum<10){
            System.out.println("i : " + i);
            sum += i;
            System.out.println("합의 값 : " + sum);
            i++;
        }
    }
}
