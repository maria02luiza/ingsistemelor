package ro.ulbs.paradigme.lab2;

public class Triangle extends Form{
    private float hight;
    private float base;
    public Triangle(){}
    public Triangle(float hight, float base) {
        this.hight = hight;
        this.base = base;
    }
    public float getHight() {
        return hight;

    }
    public void setHight(float hight) {
        this.hight = hight;

    }
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float getArea() {
        return base*hight;
    }
}
