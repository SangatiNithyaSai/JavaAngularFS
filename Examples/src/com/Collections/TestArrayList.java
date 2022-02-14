package com.Collections;

import java.util.ArrayList;

class Student{
    private int id,marks;
    private String grade;
    private String name;
    public Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
class StudentGradeCalcualtorUtility{
    public ArrayList<Student> gradeCalculator(ArrayList<Student> studentlist){
        for(Student s:studentlist) {
            if (s.getMarks()>=90 && s.getMarks() <= 100){
                s.setGrade("A");
            }
        else if (s.getMarks() >= 80 && s.getMarks() < 90) {
                s.setGrade("B");
            } else if (s.getMarks() >= 70 && s.getMarks() < 80) {
                s.setGrade("C");
            } else if(s.getMarks()<70) {
                s.setGrade("D");
            }
        }

        return studentlist;
    }
}
public class TestArrayList {
    public static void main(String[] args){
        ArrayList<Student> studentArrayList =new ArrayList<Student>();   //LinkedList for faster insertion and deletion,Arraylist for iteration.
        Student student1=new Student(101,"raju",98);  //Vector thread safety Concept no two threads change data at a time.
        Student student2=new Student(102,"raj Kiran",78);
        Student student3=new Student(103,"rajesh",68);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        StudentGradeCalcualtorUtility cal1=new StudentGradeCalcualtorUtility();

        System.out.println(studentArrayList);
        cal1.gradeCalculator(studentArrayList);
        System.out.println(studentArrayList);

    }
}
