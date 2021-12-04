package OK;

    public abstract class OK {
        int id;
        String name;
        static int count;;

        public OK(String name) {
            this.name = name;
        }

        public OK(int id, String name) {
            this.id = id;
            this.name = name;
        }

        abstract void salary();
        abstract void add();
        abstract void dis();

        static int sum() {
            return count;
        }

    }
