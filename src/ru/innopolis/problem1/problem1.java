// your solution here
//fix all the errors including package errors

interface Shape{
    double area();
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*3.14;
    }
}
class Rectange implements Shape{
    private int a,b;

    public Rectange(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }
}
class Square implements Shape{
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }
}

interface ShapeFactory{
    public Shape getShape();
}

class SquareFactory implements ShapeFactory {
    public Shape getShape(){
        return new Square(2);
    }
}

class CircleFactory implements ShapeFactory {
    public Shape getShape(){
        return new Circle(5);
    }
}

class RectangeFactory implements ShapeFactory {
    public Shape getShape(){
        return new Rectange(2,5);
    }
}