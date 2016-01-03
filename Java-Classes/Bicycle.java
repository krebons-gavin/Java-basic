/**
 * Created by Gavin on 15/12/29.
 * My first Java Class
 * 2015-12-30, Modified by Gavin
 */

public class Bicycle {
    // The Bicycle classes has three fields
    public int cadence = 0;
    public int gear = 0;
    public int speed = 1;

    // 构造函数
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // 自行车类有若干个方法
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    // 减速
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    // 加速
    public void speedUp(int increment) {
        speed += increment;
    }

    public void printStates() {
        System.out.println("Cadence: " +
                cadence + ", Speed: " +
                speed + ", Gear:" + gear);
    }
}
