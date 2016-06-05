/**
 * Created by Gavin on 2016-6-5
 * http://www.runoob.com/java/java-operators.html
 */

public class SimpleOperators {
    public static void main(String args[]){
        // 算术运算符
        int a=10;
        int b=20;
        int c=25;
        int d=25;

        System.out.println("a+b = " + (a+b));
        System.out.println("a-b = " + (a-b));
        System.out.println("a*b = " + (a*b));
        System.out.println("b/a = " + (b/a));
        System.out.println("b % a= " + (b%a));
        System.out.println("c % a= " + (c%a));
        System.out.println("a++ = " + (a++));
        // a++ = 10
        System.out.println("a-- = " + (a--));
        // a-- = 11
        System.out.println("a = "+ a);

        // 查看d++与++d 的不同
        System.out.println("d++ = " + (d++));
        // d++ = 25， 先输出d的值，然后自增
        System.out.println("++d = " + (++d));
        // ++d = 27，先自增，然后输入d的值

        // 关系运算符
        // 待完成
    }
}
