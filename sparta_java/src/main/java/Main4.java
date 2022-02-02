import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String sparta = "Hello Sparta";
        System.out.println(sparta);

        int[] intArray = new int[] {1,2,3,4,5}; // int 배열을 선언과 동시에 초기화
        System.out.println(Arrays.toString(intArray));

        int[] intEmptyArray = new int[5]; // default = 0
        intEmptyArray[0] = 1;
        intEmptyArray[1] = 2;
        System.out.println(Arrays.toString(intEmptyArray));

        String[] stringEmptyArray = new String[5]; // default = null
        stringEmptyArray[0] = "A";
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] season = {"봄", "여름", "가을", "겨울"};
        System.out.println(Arrays.toString(season));

        System.out.println(season.length);
        System.out.println(season[season.length-1]);



    }
}
