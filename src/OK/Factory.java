package OK;

public class Factory {
    public static void main(String[] args) {
        OK[] ok = new OK[]{
        };

        Worker A = new Worker(3,"A", Type.WORKER);
        A.salary();
        A.add();
        Worker W = new Worker(2,"W", Type.WORKER);
        W.salary();
        W.dis();
        Manager M = new Manager(51,"M", Type.MANAGER);
        M.salary();
        M.add();
        Boss B = new Boss(1,"B", Type.BOSS);
        B.salary();
        B.add();

        System.out.println("Работников всего " + OK.sum());
    }
}
