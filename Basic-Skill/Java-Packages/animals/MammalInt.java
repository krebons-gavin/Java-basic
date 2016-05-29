package animals;

/**
 * Created by Gavin on 2016-05-29
 * http://www.runoob.com/java/java-package.html
 */

// 继承接口
// 继承接口的话，要实现接口中的所有方法

public class MammalInt implements Animal{
    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel(){
        System.out.println("Mammal travels");
    }

    public int noOflegs(){
        return 0;
    }

    public static void main(String args[]){
        MammalInt myAnimal=new MammalInt();
        myAnimal.eat();
        myAnimal.travel();
    }
}
