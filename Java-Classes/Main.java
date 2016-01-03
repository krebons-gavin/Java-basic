import animal.*;
// 导入animal包,就可以使用该包中的所有类和接口

/**
 * Java学习 - 主函数
 * Created by Gavin on 15/12/29.
 * My first Java Class
 * 2015-12-30, Modified by Gavin
 * http://docs.oracle.com/javase/tutorial/java/concepts/class.html
 */

// 主类
public class Main {

    // 主函数
    public static void main(String[] args) {
        System.out.println("Hello Gavin! Today is 2015-12-30");

        // 创建两个不同的Bicycle对象
        Bicycle Bike1 = new Bicycle(11, 11, 11);
        Bicycle bike2 = new Bicycle(22, 22, 22);

        // 调用对象1中的方法
        Bike1.changeCadence(50);
        Bike1.speedUp(10);
        Bike1.changeGear(2);
        Bike1.printStates();

        // 调用对象2中的方法
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

        // 接口的实现
        System.out.println("Today is 2015-12-30. 以下是接口的实现:");
        // 实例化类
        ImplementsInterface Inter1 = new ImplementsInterface();
        // 调用方法
        Inter1.printStates();

        // 调用animal包中的类和方法
        MammalInt my2 = new MammalInt();
        my2.eat();
        my2.travel();
    }
}
