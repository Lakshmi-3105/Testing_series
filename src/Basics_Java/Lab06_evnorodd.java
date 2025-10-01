package Basics_Java;
import java.util.*;
public class Lab06_evnorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();

        String res =num%2==0? "evn" :"odd";
        System.out.println(res);
    }
}
