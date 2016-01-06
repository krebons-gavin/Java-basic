// 2016-01-04, Created by Gavin

public class StringDemo {

    // 主函数
    public static void main(String[] args) {
        // 定义字符数组
        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        // 注意:String类是不可改变的，所以你一旦创建了String对象，那它的值就无法改变了。
        // 如果需要对字符串做很多修改，那么应该选择使用StringBuffer & StringBuilder 类。

        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        // 使用+ 号可以连接字符串
        System.out.println("String Length is: " + len);

        System.out.println("Hello Gavin, Today is 2016-01-04!");
        System.out.println(helloString);

        // 创建格式化字符串
        float floatVar=8;
        int intVar=8;
        String stringVar="Hello Gavin";
        String fs;
        fs = String.format("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", floatVar, intVar, stringVar
        );
        System.out.println(fs);
    }
}
