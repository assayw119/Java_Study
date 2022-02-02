public class Main6 {
    public static void main(String[] args) {
        char score = 'A';
        switch (score) {
            case 'A':
                System.out.println("A등급");
                break;
            case 'B':
                System.out.println("B등급");
                break;
            case 'C':
                System.out.println("C등급");
                break;
            default:
                System.out.println("D등급");

        }

        // 조건식 ? A : B
        int a = 5;
        String result = (a < 10) ? "10보다 작음" : "10보다 큼";
        System.out.println(result);
    }
}
