package FunctionalInterface;

// traditional way to implement the functional interface

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("inside draw in rectangle");
    }
}
