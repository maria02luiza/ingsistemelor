package ro.ulbs.paradigme.lab2;

public class Circle extends Form{
    private float radius;
    public Circle(){}
    public Circle( float radius) {
        this.radius = radius;

    }
    public float getRadius() {
        return radius;

    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getArea() {
        return (float) (Math.PI*radius*radius);
    }

    @Override
    public String toString() {
        return "sunt un triunghi cu aria: "+getArea();
    }
}
