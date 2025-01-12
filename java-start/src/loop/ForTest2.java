package loop;

public class ForTest2 {
    public static void main(String[] args) {

        int num = 2;

        for(int i=1; i<11; i++){
            System.out.println(i*num);
        }

        System.out.println("--------------------------------");

        int cnt = 1;
        while(cnt < 11){
            System.out.println(cnt * num);
            cnt ++;

        }
    }
}
