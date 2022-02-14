package com.Collections;

import java.util.*;

class User{
    private int id;
    private String name;
    public User(int id,String name){
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TestCollections {
    public static void main(String[] args){
        User user1=new User(101,"raju");
        User user2=new User(102,"raju");
        System.out.println(user1==user2);// == gives always false 'no two objects are same '
       // System.out.println(user1);
        //System.out.println(user2);
        HashSet<User> setlist=new HashSet<>();  //LinkedHashSet follows order whereas Hashset doesn't care.
        setlist.add(user1);
        setlist.add(user2);
       // System.out.println(setlist);
        HashMap<Integer,User> mymap= new HashMap();
        mymap.put(111,user1);
        mymap.put(222,user2);
        System.out.println(mymap);
        LinkedHashMap<Integer,User>mylistmap=new LinkedHashMap<>(); //Order is remembered
        mylistmap.put(111,user1);
        mylistmap.put(222,user2);
        System.out.println(mylistmap);


    }
}
