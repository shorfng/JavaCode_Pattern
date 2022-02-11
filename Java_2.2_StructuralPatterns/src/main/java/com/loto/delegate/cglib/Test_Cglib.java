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
        BookCglib cglib = new BookCglib();
        BookServiceImpl bookCglib = (BookServiceImpl) cglib.getInstance(new BookServiceImpl());

        bookCglib.addBook();
    }
}
