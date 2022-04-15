package com.loto.principle.b.DIP;

/**
 * Author：蓝田_Loto<p>
 * Date：2020-06-03 15:32<p>
 * PageName：DIPTest.java<p>
 * Function：依赖倒置原则测试类
 */

public class DIPTest {
	public static void main(String[] args) {
		// 传统写法
		System.out.println("======== 传统写法 ======== ");
		Student stu1 = new Student();
		stu1.studyJavaCourse();
		stu1.studyPythonCourse();

		// 实现依赖倒置原则的方式1：依赖注入
		System.out.println("======== 实现依赖倒置原则的方式1：依赖注入 ======== ");
		Student stu2 = new Student();
		stu2.study(new JavaCourse());
		stu2.study(new PythonCourse());

		// 实现依赖倒置原则的方式2：构造器
		//System.out.println("======== 实现依赖倒置原则的方式2：构造器 ======== ");
		//Student stu3 = new Student(new JavaCourse());
		//stu3.study();
        //
		//Student stu4 = new Student(new PythonCourse());
		//stu4.study();

        // 实现依赖倒置原则的方式：单例下，setter方式注入
		System.out.println("======== 实现依赖倒置原则的方式：单例下，setter方式注入 ======== ");
		Student stu5 = new Student();
		stu5.setCourse(new JavaCourse());
		stu5.study();

		stu5.setCourse(new PythonCourse());
		stu5.study();
	}
}
