package com.Collections;

import java.util.ArrayList;
import java.util.Collections;


class StudentDetails1 implements Comparable<StudentDetails1>{
    private int id;
    private String name;
    StudentDetails1(int id,String name){
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
   // public int compareTo(StudentDetails1 o) {
     //   return this.id-o.getId();
    //}
   /* public int compareTo(StudentDetails1 o) {
        return  this.getName().compareTo(o.getName());
    }
    */
    public int compareTo(StudentDetails1 o){
        int idvalue=this.getId()-o.getId();
        if(idvalue==0){
            return this.getName().compareTo(o.getName());
        }

        return idvalue;
    }
    }
public class TestCollectionSorting {
    public static void main(String[] args){
        StudentDetails1 student1=new StudentDetails1(101,"raj");
        StudentDetails1 student2=new StudentDetails1(101,"abhi");
        StudentDetails1 student3=new StudentDetails1(103,"kiran");
        ArrayList<StudentDetails1> students=new ArrayList<>();
        students.add(student1);
        students.add(student3);
        students.add(student2);
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }
}
