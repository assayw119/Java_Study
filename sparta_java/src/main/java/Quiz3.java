public class Quiz3 {
    public static void main(String[] args) {
        Human grandParent = new GrandParent("할아버지", 70);
        Human parent = new Parent("엄마", 50);
        Human child = new Child2("나", 20);

        Human[] humans = {grandParent, parent, child};
        for(Human human: humans) {
            System.out.println(human.name + ", 나이: " + human.age + ", 속도: " + human.speed + ", 현재 위치: " + human.getLocation());
        }
        System.out.println("<활동 시작>");
        for (Human human : humans) {
            if(human instanceof Walkable){
                ((Walkable) human).walk(1,1); // Walkable 인스턴스 타입으로 캐스팅
                System.out.println(" ========= ");
            }
            if (human instanceof Runable) {
                ((Runable) human).run(2,2);
                System.out.println(" ========= ");
            }
            if (human instanceof Swimmable) {
                ((Swimmable) human).swim(3,-1);
                System.out.println(" ========= ");
            }
        }
    }
}
