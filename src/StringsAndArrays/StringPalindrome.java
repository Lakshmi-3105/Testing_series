package StringsAndArrays;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input string");
        String s1=sc.next();
        //String s1="madam";
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s2.equalsIgnoreCase(s1)){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
