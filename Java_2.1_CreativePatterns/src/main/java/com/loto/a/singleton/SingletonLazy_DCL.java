package com.loto.a.singleton;

/**
 * Author：蓝田_Loto
 * <p>Date：2022-02-25 22:38</p>
 * <p>PageName：SingletonLazy.java</p>
 * <p>Function：单例模式 - 懒加载 - 双检锁/双重校验锁（DCL，即 double-checked locking）</p>
 */

public class SingletonLazy_DCL {
    // 声明对象 SingletonLazy_DCL 的成员变量 instance
    // 使用 volatile
    private volatile static SingletonLazy_DCL instance;

    private SingletonLazy_DCL() {
    }

    public static SingletonLazy_DCL getInstance() {
        // 检查是否要阻塞
        if (instance == null) {
            // 同步锁
            synchronized (SingletonLazy_DCL.class) {
                // 检查这个单例对象是否已经创建（如果没有创建，则new，如果创建了，则直接使用之前创建的这个单例对象）
                if (instance == null) {
                    instance = new SingletonLazy_DCL();
                }
            }
        }
        return instance;
    }
}
