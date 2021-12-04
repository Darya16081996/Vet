package OK;

public class Boss extends OK{
    public Boss(String name) {
        super(name);
    }

    public Boss(int id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    void salary() {
        System.out.println("Salary " + name + " equals " + id*100);
    }
    @Override
    void dis() {
        count--;
        System.out.println(this.name + " retired");
    }
    @Override
    void add() {
        count++;
        System.out.println(this.name + " added");
    }
//    @Override
//    static int sum() {
//        return count;
//    }
}


