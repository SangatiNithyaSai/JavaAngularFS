package com.sitepack;

abstract class LoanCalculator{
    abstract void emiCalculator(int rate);
    // can have non abstract methods
    public void myName(){
        System.out.println("Inside LoanCalculator");
    }
}
class SBI extends LoanCalculator{
    @Override
    void emiCalculator(int rate) {
        System.out.println("Here we implement the method"+rate);
    }
}
public class TestAbstraction {
    public static void main(String[] args) {
        LoanCalculator l1 = new SBI();
        l1.myName();
    }
}
