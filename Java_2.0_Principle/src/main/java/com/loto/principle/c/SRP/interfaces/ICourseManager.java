package com.loto.principle.c.SRP.interfaces;

/**
 * Author：蓝田_Loto<p>
 * Date：2020-06-04 13:47<p>
 * PageName：ICourseManager.java<p>
 * Function：课程的权限（接口层面的单一职责原则）
 */

public interface ICourseManager {
	// 权限职责
	void studyCourse();   // 学习课程的权限
	void refundCourse();  // 退费课程的权限
}
