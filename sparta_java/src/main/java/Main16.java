abstract class Bird {
    private int x,y,z;

    void fly(int x, int y, int z) {
        printLocation();
        System.out.println("이동합니다.");
        this.x = x;
        this.y = y;
        if(flyable(z)) {
            this.z = z;
        } else {
            System.out.println("그 높이로는 날 수 없습니다.");
        }
        printLocation();
    }

    abstract boolean flyable(int z);

    public void printLocation() {
        System.out.println("현재위치 (" + x + ", " + y + ", " + z + ")");
    }
}

class Pigeon extends Bird { // 비둘기
    @Override
    boolean flyable(int z) {
        return z < 10000;
    }
}

class Peacock extends Bird { // 항상 날 수 없는 공작새
    @Override
    boolean flyable(int z) {
        return false;
    }
}

public class Main16 {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();
        System.out.println("--- 비둘기 ---");
        pigeon.fly(1,1,3);
        System.out.println("--- 공작새 ---");
        peacock.fly(1, 1, 3);
        System.out.println("--- 비둘기 ---");
        pigeon.fly(3, 3, 30000);
    }
}
