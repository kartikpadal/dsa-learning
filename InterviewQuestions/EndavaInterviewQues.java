package InterviewQuestions;

import java.util.*;

public class EndavaInterviewQues {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog());
        zoo.addAnimal(new Cat());
        System.out.println(zoo.totalLegs());
    }
}

    class Animal {
        private int legs;
        public Animal() {
            this.legs = 4;
        }
        public int getLegs() {
            return legs;
        }
    }

    class Dog extends Animal {
        int tail = 1;
    }

    class Cat extends Animal {
        int tail = 1;
    }

    class Zoo {
        ArrayList<Animal> animals = new ArrayList<>();

        public void addAnimal(Animal a) {
            animals.add(a);
        }

        public int totalLegs() {
            int resultLegs = 0;
            for (Animal animal : animals) {
                resultLegs += animal.getLegs();
            }
            return resultLegs;
        }
    }


// the output is 8 which i answered correctly
// but i couldn't answer how to get no. of legs , which is done here by downcasting
// ANS -->


//The problem is:

//Your ArrayList<InterviewQuestions.Animal> holds InterviewQuestions.Animal references, so you can only call methods or access
// fields declared in InterviewQuestions.Animal.

//tail exists only in InterviewQuestions.Dog and InterviewQuestions.Cat, not in InterviewQuestions.Animal, so you can’t directly do animal.tail.

//So the only way to get tails is by downcasting inside the loop and checking the actual type:
//
//public int totalTails() {
//    int resultTails = 0;
//    for (Animal animal : animals) {
//        if (animal instanceof InterviewQuestions.Dog) {
//            resultTails += ((InterviewQuestions.Dog) animal).tail;
//        } else if (animal instanceof InterviewQuestions.Cat) {
//            resultTails += ((InterviewQuestions.Cat) animal).tail;
//        }
//    }
//    return resultTails;
//}
//
//
//Then in main:
//
//        System.out.println("Total Legs: " + zoo.totalLegs());
//        System.out.println("Total Tails: " + zoo.totalTails());
//
//
//Output
//
//Total Legs: 8
//Total Tails: 2
//
//
//        💡 Why they asked this in an interview:
//
//To test if you understand polymorphism and type casting.
//
//You can always access overridden methods via the parent type, but for
// subclass-specific fields/methods you must downcast (after checking with instanceof).
//
//
