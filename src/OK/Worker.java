package OK;


    public class Worker extends OK {

        public Worker(String name) {
            super(name);
        }

        public Worker(int id, String name) {
            super(id, name);
        }

        @Override
        public String toString() {
            return this.name;
        }
        @Override
        void salary() {
            System.out.println("Salary " + name + " equals " + id*2);
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
}
