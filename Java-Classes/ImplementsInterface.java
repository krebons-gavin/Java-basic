/**
 * Java学习 - 类及接口的实现
 * Created by admin on 2015/12/30.
 * 2016-01-02, Modified by Gavin
 */

// java编程语言不支持多重继承，但是interface提供了替代方案。
// 在java中，一个类只能继承于单一的类，但是它可以实现多个接口。因此，对象可以有多重类型：属于它自身类的类型，和属于它所继承的所有接口的类型。

// 实现接口
public class ImplementsInterface implements BicycleInterface {
    // 定义变量
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // 要实现某个接口,必须实现接口中的所有方法
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    // 输出结果
    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

}
