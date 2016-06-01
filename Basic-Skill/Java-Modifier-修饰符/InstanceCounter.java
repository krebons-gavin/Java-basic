/**
 * Created by Gavin on 2016-06-01
 * http://www.runoob.com/java/java-modifier-types.html
 */

// 访问修饰符：default, private, public, protected

// 非访问修饰符：static, Final, Abstract, Synchronized, volatile
    // static修饰符，用来创建类方法和类变量。
    // Final修饰符，用来修饰类、方法和变量，final修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
    // Abstract修饰符，用来创建抽象类和抽象方法。
    // Synchronized和volatile修饰符，主要用于线程的编程。

public class InstanceCounter {
    private static int numInstances=0;

    // 返回计数器的数目
    protected static int getCount(){
        return numInstances;
    }

    // 实例数目递增
    private static void addInstance(){
        numInstances++;
    }

    // 构造函数：调用实例递增函数
    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments){
        // 初始计数
        System.out.println("Starting with "+
        InstanceCounter.getCount() +" instances");

        // 循环：500次，每次创建一个新实例
        for(int i=0;i<500;++i){
            new InstanceCounter();
        }

        // 结尾计数
        System.out.println("Created "+
        InstanceCounter.getCount() +" instances");
    }
}
