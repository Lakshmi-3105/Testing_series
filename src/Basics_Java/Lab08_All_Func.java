package Basics_Java;

public class Lab08_All_Func {
    public static void main(String[] args) {
        WoP_WoR_Greet();
        String str=WoP_Wr_Greet2();
        System.out.println(str);
        Wp_WoR_details("Jaya",22);
        int num=sum(20,40);
        System.out.println(num);

    }
    //Without parameters without return type
    static void  WoP_WoR_Greet(){
        System.out.println("hi their Good mrng !!");
    }
    //without parameters with return type
    static String WoP_Wr_Greet2(){
        System.out.println("in am 2 nd function ");
        return "Good afternoon";
    }
    //with parameters without return type
    static void Wp_WoR_details(String name,int age ){
        System.out.println("your name is " + name +"\nyour age is " +age);
    }
    //with parameters with return type
    static int sum(int a,int b ){
        return a+b;
    }

}
