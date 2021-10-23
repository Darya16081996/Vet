package Vet;

import java.util.Arrays;

public class Clinic {
    public static void main(String[] args) {


        Admin bird = new Admin("Alya", 2, Type.BIRD);
        Admin dog = new Admin("Sharik", 5, Type.DOG);
        Admin cat = new Admin("Kuzya", 12, Type.CAT);
        Admin cat1 = new Admin("Kuzya", 12, Type.CAT);


        bird.add();
        dog.add();
        cat.add();
        cat1.add();

        System.out.println("Животных всего " + Admin.sum());

    }
}
