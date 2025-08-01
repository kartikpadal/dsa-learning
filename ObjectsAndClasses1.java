public class ObjectsAndClasses1 {
    public static void main(String[] args) {
//        Student s1 = new Student(15,"kartik",56.78f);
        Student s1 = new Student();
        s1.rno = 13;
        s1.name = "kp";
        s1.marks = 45.67f;

        s1.greeting();
        System.out.println(s1.name);
        s1.changeName("padal");
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

    }
}

class Student {
    int rno;
    String name;
    float marks;

//    Student(int rno, String name, float marks){
//        this.rno = rno;
//        this.name = name;
//        this.marks = marks;
//    }

    void greeting(){
        System.out.println("hi "+this.name+" here!");
    }

    void changeName(String naam){
        this.name = naam;
    }
}
