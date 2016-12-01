package me.lv.spring.xmlandann;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private Teacher teacher;
	@Autowired
	private Student student;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Person [teacher=" + teacher + ", student=" + student + "]";
	}

}
