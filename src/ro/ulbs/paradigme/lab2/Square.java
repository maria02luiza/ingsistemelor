package ro.ulbs.paradigme.lab2;

public class Square extends Form{
    private float side;
    public Square() {}
    public Square(float side) {
        this.side = side;
    }
    public float getSide() {
        return side;

    }
    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    public String toString() {
 return "sunt un patrat cu aria: "+getArea();

    }
}
