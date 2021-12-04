package OK;


import Vet.Admin;

public class Factory {
    public static void main(String[] args) {
        OK[] ok = new OK[]{
//        new Worker(2,"A")
        };
//       OK[] worker1 = new OK[]{};
//        OK[] boss1 = new OK[]{};
        Worker A = new Worker(3,"A");
        A.salary();
        A.add();
        Worker W = new Worker(2,"W");
        W.salary();
        W.dis();
        Manager M = new Manager(51,"M");
        M.salary();
        M.add();
        Boss B = new Boss(1,"B");
        B.salary();
        B.add();

//        static int sum() {
//            return count;
//        }
        System.out.println("Работников всего " + OK.sum());
    }
}
