class Parent {
    public static void m1() {
        System.out.println("Parent M1");
    }
}

class Child extends Parent {
    public static void m2() {
        System.out.println("Child M2");
    }
}

public class Main {
    public static void main(String[] args) {
        Child.m1();
        Child.m2();

    }

}
