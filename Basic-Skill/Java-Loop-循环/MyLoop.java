/**
 * Created by Gavin on 2016/6/19
 * http://www.runoob.com/java/java-loop.html
 */

public class MyLoop {
    public static void main(String args[]) {
        // While 循环
        // 只要布尔表达式为true，循环体会一直执行下去。
        int x = 10;
        while (x < 20) {
            System.out.print("Value of x: " + x);
            x++;
            System.out.print("\n");
        }

        // do…while循环
        // do…while循环和while循环相似，不同的是，do…while循环至少会执行一次。
        int y = 10;
        do {
            System.out.print("Value of y: " + y);
            y++;
            System.out.print("\n");
        } while (y < 20);

        // for循环
        // for循环执行的次数是在执行前就确定的。
        for (int xx = 10; xx < 21; xx = xx + 1) {
            System.out.print("The value of xx is: " + xx);
            System.out.print("\n");
        }

        // 增强for循环
        // 主要用于数组的增强型for循环
        int[] numbers = {10, 20, 30, 40, 50};
        for (int xxx : numbers) {
            System.out.print(xxx);
            System.out.print(",");
        }
        System.out.print("\n");

        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }

        // break关键字
        // break主要用在循环语句或者switch语句中，用来跳出整个语句块。
        // break跳出最里层的循环，并且继续执行该循环下面的语句。


        // continue关键字
        // continue适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。


    }
}
