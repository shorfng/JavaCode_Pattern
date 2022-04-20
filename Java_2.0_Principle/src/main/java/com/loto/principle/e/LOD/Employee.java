package com.loto.principle.e.LOD;

import java.util.ArrayList;
import java.util.List;

/**
 * PageName：Employee.java<p>
 * Function：
 * @author 蓝田_Loto
 * @since 2022-04-20
 */

public class Employee {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }

        System.out.println("目前已发布的课程数量为：" + courseList.size());
    }
}
