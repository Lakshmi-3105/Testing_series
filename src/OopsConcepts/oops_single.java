package OopsConcepts;

public class oops_single {
    public static void main(String[] args) {
        son s1=new son();
        s1.bhk_house();
        s1.house();
        father f1=new father();
        f1.bhk_house();
       // f1.house();
    }
}
class father{
    int gold=2000;
    void bhk_house(){
        System.out.println("2bhk house");
    }
}
class son extends father{
    void house(){
        System.out.println("3bhk flat");
    }
}
