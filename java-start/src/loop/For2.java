package loop;

public class For2 {
    public static void main(String[] args) {
        for(int i=0; i<2; i++){
            System.out.println("외부 For 문 시작 i : " + i);
            for(int j=0; j<3; j++){
                System.out.println("내부 For 문 시작 j : " + i + " - "+ j);
            }
        }
    }
}
