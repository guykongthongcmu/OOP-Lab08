package question2;

public interface Colorable {
    public abstract void howToColor();
}

class Square extends GeometricObject implements Colorable{
    private double side;

    public Square() {
        side = 0;
    }

    public Square(double side) {
        this.side = side;
    } 

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return side + side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all the sides");
    }


}
