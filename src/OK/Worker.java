package OK;


    public class Worker extends OK {

        public Worker(int id, String name, float k, Type type) {
            super(id, name, k, type);
        }

        @Override
        public String toString() {
            return this.name;
        }
        @Override
        void salary() {
            System.out.println("Salary " + name + " equals " + oklad*k + " BYN");
        }
}
