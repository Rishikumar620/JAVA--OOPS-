public class Shape {
    public float length;
    public float breadth;
    public float radius;

    public float areaRect(float length, float breadth) {
        float area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
        return area;
    }

    public float preimRect(float length, float breadth) {
        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
        return perimeter;
    }

    public float AreaCircle(float radius) {
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle: " + area);
        return area;
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        shape1.length = 5;
        shape1.breadth = 6;
        shape1.radius = 7;

        shape1.areaRect(shape1.length, shape1.breadth);
        shape1.preimRect(shape1.length, shape1.breadth);
        shape1.AreaCircle(shape1.radius);
        System.out.println();

        Shape shape2 = new Shape();
        shape2.length = 10;
        shape2.breadth = 8;
        shape2.radius = 5;

        shape2.areaRect(shape2.length, shape2.breadth);
        shape2.preimRect(shape2.length, shape2.breadth);
        shape2.AreaCircle(shape2.radius);
    }
}
