package com.stream.pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {

//    new Student(20160001, "孔明", 20, 1, "土木工程", "武汉大学")
    private Integer id;
    private String name;
    private Integer age;
    private Integer grade;
    private String major;
    private String school;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Integer grade, String major, String school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.major = major;
        this.school = school;
    }

//    Lambda 中使用 this
    void func() {
        List<Student> students = new ArrayList<>();
        students.stream()
                .map(this::getName)
                .forEach(System.out::println);
    }

    private String getName(Student student) {
        return student.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", major='" + major + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
