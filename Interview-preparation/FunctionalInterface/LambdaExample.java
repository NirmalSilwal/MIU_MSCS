package FunctionalInterface;

// the main use of lambda expression is to implement the functional interface

public class LambdaExample {

    public static void main(String[] args) {

        Shape rectangle = () -> System.out.println("inside draw in rectangle");

        rectangle.draw();
    }
}
