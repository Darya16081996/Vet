package Vet;

public class Client {
      static int count;
      public String name;
      private int year;
      private Type type;

    public Client(String name, int year, Type type) {
        this.year = year;
        this.name = name;
    }

    public void add() {
        count++;
        System.out.println(this.name + " added");
    }
    public void dis() {
        count--;
        System.out.println(this.name + " disharge");
    }

}