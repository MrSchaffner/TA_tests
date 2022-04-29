public class Triangle extends Shape {
    float height;
    float base;

    public Triangle(String c) {
        super(c);
    }

    public Triangle(float h, float b, String c) {
        super(c);
        height = h;
        base = b;
    }

    @Override
    public float getArea() {
        return height * base / 2.0f; //2.0 is a float
    }
}
