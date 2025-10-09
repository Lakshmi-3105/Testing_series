package StringsAndArrays;

import java.util.Scanner;

public class Array_user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        String a1[]=new String[size];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.next();

        }
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+"\t");
        }

    }
}
