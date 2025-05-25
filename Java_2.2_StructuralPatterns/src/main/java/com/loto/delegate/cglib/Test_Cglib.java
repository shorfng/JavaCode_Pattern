package com.loto.delegate.cglib;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 18:27
 * <p>PageName：Test_Cglib.java
 * </p>
 * <p>Function：Java代理 - Cglib动态代理
 */

public class Test_Cglib {
    public static void main(String[] args) {
        // CGLIB 在生成动态代理类时尝试通过反射访问 ClassLoader.defineClass 方法
        // 但 JDK 9+ 默认不允许未命名模块访问 java.base 模块中的某些受保护成员
        // 解决方法：添加 JVM 启动参数绕过访问限制，允许反射访问 java.lang 包下的受保护方法
        // --add-opens java.base/java.lang=ALL-UNNAMED
        BookCglib cglib = new BookCglib();
        BookServiceImpl bookCglib = (BookServiceImpl) cglib.getInstance(new BookServiceImpl());

        bookCglib.addBook();
    }
}
