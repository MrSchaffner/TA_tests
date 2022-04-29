public class Rect extends Shape {
    float height;
    float width;

    public Rect(String c) {
        super(c);
    }

    public Rect(float h, float w, String c) {
        super(c);
        height = h;
        width = w;
    }

    @Override
    public float getArea() {
        return height * width;
    }
}
