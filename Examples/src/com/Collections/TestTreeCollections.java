package com.Collections;

import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

class User1 implements Comparable{
    private int id;
    private String name;
    public User1(int id,String name){
        this.id=id;
        this.name=name;
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
    public boolean equals(Object o) {
        if((o instanceof User) && (((User)o).getId()==this.getId())){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Object o) {
        return this.getId()-((User1)o).getId();                                
        //return this.getName().compareTo(((User1) o).getName());
    }
}

public class TestTreeCollections {
    public static void main(String[] args) {
        User1 user1 = new User1(101, "raju");
        User1 user2 = new User1(102, "kumar");

        User1 user3 = new User1(103, "sachin");

        User1 user4 = new User1(104, "vimal");
       /*TreeSet<User1> mylist=new TreeSet<>();
        mylist.add(user1);
        mylist.add(user2);
        mylist.add(user4);
        mylist.add(user3);
        System.out.println(mylist); */
        TreeMap<User1,String> mylist1=new TreeMap<>(); //Comparable is not required.
        mylist1.put(user1,"bala");
        mylist1.put(user2,"abdul");
        mylist1.put(user3,"sai");
        mylist1.put(user4,"kiran");

        System.out.println(mylist1);

    }
}
