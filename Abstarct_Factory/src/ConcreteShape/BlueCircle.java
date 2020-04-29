package ConcreteShape;
//抽象工厂模式
//具体颜色的Circle实现
import Shape.Circle;

public class BlueCircle extends Circle {
    @Override
    public void draw() {
        System.out.println("绘制蓝色的圆");
    }
}
