package OopsConcepts;

public class Cat_this {
    public static void main(String[] args) {
        catty c1=new catty();
        catty c2=new catty("lucy");
        catty c3=new catty("mirchi");
        System.out.println(c2.name);
        System.out.println(c3.name);
        c2.running();
        c3.running();



    }
}
class catty{
    String name;
    catty(){
        name="tommy";
        System.out.println("name is:"+name);

    }
    catty(String name2){
        this.name=name2;
    }
    void running(){
        System.out.println("who is running:"+this.name);
    }
}
