class  Shape {
    void about() {
        System.out.println(" shape.");
    }
}

class Circle extends Shape {
    @Override
    void about() {
        System.out.println("This is a circle");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shapeRef = new Circle();
        shapeRef.about();
    }
} 
    

