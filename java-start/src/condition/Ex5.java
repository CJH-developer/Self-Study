package condition;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String grade = sc.next();

        switch (grade){
            case "A" :
                System.out.println("탁원한 성과입니다.");
                break;
            case "B" :
                System.out.println("좋은 성과입니다.");
                break;
            case "C" :
                System.out.println("준수한 성과입니다.");
                break;
            case "D" :
                System.out.println("향상이 필요합니다.");
                break;
            case "F" :
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("다시 입력하세요.");
        }
    }

}
