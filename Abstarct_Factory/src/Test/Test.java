package Test;
//抽象工厂模式
//测试
import Shape.Shape;
import ShapeFactory.RedShapeFactory;
import ShapeFactory.ShapeFactory;

public class Test {
    public static void main(String[] args) {
        ShapeFactory redShapeFactory = new RedShapeFactory();
        Shape circle = redShapeFactory.getCircle();
        circle.draw();
        Shape rectangle = redShapeFactory.getRectange();
        rectangle.draw();

    }
}
