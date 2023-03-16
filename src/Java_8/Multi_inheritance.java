package Java_8;

interface inter{
    default void show(){
        System.out.println("inter");
    }
}

interface child1 extends inter{
    default void show(){
        System.out.println("child1");
    }
}

interface child2 extends inter{
    default void show() {
        System.out.println("child2");
    }
}
public class Multi_inheritance implements child1, child2 {
    public void show() {
        System.out.println("default method in multi_inheritance class");
    }

    public static void main(String[] args) {
    Multi_inheritance defaultMethod= new Multi_inheritance();
    defaultMethod.show();
    }
}