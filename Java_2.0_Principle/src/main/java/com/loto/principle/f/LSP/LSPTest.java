package com.loto.principle.f.LSP;

/**
 * PageName：LSPTest.java<p>
 * Function：
 *
 * @author 蓝田_Loto
 * @since 2022-04-21
 */

public class LSPTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);
    }

    /**
     * 让高一直自增，直到高等于宽。变成正方形
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("Width:" + rectangle.getWidth() + ",Height:" + rectangle.getHeight());
        }
        System.out.println("Resize End,Width:" + rectangle.getWidth() + ",Height:" + rectangle.getHeight());
    }
}
