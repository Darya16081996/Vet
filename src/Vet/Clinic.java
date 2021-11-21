package Vet;

public class Clinic {
    public static void main(String[] args) {
        Client bird = new Client("Alya", 2, Type.BIRD);
        Client dog = new Client("Sharik", 5, Type.DOG);
        Client cat = new Client("Kuzya", 12, Type.CAT);
        Client cat1 = new Client("Kuzya", 12, Type.CAT);

        bird.add();
        dog.add();
        cat.add();
        cat1.dis();



        System.out.println("Животных всего " + Admin.sum());

    }
}
