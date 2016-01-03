/**
 * Created by admin on 15/12/29.
 * 2015-12-30, Modified by Gavin
 */


// 类的继承
// 山地车类:继承自行车类
public class MountainBike extends Bicycle {
    // the MountainBike subclass has one field
    public int seatHeight;

    // Constructor:构造函数
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    // 山地车子类有一个方法
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
