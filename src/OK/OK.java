package OK;

    public abstract class OK {
        int id;
        String name;
        static int count;
        private Type type;


        public OK(int id, String name, Type type) {
            this.id = id;
            this.name = name;
            this.type = type;
        }

        abstract void salary();
        void dis() {
            count--;
            System.out.println(this.name + " retired");
        }
        void add() {
            count++;
            System.out.println(this.name + " hired");
        }
//        void list(){
//            System.out.println(OK[id]);
//}
        static int sum() {
            return count;
        }

    }
