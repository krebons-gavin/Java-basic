/**
 * Created by Gavin on 2016-05-29.
 * http://www.runoob.com/java/java-object-classes.html
 */

import java.io.*;

public class EmployeeTest {
    public static void main(String args[]){
        // 使用构造器创建两个对象
        Employee empOne=new Employee("James Smith");
        Employee empTwo=new Employee("Gavin");

        // 调用对象1的成员方法
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        // 换行
        System.out.println();

        // 调用对象2的成员方法
        empTwo.empAge(31);
        empTwo.empDesignation("Product Manager");
        empTwo.empSalary(2000);
        empTwo.printEmployee();

    }
}
