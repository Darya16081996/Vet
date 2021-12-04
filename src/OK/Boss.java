package OK;

public class Boss extends OK{
    public Boss(int id, String name, Type type) {
        super(id, name, type);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    void salary() {
        System.out.println("Salary " + name + " equals " + id*100);
    }

}


