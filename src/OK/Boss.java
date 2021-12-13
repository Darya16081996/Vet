package OK;

import java.util.Scanner;

public class Boss extends OK{
    public Boss(int id, String name, float k, Type type) {
        super(id, name, k, type);
    }

//    @Override
//    void vvodK() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number: ");
//        float k = in.nextInt();
//        char input = in.nextLine().toLowerCase().toCharArray()[0];
//    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    void salary() {
        System.out.println("Salary " + name + " equals " + oklad*k + " BYN");
    }

}


