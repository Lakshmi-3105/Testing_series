package OopsConcepts;

public class oops_multi {
    public static void main(String[] args) {
        sons s1=new sons();
        s1.property();
        s1.land();
        s1.flat();
        fathers f1=new fathers();
        f1.property();
        f1.land();
        //f1.flat()(can inherit )


    }
}
class grand{
    void property(){
        System.out.println("having 1 achre ");
    }
}
class fathers extends grand{
    void land(){
        System.out.println("having 0.5 schres");
    }

}
class sons extends fathers{
    void flat(){
        System.out.println("2bhk flat");
    }
}
