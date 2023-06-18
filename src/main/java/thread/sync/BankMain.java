package thread.sync;

public class BankMain {
  public static Bank myBank = new Bank();

  public static void main(String[] args) throws Exception{
    System.out.println("원금 : " + myBank.getMoney());

    Park park = new Park();
    ParkWife wife = new ParkWife();

    park.setPriority(10);
    park.start();
    wife.start();

    park.join();
    wife.join();

    System.out.println("은행 작업 종료");

  }
}