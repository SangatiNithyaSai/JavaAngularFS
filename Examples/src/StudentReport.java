import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

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
    public int totalScore(){
        return this.cmarks+this.pmarks+this.cmarks;
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
class MaxCalculator{
    public Student findMaxPercentStudent(Student[] students){
        int maxpercent=0;
        int indexOfMaxScorer=0;
       /* for(int i=0;i< students.length;i++){
            if(maxpercent<students[i].totalScore()){
                maxpercent=students[i].totalScore();
                indexOfMaxScorer=i;
            }
        }*/
     return students[indexOfMaxScorer];
    }
}
public class StudentReport {
    public static void main(String[] args){
        int StudentCount;
        System.out.println("Enter number of students");
        Scanner input=new Scanner(System.in);
        StudentCount=input.nextInt();
        Student[] students=new Student[StudentCount];
        MaxCalculator cal=new MaxCalculator();
        for(int i=0;i<StudentCount;i++){
            System.out.println("enter the id of "+(i+1)+" student");
            int id=input.nextInt();
            System.out.println("enter the Name of "+(i+1)+" student");
            String name=input.next();
            System.out.println("enter the Chemistry Marks of "+(i+1)+" student");
            int cmarks=input.nextInt();
            System.out.println("enter the Physics Marks of "+(i+1)+" student");
            int pmarks=input.nextInt();
            System.out.println("enter the Maths Marks of "+(i+1)+" student");
            int mmarks=input.nextInt();
            students[i]=new Student(id,name,cmarks,pmarks,mmarks);
        }
        Student maxscorer=cal.findMaxPercentStudent(students);
        System.out.println(maxscorer);
        }

}
