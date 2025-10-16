package OopsConcepts;

public class Student_X {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2=new Student("Jaya");


    }
}
    class Student{
        String name;
        Student(){
            System.out.println("this will be called automatically");
        }
        Student(String name){
            System.out.println("my name is:"+name);
        }

    }

