package condition;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rating = sc.nextDouble();

        if(rating >= 9){
            System.out.println("어바웃타입을 추천합니다.");
        }else if(rating > 7){
            System.out.println("어바웃 타임과 토이 스토리를 추천합니다.");
        }else{
            System.out.println("어바웃 타임과 토이 스토리, 고질라를 추천합니다.");
        }
    }
}
