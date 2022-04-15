package com.loto.principle.b.DIP;

/**
 * Author：蓝田_Loto<p>
 * Date：2019-07-08 17:18<p>
 * PageName：Student.java<p>
 * Function：学生类
 */

public class Student {
	public Student() {
	}

	// 传统写法
	public void studyJavaCourse() {
		System.out.println("TD 在学习 Java 的课程");
	}

	public void studyPythonCourse() {
		System.out.println("TD 在学习 Python 的课程");
	}

	// 实现依赖倒置原则的方式1：依赖注入
	public void study(ICourse course) {
		course.study();
	}

	// 实现依赖倒置原则的方式2：构造器
	//private ICourse iCourse;
	//
	//public Student(ICourse iCourse) {
	//	this.iCourse = iCourse;
	//}
	//
	//public void study(){
	//	iCourse.study();
	//}

	// 实现依赖倒置原则的方式3：单例下，setter方式注入
	private ICourse course;

	public void setCourse(ICourse course) {
		this.course = course;
	}

	public void study(){
		course.study();
	}
}
