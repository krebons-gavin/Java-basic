public class AbstractDemo {

    // 主函数
    public static void main(String[] args) {
        System.out.println("Hello Gavin. Today is 2016-01-05!");

        // 子类的初始化
        Salary sa = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        // 抽象类的初始化
        Employee em = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        // 调用子类方法
        System.out.println("Call mailCheck using Salary reference --");
        sa.mailCheck();

        // 调用抽象类方法
        System.out.println("\n Call mailCheck using Employee reference--");
        em.mailCheck();
    }
}
