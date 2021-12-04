package OK;


    public class Manager extends OK {

        public Manager(String name) {
            super(name);
        }

        public Manager(int id, String name) {
            super(id, name);
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        void salary() {
            System.out.println("Salary " + name + " equals " + id*3);
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

