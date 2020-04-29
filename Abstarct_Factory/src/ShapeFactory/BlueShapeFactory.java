package ShapeFactory;
//抽象工厂模式
//蓝色图形绘制工厂
import ConcreteShape.BlueCircle;
import ConcreteShape.BlueRectange;
import Shape.Shape;

public class BlueShapeFactory implements ShapeFactory{

    @Override
    public Shape getCircle() {
        return new BlueCircle();
    }

    @Override
    public Shape getRectange() {
        return new BlueRectange();
    }
}
