public class Main {
  public static void main(String[] args) {
    //test cases
    Feeder example=new Feeder(100000);
    System.out.println(example.getFood());

    System.out.println(example.simulateManyDays(1,1000));
    System.out.println(example.getFood());
  }
}
