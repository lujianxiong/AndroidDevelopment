package ConcreteShape;
//抽象工厂模式
//具体颜色的Rectange实现
import Shape.Rectange;

public class RedRectange extends Rectange {
    @Override
    public void draw() {
        System.out.println("绘制红色长方形");
    }
}
