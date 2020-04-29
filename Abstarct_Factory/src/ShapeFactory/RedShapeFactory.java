package ShapeFactory;
//抽象工厂模式
//红色图形绘制工厂
import ConcreteShape.RedCircle;
import ConcreteShape.RedRectange;
import Shape.Shape;

public class RedShapeFactory implements ShapeFactory{

    @Override
    public Shape getCircle() {
        return new RedCircle();
    }

    @Override
    public Shape getRectange() {
        return new RedRectange();
    }
}
