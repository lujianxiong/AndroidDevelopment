package ShapeFactory;
//抽象工厂模式
//图形绘制工厂的接口 ShapeFactory
import Shape.Shape;

public interface ShapeFactory {
    Shape getCircle();
    Shape getRectange();
}
