public class Circle extends Shape{
    double radius = 1.0d;

    public Circle(String c) {
        super(c);
    }

    public Circle(double r, String c){
        super(c);
        radius=r;
        }

    @Override
    public float getArea() {
        float f = (float) ((float) radius*radius*Math.PI);
        return f;
    }
}
