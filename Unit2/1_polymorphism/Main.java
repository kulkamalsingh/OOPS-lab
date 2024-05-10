// Shape.java
class Shape {
    // Method to draw the shape
    public void draw() {
        System.out.println("Drawing a shape");
    }

    // Method to erase the shape
    public void erase() {
        System.out.println("Erasing a shape");
    }
}

// Circle.java
class Circle extends Shape {
    // Method to draw the circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Method to erase the circle
    @Override
    public void erase() {
        System.out.println("Erasing a circle");
    }
}

// Triangle.java
class Triangle extends Shape {
    // Method to draw the triangle
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    // Method to erase the triangle
    @Override
    public void erase() {
        System.out.println("Erasing a triangle");
    }
}

// Square.java
class Square extends Shape {
    // Method to draw the square
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    // Method to erase the square
    @Override
    public void erase() {
        System.out.println("Erasing a square");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        // Calling draw and erase methods on different shape objects
        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}
