/**
 * Created by Gavin on 2016-06-01
 * http://www.runoob.com/java/java-modifier-types.html
 */

// 访问修饰符：default, private, public, protected
    // default：默认的，在同一包内可见；
    // private：私有的，在同一类内可见；
    // public：共有的，对所有类可见。
    // protected，受保护的，对同一包内的类和所有子类可见。

// 非访问修饰符：static, Final, Abstract, Synchronized, volatile
    // static修饰符，用来创建类方法和类变量。
    // Final修饰符，用来修饰类、方法和变量，final修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
    // Abstract修饰符，用来创建抽象类和抽象方法。抽象方法是一种没有任何实现的方法，该方法的的具体实现由子类提供。任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
    // Synchronized和volatile修饰符，主要用于线程的编程。
    // Synchronized关键字声明的方法同一时间只能被一个线程访问。
    // Transient：序列化的对象包含被transient修饰的实例变量时，java虚拟机(JVM)跳过该特定的变量。
    // Volatile：易失性变量。修饰的成员变量在每次被线程访问时，都强制从共享内存中重新读取该成员变量的值。而且，当成员变量发生变化时，会强制线程将变化值回写到共享内存。这样在任何时刻，两个不同的线程总是看到某个成员变量的同一个值。

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
