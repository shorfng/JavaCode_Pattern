package com.loto.principle.f.LSP;

/**
 * PageName：Square.java<p>
 * Function：正方形
 *
 * @author 蓝田_Loto
 * @since 2022-04-21
 */

public class Square implements QuadRangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return length;
    }

    public long getHeight() {
        return length;
    }
}
