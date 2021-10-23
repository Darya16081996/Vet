package Vet;

public class Client {
    private static int count;
    private String name;
    private int year;
    private Type type;

    public Client(String name, int year, Type type) {
        this.name = name;
        this.year = year;
        this.type = type;
    }

    public void add(String name) {
        count++;
        System.out.println(name + " added");
    }
    //static int sum() {
     //   return count;
    //}

}