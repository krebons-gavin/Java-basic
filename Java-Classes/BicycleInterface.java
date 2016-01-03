/**
 * Java 学习 - 接口
 * Created by admin on 2015/12/30.
 * 2016-01-02, Modified by Gavin
 * 接口的定义及实现
 * http://docs.oracle.com/javase/tutorial/java/concepts/interface.html
 * http://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
 */

// 一个interface是引用类型（reference）.它与class相似，因此只能包含常量（constants），方法签名（method signatures）和嵌套类型（nested types）。
// Interface不得含有方法的具体代码（method body）。
// Interface 不可被实例化（instantiated），只能被其它class实现（implemented）或者被其它interface继承。

// 接口一般不会变动.重写接口的解决方法就是再写一个接口,继承原有的接口。然后调用新接口

// 定义接口
public interface BicycleInterface {
    // 可以定义变量.

    // wheel revolutions per minute
    public void changeCadence(int newValue);

    public void changeGear(int newValue);

    public void speedUp(int increment);

    public void applyBrakes(int decrement);
}

