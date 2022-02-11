package com.loto.principle.b.DIP;

/**
 * Author：蓝田_Loto
 * Date：2020-06-03 15:45
 * <p>PageName：JavaCourse.java
 * </p>
 * <p>Function：Java课程类
 */

public class JavaCourse implements ICourse {

	@Override
	public void study() {
		System.out.println("TD 在学习 Java 的课程");
	}
}
