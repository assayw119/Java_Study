public class Quiz2 {
    public static void main(String[] args) {
        int sum = 0;
        for( int i=0; i<100; i++){
            sum += (i+1);
        }
        System.out.println(sum);


        for (int j = 5; j >= 0; j--){
            System.out.println("카운트다운: " + j);
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int k = 0; k <= 30; k++){
            if (k%2==0){
                sum1 += k;
            } else{
                sum2 += k;
            }
        }
        System.out.println(sum1);
    }
}
