package com.loto.a.singleton;

/**
 * Author：蓝田_Loto
 * <p>Date：2022-02-25 22:38</p>
 * <p>PageName：SingletonLazy.java</p>
 * <p>Function：单例模式 - 懒加载</p>
 */

public class SingletonLazy {
    // 声明对象 SingletonLazy 的成员变量 instance
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        // 同步锁
        synchronized (SingletonLazy.class) {
            // 判断单例对象是否已创建
            if (instance == null) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }
}
