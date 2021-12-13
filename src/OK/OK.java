package OK;

import java.util.Scanner;

public abstract class OK {
        int id;
        float k;
        String name;
        static int count;
        static int oklad = 1000;
        private Type type;


        public OK(int id, String name, float k, Type type) {
            this.id = id;
            this.name = name;
            this.k = k;
            this.type = type;
        }

//        abstract void vvodK();
//            Scanner in = new Scanner(System.in);
//            System.out.print("Input a number: ");
//            float k = in.nextInt();
//        }

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
