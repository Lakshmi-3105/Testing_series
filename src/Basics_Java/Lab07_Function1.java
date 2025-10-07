package Basics_Java;

import java.sql.SQLOutput;

public class Lab07_Function1 {
    public static void main(String[] args) {
        //return_happend();
        String name= return_happend();
        System.out.println(name);
        no_return();

    }
    static void no_return(){
        System.out.println("ntg returns");
    }
    static String  return_happend(){
        System.out.println("returns somthing");
        return "jaya";
    }
}
