package polymorfism;

public class Main {
    public static void main (String[] args){
        Human human=new Human();
        human.sayName();
        human.sayName("Ion");
        human.sayName(21);
        human.sayName("Maria", 34);
        human.sayName("VAsea", 64);
        Student human1= new Student();
        human1.sayName();

    }
}

class Human{
    void sayName(){
        System.out.println("Vasea");
    }

    void sayName(String name){
        System.out.println(name);
    }

    void sayName(int age){
        System.out.println(age);
    }

    void sayName(String name, int num){
        System.out.println(name +num);
    }

    void sayName(String name, double num){
        System.out.println(name +num);
    }
}

class Student extends Human {

    void sayName(){
        System.out.println("Oleg");
    }
}

