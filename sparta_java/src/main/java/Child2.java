public class Child2 extends Human implements Walkable, Runable, Swimmable{

    public Child2(String name, int age) {
        super(name, age, 5);
    }

    @Override
    public void swim(int x, int y) {
        printWhoAmI();
        System.out.println("swim speed: " + (speed + 1));
        this.x = x;
        this.y = y;
        System.out.println("swum to " + getLocation());
    }

    @Override
    public void run(int x, int y) {
        printWhoAmI();
        System.out.println("run speed: " + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("ran to " + getLocation());
    }

    @Override
    public void walk(int x, int y) {
        printWhoAmI();
        System.out.println("walk speed: " + speed);
        this.x = x;
        this.y = y;
        System.out.println("Walked to " + getLocation());
    }
}
