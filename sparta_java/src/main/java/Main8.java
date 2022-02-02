public class Main8 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;

        while (i<10){
            sum += i + 1;
            i += 1;
        }
        System.out.println(sum);


        int j = 0;
        while (j<10){
            if (j==5){
                break;
            }
            j += 1;
        }
        System.out.println(j);

        for(int k=0; k<10; k++){
            if (k==5){
                continue;
            }
            System.out.println(k);
        }

        int o = 1;
        int result = 0;
        do {
            result += o;
            o += 1;
        } while (o < 10);
        System.out.println(result);
    }
}
