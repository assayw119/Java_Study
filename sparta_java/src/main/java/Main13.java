class Animal {
    String name;

    public void cry() {
        System.out.println(name + "is crying");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + "is swimming");
    }
}

public class Main13 {
    public static void main(String[] args) {
        Dog dog = new Dog("코코");
        dog.cry();
        dog.swim();

        Animal dog2 = new Dog("미미");
        dog2.cry();
//        dog2.swim(); 자식 타입에 있는 함수 호출 불가능
    }
}
