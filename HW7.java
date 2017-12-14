/**
 * Java. Level 1. Lesson ., HW7 research "Try to fed angry cats!"  ;
 * (Please find below attached link on the certificate "Test-Level 1");
 * @author Alexey G. Ivanov
 * @version dated Dec 14, 2017
 * @link https://github.com/iag0910
 * @certificate link https://geekbrains.ru/certificates/382258
 */

public class HW7 {

    public static void main(String[] args) {
        Cat[] arr_cat = new Cat[3];
        arr_cat[0]=new Cat("Barsik", 5);
        arr_cat[1]=new Cat("Murzik", 45);
        arr_cat[2]=new Cat("Pushok", 33);
        Plate plate = new Plate(71);
        for (int i=0;i<3;i++) {
            arr_cat[i].eat(plate);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fill;


    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fill=false;
    }

    boolean eat(Plate plate) {
        this.fill=plate.decreaseFood(name,appetite,fill);
        System.out.println("I'm fine now ! I'm really full !! That's   -->>: "+this.fill);
        return true;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(String name,int food, boolean fill) {
        System.out.println();
        System.out.println("My name is  : "+ name);
        //System.out.println();
        System.out.println("There was food im the plate: "+ this.food);
        System.out.println("My appetite was: "+food);
        System.out.println("Residues of the food was:  " + (this.food-food));

        if (this.food - food <=0)
            increaseFood(name,(Math.abs((this.food - food))));
        this.food -= food;
        return true;
    }

    void increaseFood(String name,int food) {
        this.food += food;
        System.out.println("Poor cat  " + name + " started to cry: "
                +" My Plate is empty! But to avoid to stay hungry "
                + food + "  pieces food is added automatically "
                + "by my clever automatic-pet-owner !");
    }


    @Override
    public String toString() {
        return "The quantity of the food in the plate is: " + food;
    }
}


