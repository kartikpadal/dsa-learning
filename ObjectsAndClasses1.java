public class ObjectsAndClasses1 {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.rno = 13;
//        s1.name = "kp";
//        s1.marks = 45.67f;

        Student s1 = new Student(15,"kartik",56.78f);
        s1.greeting();
        System.out.println(s1.name);
        s1.changeName("padal");
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        //calls the empty Student()
        Student s2 = new Student();
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);



    }
}

class Student {
    int rno;
    String name;
    float marks;

    // gets called only when i pass 3 args from any Student()
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void greeting(){
        System.out.println("hi "+this.name+" here!");
    }

    void changeName(String naam){
        this.name = naam;
    }


    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // gets called when i dont pass any args
    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (1, "default person", 100.0f);
    }
}
