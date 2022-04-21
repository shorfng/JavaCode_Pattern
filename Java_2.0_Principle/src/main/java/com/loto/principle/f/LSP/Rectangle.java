package com.loto.principle.f.LSP;

/**
 * PageName：Rectangle.java<p>
 * Function：长方形
 *
 * @author 蓝田_Loto
 * @since 2022-04-21
 */

public class Rectangle implements QuadRangle {
    private long height;
    private long width;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
