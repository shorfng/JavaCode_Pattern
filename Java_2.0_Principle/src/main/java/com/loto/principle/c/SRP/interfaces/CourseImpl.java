package com.loto.principle.c.SRP.interfaces;

/**
 * Author：蓝田_Loto
 * Date：2020-06-04 13:46
 * <p>PageName：CourseImpl.java
 * </p>
 * <p>Function：课程的实现类
 */

public class CourseImpl implements ICourseInfo, ICourseManager {

	@Override
	public String getCourseName() {
		return null;
	}

	@Override
	public byte[] getCourseVideo() {
		return new byte[0];
	}

	@Override
	public void studyCourse() {

	}

	@Override
	public void refundCourse() {

	}
}
