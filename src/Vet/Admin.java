package Vet;

public class Admin extends Client{
    public Admin(String name, int i, Type bird) {

    }
//    private static int count;
//    private String name;
//    private int year;
//    private Type type;
//    private Client client;
//
//    public Admin(String name, int year, Type type) {
//        this.name = name;
//        this.year = year;
//        this.type = type;
//        this.client = client;
//    }


//    public void add(){
//        count++;
//        client.add(this.name);
//        System.out.println(name);
//        }
  public void add() {
      count++;
     System.out.println(name + " added");
  }
//     public void dis() {
//       count--;
//       System.out.println(name + " discharge");
   //}
    static int sum() {
        return count;
    }

}
