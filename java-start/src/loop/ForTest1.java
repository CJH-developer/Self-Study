package loop;

public class ForTest1 {
    public static void main(String[] args) {

        int count = 0;

        for(int i=0; i<10; i++){
            System.out.println(count+1+i);
        }

        System.out.println("/////////////////////////////////////////////");

        while(count<10){
            System.out.println(count+1);
            count++;
        }
    }
}
