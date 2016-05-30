/**
 * Created by Gavin on 2016-05/30
 * http://www.runoob.com/java/java-variable-types.html
 */

// 调用包
package test;

public class VariableTypes {
    public void pupAge(){
        // 定义局部变量
        int age=0;
        age +=7;
        System.out.println("小狗的年龄是："+age);
    }

    public static void main(String args[]){
        VariableTypes test=new VariableTypes();
        test.pupAge();
    }
}
