package ConcreteShape;
//抽象工厂模式
//具体颜色的Rectange实现
import Shape.Circle;

public class RedCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("绘制红色的圆");
    }
}
