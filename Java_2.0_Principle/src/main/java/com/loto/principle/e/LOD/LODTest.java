package com.loto.principle.e.LOD;

/**
 * PageName：LODTest.java<p>
 * Function：
 *
 * @author 蓝田_Loto
 * @since 2022-04-20
 */

public class LODTest {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }
}
