package Exceptionex;

import java.util.Scanner;

public class ThrowEx {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int user_age=sc.nextInt();
        validateAge(user_age);


    }
    static void validateAge(int age) throws Exception{
        if(age<25){
            throw new Exception("age cant be less than 25");
        }else {
            System.out.println("enjoy clubing");
        }
    }
}
