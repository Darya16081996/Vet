package OK;

public class Factory {
    public static void main(String[] args) {
        OK[] ok = new OK[]{
        };

//        Worker A = new Worker(3,"A", 1, Type.WORKER);
//        A.salary();
//        A.add();
//        Worker W = new Worker(2,"W", 1.2f, Type.WORKER);
//        W.salary();
//        W.dis();
//        Manager M = new Manager(51,"M", 1.4f, Type.MANAGER);
//        M.salary();
//        M.add();
        Boss B = new Boss(1,"B", 5, Type.BOSS);
        B.salary();
        B.add();
        B.vvodK();

        System.out.println("Работников всего " + OK.sum());
    }
}
