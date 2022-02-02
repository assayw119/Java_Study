class Calculation {
    int add(int x, int y) {
        return x + y;
    }
    int substract(int x, int y) {
        return x - y;
    }
}


public class Main10 {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int addResult = calculation.add(1, 2);
        int substractResult = calculation.substract(5, 3);

        System.out.println(addResult);
        System.out.println(substractResult);
    }
}
