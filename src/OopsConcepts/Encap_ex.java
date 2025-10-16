package OopsConcepts;

public class Encap_ex {
    public static void main(String[] args) {

        icicbank ic1=new icicbank("amit",20000);
        long bal =ic1.getBal();
        System.out.println(bal);

        icicbank cashier1=new icicbank("jaya",20000);
        cashier1.setBal(40000,true);
        System.out.println(cashier1.getBal());



    }
}
class icicbank {

    private String name;
    private long bal;

    public icicbank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean cashier) {
        if(cashier) {
            this.bal = bal;
        }else{
            System.out.println("not allowed");
        }
    }
}


