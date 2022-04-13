package this_keyword;

class Student7{
    int rollno;
    String name,course;
    float fee;
    Student7(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student7(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}

public class TestThis7 {
    public static void main(String[] args) {
        Student7 s1=new Student7(111,"ankit","java");
        Student7 s2=new Student7(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }
}
