package com.loto.principle.g.CARP;

/**
 * PageName：CARPTest.java<p>
 * Function：
 *
 * @author 蓝田_Loto
 * @since 2022-04-22
 */

public class CARPTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setConnection(new MySQLConnection());
        productDao.addProduct();
    }
}
