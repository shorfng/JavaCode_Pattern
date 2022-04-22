package com.loto.principle.g.CARP;

/**
 * PageName：ProductDao.java<p>
 * Function：
 *
 * @author 蓝田_Loto
 * @since 2022-04-22
 */

public class ProductDao {
    private DBConnection dbConnection;

    public void setConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("获得数据库连接："+ conn);
    }
}
