package com.loto.principle.d.ISP.b;

/**
 * Author：蓝田_Loto<p>
 * Date：2020-08-25 23:48<p>
 * PageName：Bird.java<p>
 * Function：
 */

public class Bird implements IEatAnimal, IFlyAnimal {
    @Override
    public void eat() {
        // Do nothing
    }

    @Override
    public void fly() {
        // Do nothing
    }
}
