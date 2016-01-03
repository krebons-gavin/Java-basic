package animal;

/**
 * Created by admin on 2016/1/3.
 */

// 实现Animal接口
public class MammalInt implements Animal {
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    // 主函数
    public static void main(String args[]) {
        // 类的实例化
        MammalInt my = new MammalInt();

        // 调用类中的方法
        my.eat();
        my.travel();
    }
}
