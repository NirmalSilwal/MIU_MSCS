package FunctionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {

    public abstract void welcome();

//    void print(String message);// can't have two public abstract method in functional interface

    // it can contain any number of static and default methods

    static void fun() {
        System.out.println("static: inside fun");
    }

    default void run() {
        System.out.println("default: running inside functional interface");
    }
}
