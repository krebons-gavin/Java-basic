/**
 * Created by Gavin on 2016/1/5.
 * http://www.runoob.com/java/java-abstraction.html
 */

// 注意:
// 1. 如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。
// 2. 抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。

public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

//    public double computePay() {
//        System.out.println("Inside Employee computePay");
//        return 0.0;
//    }

    // 抽象方法
    // 如果一个类包含抽象方法，那么该类必须是抽象类。
    // 任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
    public abstract double computePay();

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name
                + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }

}
