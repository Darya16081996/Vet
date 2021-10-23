package Vet;

public class Doctor {
    private static int count;
    private String name;
    private int year;
    Type type;;

    public Doctor(String name, int year, Type type) {
        this.name = name;
        this.year = year;
        this.type = type;
    }

    public void dis() {
        count--;
        System.out.println(name + " disharge");
    }
    //static int sum() {
       // return count;}
    }


