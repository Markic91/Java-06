class Classroom {
  public static void main(String[] args) {

    //Reference
    Wilder student1 = new Wilder("Cyril",false);
    Wilder student2 = new Wilder("Djamel",true);
    Wilder student3 = new Wilder("Steph",true);
    Wilder student4 = new Wilder("Adrien",false);

    //Callback whoAmI()
    System.out.println(student1.whoAmI());
    System.out.println(student2.whoAmI());
    System.out.println(student3.whoAmI());
    System.out.println(student4.whoAmI());
  }
}