package max.min.avg;

public class SearchForPrimeNumber {
    public static void main(String[] args) {

        for (int i = 2 ; i<=100; i ++){
            boolean isPrime = true;

            for( int j = 2; j<i; j++){
                if(i%j == 0){
                    System.out.println("finish ");
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
        check();
    }


static void check(){
        out_for:
    for(int i = 2; i<= 100; i++){
        for(int j = 2;j<i;j++){
            if(i%j == 0){
                continue out_for;
            }
        }
        System.out.println(i);
    }
    }
}
