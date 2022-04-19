package com.loto.principle.d.ISP.b;

/**
 * Author：蓝田_Loto<p>
 * Date：2020-08-25 23:48<p>
 * PageName：Dog.java<p>
 * Function：
 */

public class Dog implements ISwimAnimal, IEatAnimal {
    @Override
    public void eat() {
        // Do nothing
    }

    @Override
    public void swim() {
        // Do nothing
    }
}
