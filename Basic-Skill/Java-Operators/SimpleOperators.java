/**
 * Created by Gavin on 2016-6-5
 * Modified by Gavin on 2016-6-15
 * http://www.runoob.com/java/java-operators.html
 */

public class SimpleOperators {
    public static void main(String args[]) {
    // 算术运算符
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        System.out.println("b/a = " + (b / a));
        System.out.println("b % a= " + (b % a));
        System.out.println("c % a= " + (c % a));
        System.out.println("a++ = " + (a++));
        // a++ = 10
        System.out.println("a-- = " + (a--));
        // a-- = 11
        System.out.println("a = " + a);

        // 查看d++与++d 的不同
        System.out.println("d++ = " + (d++));
        // d++ = 25， 先输出d的值，然后自增
        System.out.println("++d = " + (++d));
        // ++d = 27，先自增，然后输入d的值

    // 关系运算符
        System.out.println("a==b = " + (a == b));
        // a==b = false

        System.out.println("a != b =" + (a != b));
        // a != b =true

        System.out.println("a>b = " + (a > b));
        // a>b = false

    // 位运算符
        int aa = 60;
        int bb = 13;
        // 按位与：当且仅当两个操作数的某一位都非0时候结果的该位才为1。
        System.out.println("aa & bb = " + (aa & bb));
        // aa & bb = 12

        // 按位或：只要两个操作数的某一位有一个非0时候结果的该位就为1。
        System.out.println("aa | bb =" + (aa | bb));
        // aa | bb =61

    // 逻辑运算符
        boolean aaa = true;
        boolean bbb = false;
        // 逻辑与
        System.out.println("aaa && bbb =" + (aaa && bbb));
        // aaa && bbb =false

        // 逻辑或
        System.out.println("aaa || bbb =" + (aaa || bbb));
        // aaa || bbb =true

        // 逻辑非
        System.out.println("!(aaa && bbb) =" + !(aaa && bbb));
        // !(aaa && bbb) =true
    }
}
