package com.sitepack;
interface Myinterface{   //interface is a contract
    default void printMe(){
        System.out.println("Default from one");
    }

  //    public void printme(){

    //}cannot have concrete methods.
}
interface Myinterface2{
    default void printMe(){
        System.out.println("Default from two");
    }
}
class Student1 implements Myinterface,Myinterface2{
    @Override
    public void printMe() {
        Myinterface2.super.printMe();   //as default is present it is overidden method.
    }


}
public class TestInterface {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.printMe();
    }
}
