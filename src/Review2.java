
public class Review2 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        int i ;

        int divided1 = 3;
        int divided2 = 5;

        for(i = 1; i<=100 ; i++) {

            if(i % divided1 == 0 && i % divided2 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % divided1 == 0) {
                System.out.println("Fizz");
            }

            else if (i % divided2 == 0) {
                System.out.println("Buzz");
            }

            else {
                System.out.println(i);
            }

        }

    }

}
