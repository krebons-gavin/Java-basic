/**
 * Created by Gavin on 2015-9-5.
 * Modified by Gavin on 2016-05-28.
 * Java Basic Data types.
 * http://www.runoob.com/java/java-basic-datatypes.html
 */
public class JavaDataTypes {
    public static void main(String[] args){
        // Java语言提供了八种基本类型。
        // 六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。

        // 引用类型
        // 引用类型变量由类的构造函数创建，可以使用它们访问所引用的对象。
        // 对象、数组都是引用数据类型。变量一旦声明后，类型就不能被改变了。

        // Java常量
        // 常量在程序运行时，不会被修改的量。
        // 在 Java 中使用 final 关键字来修饰常量

        // byte
        // byte数据类型是8位、有符号的，以二进制补码表示的整数
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        // short数据类型是16位、有符号的以二进制补码表示的整数
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // 整型：int
        // int数据类型是32位、有符号的以二进制补码表示的整数；
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        // long数据类型是64位、有符号的以二进制补码表示的整数；
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        // 基本类型：long 二进制位数：64
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        // 最大值：Long.MAX_VALUE=9223372036854775807
        System.out.println();

        // 浮点型：float
        // float数据类型是单精度、32位、符合IEEE 754标准的浮点数；
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        // 基本类型：float 二进制位数：32
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        // 最大值：Float.MAX_VALUE=3.4028235E38
        System.out.println();

        // double
        // double数据类型是双精度、64位、符合IEEE 754标准的浮点数；
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        // 基本类型：double 二进制位数：64
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        // 最大值：Double.MAX_VALUE=1.7976931348623157E308
        System.out.println();

        // char
        // char类型是一个单一的16位Unicode字符；
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        // 基本类型：char 二进制位数：16
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);
        // 最大值：Character.MAX_VALUE=65535

        // boolean
        // boolean数据类型表示一位的信息；
        // 只有两个取值：true和false；

        int decimalA=100;
        int octalA=0144;
        int hexaA=0x64;
        System.out.println("100 的二进制位: "+ decimalA);
        // 100 的二进制位: 100

        System.out.println("八进制数0144的结果为: "+ octalA);
        // 八进制数0144的结果为: 100

        System.out.println("十六进制数0x64的结果为: "+ hexaA);
        // 十六进制数0x64的结果为: 100

        // 常量
        final double PI=3.1415927;
        System.out.println("圆周率的值为： " +PI);
    }
}
