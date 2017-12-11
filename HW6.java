/**
 * Java. Level 1. Lesson 6., HW6 research of questions of the inheritance
 *
 * @author Alexey G. Ivanov
 * @version dated Dec 11, 2017
 * @link https://github.com/iag0910
 */
    // All researches are built using material of lesson 6;

    // Creation of the class;

class HW6 {
    public static void main(String[] args) {

    // Creation of the array of objecst;

    IAnimal[] animal = {new Cat("Tomas", "black" ),
                        new Dog("Bobby", "red")};

    // The point of setting starting values and output of needed information;

        for (IAnimal item : animal) {
            System.out.println();
            System.out.println(item + " " +item.kind());
            System.out.println();
            System.out.println("I can jump up to "+ item.jump(2.0) +" m " );
            System.out.println("I can swim "+ item.swim(10.00) + " m ");
            System.out.println("I can run "+ item.run(600.00) + " m ");
        }
    }
}

    // Settings for the Interface;

interface IAnimal {
    String kind();
    Double jump(Double high);
    Double swim(Double line);
    Double run(Double dist);
}

    //Settings for the Abstract Class (implementation);

abstract class Animal implements IAnimal {

    String name;
    String color;

    // The constructor of the abstract class;

    Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Management of the outputted string values;

    @Override
    public String toString() {
        return name + "," + color;
    }
}


    // The constructor of class CAT;

class Cat extends Animal {
    Cat(String name, String color) {
        super(name, color);
    }

    // The kind of the animal- CAT;

    public String kind() {
        return "cat : ";
    }

    // Conditions and checking for jumping possibility - CAT;

    public Double jump(Double high) {
        if (high > 2.00) {
            System.out.println("..too highly for me. There was a mistake to input: " + high + " m to jump");
            high = 2.00;
        } else if (high <= 0) {
            System.out.println("..too lowly for me. There was a mistake to input: " + high + " m to jump");
            high = 2.00;
        }
        return high;
    }

    // Conditions and checking for swimming possibility - CAT;

    public Double swim(Double line) {
        System.out.println("There was a mistake to input: " + line + " m  to swim");
        System.out.println("I can't swim !!");
        return 0.0;
    }

    // Conditions and checking for jogging possibility - CAT;

    public Double run(Double dist) {
        if (dist > 200.0){
            System.out.println("There was a mistake to input: "+dist +" m  to run");
            System.out.println("I can't run so far !!");
            dist =200.0;
        }
        return dist;
    }
}

    // The constructor of class DOG;

class Dog extends Animal {
    Dog(String name, String color) {
        super(name, color);
    }

    // The kind of the animal- DOG;

    public String kind() {
        return "dog : ";
    }

    // Conditions and checking for jumping possibility - DOG;

    public Double jump(Double high){
        if (high>0.50) {
            System.out.println("..too highly for me. There was a mistake to input: " + high + " m to jump" );
            high = 0.50;
        } else if ( high<= 0) {
            System.out.println("..too lowly for me. There was a mistake to input: " + high + " m to jump");
            high = 0.50;
        }
        return high;
    }

    // Conditions and checking for swimming possibility - DOG;

    public Double swim(Double line){
        if(line>10.0) {
            System.out.println("There was a mistake to input: " + line + " m  to swim");
            System.out.println("I can't swim so far !!");
            line = 10.0;
        }
        return line;
    }

    // Conditions and checking for jogging possibility - DOG;

    public Double run(Double dist){
        if(dist>500.0) {
            System.out.println("There was a mistake to input: " + dist + " m  to run");
            System.out.println("I can't run so far !!");
            dist = 500.0;
        }
        return dist;
    }

}
