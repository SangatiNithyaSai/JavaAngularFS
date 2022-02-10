package com.sitepack;

import java.util.Scanner;

class PerformOperation extends Exception{
    private int num1,num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void operation(int choice){
        if(choice==1){
            System.out.println("Operation Performed is Addition"+"\n"+this.num1+"+"+this.num2+":"+(this.num1+this.num2));
        }
        else if(choice==2){
            System.out.println("Operation Performed is Subtraction"+"\n"+this.num1+"-"+this.num2+":"+(this.num1-this.num2));
        }
        else if(choice==3){
            System.out.println("Operation Performed is Multiplication"+"\n"+this.num1+"*"+this.num2+":"+(this.num1*this.num2));
        }
        else if(choice==4){
            try {
                System.out.println("Operation Performed is Division" + "\n" + this.num1 + "/" + this.num2 + ":" + (this.num1/this.num2));
            }
            catch (Exception e){
                System.out.println("Number can't be divided by Zero");
            }
        }
        else{
            System.out.println("Choose the operation correctly");
        }
    }

    @Override
    public String toString() {
        return "PerformOperation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}

public class Calculate {

    public static  void main(String[] args){
        int num1,num2,operation;
        Scanner sc=new Scanner(System.in);
        PerformOperation op1=new PerformOperation();
        System.out.println("Enter the 1st operand");
        num1=sc.nextInt();
        System.out.println("Enter the 2nd operand");
        num2=sc.nextInt();
        System.out.println("Enter the number to perform operation as required"+"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        operation=sc.nextInt();
         op1.setNum1(num1);
         op1.setNum2(num2);
         op1.operation(operation);
         System.out.println(op1);
    }
}
