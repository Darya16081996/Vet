package OK;


    public class Manager extends OK {
        public Manager(int id, String name, Type type) {
            super(id, name, type);
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        void salary() {
            System.out.println("Salary " + name + " equals " + id*3);
        }
    }

