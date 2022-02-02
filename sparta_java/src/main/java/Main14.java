// OverLoading example

//public class Main14 {
//    public static void main(String[] args) {
//
//    }
//
//    int add(int x, int y, int z) {
//        int result = x + y + z;
//        return result;
//    }
//
//    long add(int a, int b, long c) {
//        long result = a + b + c;
//        return result;
//    }
//
//    int add(int a, int b) {
//        int result = a + b;
//        return result;
//    }
//}

// OverRidng example

class Animal2 {
    String name;
    String color;

    public Animal2(String name) {
        this.name = name;
    }

    public void cry() {
        System.out.println(name + " is crying");
    }
}

class Dog2 extends Animal2 {
    public Dog2(String name) {
        super(name);
    }

    public void cry() {
        System.out.println(name + " is barking");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Animal2 dog = new Dog2("코코");
        dog.cry();
    }
}
