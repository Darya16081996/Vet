package Vet;

public class Admin extends Client{
    public Admin(String name, int year, Type type) {
        super(name, year, type);
    }
    @Override
    public String toString() {
        return this.name;
    }

    static int sum() {
        return count;
    }

}
