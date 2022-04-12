package com.loto.a.singleton;

/**
 * Author：蓝田_Loto
 * <p>Date：2022-02-25 22:37</p>
 * <p>PageName：SingletonHurry.java</p>
 * <p>Function：单例模式 - 饿汉式</p>
 */

public class SingletonHurry {
    // 私有化构造方法
    private SingletonHurry() {
    }

    // 定义 SingletonHurry 类型的静态变量 instance，并初始化
    private static SingletonHurry instance = new SingletonHurry();

    // 提供一个对外可以访问的静态方法 getInstance()，返回 instance（返回的实际是被 static 修饰的内存中唯一存在的 instance 静态变量）
    public static SingletonHurry getInstance() {
        return instance;
    }
}
