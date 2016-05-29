/**
 * Created by Gavin on 2016-05-29 .
 * http://www.runoob.com/java/java-object-classes.html
 */

// 一个源文件中只能有一个public类；源文件的名称应该和public类的类名保持一致。
// 一个源文件可以有多个非public类
// 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
public class Puppy {
    int puppyAge;

    // 构造函数，含有一个参数：name
    public Puppy(String name){
        System.out.println("Passed name is: " + name);
    }

    // 方法：设置宠物年龄
    public void setAge(int age){
        puppyAge=age;
    }

    // 方法：获取宠物年龄
    public int getAge(){
        System.out.println("Puppy's age is: " +puppyAge);
        return puppyAge;
    }

    // 主函数
    public static void main(String []args){
        // 创建对象
        Puppy myPuppy =new Puppy("Tommy");

        // 设置宠物年龄
        myPuppy.setAge(2);

        // 获取宠物年龄
        myPuppy.getAge();

        // 访问成员变量
        System.out.println("Variable Value: "+ myPuppy.puppyAge);
    }
}
