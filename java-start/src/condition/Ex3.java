package condition;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dollar = sc.nextInt();
        int kw = 1470;
        int total;
        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        }else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        }else{
            total = dollar * kw;
            System.out.println("환전 금액은 " + total + "원 입니다.");
        }
    }
}
