package com.java8;
interface Hirerable{
    void suitableToHire(int marks,String comm_grade,int lpa);
}
class FacebookHR implements Hirerable{

    @Override
    public void suitableToHire(int marks, String comm_grade, int lpa) {
        if(marks>=60 && comm_grade=="C" && lpa<=50){
            System.out.println("Congratulations! You are hired by Facebook");
        }else{
            System.out.println("Better luck next time");
        }
    }
}
class GoogleHR implements Hirerable{

    @Override
    public void suitableToHire(int marks, String comm_grade, int lpa) {
        if(marks>=90 && comm_grade=="A" && lpa>=200){
            System.out.println("Congratulations! You are hired by Google");
        }
        else{
            System.out.println("Better luck next time");
        }
    }
}
public class Interface {
    public static void main(String[] args){
        FacebookHR fb=new FacebookHR();
        fb.suitableToHire(70,"C",10);
    }
}
