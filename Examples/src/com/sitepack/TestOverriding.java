package com.sitepack;

import javax.sql.XAConnection;

class Calculators {
    public void addition(int x,int y){
        System.out.println(x+y);
    }
    public void addition(int x,int y,int z){  //overloading differnt parameters or count or return type
        System.out.println(x+y+z);
    }

}
class Science extends Calculators{
    @Override
    public void addition(int x, int y) {
        System.out.println("Inside child");
        System.out.println(x+y);
    }
}
public class TestOverriding {
    public static void main(String[] args){
            Calculators s1=new Science();
        s1.addition(10,20);
    }
}
