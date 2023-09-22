package org.example;

public class Constructexample {
    public static void main(String[] args) {
        Animal animal = new Animal("Tim", 1);// Animal Class assigned with name & id
        animal.display(); //This will display Tim & 1

        Animal animal2 = new Animal("William", 2); //animal2 assigned with name William & id 2
        animal2.display();// displays animal2

        Animal animal3 = new Animal();//
    }
}

class Animal{

    String name; //string "name" created
    int id; // int "id" created

    void display(){
        System.out.println("The name is: "+name);// this will print The name is : tim
        System.out.println("The id is: "+id);// this will print the id is 1
    }
    Animal(String name, int id){
        this.name = name;// this will hold both names
        this.id = id;// this ill hold bot id
    }

    Animal(){
        System.out.println("This is empty constructor");//this prints This is empty constructor
    }
}