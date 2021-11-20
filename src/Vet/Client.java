package Vet;

public class Client {
      static int count;
      public String name;
//    private int year;
//    private Type type;
//
//    public Client(String name, int year, Type type) {
//        this.name = name;
//        this.year = year;
//        this.type = type;
//    }

    public void add(String name) {
        count++;
        System.out.println(this.name + " added");
    }
    //static int sum() {
     //   return count;
    //}

}