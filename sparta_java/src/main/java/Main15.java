import pkg.ModifierTest;

class Child extends ModifierTest {
    void callParentProtected() {
        System.out.println("Call my parent's protected method");
        super.messageProtected();
    }
}

public class Main15 {
    public static void main(String[] args) {
        ModifierTest modifierTest = new ModifierTest();
        modifierTest.messageOutside();
//        modifierTest.messageInside();
//        modifierTest.messageProtected();
//        modifierTest.messagePackagePrivate();

        Child child = new Child();
        child.callParentProtected(); // 상속받은 protected도 함께 출력
    }

}
