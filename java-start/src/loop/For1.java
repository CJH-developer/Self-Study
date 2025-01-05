package loop;

public class For1 {
    public static void main(String[] args) {
        int sum = 0;
        int cnt = 10;

        for(int i=0; ; i++){
            sum += i;
            if(sum>10) {
                System.out.println("합이 10보단 크면 종료 : i = " + cnt + " sum " + sum);
                break;
            }
            System.out.println(sum);
        }

    }
}
