package geeks.org;

public class Student extends Object {
    private String name;
    private int age;

    @Override
    public int hashCode(){
        return this.age+ this.name.hashCode();

    }
    @Override
    public boolean equals(Object obj){
       //first condition
        if(obj == this){
           return true;
       }
        //second Condition
        if(!(obj instanceof Student)){
            return false;
        }
        //third condition
        Student student = (Student) obj;
        if(this.name == student.name && this.age == student.age){
            return true;
        }
        return false;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] s){
        Student student1 = new Student("John" , 32);
        Student student2 = new Student("John" , 32);
        Student student3 = new Student("Johnaa" , 22);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student1.equals(student2));

    }
}

//hashCode
//equals

//by default
//hashcode -> generated -> location

//-->
//Inner class
//Parent child
//hashCode, equals



