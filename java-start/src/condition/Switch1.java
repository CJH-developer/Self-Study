package condition;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();

        int coupon = 0;

        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            case 4:
                coupon = 4000;
                break;
        }
        System.out.println(coupon);

    }
}
