interface Flyable {
    void fly(int x, int y, int z);
}

class Pigeon2 implements Flyable {
    private int x,y,z;

    @Override
    public void fly(int x, int y, int z) {
        printLocation();
        System.out.println("날아갑니다.");
        this.x = x;
        this.y = y;
        this.z = z;
        printLocation();
    }

    public void printLocation() {
        System.out.println("현재 위치(" + x + ", " + y + ", " + z + ")");
    }
}
public class Main17 {
    public static void main(String[] args) {
        Flyable pigeon = new Pigeon2();
        pigeon.fly(1,2,3);
    }
}
