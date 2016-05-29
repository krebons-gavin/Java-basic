/**
 * Created by Gavin on 2016-05-29.
 * http://www.runoob.com/java/java-object-classes.html
 */

import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // 构造函数
    public Employee(String name){
        this.name=name;
    }

    // 方法：设置age的值
    public void empAge(int empAge){
        age=empAge;
    }

    // 方法：设置designation的值
    public void empDesignation(String empDesig){
        designation= empDesig;
    }

    // 方法：设置Salary的值
    public void empSalary(double empSalary){
        salary=empSalary;
    }

    // 打印信息
    public void printEmployee(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Designation: "+ designation);
        System.out.println("Salary: "+ salary);
    }
}
