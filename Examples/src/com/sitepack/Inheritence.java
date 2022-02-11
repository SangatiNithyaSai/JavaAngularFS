package com.sitepack;
class Calculator{
     public void addition(int x,int y){
         System.out.println(x+y);
     }
        }
class ScientificCalc extends Calculator{
    public  void areaCube(int side){
        System.out.println(side*side);
    }
}
public class Inheritence  {
    public static void main(String[] args){
        ScientificCalc cal1=new ScientificCalc();
        cal1.addition(5,10);

      //  Calculator c1=new ScientificCalc();
        //c1.areaCube(10);  c1 cant access areacube as parent class reference is used
        //ScientificCalc cal2=new Calculator();
           //This gives error as child class is refering to parent memory size ,to solve this use down casting of hierarchy
        ScientificCalc cal2= (ScientificCalc) new Calculator();
        cal2.areaCube(10);
    }
}
