package com.java8;

import java.util.ArrayList;

interface HiringCriteria{
     Student SuitableforCompany(Student student,String grade);

}
class Facebook implements HiringCriteria{

    @Override
    public Student SuitableforCompany(Student student,String grade) {
        if(grade=="B" && student.getMmarks()>50){
            return student;
        }
        return null;
    }
}
class Google implements HiringCriteria{

    @Override
    public Student SuitableforCompany(Student student,String grade) {
        if((grade=="A"|| grade=="B") && student.getMmarks()>70){
            return student;
        }
        return null;
    }
}
class Amazon implements HiringCriteria{

    @Override
    public Student SuitableforCompany(Student student,String grade) {
        if((grade=="A" || grade=="B") && student.getMmarks()>80){
            return student;
        }
        return null;
    }
}
class Student{
    private int id,cmarks,pmarks,mmarks;
    private String name;
    public Student(int id,String name,int cmarks,int pmarks,int mmarks){
        this.id=id;
        this.name=name;
        this.cmarks=cmarks;
        this.pmarks=pmarks;
        this.mmarks=mmarks;
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

    public int getCmarks() {
        return cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getPmarks() {
        return pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getMmarks() {
        return mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }
    public int AvgScore(){
        return (this.cmarks+this.pmarks+this.cmarks)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cmarks=" + cmarks +
                ", pmarks=" + pmarks +
                ", mmarks=" + mmarks +
                ", name='" + name + '\'' +
                '}';
    }
}
class StudentGradeCalculator{
    public String  gradeCalculator(int totalmarks){
        if(totalmarks>=90 && totalmarks<=100){
            return "A";
        }
        else if(totalmarks>=80 && totalmarks<90){
            return "B";
        }
        else if(totalmarks>=70 && totalmarks<80){
            return "C";
        }
        else{
            return "Avg";
        }
    }
}

public class HiringStudent {
    public static void main(String[] args){
        Student student1=new Student(101,"raju",100,70,80);
        Student student2=new Student(102,"Kiran",80,70,80);
        Student student3=new Student(103,"raj",100,70,80);

        ArrayList<Student>studentArrayList=new ArrayList<Student>();
        ArrayList<Student>amazonselects=new ArrayList<Student>();
        ArrayList<Student>facebookselects=new ArrayList<Student>();
        ArrayList<Student>googleselects=new ArrayList<Student>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        StudentGradeCalculator cal1=new StudentGradeCalculator();
        Facebook fbHiring=new Facebook();
        Amazon amazonHiring=new Amazon();
        Google googleHiring=new Google();
        for(Student s:studentArrayList){
            amazonselects.add(amazonHiring.SuitableforCompany(s,cal1.gradeCalculator(s.AvgScore())));
            facebookselects.add(fbHiring.SuitableforCompany(s, cal1.gradeCalculator(s.AvgScore())));
            googleselects.add(googleHiring.SuitableforCompany(s, cal1.gradeCalculator(s.AvgScore())));
            amazonselects.remove(null);
            facebookselects.remove(null);
            googleselects.remove(null);
        }
       System.out.println("Amazon selects:"+amazonselects+"\nFacebook Selects:"+facebookselects+"\nGoogle Selects:"+googleselects);
     }
}
