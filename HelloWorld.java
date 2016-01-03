/**
 * Created by Gavin on 2015-07-28
 * Modified at 2015-9-5.
 * My Java Hello World
 */

// 定义私有类
class FreshJuice {

    // 定义枚举类型
    enum FreshJuiceSize {
        SMALL, MEDIUM, LARGE
    }
    FreshJuiceSize size;
}


// 文件名必须和Public修饰的类名一致,以.java结尾
public class HelloWorld {
    // 主函数
    public static void main(String[] args){
        // Hello World程序
        System.out.println("Hello Gavin, Created at 2015-07-28");
        System.out.println("Hello 世界, Modified at 2015-12-28");

        // byte 的二进制位数
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);

        // 调用私有类
        FreshJuice juice = new FreshJuice();
        juice.size=FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: "+juice.size);
    }
}
