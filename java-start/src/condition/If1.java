package condition;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int age = sc.nextInt();
        int discount = 0;

        System.out.println("판매 가격 : " + price);
        System.out.println("구매자 나이 : " + age);
        
        if(price >= 10000){
            discount = discount + price/10;
            System.out.println("10000원이상 구매 시, 10% 할인 : " + discount);
        }

        if(age <= 10 ){
            discount = discount + price/10;
            System.out.println("10살 이하 : " + discount);
        }

        System.out.println("총 할인 가격 : " + discount);

        price = price - discount;
        System.out.println("총 금액 : " + price + " 원");
    }
}
